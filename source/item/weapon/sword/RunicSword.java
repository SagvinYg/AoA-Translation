package net.tslat.aoa3.item.weapon.sword;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.tslat.aoa3.common.registration.AoAItems;
import net.tslat.aoa3.item.misc.RuneItem;
import net.tslat.aoa3.util.DamageUtil;
import net.tslat.aoa3.util.ItemUtil;
import net.tslat.aoa3.util.LocaleUtil;
import net.tslat.aoa3.util.constant.AttackSpeed;

import javax.annotation.Nullable;
import java.util.List;

public class RunicSword extends BaseSword {
	public RunicSword() {
		super(ItemUtil.customItemTier(2450, AttackSpeed.NORMAL, 17.5f, 4, 10, null));
	}

	@Override
	protected void doMeleeEffect(ItemStack stack, LivingEntity target, LivingEntity attacker, float attackCooldown) {
		if (!attacker.world.isRemote && attackCooldown > 0.75 && attacker instanceof PlayerEntity) {
			ItemStack offhandStack = attacker.getHeldItemOffhand();

			if (offhandStack.getItem() instanceof RuneItem && offhandStack.getCount() >= 5) {
				RuneItem rune = (RuneItem)offhandStack.getItem();

				if (rune == AoAItems.POISON_RUNE.get()) {
					target.addPotionEffect(new EffectInstance(Effects.POISON, 72, 1, false, true));
				}
				else if (rune == AoAItems.WITHER_RUNE.get()) {
					target.addPotionEffect(new EffectInstance(Effects.WITHER, 40, 2, false, true));
				}
				else if (rune == AoAItems.FIRE_RUNE.get()) {
					target.setFire(5);
				}
				else if (rune == AoAItems.WIND_RUNE.get()) {
					DamageUtil.doScaledKnockback(target, attacker, 0.5f, attacker.getPosX() - target.getPosX(), attacker.getPosZ() - target.getPosZ());
				}
				else if (rune == AoAItems.WATER_RUNE.get()) {
					target.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 60, 0, false, true));
				}
				else if (rune == AoAItems.CHARGED_RUNE.get()) {
					((ServerWorld)target.world).spawnParticle(ParticleTypes.ANGRY_VILLAGER, target.getPosX() + (random.nextFloat() * target.getWidth() * 2f) - target.getWidth(), target.getPosY() + 1 + (random.nextFloat() * target.getHeight()), target.getPosZ() + (random.nextFloat() * target.getWidth() * 2f) - target.getWidth(), 3, 0, 0, 0, (double)0);
				}
				else {
					return;
				}

				if (!((PlayerEntity)attacker).isCreative()) {
					offhandStack.shrink(5);
					ItemUtil.damageItem(stack, attacker, 1, EquipmentSlotType.MAINHAND);
				}
			}
		}
	}

	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(LocaleUtil.getFormattedItemDescriptionText(this, LocaleUtil.ItemDescriptionType.BENEFICIAL, 1));
		tooltip.add(LocaleUtil.getFormattedItemDescriptionText(this, LocaleUtil.ItemDescriptionType.HARMFUL, 2));
	}
}
