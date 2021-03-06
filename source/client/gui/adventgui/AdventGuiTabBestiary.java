package net.tslat.aoa3.client.gui.adventgui;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.IProgressMeter;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.Quaternion;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.network.play.client.CClientStatusPacket;
import net.minecraft.stats.Stat;
import net.minecraft.stats.StatisticsManager;
import net.minecraft.stats.Stats;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Tuple;
import net.minecraft.util.Util;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.tslat.aoa3.advent.AdventOfAscension;
import net.tslat.aoa3.advent.Logging;
import net.tslat.aoa3.client.gui.lib.ScrollablePane;
import net.tslat.aoa3.config.AoAConfig;
import net.tslat.aoa3.entity.base.*;
import net.tslat.aoa3.library.resourcemanager.BestiaryManager;
import net.tslat.aoa3.util.LocaleUtil;
import net.tslat.aoa3.util.NumberUtil;
import net.tslat.aoa3.util.RenderUtil;
import net.tslat.aoa3.util.skill.HunterUtil;
import org.apache.logging.log4j.Level;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

import static net.minecraft.entity.CreatureAttribute.*;

@OnlyIn(Dist.CLIENT)
public class AdventGuiTabBestiary extends Screen implements IProgressMeter {
	private static final ResourceLocation iconsTextures = new ResourceLocation("aoa3", "textures/gui/maingui/icons.png");

	private static final HashMap<String, Function<Entity, Tuple>> registeredEntryHandlers = new HashMap<String, Function<Entity, Tuple>>(1);

	private final HashMap<String, Entity> instancesMap = new HashMap<String, Entity>();

	private StatisticsManager stats;
	private Object2IntMap<Stat<?>> statsMap;
	private BestiaryMenu scrollMenu;
	private ArrayList<EntityStats> statList;
	private ArrayList<EntityStats> filteredMobList;

	private boolean receivedStats = false;
	private int lastOpenIndex = -1;
	private int openEntryIndex = -1;
	private int openEntryHeight = 0;
	private float lastDistanceScrolled = 0;
	private Entity openEntryInstance = null;
	private List<String> openEntryInfoLines = null;
	private List<String> openEntryStatsLines = null;

	private int adjustedMouseX;
	private int adjustedMouseY;

	protected TextFieldWidget searchField;

	protected AdventGuiTabBestiary() {
		super(new TranslationTextComponent("gui.aoa3.adventGui.bestiary"));
	}

	@Override
	protected void init() {
		receivedStats = false;
		openEntryIndex = -1;
		stats = getMinecraft().player.getStats();

		if (statsMap == null)
			statsMap = ObfuscationReflectionHelper.getPrivateValue(StatisticsManager.class, stats, "field_150875_a");

		if (scrollMenu == null)
			scrollMenu = new BestiaryMenu(minecraft, AdventMainGui.scaledTabRootY, AdventMainGui.scaledTabRootX, 340, 764, AdventMainGui.scale);

		searchField = new TextFieldWidget(font, AdventMainGui.scaledTabRootX + 20, AdventMainGui.scaledTabRootY, (int)((width - 40) / 2d), 15, "");

		searchField.setVisible(false);
		getMinecraft().getConnection().sendPacket(new CClientStatusPacket(CClientStatusPacket.State.REQUEST_STATS));
	}

	@Override
	public void render(int mouseX, int mouseY, float partialTicks) {
		super.render(mouseX, mouseY, partialTicks);

		this.adjustedMouseX = (int)(mouseX * AdventMainGui.scaleInverse);
		this.adjustedMouseY = (int)(mouseY * AdventMainGui.scaleInverse);

		scrollMenu.render(adjustedMouseX, adjustedMouseY, partialTicks);
	}

	@Override
	public boolean mouseScrolled(double mouseX, double mouseY, double scrollAmount) {
		if (scrollMenu != null)
			return scrollMenu.handleMouseScroll(-1, -1, scrollAmount);

		return false;
	}

	@Override
	public boolean mouseClicked(double mouseX, double mouseY, int mouseButton) {
		if (scrollMenu != null) {
			scrollMenu.handleMouseClick(adjustedMouseX, adjustedMouseY, mouseButton);

			return true;
		}

		return false;
	}

