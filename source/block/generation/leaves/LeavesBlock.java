package net.tslat.aoa3.block.generation.leaves;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class LeavesBlock extends net.minecraft.block.LeavesBlock {
	private final float saplingDropChance;

	public LeavesBlock(MaterialColor mapColour, float saplingChance) {
		super(generateBlockProperties(mapColour));

		this.saplingDropChance = saplingChance;
	}

	private static Block.Properties generateBlockProperties(MaterialColor mapColour) {
		Block.Properties blockProperties = Block.Properties.create(Material.LEAVES, mapColour);

		blockProperties.hardnessAndResistance(0.2f);
		blockProperties.sound(SoundType.PLANT);
		blockProperties.notSolid();
		// TODO Tick Randomly & decay

		return blockProperties;
	}

	@Override
	public void randomTick(BlockState state, ServerWorld worldIn, BlockPos pos, Random random) {}

	public float getSaplingDropChance() {
		return saplingDropChance;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
		return 30;
	}

	@Override
	public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
		return 60;
	}
}
