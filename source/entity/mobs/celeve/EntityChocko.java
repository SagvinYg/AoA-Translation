package net.tslat.aoa3.entity.mobs.celeve;

import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.common.registration.ItemRegister;
import net.tslat.aoa3.common.registration.SoundsRegister;
import net.tslat.aoa3.entity.base.AoAMeleeMob;

import javax.annotation.Nullable;

public class EntityChocko extends AoAMeleeMob {
	public static final float entityWidth = 0.6f;

	public EntityChocko(World world) {
		super(world, entityWidth, 2.0f);
	}

	@Override
	public float getEyeHeight() {
		return 1.78125f;
	}

	@Override
	protected double getBaseKnockbackResistance() {
		return 0.1f;
	}

	@Override
	protected double getBaseMaxHealth() {
		return 35;
	}

	@Override
	protected double getBaseMeleeDamage() {
		return 9;
	}

	@Override
	protected double getBaseMovementSpeed() {
		return 0.2875;
	}

	@Nullable
	@Override
	protected SoundEvent getAmbientSound() {
		return SoundsRegister.mobCeleveClownLiving;
	}

	@Nullable
	@Override
	protected SoundEvent getDeathSound() {
		return SoundsRegister.mobCeleveClownDeath;
	}

	@Nullable
	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundsRegister.mobCeleveClownHit;
	}

	@Override
	protected int getSpawnChanceFactor() {
		return 3;
	}

	@Override
	protected void dropSpecialItems(int lootingMod, DamageSource source) {
		if (rand.nextBoolean())
			dropItem(ItemRegister.circusCoin, 1);

		if (rand.nextInt(35 - lootingMod) == 0)
			dropItem(ItemRegister.realmstoneCandyland, 1);

		if (rand.nextInt(7) == 0)
			dropItem(Item.getItemFromBlock(BlockRegister.bannerClown), 1);
	}
}
