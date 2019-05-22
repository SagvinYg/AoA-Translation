package net.tslat.aoa3.entity.mobs.overworld;

import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.SoundsRegister;
import net.tslat.aoa3.entity.base.AoAMeleeMob;

import javax.annotation.Nullable;

public class EntityTricksterClone extends AoAMeleeMob {
	public static final float entityWidth = 0.6f;

	public EntityTricksterClone(World world) {
		super(world, entityWidth, 1.75f);
	}

	@Override
	public float getEyeHeight() {
		return 1.65f;
	}

	public EntityTricksterClone(World world, double posX, double posY, double posZ) {
		super(world, entityWidth, 1.75f);
		setLocationAndAngles(posX, posY, posZ, rand.nextFloat() * 360f, 0f);
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
		return 4;
	}

	@Override
	protected double getBaseMovementSpeed() {
		return 0.2875;
	}

	@Nullable
	@Override
	protected SoundEvent getAmbientSound() {
		return SoundsRegister.mobTricksterLiving;
	}

	@Override
	protected SoundEvent getDeathSound() {
		return SoundsRegister.mobTricksterHit;
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundsRegister.mobTricksterHit;
	}

	@Override
	public void onDeath(DamageSource cause) {
		super.onDeath(cause);

		world.createExplosion(this, posX, posY, posZ, 2, false);
		setDead();
	}

	@Override
	protected boolean isOverworldMob() {
		return true;
	}
}
