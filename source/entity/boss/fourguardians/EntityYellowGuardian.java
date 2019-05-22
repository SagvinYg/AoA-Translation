package net.tslat.aoa3.entity.boss.fourguardians;

import com.google.common.base.Predicate;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.common.registration.SoundsRegister;
import net.tslat.aoa3.common.registration.WeaponRegister;
import net.tslat.aoa3.entity.base.AoARangedMob;
import net.tslat.aoa3.entity.minions.AoAMinion;
import net.tslat.aoa3.entity.projectiles.mob.BaseMobProjectile;
import net.tslat.aoa3.entity.projectiles.mob.EntityYellowGuardianShot;
import net.tslat.aoa3.entity.properties.BossEntity;
import net.tslat.aoa3.library.Enums;
import net.tslat.aoa3.utils.ModUtil;

import javax.annotation.Nullable;

public class EntityYellowGuardian extends AoARangedMob implements BossEntity {
	private static final ResourceLocation bossBarTexture = new ResourceLocation("aoa3", "textures/gui/bossbars/yellow_guardian.png");
	public static final float entityWidth = 1.5f;

	private EntityRedGuardian redGuardian;
	private EntityGreenGuardian greenGuardian;
	private EntityBlueGuardian blueGuardian;

	public EntityYellowGuardian(World world) {
		super(world, entityWidth, 2.625f);
	}

	@Override
	public float getEyeHeight() {
		return 1.875f;
	}

	@Override
	protected void initEntityAI() {
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(2, new EntityAIMoveTowardsRestriction(this, 1.0d));
		this.tasks.addTask(3, new EntityAIAttackRanged(this, 1.0d, 15, 30, 32));
		this.tasks.addTask(4, new EntityAIWanderAvoidWater(this, 1.0d));
		this.tasks.addTask(5, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0f));
		this.tasks.addTask(5, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, AoAMinion.class, 10, true, false, (Predicate<AoAMinion>)minion -> minion.isTamed()));
		this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
		this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
	}

	@Override
	protected double getBaseKnockbackResistance() {
		return 0;
	}

	@Override
	protected double getBaseMaxHealth() {
		return 750;
	}

	@Override
	public double getBaseProjectileDamage() {
		return 15;
	}

	@Override
	protected double getBaseMovementSpeed() {
		return 0.207;
	}

	@Nullable
	@Override
	protected SoundEvent getDeathSound() {
		return SoundsRegister.mobGuardianDeath;
	}

	@Nullable
	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundsRegister.mobGuardianHit;
	}

	@Nullable
	@Override
	protected SoundEvent getShootSound() {
		return SoundsRegister.shotGuardianFire;
	}

	@Override
	public boolean isNonBoss() {
		return false;
	}
	
	public void setGreenGuardian(EntityGreenGuardian greenGuardian) {
		this.greenGuardian = greenGuardian;
	}
	
	public void setRedGuardian(EntityRedGuardian redGuardian) {
		this.redGuardian = redGuardian;
	}
	
	public void setBlueGuardian(EntityBlueGuardian blueGuardian) {
		this.blueGuardian = blueGuardian;
	}

	@Override
	protected void dropSpecialItems(int lootingMod, DamageSource source) {
		if (checkGuardian(redGuardian) || checkGuardian(greenGuardian) || checkGuardian(blueGuardian))
			return;

		if (source.getTrueSource() instanceof EntityPlayerMP)
			ModUtil.completeAdvancement((EntityPlayerMP)source.getTrueSource(), "haven/guard_that", "kill_four_guardians");
		
		dropItem(Item.getItemFromBlock(BlockRegister.statueGuardian), 1);
		
		switch (rand.nextInt(4)) {
			case 0:
				dropItem(WeaponRegister.swordGuardians, 1);
				break;
			case 1:
				dropItem(WeaponRegister.gunBayonetteRifle, 1);
				break;
			case 2:
				dropItem(WeaponRegister.shotgunRedRocket, 1);
				break;
			case 3:
				dropItem(WeaponRegister.blasterEradicator, 1);
				break;
		}
	}

	private boolean checkGuardian(EntityLivingBase guardian) {
		return guardian != null && guardian.isDead;
	}

	@Override
	public void onDeath(DamageSource cause) {
		super.onDeath(cause);
		
		if (!world.isRemote)
			setDead();
	}

	@Override
	public void doProjectileEntityImpact(BaseMobProjectile projectile, Entity target) {
		if (target instanceof AoARangedMob && target instanceof BossEntity)
			return;

		super.doProjectileEntityImpact(projectile, target);
	}

	@Override
	protected BaseMobProjectile getNewProjectileInstance() {
		return new EntityYellowGuardianShot(this, Enums.MobProjectileType.ENERGY);
	}

	@Override
	public ResourceLocation getBossBarTexture() {
		return bossBarTexture;
	}

	@Override
	public void setAttackTarget(@Nullable EntityLivingBase target) {
		if (target instanceof BossEntity)
			return;

		super.setAttackTarget(target);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void checkMusicStatus() {}
}
