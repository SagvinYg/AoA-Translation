package net.tslat.aoa3.item.weapon.thrown;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.tslat.aoa3.common.registration.CreativeTabsRegister;
import net.tslat.aoa3.common.registration.SoundsRegister;
import net.tslat.aoa3.entity.projectiles.gun.BaseBullet;
import net.tslat.aoa3.entity.projectiles.thrown.EntityGooBall;
import net.tslat.aoa3.item.weapon.gun.BaseGun;
import net.tslat.aoa3.utils.ItemUtil;
import net.tslat.aoa3.utils.StringUtil;

import java.util.List;

public class GooBall extends BaseThrownWeapon {
	public static final float dmg = 3.5f;

	public GooBall() {
		super(dmg, SoundEvents.ENTITY_ARROW_SHOOT, 7);
		setUnlocalizedName("GooBall");
		setRegistryName("aoa3:goo_ball");
		setCreativeTab(CreativeTabsRegister.thrownWeaponsTab);
	}

	@Override
	public BaseBullet findAndConsumeAmmo(EntityPlayer player, BaseGun gun, EnumHand hand) {
		if (ItemUtil.findAndConsumeSpecialBullet(player, gun, true, this, player.getHeldItem(hand)) != null)
			return new EntityGooBall(player, gun);

		return null;
	}

	@Override
	public void doImpactDamage(Entity target, EntityLivingBase shooter, BaseBullet gooBall, float bulletDmgMultiplier) {
		super.doImpactDamage(target, shooter, gooBall, bulletDmgMultiplier);

		if (target instanceof EntityLivingBase)
			((EntityLivingBase)target).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 60, 1));

		shooter.world.playSound(null, gooBall.posX, gooBall.posY, gooBall.posZ, SoundsRegister.gooBallImpact, SoundCategory.PLAYERS, 1.0f, 1.0f);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack stack, World world, List<String> tooltip, ITooltipFlag flag) {
		tooltip.add(StringUtil.getColourLocaleString("items.description.damage.slow", TextFormatting.DARK_GREEN));
		super.addInformation(stack, world, tooltip, flag);
	}
}
