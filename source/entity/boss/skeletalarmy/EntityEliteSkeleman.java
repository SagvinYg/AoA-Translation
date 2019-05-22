package net.tslat.aoa3.entity.boss.skeletalarmy;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.common.registration.SoundsRegister;
import net.tslat.aoa3.entity.base.AoARangedMob;
import net.tslat.aoa3.entity.projectiles.mob.BaseMobProjectile;
import net.tslat.aoa3.entity.projectiles.mob.EntitySpiritualShot;
import net.tslat.aoa3.library.Enums;

import javax.annotation.Nullable;

public class EntityEliteSkeleman extends AoARangedMob {
	public static final float entityWidth = 0.8f;

	public EntityEliteSkeleman(World world, BlockPos armyBlockPos) {
		this(world);

		int posX = armyBlockPos.getX() - 3 + rand.nextInt(6);
		int posZ = armyBlockPos.getZ() - 3 + rand.nextInt(6);
		int posY = world.getHeight(posX, posZ);

		setLocationAndAngles(posX, posY, posZ, rand.nextFloat() * 360, 0);
	}

	public EntityEliteSkeleman(World world) {
		super(world, entityWidth, 1.75f);
	}

	@Override
	public float getEyeHeight() {
		return 1.46875f;
	}

	@Override
	protected double getBaseKnockbackResistance() {
		return 0;
	}

	@Override
	protected double getBaseMaxHealth() {
		return 120;
	}

	@Override
	public double getBaseProjectileDamage() {
		return 7;
	}

	@Override
	protected double getBaseMovementSpeed() {
		return 0.207;
	}

	@Nullable
	@Override
	protected SoundEvent getShootSound() {
		return SoundsRegister.shotSkelemanFire;
	}

	@Override
	protected BaseMobProjectile getNewProjectileInstance() {
		return new EntitySpiritualShot(this, Enums.MobProjectileType.ENERGY);
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
	protected void dropSpecialItems(int lootingMod, DamageSource source) {
		if (rand.nextInt(7) == 0)
			dropItem(Item.getItemFromBlock(BlockRegister.bannerSkeletal), 1);
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		if (source.getImmediateSource() instanceof EntitySpiritualShot)
			return false;

		return super.attackEntityFrom(source, amount);
	}

	@Override
	protected SoundEvent getStepSound() {
		return null;
	}
}
