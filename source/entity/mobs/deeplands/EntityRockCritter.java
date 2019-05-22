package net.tslat.aoa3.entity.mobs.deeplands;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.pathfinding.PathNavigateClimber;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.ItemRegister;
import net.tslat.aoa3.common.registration.SoundsRegister;
import net.tslat.aoa3.entity.base.AoAMeleeMob;
import net.tslat.aoa3.entity.mobs.mysterium.EntityMushroomSpider;
import net.tslat.aoa3.library.Enums;
import net.tslat.aoa3.utils.ConfigurationUtil;
import net.tslat.aoa3.utils.PlayerUtil;

import javax.annotation.Nullable;

public class EntityRockCritter extends AoAMeleeMob {
    public static final float entityWidth = 0.875f;
    private static final DataParameter<Byte> CLIMBING = EntityDataManager.<Byte>createKey(EntityMushroomSpider.class, DataSerializers.BYTE);

    public EntityRockCritter(World world) {
        super(world, entityWidth, 1.21875f);
    }

    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataManager.register(CLIMBING, (byte)0);
    }

    @Override
    protected PathNavigate createNavigator(World world) {
        return new PathNavigateClimber(this, world);
    }

    @Override
    public float getEyeHeight() {
        return 0.8125f;
    }

    @Override
    protected double getBaseKnockbackResistance() {
        return 0.8;
    }

    @Override
    protected double getBaseMaxHealth() {
        return 45;
    }

    @Override
    protected double getBaseMeleeDamage() {
        return 6;
    }

    @Override
    protected double getBaseMovementSpeed() {
        return 0.2875;
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundsRegister.mobCaveBugLiving;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundsRegister.mobCaveBugDeath;
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundsRegister.mobCaveBugHit;
    }

    @Override
    protected SoundEvent getStepSound() {
        return SoundEvents.ENTITY_SPIDER_STEP;
    }

    @Override
    public EnumCreatureAttribute getCreatureAttribute() {
        return EnumCreatureAttribute.ARTHROPOD;
    }

    @Override
    public boolean getCanSpawnHere() {
        return posY < 120 && super.getCanSpawnHere();
    }

    @Override
    protected void dropSpecialItems(int lootingMod, DamageSource source) {
        if (world.provider.getDimension() != ConfigurationUtil.MainConfig.dimensionIds.ancientCavern) {
            if (rand.nextInt(40 - lootingMod) == 0)
                dropItem(ItemRegister.realmstoneAncientCavern, 1);
        }
    }

    @Override
    protected void dropGuaranteedItems(int lootingMod, DamageSource source) {
        dropItem(ItemRegister.coinCopper, 5 + rand.nextInt(9 + lootingMod));
    }

    @Override
    public void onUpdate() {
        super.onUpdate();

        if (!world.isRemote)
            setBesideClimbableBlock(this.collidedHorizontally);
    }

    @Override
    public boolean isOnLadder() {
        return isBesideClimbableBlock();
    }

    public boolean isBesideClimbableBlock() {
        return (this.dataManager.get(CLIMBING) & 1) != 0;
    }

    public void setBesideClimbableBlock(boolean climbing) {
        byte climbingBit = this.dataManager.get(CLIMBING);

        if (climbing) {
            climbingBit = (byte)(climbingBit | 1);
        }
        else {
            climbingBit = (byte)(climbingBit & -2);
        }

        this.dataManager.set(CLIMBING, climbingBit);
    }

    @Override
    public void onDeath(DamageSource cause) {
        super.onDeath(cause);

        if (!world.isRemote && world.provider.getDimension() == ConfigurationUtil.MainConfig.dimensionIds.ancientCavern) {
            Entity source = cause.getTrueSource();
            EntityPlayer killer = null;

            if (source != null) {
                if (source instanceof EntityPlayer) {
                    killer = (EntityPlayer)source;
                }
                else if (source instanceof EntityTameable && ((EntityTameable)source).getOwner() instanceof EntityPlayer) {
                    killer = (EntityPlayer)((EntityTameable)source).getOwner();
                }
            }

            if (killer != null)
                PlayerUtil.addTributeToPlayer(killer, Enums.Deities.PLUTON, 8);
        }
    }
}
