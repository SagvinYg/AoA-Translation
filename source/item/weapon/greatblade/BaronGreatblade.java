package net.tslat.aoa3.item.weapon.greatblade;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.tslat.aoa3.common.registration.WeaponRegister;
import net.tslat.aoa3.entity.projectiles.thrown.EntityGrenade;
import net.tslat.aoa3.item.weapon.AdventWeapon;
import net.tslat.aoa3.item.weapon.LongReachWeapon;
import net.tslat.aoa3.utils.ItemUtil;
import net.tslat.aoa3.utils.StringUtil;

import java.util.List;

public class BaronGreatblade extends BaseGreatblade implements AdventWeapon, LongReachWeapon {
	public BaronGreatblade(double dmg, double speed, int durability) {
		super(dmg, speed, durability);
		setUnlocalizedName("BaronGreatblade");
		setRegistryName("aoa3:baron_greatblade");
	}

	@Override
	public void attackEntity(ItemStack stack, Entity target, EntityLivingBase attacker, float dmg) {
		super.attackEntity(stack, target, attacker, dmg);

		if (!attacker.world.isRemote && attacker instanceof EntityPlayer) {
			if (((EntityPlayer)attacker).getCooledAttackStrength(0.0f) > 0.75f) {
				if (((EntityPlayer)attacker).capabilities.isCreativeMode || ItemUtil.findAndConsumeSpecialBullet(attacker, null, true, WeaponRegister.throwableGrenade, ItemStack.EMPTY) != null) {
					attacker.world.spawnEntity(new EntityGrenade(attacker, null));
					stack.damageItem(1, attacker);
				}
			}
		}
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(StringUtil.getColourLocaleString("item.BaronGreatblade.desc.1", TextFormatting.DARK_GREEN));
	}
}
