package net.tslat.aoa3.entity.mob.overworld;

import net.minecraft.entity.*;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.AoASounds;
import net.tslat.aoa3.entity.base.AoAMeleeMob;
import net.tslat.aoa3.util.DamageUtil;
import net.tslat.aoa3.util.EntityUtil;
import net.tslat.aoa3.util.PotionUtil;

import javax.annotation.Nullable;

public class TreeSpiritEntity extends AoAMeleeMob {
	public TreeSpiritEntity(EntityType<? extends MonsterEntity> entityType, World world) {
		super(entityType, world);
	}

	@Override
	protected float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn) {
		return 2.4f;
	}

	@Override
	protected double getBaseKnockbackResistance() {
		return 1.0f;
	}

	@Override
	protected double getBaseMaxHealth() {
		return 35;
	}

	@Override
	protected double getBaseMeleeDamage() {
		return 6;
	}

	@Override
	protected double getBaseMovementSpeed() {
		return 0.329;
	}

	@Nullable
	@Override
	protected SoundEvent getAmbientSound() {
		return AoASounds.ENTITY_TREE_SPIRIT_AMBIENT.get();
	}

	@Override
	protected SoundEvent getDeathSound() {
		return AoASounds.ENTITY_TREE_SPIRIT_DEATH.get();
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return AoASounds.ENTITY_TREE_SPIRIT_HURT.get();
	}

	@Override
	protected boolean isDaylightMob() {
		return true;
	}

	@Override
	protected void onAttack(Entity target) {
		if (target instanceof LivingEntity) {
			DamageUtil.doBodySlamKnockback((LivingEntity)target, this, 5, 1, 5);
			EntityUtil.applyPotions(target, new PotionUtil.EffectBuilder(Effects.SLOWNESS, 50));
		}
	}

	@Override
	protected boolean isOverworldMob() {
		return true;
	}
}
