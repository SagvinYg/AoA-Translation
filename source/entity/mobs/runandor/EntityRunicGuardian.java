package net.tslat.aoa3.entity.mobs.runandor;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.ItemRegister;
import net.tslat.aoa3.common.registration.SoundsRegister;
import net.tslat.aoa3.entity.base.AoARangedMob;
import net.tslat.aoa3.entity.projectiles.mob.BaseMobProjectile;
import net.tslat.aoa3.entity.projectiles.mob.EntityRunicGuardianShot;
import net.tslat.aoa3.entity.projectiles.mob.EntityRunicGuardianShotHeavy;
import net.tslat.aoa3.entity.projectiles.mob.EntityRunicGuardianShotLight;
import net.tslat.aoa3.library.Enums;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class EntityRunicGuardian extends AoARangedMob {
	public static final float entityWidth = 0.6f;

	public EntityRunicGuardian(World world) {
		super(world, entityWidth, 2f);
	}

	@Override
	public float getEyeHeight() {
		return 1.75f;
	}

	@Override
	protected double getBaseKnockbackResistance() {
		return 0;
	}

	@Override
	protected double getBaseMaxHealth() {
		return 70;
	}

	@Override
	public double getBaseProjectileDamage() {
		return 6;
	}

	@Override
	protected double getBaseMovementSpeed() {
		return 0.207;
	}

	@Override
	protected SoundEvent getStepSound() {
		return null;
	}

	@Override
	protected void dropSpecialItems(int lootingMod, DamageSource source) {
		if (rand.nextInt(20 - lootingMod) == 0)
			dropItem(ItemRegister.runicEnergy, 1);
	}

	@Override
	protected void dropGuaranteedItems(int lootingMod, DamageSource source) {
		dropItem(ItemRegister.coinCopper, 5 + rand.nextInt(9 + lootingMod));
	}

	@Override
	public void attackEntityWithRangedAttack(@Nonnull EntityLivingBase target, float bowDamageFactor) {
		BaseMobProjectile projectile1 = new EntityRunicGuardianShotLight(this, Enums.MobProjectileType.ENERGY);
		BaseMobProjectile projectile2 = new EntityRunicGuardianShot(this, Enums.MobProjectileType.ENERGY);
		BaseMobProjectile projectile3 = new EntityRunicGuardianShotHeavy(this, Enums.MobProjectileType.ENERGY);

		double distanceFactorX = target.posX - this.posX;
		double distanceFactorY = target.getEntityBoundingBox().minY + (double)(target.height / 3.0f) - projectile1.posY;
		double distanceFactorZ = target.posZ - this.posZ;
		double hyp = MathHelper.sqrt(distanceFactorX * distanceFactorX + distanceFactorZ * distanceFactorZ) + 0.2D;

		if (getShootSound() != null)
			world.playSound(null, posX, posY, posZ, getShootSound(), SoundCategory.HOSTILE, 1.0f, 1.0f);

		projectile1.shoot(distanceFactorX, distanceFactorY + hyp * 0.20000000298023224D, distanceFactorZ, 1.6f, (float)(4 - this.world.getDifficulty().getDifficultyId()));
		projectile2.shoot(distanceFactorX, distanceFactorY + hyp * 0.20000000298023224D, distanceFactorZ, 1.6f, (float)(4 - this.world.getDifficulty().getDifficultyId()));
		projectile3.shoot(distanceFactorX, distanceFactorY + hyp * 0.20000000298023224D, distanceFactorZ, 1.6f, (float)(4 - this.world.getDifficulty().getDifficultyId()));
		world.spawnEntity(projectile1);
		world.spawnEntity(projectile2);
		world.spawnEntity(projectile3);
	}

	@Nullable
	@Override
	protected SoundEvent getShootSound() {
		return SoundsRegister.shotWizardBlast;
	}

	@Override
	protected BaseMobProjectile getNewProjectileInstance() {
		return null;
	}
}
