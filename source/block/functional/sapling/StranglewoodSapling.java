package net.tslat.aoa3.block.functional.sapling;

import net.minecraft.block.BlockState;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;
import net.tslat.aoa3.block.decoration.sapling.SaplingBlock;
import net.tslat.aoa3.worldgen.trees.LucalusTreeGenerator;
import net.tslat.aoa3.worldgen.trees.StranglewoodTreeGenerator;
import net.tslat.aoa3.worldgen.trees.TreeGenerator;

import java.util.Random;

public class StranglewoodSapling extends SaplingBlock {
	public StranglewoodSapling() {
		super(MaterialColor.FOLIAGE, false);
	}

	@Override
	protected TreeGenerator getTree(ServerWorld world, BlockPos pos, BlockState groundBlock, Random rand) {
		return new StranglewoodTreeGenerator(this);
	}
}
