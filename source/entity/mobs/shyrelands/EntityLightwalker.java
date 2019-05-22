package net.tslat.aoa3.entity.mobs.shyrelands;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.tslat.aoa3.common.packet.PacketScreenOverlay;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.common.registration.SoundsRegister;
import net.tslat.aoa3.common.registration.WeaponRegister;
import net.tslat.aoa3.entity.base.AoAMeleeMob;
import net.tslat.aoa3.library.Enums;
import net.tslat.aoa3.utils.PacketUtil;

import javax.annotation.Nullable;

public class EntityLightwalker extends AoAMeleeMob {
    public static final float entityWidth = 1.0f;

    public EntityLightwalker(World world) {
        super(world, entityWidth, 1.5625f);
    }

    @Override
    public float getEyeHeight() {
        return 0.90625f;
    }

    @Override
    protected double getBaseKnockbackResistance() {
        return 0.7;
    }

    @Override
    protected double getBaseMaxHealth() {
        return 70;
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
        return SoundsRegister.mobVoidWalkerLiving;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundsRegister.mobVoidWalkerDeath;
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundsRegister.mobVoidWalkerHit;
    }

    @Override
    public boolean getCanSpawnHere() {
        return posY < 35 && super.getCanSpawnHere();
    }

    @Override
    protected void dropSpecialItems(int lootingMod, DamageSource source) {
        if (rand.nextInt(7) == 0)
            dropItem(Item.getItemFromBlock(BlockRegister.bannerShiny), 1);

        if (rand.nextInt(50 - lootingMod) == 0)
            dropItem(WeaponRegister.greatbladeShyreSword, 1);
    }

    @Override
    protected void doMeleeEffect(Entity target) {
        if (target instanceof EntityLivingBase) {
            ((EntityLivingBase) target).addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, 120, 4, true, false));

            if (target instanceof EntityPlayerMP)
                PacketUtil.network.sendTo(new PacketScreenOverlay(120, Enums.ScreenOverlays.LIGHTWALKER), (EntityPlayerMP)target);
        }
    }
}
