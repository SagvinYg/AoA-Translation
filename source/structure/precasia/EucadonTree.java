package net.tslat.aoa3.structure.precasia;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class EucadonTree extends AoAStructure { //StructureSize: 7x29x7
	private static final IBlockState eucadonLeaves = BlockRegister.leavesEucadon.getDefaultState();
	private static final IBlockState eucadonLog = BlockRegister.logEucadon.getDefaultState();

	public EucadonTree() {
		super("EucadonTree");
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 3, 0, 3, eucadonLog);
		addBlock(world, basePos, 3, 1, 3, eucadonLog);
		addBlock(world, basePos, 3, 2, 3, eucadonLog);
		addBlock(world, basePos, 3, 3, 3, eucadonLog);
		addBlock(world, basePos, 3, 4, 3, eucadonLog);
		addBlock(world, basePos, 3, 5, 3, eucadonLog);
		addBlock(world, basePos, 3, 6, 3, eucadonLog);
		addBlock(world, basePos, 3, 7, 3, eucadonLog);
		addBlock(world, basePos, 3, 8, 3, eucadonLog);
		addBlock(world, basePos, 3, 9, 3, eucadonLog);
		addBlock(world, basePos, 3, 10, 3, eucadonLog);
		addBlock(world, basePos, 3, 11, 3, eucadonLog);
		addBlock(world, basePos, 3, 12, 3, eucadonLog);
		addBlock(world, basePos, 3, 13, 3, eucadonLog);
		addBlock(world, basePos, 3, 14, 3, eucadonLog);
		addBlock(world, basePos, 3, 15, 3, eucadonLog);
		addBlock(world, basePos, 3, 16, 3, eucadonLog);
		addBlock(world, basePos, 3, 17, 3, eucadonLog);
		addBlock(world, basePos, 3, 18, 3, eucadonLog);
		addBlock(world, basePos, 3, 19, 3, eucadonLog);
		addBlock(world, basePos, 3, 20, 3, eucadonLog);
		addBlock(world, basePos, 2, 21, 3, eucadonLeaves);
		addBlock(world, basePos, 3, 21, 2, eucadonLeaves);
		addBlock(world, basePos, 3, 21, 3, eucadonLog);
		addBlock(world, basePos, 3, 21, 4, eucadonLeaves);
		addBlock(world, basePos, 4, 21, 3, eucadonLeaves);
		addBlock(world, basePos, 1, 22, 3, eucadonLeaves);
		addBlock(world, basePos, 2, 22, 2, eucadonLeaves);
		addBlock(world, basePos, 2, 22, 3, eucadonLeaves);
		addBlock(world, basePos, 2, 22, 4, eucadonLeaves);
		addBlock(world, basePos, 3, 22, 1, eucadonLeaves);
		addBlock(world, basePos, 3, 22, 2, eucadonLeaves);
		addBlock(world, basePos, 3, 22, 3, eucadonLog);
		addBlock(world, basePos, 3, 22, 4, eucadonLeaves);
		addBlock(world, basePos, 3, 22, 5, eucadonLeaves);
		addBlock(world, basePos, 4, 22, 2, eucadonLeaves);
		addBlock(world, basePos, 4, 22, 3, eucadonLeaves);
		addBlock(world, basePos, 4, 22, 4, eucadonLeaves);
		addBlock(world, basePos, 5, 22, 3, eucadonLeaves);
		addBlock(world, basePos, 1, 23, 3, eucadonLeaves);
		addBlock(world, basePos, 2, 23, 2, eucadonLeaves);
		addBlock(world, basePos, 2, 23, 3, eucadonLeaves);
		addBlock(world, basePos, 2, 23, 4, eucadonLeaves);
		addBlock(world, basePos, 3, 23, 1, eucadonLeaves);
		addBlock(world, basePos, 3, 23, 2, eucadonLeaves);
		addBlock(world, basePos, 3, 23, 3, eucadonLeaves);
		addBlock(world, basePos, 3, 23, 4, eucadonLeaves);
		addBlock(world, basePos, 3, 23, 5, eucadonLeaves);
		addBlock(world, basePos, 4, 23, 2, eucadonLeaves);
		addBlock(world, basePos, 4, 23, 3, eucadonLeaves);
		addBlock(world, basePos, 4, 23, 4, eucadonLeaves);
		addBlock(world, basePos, 5, 23, 3, eucadonLeaves);
		addBlock(world, basePos, 0, 24, 3, eucadonLeaves);
		addBlock(world, basePos, 1, 24, 2, eucadonLeaves);
		addBlock(world, basePos, 1, 24, 3, eucadonLeaves);
		addBlock(world, basePos, 1, 24, 4, eucadonLeaves);
		addBlock(world, basePos, 2, 24, 1, eucadonLeaves);
		addBlock(world, basePos, 2, 24, 2, eucadonLeaves);
		addBlock(world, basePos, 2, 24, 3, eucadonLeaves);
		addBlock(world, basePos, 2, 24, 4, eucadonLeaves);
		addBlock(world, basePos, 2, 24, 5, eucadonLeaves);
		addBlock(world, basePos, 3, 24, 0, eucadonLeaves);
		addBlock(world, basePos, 3, 24, 1, eucadonLeaves);
		addBlock(world, basePos, 3, 24, 2, eucadonLeaves);
		addBlock(world, basePos, 3, 24, 3, eucadonLeaves);
		addBlock(world, basePos, 3, 24, 4, eucadonLeaves);
		addBlock(world, basePos, 3, 24, 5, eucadonLeaves);
		addBlock(world, basePos, 3, 24, 6, eucadonLeaves);
		addBlock(world, basePos, 4, 24, 1, eucadonLeaves);
		addBlock(world, basePos, 4, 24, 2, eucadonLeaves);
		addBlock(world, basePos, 4, 24, 3, eucadonLeaves);
		addBlock(world, basePos, 4, 24, 4, eucadonLeaves);
		addBlock(world, basePos, 4, 24, 5, eucadonLeaves);
		addBlock(world, basePos, 5, 24, 2, eucadonLeaves);
		addBlock(world, basePos, 5, 24, 3, eucadonLeaves);
		addBlock(world, basePos, 5, 24, 4, eucadonLeaves);
		addBlock(world, basePos, 6, 24, 3, eucadonLeaves);
		addBlock(world, basePos, 0, 25, 3, eucadonLeaves);
		addBlock(world, basePos, 1, 25, 2, eucadonLeaves);
		addBlock(world, basePos, 1, 25, 3, eucadonLeaves);
		addBlock(world, basePos, 1, 25, 4, eucadonLeaves);
		addBlock(world, basePos, 2, 25, 1, eucadonLeaves);
		addBlock(world, basePos, 2, 25, 2, eucadonLeaves);
		addBlock(world, basePos, 2, 25, 3, eucadonLeaves);
		addBlock(world, basePos, 2, 25, 4, eucadonLeaves);
		addBlock(world, basePos, 2, 25, 5, eucadonLeaves);
		addBlock(world, basePos, 3, 25, 0, eucadonLeaves);
		addBlock(world, basePos, 3, 25, 1, eucadonLeaves);
		addBlock(world, basePos, 3, 25, 2, eucadonLeaves);
		addBlock(world, basePos, 3, 25, 3, eucadonLeaves);
		addBlock(world, basePos, 3, 25, 4, eucadonLeaves);
		addBlock(world, basePos, 3, 25, 5, eucadonLeaves);
		addBlock(world, basePos, 3, 25, 6, eucadonLeaves);
		addBlock(world, basePos, 4, 25, 1, eucadonLeaves);
		addBlock(world, basePos, 4, 25, 2, eucadonLeaves);
		addBlock(world, basePos, 4, 25, 3, eucadonLeaves);
		addBlock(world, basePos, 4, 25, 4, eucadonLeaves);
		addBlock(world, basePos, 4, 25, 5, eucadonLeaves);
		addBlock(world, basePos, 5, 25, 2, eucadonLeaves);
		addBlock(world, basePos, 5, 25, 3, eucadonLeaves);
		addBlock(world, basePos, 5, 25, 4, eucadonLeaves);
		addBlock(world, basePos, 6, 25, 3, eucadonLeaves);
		addBlock(world, basePos, 1, 26, 3, eucadonLeaves);
		addBlock(world, basePos, 2, 26, 2, eucadonLeaves);
		addBlock(world, basePos, 2, 26, 3, eucadonLeaves);
		addBlock(world, basePos, 2, 26, 4, eucadonLeaves);
		addBlock(world, basePos, 3, 26, 1, eucadonLeaves);
		addBlock(world, basePos, 3, 26, 2, eucadonLeaves);
		addBlock(world, basePos, 3, 26, 3, eucadonLeaves);
		addBlock(world, basePos, 3, 26, 4, eucadonLeaves);
		addBlock(world, basePos, 3, 26, 5, eucadonLeaves);
		addBlock(world, basePos, 4, 26, 2, eucadonLeaves);
		addBlock(world, basePos, 4, 26, 3, eucadonLeaves);
		addBlock(world, basePos, 4, 26, 4, eucadonLeaves);
		addBlock(world, basePos, 5, 26, 3, eucadonLeaves);
		addBlock(world, basePos, 1, 27, 3, eucadonLeaves);
		addBlock(world, basePos, 2, 27, 2, eucadonLeaves);
		addBlock(world, basePos, 2, 27, 3, eucadonLeaves);
		addBlock(world, basePos, 2, 27, 4, eucadonLeaves);
		addBlock(world, basePos, 3, 27, 1, eucadonLeaves);
		addBlock(world, basePos, 3, 27, 2, eucadonLeaves);
		addBlock(world, basePos, 3, 27, 3, eucadonLeaves);
		addBlock(world, basePos, 3, 27, 4, eucadonLeaves);
		addBlock(world, basePos, 3, 27, 5, eucadonLeaves);
		addBlock(world, basePos, 4, 27, 2, eucadonLeaves);
		addBlock(world, basePos, 4, 27, 3, eucadonLeaves);
		addBlock(world, basePos, 4, 27, 4, eucadonLeaves);
		addBlock(world, basePos, 5, 27, 3, eucadonLeaves);
		addBlock(world, basePos, 2, 28, 3, eucadonLeaves);
		addBlock(world, basePos, 3, 28, 2, eucadonLeaves);
		addBlock(world, basePos, 3, 28, 3, eucadonLeaves);
		addBlock(world, basePos, 3, 28, 4, eucadonLeaves);
		addBlock(world, basePos, 4, 28, 3, eucadonLeaves);
	}
}
