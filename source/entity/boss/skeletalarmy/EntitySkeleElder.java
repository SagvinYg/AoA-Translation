package net.tslat.aoa3.entity.boss.skeletalarmy;

import net.minecraft.block.Block;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.block.functional.altar.ArmyBlock;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.entity.base.AoAMeleeMob;

import javax.annotation.Nullable;

public class EntitySkeleElder extends AoAMeleeMob {
	public static final float entityWidth = 0.7f;
	private final BlockPos armyBlockPos;
	private final int wave;

	public EntitySkeleElder(World world, BlockPos armyBlockPos, int wave) {
		super(world, entityWidth, 2.5625f);

		int posX = armyBlockPos.getX() - 3 + rand.nextInt(6);
		int posZ = armyBlockPos.getZ() - 3 + rand.nextInt(6);
		int posY = world.getHeight(posX, posZ);
		this.armyBlockPos = armyBlockPos;
		this.wave = wave;

		setLocationAndAngles(posX, posY, posZ, rand.nextFloat() * 360, 0);
	}

	public EntitySkeleElder(World world) {
		super(world, entityWidth, 2.5625f);

		this.armyBlockPos = null;
		this.wave = 0;
	}

	@Override
	public float getEyeHeight() {
		return 2.34375f;
	}

	@Override
	protected double getBaseKnockbackResistance() {
		return 0.1;
	}

	@Override
	protected double getBaseMaxHealth() {
		return 60;
	}

	@Override
	protected double getBaseMeleeDamage() {
		return 3;
	}

	@Override
	protected double getBaseMovementSpeed() {
		return 0.25;
	}

	@Nullable
	@Override
	protected SoundEvent getAmbientSound() {
		return SoundEvents.ENTITY_SKELETON_AMBIENT;
	}

	@Nullable
	@Override
	protected SoundEvent getDeathSound() {
		return SoundEvents.ENTITY_SKELETON_DEATH;
	}

	@Nullable
	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundEvents.ENTITY_SKELETON_HURT;
	}

	@Override
	protected SoundEvent getStepSound() {
		return null;
	}

	@Override
	public void onDeath(DamageSource cause) {
		super.onDeath(cause);

		if (wave > 0 && armyBlockPos != null) {
			Block bl = world.getBlockState(armyBlockPos).getBlock();

			if (bl == BlockRegister.armyBlock)
				ArmyBlock.spawnWave(world, armyBlockPos, wave + 1);
		}
	}
}
