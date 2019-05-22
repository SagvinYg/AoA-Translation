package net.tslat.aoa3.entity.boss.hydrolisk;

import com.google.common.base.Predicate;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.tslat.aoa3.common.registration.ArmourRegister;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.common.registration.ItemRegister;
import net.tslat.aoa3.common.registration.SoundsRegister;
import net.tslat.aoa3.entity.base.AoAMeleeMob;
import net.tslat.aoa3.entity.minions.AoAMinion;
import net.tslat.aoa3.entity.properties.BossEntity;
import net.tslat.aoa3.entity.properties.SpecialPropertyEntity;
import net.tslat.aoa3.library.Enums;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.TreeSet;

public class EntityHydrolisk extends AoAMeleeMob implements BossEntity, SpecialPropertyEntity {
	private static final ResourceLocation bossBarTexture = new ResourceLocation("aoa3", "textures/gui/bossbars/hydrolisk.png");
	private static final ResourceLocation shieldedBossBarTexture = new ResourceLocation("aoa3", "textures/gui/bossbars/hydrolisk_armour.png");
	private static final DataParameter<Boolean> SHIELDED = EntityDataManager.<Boolean>createKey(EntityHydrolisk.class, DataSerializers.BOOLEAN);
	private boolean shielded = true;
	public static final float entityWidth = 1.9f;

	public EntityHydrolisk(World world) {
		super(world, entityWidth, 3f);
	}

	@Override
	protected void initEntityAI() {
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(2, new EntityAIAttackMelee(this, 1.0d, false));
		this.tasks.addTask(3, new EntityAIMoveTowardsRestriction(this, 1.0d));
		this.tasks.addTask(4, new EntityAIWander(this, 1.0d));
		this.tasks.addTask(5, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0f));
		this.tasks.addTask(5, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, AoAMinion.class, 10, true, false, (Predicate<AoAMinion>)minion -> minion.isTamed()));
		this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
		this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
	}

	@Override
	public float getEyeHeight() {
		return 2.625f;
	}

	@Override
	protected void entityInit() {
		super.entityInit();

		this.dataManager.register(SHIELDED, true);
	}

	@Override
	protected double getBaseKnockbackResistance() {
		return 0.8;
	}

	@Override
	protected double getBaseMaxHealth() {
		return 609;
	}

	@Override
	protected double getBaseMeleeDamage() {
		return 12;
	}

	@Override
	protected double getBaseMovementSpeed() {
		return 0.2875;
	}

	@Nullable
	@Override
	protected SoundEvent getAmbientSound() {
		return SoundsRegister.mobHydroliskLiving;
	}

	@Nullable
	@Override
	protected SoundEvent getDeathSound() {
		return SoundsRegister.mobHydroliskDeath;
	}

	@Nullable
	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundsRegister.mobHydroliskHit;
	}

	@Override
	protected SoundEvent getStepSound() {
		return SoundsRegister.mobEmperorBeastStep;
	}

	@Override
	public boolean isNonBoss() {
		return false;
	}

	@Override
	public boolean getIsInvulnerable() {
		return this.dataManager.get(SHIELDED);
	}

	public boolean isShielded() {
		return this.dataManager.get(SHIELDED);
	}

	private void disableShield() {
		this.dataManager.set(SHIELDED, false);
		this.shielded = false;
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(800);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(16);
		this.setHealth(800);
	}

	@Override
	protected void dropSpecialItems(int lootingMod, DamageSource source) {
		if (!shielded) {
			dropItem(Item.getItemFromBlock(BlockRegister.statueHydrolisk), 1);

			switch (rand.nextInt(4)) {
				case 0:
					dropItem(ArmourRegister.HydroplateBoots, 1);
					break;
				case 1:
					dropItem(ArmourRegister.HydroplateLegs, 1);
					break;
				case 2:
					dropItem(ArmourRegister.HydroplateBody, 1);
					break;
				case 3:
					dropItem(ArmourRegister.HydroplateHelmet, 1);
					break;
			}
		}
	}

	@Override
	protected void dropGuaranteedItems(int lootingMod, DamageSource source) {
		dropItem(ItemRegister.coinSilver, 5 + rand.nextInt(9 + lootingMod));
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();

		if (isInWater())
			heal(1);

		if (!world.isRemote) {
			if (shielded) {
				if (rand.nextInt(80) == 0) {
					EntityHydrolon hydrolon = new EntityHydrolon(this);

					world.spawnEntity(hydrolon);
				}

				if (rand.nextInt(200) == 0) {
					EntityPlayer pl = world.getClosestPlayer(posX, posY, posZ, 20, false);

					if (pl != null && !pl.capabilities.isCreativeMode)
						setPositionAndUpdate(pl.posX, pl.posY, pl.posZ);
				}
			}
			else {
				if (rand.nextInt(130) == 0) {
					EntityPlayer pl = world.getClosestPlayer(posX, posY, posZ, 20, false);

					if (pl != null && !pl.capabilities.isCreativeMode)
						setPositionAndUpdate(pl.posX, pl.posY, pl.posZ);
				}

				if (rand.nextInt(120) == 0 && !world.provider.doesWaterVaporize() && world.getBlockState(getPosition()).getMaterial().isReplaceable())
					world.setBlockState(getPosition(), Blocks.FLOWING_WATER.getDefaultState());
			}
		}
	}

	@Override
	protected boolean processInteract(EntityPlayer player, EnumHand hand) {
		if (shielded) {
			ItemStack heldItem = player.getHeldItem(hand);

			if (heldItem.getItem() == ItemRegister.hydroStone) {
				if (!player.capabilities.isCreativeMode)
					heldItem.shrink(1);

				if (getHealth() <= 50) {
					disableShield();
				}
				else {
					setHealth(getHealth() - 50);
				}

				return true;
			}
		}

		return super.processInteract(player, hand);
	}

	@Override
	public ResourceLocation getBossBarTexture() {
		return this.dataManager.get(SHIELDED) ? shieldedBossBarTexture : bossBarTexture;
	}

	@Nonnull
	@Override
	public TreeSet<Enums.MobProperties> getMobProperties() {
		return mobProperties;
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
