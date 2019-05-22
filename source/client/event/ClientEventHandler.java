package net.tslat.aoa3.client.event;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.tslat.aoa3.client.gui.KeyBinder;
import net.tslat.aoa3.client.gui.render.HelmetScreenRenderer;
import net.tslat.aoa3.client.gui.render.ScreenOverlayRenderer;
import net.tslat.aoa3.client.gui.render.SniperGuiRenderer;
import net.tslat.aoa3.client.model.entities.player.LayerPlayerCrown;
import net.tslat.aoa3.common.handlers.PlayerCrownHandler;
import net.tslat.aoa3.common.packet.PacketChangedCrown;
import net.tslat.aoa3.common.packet.PacketGreatbladeHit;
import net.tslat.aoa3.item.armour.ScreenOverlayArmour;
import net.tslat.aoa3.item.weapon.LongReachWeapon;
import net.tslat.aoa3.item.weapon.sniper.BaseSniper;
import net.tslat.aoa3.utils.ConfigurationUtil;
import net.tslat.aoa3.utils.PacketUtil;
import net.tslat.aoa3.utils.StringUtil;
import org.lwjgl.input.Keyboard;

import java.util.List;

@SideOnly(Side.CLIENT)
public class ClientEventHandler {
	public static int tick;
	public static int recoilTicks;
	public static int recoilTicksRemaining;
	public static float recoilAngle;

	@SubscribeEvent
	public void clientTick(final TickEvent.ClientTickEvent ev) {
		if (ev.phase == TickEvent.Phase.END) {
			tick++;

			if (tick > 24000)
				tick = 0;

			if (ScreenOverlayRenderer.overlayTicks > 0)
				--ScreenOverlayRenderer.overlayTicks;

			if (recoilTicksRemaining > 0) {
				--recoilTicksRemaining;
				doRecoil();
			}

			EntityPlayerSP player = Minecraft.getMinecraft().player;

			if (player == null)
				return;

			if (player.isSneaking() && player.onGround) {
				Item sniper = player.getHeldItem(EnumHand.MAIN_HAND).getItem();

				if (sniper instanceof BaseSniper) {
					SniperGuiRenderer.isSniping = true;
					SniperGuiRenderer.screen = ((BaseSniper)sniper).getScreen();
				}
				else {
					SniperGuiRenderer.isSniping = false;
				}
			}
			else {
				SniperGuiRenderer.isSniping = false;

				if (SniperGuiRenderer.screen != null) {
					recoilTicks = 5;
					recoilTicksRemaining = 5;
					recoilAngle = 1.0f;
					SniperGuiRenderer.screen = null;
				}
			}

			HelmetScreenRenderer.active = false;
			Item helmetItem = player.inventory.armorInventory.get(3).getItem();

			if (!SniperGuiRenderer.isSniping && helmetItem instanceof ScreenOverlayArmour) {
				HelmetScreenRenderer.screen = ((ScreenOverlayArmour)helmetItem).getOverlay();
				HelmetScreenRenderer.active = true;
			}
		}
	}

	@SubscribeEvent
	public void configChanged(ConfigChangedEvent.OnConfigChangedEvent ev) {
		if (ev.getModID().equals("aoa3")) {
			ConfigManager.sync("aoa3", Config.Type.INSTANCE);

			if ("aoa3/main_config".equals(ev.getConfigID()))
				PacketUtil.network.sendToServer(new PacketChangedCrown(ConfigurationUtil.MainConfig.personalCrownPreference));
		}
	}

	@SubscribeEvent(receiveCanceled = true)
	public void onGreatbladeMouse(MouseEvent ev) {
		if (ev.getButton() != 0 || !ev.isButtonstate())
			return;

		Minecraft mc = Minecraft.getMinecraft();
		EntityPlayer player = mc.player;

		if (player != null) {
			ItemStack stack = player.getHeldItem(EnumHand.MAIN_HAND);
			ItemStack offHandStack = player.getActiveItemStack();

			if (stack.getItem() instanceof LongReachWeapon && !offHandStack.getItem().isShield(offHandStack, player)) {
				RayTraceResult ray = getExtendedReachRayTrace(((LongReachWeapon)stack.getItem()).getReach());

				if (ray != null)
					PacketUtil.network.sendToServer(new PacketGreatbladeHit(ray.entityHit.getEntityId()));
			}
		}
	}

