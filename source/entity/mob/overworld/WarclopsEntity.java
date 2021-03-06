package net.tslat.aoa3.entity.mob.overworld;

import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.AoASounds;
import net.tslat.aoa3.entity.base.AoAMeleeMob;

import javax.annotation.Nullable;

public class WarclopsEntity extends AoAMeleeMob {
	public WarclopsEntity(EntityType<? extends MonsterEntity> entityType, World world) {
		super(entityType, world);
	}

	@Override
	protected float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn) {
		return 1.9f;
	}

	@Override
	protected double getBaseKnockbackResistance() {
		return 0.1;
	}

	@Override
	protected double getBaseMaxHealth() {
		return 30;
	}

	@Override
	protected double getBaseMeleeDamage() {
		return 5.5;
	}

	@Override
	protected double getBaseMovementSpeed() {
		return 0.2875;
	}

	@Nullable
	@Override
	protected SoundEvent getAmbientSound() {
		return AoASounds.ENTITY_CYCLOPS_AMBIENT.get();
	}

	@Override
	protected SoundEvent getDeathSound() {
		return AoASounds.ENTITY_CYCLOPS_DEATH.get();
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return AoASounds.ENTITY_CYCLOPS_HURT.get();
	}

	@Override
	protected boolean isDaylightMob() {
		return true;
	}

	@Override
	protected void onAttack(Entity target) {
		if (target instanceof LivingEntity) {
			double resist = 1;
			IAttributeInstance attrib = ((LivingEntity)target).getAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE);

			if (attrib != null)
				resist -= attrib.getValue();

			((LivingEntity)target).addPotionEffect(new EffectInstance(Effects.SLOWNESS, 50, 0, true, true));
			target.addVelocity(getMotion().getX() * 0.9 * resist, 0.1 * resist, getMotion().getZ() * 0.9 * resist);
			target.velocityChanged = true;
		}
	}

	@Override
	protected boolean isOverworldMob() {
		return true;
	}
}
