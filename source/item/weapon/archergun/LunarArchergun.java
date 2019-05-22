package net.tslat.aoa3.item.weapon.archergun;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.tslat.aoa3.entity.projectiles.gun.BaseBullet;
import net.tslat.aoa3.utils.EntityUtil;
import net.tslat.aoa3.utils.StringUtil;

import java.util.List;

public class LunarArchergun extends BaseArchergun {
	private final double baseDmg;
	private final double maxDamage = 19;
	private final int firingDelay;

	public LunarArchergun(double dmg, SoundEvent sound, int durability, int fireDelayTicks, float recoil) {
		super(dmg, sound, durability, fireDelayTicks, recoil);
		this.baseDmg = dmg;
		setUnlocalizedName("LunarArchergun");
		setRegistryName("aoa3:lunar_archergun");
		this.firingDelay = fireDelayTicks;
	}

	@Override
	public void doImpactDamage(Entity target, EntityLivingBase shooter, BaseBullet bullet, float bulletDmgMultiplier) {
		if (target != null) {
			bullet.doImpactEffect();
			EntityUtil.dealGunDamage(target, shooter, bullet, ((float)baseDmg + itemRand.nextInt((int)maxDamage + 1 - (int)baseDmg)) * bulletDmgMultiplier);
		}
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack stack, World world, List<String> tooltip, ITooltipFlag flag) {
		tooltip.add(StringUtil.getColourLocaleStringWithArguments("items.description.damage.random", TextFormatting.DARK_GREEN, Double.toString(baseDmg), Double.toString(maxDamage)));
		tooltip.add(StringUtil.getLocaleStringWithArguments("items.description.gun.speed", Double.toString((2000 / firingDelay) / (double)100)));
		tooltip.add(StringUtil.getColourLocaleString("items.description.ammo.arrows", TextFormatting.LIGHT_PURPLE));
	}
}
