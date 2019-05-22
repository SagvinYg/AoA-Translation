package net.tslat.aoa3.block.functional.utility;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.tslat.aoa3.capabilities.handlers.AdventPlayerCapability;
import net.tslat.aoa3.common.registration.ItemRegister;
import net.tslat.aoa3.entity.boss.flash.EntityFlash;
import net.tslat.aoa3.entity.boss.klobber.EntityKlobber;
import net.tslat.aoa3.entity.boss.mirage.EntityMirage;
import net.tslat.aoa3.entity.boss.proshield.EntityProshield;
import net.tslat.aoa3.library.Enums;
import net.tslat.aoa3.utils.ItemUtil;
import net.tslat.aoa3.utils.PlayerUtil;
import net.tslat.aoa3.utils.StringUtil;

public class ImmortallisProgressor extends Block {
	private final int place;

	public ImmortallisProgressor(String name, String registryName, int place) {
		super(Material.ROCK);
		setUnlocalizedName(name);
		setRegistryName("aoa3:" + registryName);
		setHardness(-1f);
		setResistance(999999999f);
		this.place = place;
		setSoundType(SoundType.STONE);
		setCreativeTab(null);
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (!world.isRemote) {
			AdventPlayerCapability cap;

			switch (place) {
				case 1:
					if (ItemUtil.consumeItem(player, new ItemStack(ItemRegister.progressCoin0))) {
						if (!player.addItemStackToInventory(new ItemStack(ItemRegister.returnCrystal))) {
							cap = PlayerUtil.getAdventPlayer(player);

							cap.sendPlayerMessage(StringUtil.getLocale("message.feedback.item.returnCrystal.noSpace"));
							cap.resetAllTribute();
							player.entityDropItem(new ItemStack(ItemRegister.progressCoin0), 0.5f);
						}
						else {
							player.sendMessage(StringUtil.getColourLocale("message.feedback.immortallisProgression.goldStart.0", TextFormatting.GOLD));
							player.sendMessage(StringUtil.getColourLocale("message.feedback.immortallisProgression.goldStart.1", TextFormatting.GOLD));
							player.setPositionAndUpdate(28, 20, 2);
						}

						return true;
					}
					break;
				case 2:
					if (PlayerUtil.getAdventPlayer(player).getTribute(Enums.Deities.PLUTON) >= 100) {
						if (world.getEntitiesWithinAABB(EntityKlobber.class, new AxisAlignedBB(52, 16, -13, 82, 26, 17)).size() == 0) {
							EntityKlobber klobber = new EntityKlobber(world);

							klobber.setPositionAndUpdate(69, 21, 4);
							world.spawnEntity(klobber);
						}

						player.setPositionAndUpdate(67, 21, 2);
						player.sendMessage(StringUtil.getColourLocale("message.feedback.immortallisProgression.klobberStart", TextFormatting.DARK_AQUA));

						return true;
					}
					break;
				case 3:
					if (ItemUtil.consumeItem(player, new ItemStack(ItemRegister.progressCoin1))) {
						player.sendMessage(StringUtil.getColourLocale("message.feedback.immortallisProgression.skeletalSpiritsStart", TextFormatting.RED));
						player.setPositionAndUpdate(81, 21, 2);

						return true;
					}
					break;
				case 4:
					if (PlayerUtil.getAdventPlayer(player).getTribute(Enums.Deities.EREBON) >= 100) {
						if (world.getEntitiesWithinAABB(EntityProshield.class, new AxisAlignedBB(107, 16, -13, 137, 26, 17)).size() == 0) {
							EntityProshield proshield = new EntityProshield(world);

							proshield.setPositionAndUpdate(123, 21, 6);
							world.spawnEntity(proshield);
						}

						player.setPositionAndUpdate(122, 21, 2);
						player.sendMessage(StringUtil.getColourLocale("message.feedback.immortallisProgression.proshieldStart", TextFormatting.DARK_AQUA));

						return true;
					}
					break;
				case 5:
					if (ItemUtil.consumeItem(player, new ItemStack(ItemRegister.progressCoin2))) {
						player.sendMessage(StringUtil.getColourLocale("message.feedback.immortallisProgression.pureGoldStart.0", TextFormatting.GOLD));
						player.sendMessage(StringUtil.getColourLocale("message.feedback.immortallisProgression.pureGoldStart.1", TextFormatting.GOLD));
						player.setPositionAndUpdate(141, 24, 2);

						return true;
					}
					break;
				case 6:
					if (PlayerUtil.getAdventPlayer(player).getTribute(Enums.Deities.PLUTON) == 200) {
						if (world.getEntitiesWithinAABB(EntityMirage.class, new AxisAlignedBB(153, 19, -8, 183, 29, 22)).size() == 0) {
							EntityMirage mirage = new EntityMirage(world);

							mirage.setPositionAndUpdate(177, 24, -2);
							world.spawnEntity(mirage);
						}

						player.setPositionAndUpdate(168, 24, 7);
						player.sendMessage(StringUtil.getColourLocale("message.feedback.immortallisProgression.mirageStart", TextFormatting.DARK_AQUA));

						return true;
					}
					break;
				case 7:
					if (ItemUtil.consumeItem(player, new ItemStack(ItemRegister.progressCoin3))) {
						player.sendMessage(StringUtil.getColourLocale("message.feedback.immortallisProgression.evilSpiritsStart", TextFormatting.RED));
						player.setPositionAndUpdate(189, 20, 2);

						return true;
					}
					break;
				case 8:
					if (PlayerUtil.getAdventPlayer(player).getTribute(Enums.Deities.EREBON) == 200) {
						if (world.getEntitiesWithinAABB(EntityFlash.class, new AxisAlignedBB(218, 16, -12, 248, 26, 18)).size() == 0) {
							EntityFlash flash = new EntityFlash(world);

							flash.setPositionAndUpdate(235, 22, 10);
							world.spawnEntity(flash);
						}

						player.setPositionAndUpdate(233, 21, 3);
						player.sendMessage(StringUtil.getColourLocale("message.feedback.immortallisProgression.flashStart", TextFormatting.DARK_AQUA));

						return true;
					}
					break;
				case 9:
					if (ItemUtil.consumeItem(player, new ItemStack(ItemRegister.progressCoin4))) {
						player.setPositionAndUpdate(0, 20, 0);
						ItemUtil.consumeItem(player, new ItemStack(ItemRegister.returnCrystal));
						PlayerUtil.getAdventPlayer(player).resetAllTribute();

						return true;
					}
					break;
			}
		}

		return true;
	}
}
