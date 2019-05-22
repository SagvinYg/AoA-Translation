package net.tslat.aoa3.structure.candyland;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class BlueCandyRock4 extends AoAStructure { //StructureSize: 4x9x4
	private static final IBlockState blueRockCandy = BlockRegister.rockCandyBlue.getDefaultState();

	public BlueCandyRock4() {
		super("BlueCandyRock4");
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 0, 0, 2, blueRockCandy);
		addBlock(world, basePos, 1, 0, 0, blueRockCandy);
		addBlock(world, basePos, 1, 0, 1, blueRockCandy);
		addBlock(world, basePos, 1, 0, 2, blueRockCandy);
		addBlock(world, basePos, 2, 0, 1, blueRockCandy);
		addBlock(world, basePos, 2, 0, 2, blueRockCandy);
		addBlock(world, basePos, 2, 0, 3, blueRockCandy);
		addBlock(world, basePos, 0, 1, 1, blueRockCandy);
		addBlock(world, basePos, 1, 1, 1, blueRockCandy);
		addBlock(world, basePos, 1, 1, 2, blueRockCandy);
		addBlock(world, basePos, 2, 1, 1, blueRockCandy);
		addBlock(world, basePos, 2, 1, 2, blueRockCandy);
		addBlock(world, basePos, 3, 1, 2, blueRockCandy);
		addBlock(world, basePos, 1, 2, 1, blueRockCandy);
		addBlock(world, basePos, 1, 2, 2, blueRockCandy);
		addBlock(world, basePos, 1, 2, 3, blueRockCandy);
		addBlock(world, basePos, 2, 2, 0, blueRockCandy);
		addBlock(world, basePos, 2, 2, 1, blueRockCandy);
		addBlock(world, basePos, 2, 2, 2, blueRockCandy);
		addBlock(world, basePos, 3, 2, 1, blueRockCandy);
		addBlock(world, basePos, 0, 3, 2, blueRockCandy);
		addBlock(world, basePos, 1, 3, 0, blueRockCandy);
		addBlock(world, basePos, 1, 3, 1, blueRockCandy);
		addBlock(world, basePos, 1, 3, 2, blueRockCandy);
		addBlock(world, basePos, 2, 3, 1, blueRockCandy);
		addBlock(world, basePos, 2, 3, 2, blueRockCandy);
		addBlock(world, basePos, 1, 4, 1, blueRockCandy);
		addBlock(world, basePos, 1, 4, 2, blueRockCandy);
		addBlock(world, basePos, 2, 4, 1, blueRockCandy);
		addBlock(world, basePos, 2, 4, 2, blueRockCandy);
		addBlock(world, basePos, 2, 4, 3, blueRockCandy);
		addBlock(world, basePos, 3, 4, 1, blueRockCandy);
		addBlock(world, basePos, 0, 5, 1, blueRockCandy);
		addBlock(world, basePos, 1, 5, 1, blueRockCandy);
		addBlock(world, basePos, 1, 5, 2, blueRockCandy);
		addBlock(world, basePos, 1, 5, 3, blueRockCandy);
		addBlock(world, basePos, 2, 5, 0, blueRockCandy);
		addBlock(world, basePos, 2, 5, 1, blueRockCandy);
		addBlock(world, basePos, 2, 5, 2, blueRockCandy);
		addBlock(world, basePos, 3, 5, 2, blueRockCandy);
		addBlock(world, basePos, 0, 6, 2, blueRockCandy);
		addBlock(world, basePos, 1, 6, 1, blueRockCandy);
		addBlock(world, basePos, 1, 6, 2, blueRockCandy);
		addBlock(world, basePos, 2, 6, 1, blueRockCandy);
		addBlock(world, basePos, 2, 6, 2, blueRockCandy);
		addBlock(world, basePos, 1, 7, 0, blueRockCandy);
		addBlock(world, basePos, 1, 7, 1, blueRockCandy);
		addBlock(world, basePos, 1, 7, 2, blueRockCandy);
		addBlock(world, basePos, 2, 7, 1, blueRockCandy);
		addBlock(world, basePos, 2, 7, 2, blueRockCandy);
		addBlock(world, basePos, 2, 7, 3, blueRockCandy);
		addBlock(world, basePos, 3, 7, 1, blueRockCandy);
		addBlock(world, basePos, 1, 8, 2, blueRockCandy);
	}
}
