package net.tslat.aoa3.entity.projectiles.blaster;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;
import net.tslat.aoa3.entity.projectiles.staff.BaseEnergyShot;
import net.tslat.aoa3.item.weapon.EnergyProjectileWeapon;

public class EntitySwarmShot extends BaseEnergyShot {
	public EntitySwarmShot(World world) {
		super(world);
	}

	public EntitySwarmShot(EntityLivingBase shooter, EnergyProjectileWeapon weapon, int maxAge, float xMod, float yMod, float zMod) {
		super(shooter, weapon, maxAge, xMod, yMod, zMod);
	}

	public EntitySwarmShot(World world, double x, double y, double z) {
		super(world, x, y, z);
	}
}
