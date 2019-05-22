package net.tslat.aoa3.entity.mobs.greckon;

import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.ItemRegister;
import net.tslat.aoa3.common.registration.SoundsRegister;
import net.tslat.aoa3.common.registration.WeaponRegister;
import net.tslat.aoa3.entity.base.AoAFlyingRangedMob;
import net.tslat.aoa3.entity.projectiles.mob.BaseMobProjectile;
import net.tslat.aoa3.entity.projectiles.mob.EntityValkyrieShot;
import net.tslat.aoa3.library.Enums;

import javax.annotation.Nullable;

public class EntityValkyrie extends AoAFlyingRangedMob {
    public static final float entityWidth = 0.75f;

    public EntityValkyrie(World world) {
        super(world, entityWidth, 1.125f);
    }

    @Override
    public float getEyeHeight() {
        return 1.03125f;
    }

    @Override
    protected double getBaseKnockbackResistance() {
        return 0;
    }

    @Override
    protected double getBaseMaxHealth() {
        return 50;
    }

    @Override
    public double getBaseProjectileDamage() {
        return 40;
    }

    @Override
    protected double getBaseMovementSpeed() {
        return 0.1;
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundsRegister.mobValkyrieLiving;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundsRegister.mobValkyrieDeath;
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundsRegister.mobValkyrieHit;
    }

    @Nullable
    @Override
    protected SoundEvent getShootSound() {
        return null;
    }

    @Override
    protected int getSpawnChanceFactor() {
        return 5;
    }

    @Override
    protected void dropSpecialItems(int lootingMod, DamageSource source) {
        if (rand.nextBoolean())
            dropItem(ItemRegister.tokensGreckon, 2 + rand.nextInt(5 + lootingMod));

        if (rand.nextInt(200 - lootingMod) == 0)
            dropItem(ItemRegister.upgradeKitHaunted, 1);

        if (rand.nextInt(40 - lootingMod) == 0)
            dropItem(WeaponRegister.gunDischargeRifle, 1);
    }

    @Override
    protected void dropGuaranteedItems(int lootingMod, DamageSource source) {
        dropItem(ItemRegister.coinCopper, 5 + rand.nextInt(9 + lootingMod));
    }

    @Override
    protected BaseMobProjectile getNewProjectileInstance() {
        return new EntityValkyrieShot(this, Enums.MobProjectileType.OTHER);
    }
}
