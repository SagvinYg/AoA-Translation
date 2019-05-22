package net.tslat.aoa3.entity.minions;

import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.SoundsRegister;

import javax.annotation.Nullable;

public class EntityShadowStalker extends AoAMinion {
	public static final float entityWidth = 1.125f;

	public EntityShadowStalker(final World world){
		super(world, 250, entityWidth, 1.59375f);
	}

	@Override
	public float getEyeHeight() {
		return 0.9375f;
	}

	@Override
	protected double getBaseMoveSpeed() {
		return 0.3d;
	}

	@Override
	protected double getBaseMaxHealth() {
		return 25.0d;
	}

	@Override
	protected double getBaseMeleeDamage() {
		return 15.0d;
	}

	@Override
	protected boolean isHostile() {
		return true;
	}

	@Nullable
	@Override
	protected SoundEvent getAmbientSound() {
		return SoundsRegister.mobDistorterLiving;
	}

	@Nullable
	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundsRegister.mobDistorterHit;
	}

	@Nullable
	@Override
	protected SoundEvent getDeathSound() {
		return SoundsRegister.mobDistorterDeath;
	}
}