	@SubscribeEvent
	public void onPlayerRenderPre(RenderPlayerEvent.Pre ev) {
		if (ConfigurationUtil.MainConfig.showPlayerCrowns && PlayerCrownHandler.testForNewRenderer(ev.getEntityPlayer().getGameProfile().getId()))
			ev.getRenderer().addLayer(new LayerPlayerCrown(ev.getRenderer()));
	}

	@SubscribeEvent
	public void onPlayerJoin(PlayerEvent.PlayerLoggedInEvent ev) {
		if (KeyBinder.keyAdventGui.getKeyCode() == 0) {
			ev.player.sendMessage(StringUtil.getColourLocale("message.login.welcome.alt", TextFormatting.GRAY));
		}
		else {
			ev.player.sendMessage(StringUtil.getColourLocaleWithArguments("message.login.welcome", TextFormatting.GRAY, Keyboard.getKeyName(KeyBinder.keyAdventGui.getKeyCode())));
		}

		PacketUtil.network.sendToServer(new PacketChangedCrown(ConfigurationUtil.MainConfig.personalCrownPreference));
	}

	@SubscribeEvent
	public void onPlayerDeath(LivingDeathEvent ev) {
		if (ev.getEntity() instanceof EntityPlayer)
			ScreenOverlayRenderer.overlayTicks = 0;
	}

	private RayTraceResult getExtendedReachRayTrace(float distance) {
		Minecraft mc = Minecraft.getMinecraft();
		Entity viewEntity = mc.getRenderViewEntity();

		if (viewEntity != null && viewEntity.world != null) {
			Vec3d lookVec = viewEntity.getLook(1.0f);
			Vec3d eyesVec = viewEntity.getPositionEyes(1.0f);
			List<Entity> collisionList = mc.world.getEntitiesInAABBexcluding(viewEntity, viewEntity.getEntityBoundingBox().expand(lookVec.x * distance, lookVec.y * distance, lookVec.z * distance).grow(0.5D, 0.5D, 0.5D), Predicates.and(EntitySelectors.NOT_SPECTATING, new Predicate<Entity>() {
				public boolean apply (Entity entity) {
					return !entity.isDead;
				}
			}));

			for (int i = collisionList.size() - 1; i >= 0; i--) {
				Entity collided = collisionList.get(i);

				AxisAlignedBB axis = collided.getEntityBoundingBox().grow(collided.getCollisionBorderSize());
				Vec3d extendedEyesVec = eyesVec.addVector(lookVec.x * distance, lookVec.y * distance, lookVec.z * distance);
				RayTraceResult collisionRay = axis.calculateIntercept(eyesVec, extendedEyesVec);

				if (axis.contains(eyesVec)) {
					if (collided.getLookVec().distanceTo(lookVec) <= distance) {
						return new RayTraceResult(collided);
					}
				}
				else if (collisionRay != null) {
					if (eyesVec.distanceTo(collisionRay.hitVec) < distance) {
						return new RayTraceResult(collided);
					}
				}
			}
		}

		return null;
	}

	private void doRecoil() {
		final EntityPlayerSP player = Minecraft.getMinecraft().player;

		if (player == null)
			return;

		if (recoilTicksRemaining >= recoilTicks - 5) {
			player.rotationPitch -= recoilAngle / (4.0f * (SniperGuiRenderer.isSniping ? 4 : 1));
		}
		else {
			player.rotationPitch += recoilAngle / (35.0f  * (SniperGuiRenderer.isSniping ? 2 : 1));
		}
	}
}