	@Override
	public boolean mouseReleased(double mouseX, double mouseY, int button) {
		if (scrollMenu != null)
			return scrollMenu.handleMouseReleased(mouseX, mouseY, button);

		return false;
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		super.resize(minecraft, width, height);

		if (scrollMenu != null)
			scrollMenu.onResize(this.minecraft, AdventMainGui.scaledTabRootX, AdventMainGui.scaledTabRootY, 764, 340);
	}

	@Override
	public void onStatsUpdated() {
		HashMap<String, EntityStats> statsMap = new HashMap<String, EntityStats>();
		statList = new ArrayList<EntityStats>();

		for (Stat<?> stat : this.statsMap.keySet()) {
			ResourceLocation registryName;

			if (stat.getValue() instanceof EntityType && (registryName = ((EntityType<?>)stat.getValue()).getRegistryName()) != null) {
				if (AoAConfig.CLIENT.thirdPartyBestiary.get() || registryName.getNamespace().equals(AdventOfAscension.MOD_ID)) {
					String registryNameString = registryName.toString();

					if (!statsMap.containsKey(registryNameString)) {
						statsMap.put(registryNameString, new EntityStats((Stat<EntityType<?>>)stat, stat.getType() == Stats.ENTITY_KILLED));
					}
					else {
						statsMap.get(registryNameString).matchAndComplete((Stat<EntityType<?>>)stat);
					}
				}
			}
		}

		for (EntityStats stat : statsMap.values()) {
			if (stat.hasKills())
				statList.add(stat);
		}

		statList.sort(Comparator.comparing(stat -> stat.registryName.getPath()));
		filteredMobList = (ArrayList<EntityStats>)statList.clone();
		receivedStats = true;
	}

	@Override
	public void onClose() {
		if (searchField != null && searchField.isFocused())
			searchField.setFocused2(false);
	}

	@Nullable
	private Entity getEntityFromStat(EntityStats stat) {
		String registryName = stat.registryName.toString();

		if (instancesMap.containsKey(registryName))
			return instancesMap.get(registryName);

		try {
			Entity entity = ForgeRegistries.ENTITIES.getValue(stat.registryName).create(minecraft.player.worldClient);

			instancesMap.put(registryName, entity);

			return entity;
		}
		catch (Exception e) {
			Logging.logMessage(Level.DEBUG, "Unable to retrieve entity from entity type: " + registryName);
		}

		return null;
	}

	@Override
	public boolean charTyped(char character, int arg) {
		if (searchField.isFocused()) {
			int searchTextLength = searchField.getText().length();

			if (searchField.charTyped(character, arg)) {
				if (searchField.getText().isEmpty()) {
					filteredMobList = (ArrayList<EntityStats>)statList.clone();

					searchField.setTextColor(NumberUtil.RGB(255, 255, 255));
				}
				else if (searchField.getText().length() != searchTextLength) {
					searchFilterBestiaryEntries(searchTextLength < searchField.getText().length());
				}
			}

			return true;
		}

		return super.charTyped(character, arg);
	}

	@Override
	public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
		boolean success = super.keyPressed(keyCode, scanCode, modifiers);

		if (openEntryIndex < 0 && keyCode == 70 && hasControlDown() && !hasShiftDown() && !hasAltDown())  {
			if (!searchField.getVisible())
				searchField.setVisible(true);

			searchField.setFocused2(true);

			return true;
		}

		if (searchField.isFocused()) {
			int searchTextLength = searchField.getText().length();

			if (searchField.keyPressed(keyCode, scanCode, modifiers)) {
				if (searchField.getText().isEmpty()) {
					filteredMobList = (ArrayList<EntityStats>)statList.clone();

					searchField.setTextColor(NumberUtil.RGB(255, 255, 255));
				}
				else if (searchField.getText().length() != searchTextLength) {
					searchFilterBestiaryEntries(searchTextLength < searchField.getText().length());
				}
			}

			return true;
		}

