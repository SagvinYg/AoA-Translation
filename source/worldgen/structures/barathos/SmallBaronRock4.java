package net.tslat.aoa3.worldgen.structures.barathos;


import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.tslat.aoa3.common.registration.AoABlocks;
import net.tslat.aoa3.worldgen.structures.AoAStructure;

import java.util.Random;

public class SmallBaronRock4 extends AoAStructure { //StructureSize: 2x1x3
	private static final BlockState baronStone = AoABlocks.BARON_STONE.get().getDefaultState();

	public SmallBaronRock4() {
		super("SmallBaronRock4");
	}

	@Override
	protected void build(IWorld world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 0, 0, 0, baronStone);
		addBlock(world, basePos, 0, 0, 1, baronStone);
		addBlock(world, basePos, 0, 0, 2, baronStone);
		addBlock(world, basePos, 1, 0, 0, baronStone);
		addBlock(world, basePos, 1, 0, 1, baronStone);
		addBlock(world, basePos, 1, 0, 2, baronStone);
	}
}
