package net.tslat.aoa3.entity.mobs.lunalus;

import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.SoundsRegister;
import net.tslat.aoa3.entity.base.AoAFlyingMeleeMob;

import javax.annotation.Nullable;

public class EntityExplodot extends AoAFlyingMeleeMob {
	public static final float entityWidth = 0.6f;

	public EntityExplodot(World world) {
		super(world, entityWidth, 1f);
	}

	@Override
	public float getEyeHeight() {
		return 0.71875f;
	}

	@Override
	protected double getBaseKnockbackResistance() {
		return 0;
	}

	@Override
	protected double getBaseMaxHealth() {
		return 40;
	}

	@Override
	protected double getBaseMeleeDamage() {
		return 3;
	}

	@Override
	protected double getBaseMovementSpeed() {
		return 0.1;
	}

	@Nullable
	@Override
	protected SoundEvent getAmbientSound() {
		return SoundsRegister.mobExplodotLiving;
	}

	@Nullable
	@Override
	protected SoundEvent getDeathSound() {
		return SoundsRegister.mobExplodotDeath;
	}

	@Nullable
	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundsRegister.mobExplodotHit;
	}

	@Override
	protected void doMeleeEffect(Entity target) {
		world.createExplosion(this, posX, posY, posZ, 3, false);

		if (!world.isRemote)
			setDead();
	}
}
