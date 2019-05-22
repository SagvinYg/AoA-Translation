package net.tslat.aoa3.item.weapon.blaster;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.tslat.aoa3.entity.projectiles.blaster.EntitySwarmShot;
import net.tslat.aoa3.utils.StringUtil;

import java.util.List;

public class Swarmotron extends BaseBlaster {
	public Swarmotron(double dmg, SoundEvent sound, int durability, int fireDelayTicks, float energyCost) {
		super(dmg, sound, durability, fireDelayTicks, energyCost);
		setUnlocalizedName("Swarmotron");
		setRegistryName("aoa3:swarmotron");
	}

	@Override
	public void fire(ItemStack blaster, EntityLivingBase shooter) {
		shooter.world.spawnEntity(new EntitySwarmShot(shooter, this, 60, 0, 0, 0));
		shooter.world.spawnEntity(new EntitySwarmShot(shooter, this, 60, -0.125f, 0f, -0.125f));
		shooter.world.spawnEntity(new EntitySwarmShot(shooter, this, 60, -0.125f, 0, 0));
		shooter.world.spawnEntity(new EntitySwarmShot(shooter, this, 60, 0.125f, -0.125f, 0.125f));
		shooter.world.spawnEntity(new EntitySwarmShot(shooter, this, 60, 0.125f, 0.125f, 0.125f));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack stack, World world, List<String> tooltip, ITooltipFlag flag) {
		tooltip.add(StringUtil.getColourLocaleString("item.Swarmotron.desc.1", TextFormatting.DARK_GREEN));
		super.addInformation(stack, world, tooltip, flag);
	}
}
