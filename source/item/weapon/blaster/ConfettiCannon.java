package net.tslat.aoa3.item.weapon.blaster;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.tslat.aoa3.entity.projectiles.blaster.EntityConfettiShot;
import net.tslat.aoa3.utils.StringUtil;

import java.util.List;

public class ConfettiCannon extends BaseBlaster {
	public ConfettiCannon(double dmg, SoundEvent sound, int durability, int fireDelayTicks, float energyCost) {
		super(dmg, sound, durability, fireDelayTicks, energyCost);
		setUnlocalizedName("ConfettiCannon");
		setRegistryName("aoa3:confetti_cannon");
	}

	@Override
	public void fire(ItemStack blaster, EntityLivingBase shooter) {
		EntityConfettiShot shot = new EntityConfettiShot(shooter, this, 1);
		shot.motionX = 0;
		shot.motionY = 0;
		shot.motionZ = 0;
		shooter.world.spawnEntity(shot);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack stack, World world, List<String> tooltip, ITooltipFlag flag) {
		tooltip.add(StringUtil.getColourLocaleString("item.ConfettiCannon.desc.1", TextFormatting.DARK_GREEN));
		super.addInformation(stack, world, tooltip, flag);
	}
}