		return success;
	}

	private void searchFilterBestiaryEntries(boolean additiveEdit) {
		searchField.setTextColor(NumberUtil.RGB(255, 255, 255));

		if (searchField.getText().isEmpty()) {
			filteredMobList = (ArrayList<EntityStats>)statList.clone();

			return;
		}

		if (!additiveEdit || filteredMobList == null)
			filteredMobList = (ArrayList<EntityStats>)statList.clone();

		String searchFilter = searchField.getText().toLowerCase();

		if (searchFilter.startsWith("@")) {
			String modIdFilter = searchFilter.split("@", 2)[1].split(" ")[0];

			filteredMobList.removeIf(stat -> !stat.registryName.getNamespace().startsWith(modIdFilter));

			searchFilter = searchFilter.replace("@" + modIdFilter, "");

			if (searchFilter.startsWith(" "))
				searchFilter = searchFilter.substring(1);

			if (searchFilter.isEmpty()) {
				if (filteredMobList.isEmpty())
					searchField.setTextColor(NumberUtil.RGB(255, 0, 0));

				return;
			}
		}

		final String searchedEntityName = searchFilter;

		filteredMobList.removeIf(stat -> {
			ResourceLocation registryName = stat.registryName;

			String entityName = LocaleUtil.getLocaleString("entity." + registryName.getNamespace() + "." + registryName.getPath()).replace("." + registryName.getNamespace(), "");

			return !entityName.toLowerCase().contains(searchedEntityName);
		});

		if (filteredMobList.isEmpty())
			searchField.setTextColor(NumberUtil.RGB(255, 0, 0));
	}

	private void gatherEntityStats(EntityStats stat) {
		ResourceLocation registryName = stat.registryName;
		String entityModId = registryName.getNamespace();
		openEntryInstance = getEntityFromStat(stat);
		openEntryStatsLines = new ArrayList<String>();
		openEntryInfoLines = new ArrayList<String>(0);
		LivingEntity livingInstance = openEntryInstance instanceof LivingEntity ? (LivingEntity)openEntryInstance : null;

		if (openEntryInstance != null) {
			if (registeredEntryHandlers.containsKey(entityModId)) {
				try {
					Tuple<List<String>, String> entityData = (Tuple<List<String>, String>)registeredEntryHandlers.get(entityModId).apply(openEntryInstance);
					openEntryStatsLines = entityData.getA();

					if (entityData.getB() != null && entityData.getB().length() > 0)
						openEntryInfoLines = font.listFormattedStringToWidth(entityData.getB(), (int)(734 / 1.5f));
				}
				catch (ClassCastException ex) {
					Logging.logMessage(Level.WARN, "Mod '" + entityModId + "' provided invalid bestiary entry handler. Removing support. Report this to the mod author.");

					registeredEntryHandlers.remove(entityModId);

					openEntryIndex = -1;
					openEntryHeight = 0;
				}
			}
			else {
				String type;
				String attribute = "";

				if (!openEntryInstance.isNonBoss()) {
					type = LocaleUtil.getLocaleString("gui.aoa3.adventGui.bestiary.type.boss");
				}
				else if (openEntryInstance instanceof AoAMeleeMob) {
					if (openEntryInstance instanceof AoARangedAttacker) {
						type = LocaleUtil.getLocaleString("gui.aoa3.adventGui.bestiary.type.hybrid");
					}
					else {
						type = LocaleUtil.getLocaleString("gui.aoa3.adventGui.bestiary.type.melee");
					}
				}
				else if (openEntryInstance instanceof AoARangedMob) {
					type = LocaleUtil.getLocaleString("gui.aoa3.adventGui.bestiary.type.ranged");
				}
				else if (openEntryInstance instanceof AoAFlyingMeleeMob) {
					type = LocaleUtil.getLocaleString("gui.aoa3.adventGui.bestiary.type.flyingMelee");
				}
				else if (openEntryInstance instanceof AoAFlyingRangedMob) {
					type = LocaleUtil.getLocaleString("gui.aoa3.adventGui.bestiary.type.flyingRanged");
				}
				else if (openEntryInstance instanceof AnimalEntity) {
					type = LocaleUtil.getLocaleString("gui.aoa3.adventGui.bestiary.type.animal");
				}
				else if (openEntryInstance instanceof AoAAmbientNPC) {
					type = LocaleUtil.getLocaleString("gui.aoa3.adventGui.bestiary.type.ambient");
				}
				else if (openEntryInstance instanceof AoATrader) {
					type = LocaleUtil.getLocaleString("gui.aoa3.adventGui.bestiary.type.trader");
				}
				else {
					if (entityModId.equals(AdventOfAscension.MOD_ID)) {
						type = LocaleUtil.getLocaleString("gui.aoa3.adventGui.bestiary.type.other");
					}
					else if (openEntryInstance instanceof IRangedAttackMob) {
						type = LocaleUtil.getLocaleString("gui.aoa3.adventGui.bestiary.type.ranged");
					}
					else {
						type = LocaleUtil.getLocaleString("gui.aoa3.adventGui.bestiary.type.melee");
					}
				}

				if (livingInstance != null) {
					CreatureAttribute creatureAttribute = (livingInstance).getCreatureAttribute();

					if (creatureAttribute == ARTHROPOD) {
						attribute = LocaleUtil.getLocaleString("gui.aoa3.adventGui.bestiary.attribute.arthropod");
					}
					else if (creatureAttribute == ILLAGER) {
						attribute = LocaleUtil.getLocaleString("gui.aoa3.adventGui.bestiary.attribute.illager");
					}
					else if (creatureAttribute == UNDEAD) {
						attribute = LocaleUtil.getLocaleString("gui.aoa3.adventGui.bestiary.attribute.undead");
					}
					else if (creatureAttribute == UNDEFINED || creatureAttribute == WATER) {
						attribute = LocaleUtil.getLocaleString("gui.aoa3.adventGui.bestiary.attribute.none");
					}
				}

				openEntryStatsLines.add(TextFormatting.BOLD + LocaleUtil.getLocaleString("gui.aoa3.adventGui.bestiary.type") + TextFormatting.RESET + " " + type);

				if (livingInstance != null && HunterUtil.isHunterCreature(livingInstance)) {
					openEntryStatsLines.add(TextFormatting.BOLD + LocaleUtil.getLocaleString("gui.aoa3.adventGui.bestiary.hunterReq") + TextFormatting.RESET + " " + HunterUtil.getHunterLevel((LivingEntity)openEntryInstance));
					openEntryStatsLines.add(TextFormatting.BOLD + LocaleUtil.getLocaleString("gui.aoa3.adventGui.bestiary.hunterXp") + TextFormatting.RESET + " " + HunterUtil.getHunterXp((LivingEntity)openEntryInstance));
				}

				openEntryStatsLines.add(TextFormatting.BOLD + LocaleUtil.getLocaleString("gui.aoa3.adventGui.bestiary.attribute") + TextFormatting.RESET + " " + attribute);
				openEntryStatsLines.add(TextFormatting.BOLD + LocaleUtil.getLocaleString("gui.aoa3.adventGui.bestiary.size") + TextFormatting.RESET + " " + ((int)(openEntryInstance.getWidth() * 1000)) / 1000f + "x" + ((int)(openEntryInstance.getHeight() * 1000)) / 1000f);
				openEntryStatsLines.add("");

				if (livingInstance != null) {
					openEntryStatsLines.add(TextFormatting.BOLD + LocaleUtil.getLocaleString("gui.aoa3.adventGui.bestiary.health") + TextFormatting.RESET + " " + livingInstance.getMaxHealth());

					if (livingInstance.getAttribute(SharedMonsterAttributes.ARMOR).getValue() > 0)
						openEntryStatsLines.add(TextFormatting.BOLD + LocaleUtil.getLocaleString("gui.aoa3.adventGui.bestiary.armour") + TextFormatting.RESET + " " + livingInstance.getAttribute(SharedMonsterAttributes.ARMOR).getValue());

					if (livingInstance.getAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).getValue() > 0)
						openEntryStatsLines.add(TextFormatting.BOLD + LocaleUtil.getLocaleString("gui.aoa3.adventGui.bestiary.knockback") + TextFormatting.RESET + " " + (livingInstance.getAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).getValue() * 100) + "%");

					IAttributeInstance attackAttribute = livingInstance.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);

					if (attackAttribute != null && attackAttribute.getValue() > 0)
						openEntryStatsLines.add(TextFormatting.BOLD + LocaleUtil.getLocaleString("gui.aoa3.adventGui.bestiary.strength") + TextFormatting.RESET + " " + livingInstance.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getValue());

					if (openEntryInstance instanceof AoARangedAttacker) {
						if (openEntryInstance instanceof AoARangedMob) {
							openEntryStatsLines.add(TextFormatting.BOLD + LocaleUtil.getLocaleString("gui.aoa3.adventGui.bestiary.projectileStrength") + TextFormatting.RESET + " " + ((AoARangedMob)openEntryInstance).getBaseProjectileDamage());
						}
						else if (openEntryInstance instanceof AoAFlyingRangedMob) {
							openEntryStatsLines.add(TextFormatting.BOLD + LocaleUtil.getLocaleString("gui.aoa3.adventGui.bestiary.projectileStrength") + TextFormatting.RESET + " " + ((AoAFlyingRangedMob)openEntryInstance).getBaseProjectileDamage());
						}
					}

					openEntryStatsLines.add(TextFormatting.BOLD + LocaleUtil.getLocaleString("gui.aoa3.adventGui.bestiary.speed") + TextFormatting.RESET + " " + (int)(livingInstance.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getValue() * 1000) / 1000f);
				}

				String bestiaryInfo = BestiaryManager.BESTIARY.get(registryName);

				if (bestiaryInfo != null)
					openEntryInfoLines = font.listFormattedStringToWidth(bestiaryInfo, (int)(734 / 1.5f));
			}
		}
		else {
			openEntryIndex = -1;
			openEntryHeight = 0;
		}
	}

	public static void registerThirdPartyBestiaryHandler(String modId, Function<Entity, Tuple> entityHandlerFunction) {
		if (!modId.equalsIgnoreCase("aoa3"))
			registeredEntryHandlers.put(modId, entityHandlerFunction);
	}

	private static class EntityStats {
		@Nonnull
		private final ResourceLocation registryName;
		private Stat<EntityType<?>> killStat = null;
		private Stat<EntityType<?>> deathStat = null;

		private EntityStats(Stat<EntityType<?>> stat, boolean killStat) {
			this.registryName = stat.getValue().getRegistryName();

			if (killStat) {
				this.killStat = stat;
			}
			else {
				this.deathStat = stat;
			}
		}

		private void matchAndComplete(Stat<EntityType<?>> stat) {
			if (killStat == null) {
				this.killStat = stat;
			}
			else {
				this.deathStat = stat;
			}
		}

		private boolean hasKills() {
			return killStat != null;
		}

		private int getKills(StatisticsManager statsManager) {
			return statsManager.getValue(killStat);
		}

		private int getDeaths(StatisticsManager statsManager) {
			return deathStat != null ? statsManager.getValue(deathStat) : 0;
		}
	}

	private class BestiaryMenu extends ScrollablePane {
		public BestiaryMenu(Minecraft mc, int top, int left, int viewHeight, int viewWidth, float... renderingScale) {
			super(minecraft, top, left, viewHeight, viewWidth, renderingScale);
		}

		@Override
		public int getFullPaneHeight() {
			return receivedStats ? openEntryIndex < 0 ? (filteredMobList.size() + filteredMobList.size() % 2) * 100 + 20 : openEntryHeight : 0;
		}

		@Override
		public void drawPaneContents(int top, int left, int right, int bottom, float scrollDistance, float partialTicks) {
			RenderSystem.pushMatrix();

			if (!receivedStats) {
				RenderUtil.drawCenteredScaledString(font, LocaleUtil.getLocaleString("gui.aoa3.adventGui.bestiary.downloading"), left + (int)(viewWidth / 2f), top + (int)(viewHeight / 2f) - 20, 2f, NumberUtil.RGB(255, 255, 255), RenderUtil.StringRenderType.OUTLINED);
				RenderUtil.drawCenteredScaledString(font, LOADING_STRINGS[(int)(Util.milliTime() / 150L % (long)LOADING_STRINGS.length)], left + (int)(viewWidth / 2f), top + (int)(viewHeight / 2f), 2f, NumberUtil.RGB(255, 255, 255), RenderUtil.StringRenderType.OUTLINED);
			}
			else if (filteredMobList.isEmpty()) {
				if (!statList.isEmpty()) {
					RenderUtil.drawColouredBox(left, AdventMainGui.scaledTabRootY, 0, 20, 20, 0xFF202020);
					getMinecraft().getTextureManager().bindTexture(iconsTextures);
					RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
					RenderUtil.renderScaledCustomSizedTexture(left + 2, AdventMainGui.scaledTabRootY + 2, 0, 32, 16, 16, 16, 16, 16, 48);

					if (searchField.getVisible()) {
						searchField.x = (int)((left + 20) / 2d);
						searchField.y = (int)(AdventMainGui.scaledTabRootY / 2d);
						searchField.setWidth((int)((right - left - 40) / 2d));
						RenderSystem.scalef(2, 2, 2);
						searchField.render(adjustedMouseX, adjustedMouseX, partialTicks);
						RenderSystem.scalef(0.5f, 0.5f, 0.5f);
					}

					RenderUtil.drawCenteredScaledString(font, LocaleUtil.getLocaleString("gui.aoa3.adventGui.bestiary.emptySearch"), left + (int)(viewWidth / 2f), top + (int)(viewHeight / 2f) - 20, 2f, NumberUtil.RGB(255, 255, 255), RenderUtil.StringRenderType.OUTLINED);
				}
				else {
					RenderUtil.drawCenteredScaledString(font, LocaleUtil.getLocaleString("gui.aoa3.adventGui.bestiary.empty"), left + (int)(viewWidth / 2f), top + (int)(viewHeight / 2f) - 20, 2f, NumberUtil.RGB(255, 255, 255), RenderUtil.StringRenderType.OUTLINED);
				}
			}
			else {
				if (openEntryIndex < 0) {
					for (int i = Math.max(0, (int)(scrollDistance / 200f) * 2); i * 100 <= bottom - top && i < filteredMobList.size(); i += 2) {
						EntityStats entityStat = filteredMobList.get(i);
						ResourceLocation registryName = entityStat.registryName;
						int rowTop = top + 20 + i * 100;
						Entity entity = getEntityFromStat(entityStat);
						String entityName = entity != null ? entityStat.killStat.getValue().getName().getFormattedText() : LocaleUtil.getLocaleString("entity." + registryName.getNamespace() + "." + registryName.getPath() + ".name").replace("." + registryName.getNamespace(), "");

						RenderUtil.drawColouredBox(left + 40, rowTop + 30, 0, 320, 150, 0xFF202020);

						if (entity != null)
							drawEntity(entity, left + 200, rowTop + 170, 50f);

						RenderUtil.drawColouredBox(left + 40, rowTop, 0, 320, 30, 0xFF010101);
						RenderUtil.drawCenteredScaledString(font, entityName, left + 200, rowTop + 8, 2f, NumberUtil.RGB(255, 255, 255), RenderUtil.StringRenderType.NORMAL);
						getMinecraft().getTextureManager().bindTexture(iconsTextures);
						RenderSystem.enableAlphaTest();
						RenderUtil.renderScaledCustomSizedTexture(left + 300, rowTop + 160, 0, 0, 16, 16, 16, 16, 16, 48);
						RenderUtil.renderScaledCustomSizedTexture(left + 43, rowTop + 160, 0, 16, 16, 16, 16, 16, 16, 48);
						RenderSystem.disableAlphaTest();
						RenderUtil.drawScaledString(font, NumberUtil.floorAndAppendSuffix(stats.getValue(entityStat.killStat), true), left + 60, rowTop + 163, 1.5f, NumberUtil.RGB(255, 255, 255), RenderUtil.StringRenderType.NORMAL);
						RenderUtil.drawScaledString(font, NumberUtil.floorAndAppendSuffix(stats.getValue(entityStat.deathStat), true), left + 320, rowTop + 163, 1.5f, NumberUtil.RGB(255, 255, 255), RenderUtil.StringRenderType.NORMAL);

						if (i + 1 < filteredMobList.size()) {
							entityStat = filteredMobList.get(i + 1);
							entity = getEntityFromStat(entityStat);
							entityName = entity != null ? entity.getDisplayName().getFormattedText() : LocaleUtil.getLocaleString("entity." + entityStat.registryName.getNamespace() + "." + entityStat.registryName.getPath() + ".name").replace(".minecraft", "");

							RenderUtil.drawColouredBox(right - 360, rowTop + 30, 0, 320, 150, 0xFF202020);

							if (entity != null)
								drawEntity(entity, right - 200, rowTop + 170, 50f);

							RenderUtil.drawColouredBox(right - 360, rowTop, 0, 320, 30, 0xFF010101);
							RenderUtil.drawCenteredScaledString(font, entityName, right - 200, rowTop + 8, 2f, NumberUtil.RGB(255, 255, 255), RenderUtil.StringRenderType.NORMAL);
							getMinecraft().getTextureManager().bindTexture(iconsTextures);
							RenderSystem.enableAlphaTest();
							RenderUtil.renderScaledCustomSizedTexture(right - 100, rowTop + 160, 0, 0, 16, 16, 16, 16, 16, 48);
							RenderUtil.renderScaledCustomSizedTexture(right - 357, rowTop + 160, 0, 16, 16, 16, 16, 16, 16, 48);
							RenderSystem.disableAlphaTest();
							RenderUtil.drawScaledString(font, NumberUtil.floorAndAppendSuffix(stats.getValue(entityStat.killStat), true), right - 340, rowTop + 163, 1.5f, NumberUtil.RGB(255, 255, 255), RenderUtil.StringRenderType.NORMAL);
							RenderUtil.drawScaledString(font, NumberUtil.floorAndAppendSuffix(stats.getValue(entityStat.deathStat), true), right - 80, rowTop + 163, 1.5f, NumberUtil.RGB(255, 255, 255), RenderUtil.StringRenderType.NORMAL);
						}
					}

					RenderSystem.disableDepthTest();
					RenderUtil.drawColouredBox(left, AdventMainGui.scaledTabRootY, 0, 20, 20, 0xFF202020);
					getMinecraft().getTextureManager().bindTexture(iconsTextures);
					RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
					RenderUtil.renderScaledCustomSizedTexture(left + 2, AdventMainGui.scaledTabRootY + 2, 0, 32, 16, 16, 16, 16, 16, 48);

					if (searchField.getVisible()) {
						searchField.x = (int)((left + 20) / 2d);
						searchField.y = (int)(AdventMainGui.scaledTabRootY / 2d);
						searchField.setWidth((int)((right - left - 40) / 2d));
						RenderSystem.scalef(2, 2, 2);
						searchField.render(adjustedMouseX, adjustedMouseX, partialTicks);
						RenderSystem.scalef(0.5f, 0.5f, 0.5f);
					}

					RenderSystem.enableDepthTest();
				}
				else {
					EntityStats entityStat = filteredMobList.get(openEntryIndex);
					ResourceLocation registryName = entityStat.registryName;
					openEntryHeight = Math.max(viewHeight - 30, 320 + (int)(openEntryInfoLines.size() * font.FONT_HEIGHT * 1.5f));

					RenderUtil.drawColouredBox(left, top + 30, 0, right - left, bottom - top, 0xFF202020);
					RenderUtil.drawColouredBox(left, top, 0, right - left, 30, 0xFF010101);
					String entityName = openEntryInstance != null ? openEntryInstance.getName().getFormattedText() : LocaleUtil.getLocaleString("entity." + registryName.getNamespace() + "." + registryName.getPath() + ".name").replace(".minecraft", "");

					RenderUtil.drawCenteredScaledString(font, entityName, left + (int)(viewWidth / 2f), top + 8, 2f, NumberUtil.RGB(255, 255, 255), RenderUtil.StringRenderType.NORMAL);

					if (openEntryInstance != null)
						drawEntity(openEntryInstance, left + 200, top + 240, 75f);

					getMinecraft().getTextureManager().bindTexture(iconsTextures);
					RenderSystem.enableAlphaTest();
					RenderUtil.renderScaledCustomSizedTexture(left + 425, top + 45, 0, 16, 16, 16, 16, 16, 16, 48);
					RenderUtil.renderScaledCustomSizedTexture(left + 425, top + 65, 0, 0, 16, 16, 16, 16, 16, 48);
					RenderSystem.disableAlphaTest();
					RenderUtil.drawScaledString(font, "X", right - 20, top + 5, 1.5f, NumberUtil.RGB(255, 255, 255), RenderUtil.StringRenderType.NORMAL);
					RenderUtil.drawScaledString(font, NumberUtil.floorAndAppendSuffix(stats.getValue(entityStat.killStat), true), left + 445, top + 48, 1.5f, NumberUtil.RGB(255, 255, 255), RenderUtil.StringRenderType.NORMAL);
					RenderUtil.drawScaledString(font, NumberUtil.floorAndAppendSuffix(stats.getValue(entityStat.deathStat), true), left + 445, top + 68, 1.5f, NumberUtil.RGB(255, 255, 255), RenderUtil.StringRenderType.NORMAL);

					RenderSystem.scalef(1.5f, 1.5f, 1.5f);

					for (int i = 0; i < openEntryStatsLines.size(); i++) {
						font.drawStringWithShadow(openEntryStatsLines.get(i), (int)((left + 425) / 1.5f), (int)((top + 100 + 14 * i) / 1.5f), NumberUtil.RGB(255, 255, 255));
					}

					for (int i = 0; i < openEntryInfoLines.size(); i++) {
						font.drawString(openEntryInfoLines.get(i), (int)((left + 20) / 1.5f), (int)((top + 300 + i * 14) / 1.5f), NumberUtil.RGB(255, 255, 255));
					}
				}
			}

			RenderSystem.popMatrix();
		}

		@Override
		public void drawBackground() {}

		private void drawEntity(Entity entity, int posX, int posY, float scale) {
			RenderSystem.pushMatrix();
			RenderSystem.translatef((float)posX, (float)posY, 1050.0F);
			RenderSystem.scalef(1.0F, 1.0F, -1.0F);

			MatrixStack matrix = new MatrixStack();
			Minecraft mc = Minecraft.getInstance();

			matrix.translate(0.0D, 0.0D, 1000.0D);
			matrix.scale(scale, scale, scale);

			Quaternion quaternion = Vector3f.XP.rotationDegrees(180f);

			matrix.rotate(quaternion);

			entity.ticksExisted = mc.player.ticksExisted;
			entity.rotationYaw = 0;
			entity.rotationPitch = 0;
			EntityRendererManager renderManager = mc.getRenderManager();

			renderManager.setRenderShadow(false);

			IRenderTypeBuffer.Impl renderBuffer = mc.getRenderTypeBuffers().getBufferSource();

			renderManager.renderEntityStatic(entity, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F, matrix, renderBuffer, 15728880);
			renderBuffer.finish();
			renderManager.setRenderShadow(true);
			RenderSystem.popMatrix();
		}

		@Override
		public boolean handleMouseClick(double mouseX, double mouseY, int button) {
			super.handleMouseClick(mouseX, mouseY, button);

			if (!receivedStats)
				return false;

			int relativeMouseX = (int)mouseX - left + 2;

			if (openEntryIndex < 0) {
				if (relativeMouseX >= 0 && relativeMouseX <= 20 && mouseY - top + 2 < 20) {
					searchField.setVisible(!searchField.getVisible());

					if (searchField.getVisible()) {
						searchField.setFocused2(true);
					}
					else {
						searchField.setText("");
						searchFilterBestiaryEntries(false);
					}
				}
				else if (searchField.getVisible()) {
					if (searchField.mouseClicked((int)((relativeMouseX + left) / 2d), (int)((mouseY - 2) / 2d), 0))
						return true;
				}

				if (relativeMouseX < 40 || relativeMouseX > right - left - 40)
					return false;
			}

			int newTop = top - Math.max(0, (int)distanceScrolled);
			int relativeMouseY = (int)mouseY - newTop + 2;

			if (mouseY - top < 0 || mouseY > top + viewHeight)
				return false;

			if (openEntryIndex < 0) {
				int selectedIndex = -1;

				if (relativeMouseX < 360) {
					float preIndexY = relativeMouseY / 200f;

					if (preIndexY - ((int)preIndexY) > 0.11)
						selectedIndex = 2 * (int)preIndexY;
				}
				else if (relativeMouseX > right - left - 360) {
					float preIndexY = relativeMouseY / 200f;

					if (preIndexY - ((int)preIndexY) > 0.11)
						selectedIndex = 1 + (int)preIndexY * 2;
				}

				if (selectedIndex >= 0 && filteredMobList.size() > selectedIndex) {
					openEntryIndex = selectedIndex;
					openEntryHeight = 600;
					lastDistanceScrolled = distanceScrolled;
					distanceScrolled = 0;

					if (lastOpenIndex != selectedIndex) {
						if (openEntryInstance != null)
							openEntryInstance.remove();

						gatherEntityStats(filteredMobList.get(selectedIndex));
					}

					lastOpenIndex = selectedIndex;
					searchField.setVisible(false);
				}
			}
			else  {
				if (relativeMouseY <= 30) {
					lastOpenIndex = openEntryIndex;
					openEntryIndex = -1;
					openEntryHeight = 0;
					distanceScrolled = lastDistanceScrolled;
				}
			}

			return true;
		}
	}
}
