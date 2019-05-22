package net.tslat.aoa3.entity.mobs.mysterium;

import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.SoundsRegister;
import net.tslat.aoa3.entity.base.AoAMeleeMob;

import javax.annotation.Nullable;

public class EntitySpiritGuardian extends AoAMeleeMob {
	public static final float entityWidth = 0.6f;

	public EntitySpiritGuardian(EntityEeo eeo) {
		this(eeo.world);

		setLocationAndAngles(eeo.posX, eeo.posY, eeo.posZ, eeo.rotationYaw, eeo.rotationPitch);
	}

	public EntitySpiritGuardian(World world) {
		super(world, entityWidth, 1.8125f);
	}

	@Override
	public float getEyeHeight() {
		return 1.6875f;
	}

	@Override
	protected double getBaseKnockbackResistance() {
		return 1;
	}

	@Override
	protected double getBaseMaxHealth() {
		return 45;
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
		return SoundsRegister.mobSpiritLiving;
	}

	@Nullable
	@Override
	protected SoundEvent getDeathSound() {
		return SoundsRegister.mobSpiritDeath;
	}

	@Nullable
	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundsRegister.mobSpiritLiving;
	}

	@Override
	protected SoundEvent getStepSound() {
		return null;
	}
}
