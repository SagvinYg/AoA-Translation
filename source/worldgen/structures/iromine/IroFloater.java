package net.tslat.aoa3.worldgen.structures.iromine;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.tslat.aoa3.common.registration.AoABlocks;
import net.tslat.aoa3.worldgen.structures.AoAStructure;

import java.util.Random;

public class IroFloater extends AoAStructure { //StructureSize: 7x7x7
	private static final BlockState leaves = AoABlocks.IRODUST_LEAVES.get().getDefaultState();
	private static final BlockState log = AoABlocks.IROLOG.get().getDefaultState();

	public IroFloater() {
		super("IroFloater");
	}

	@Override
	protected void build(IWorld world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 3, 0, 3, leaves);
		addBlock(world, basePos, 2, 1, 3, leaves);
		addBlock(world, basePos, 3, 1, 2, leaves);
		addBlock(world, basePos, 3, 1, 3, log);
		addBlock(world, basePos, 3, 1, 4, leaves);
		addBlock(world, basePos, 4, 1, 3, leaves);
		addBlock(world, basePos, 1, 2, 3, leaves);
		addBlock(world, basePos, 3, 2, 1, leaves);
		addBlock(world, basePos, 3, 2, 3, log);
		addBlock(world, basePos, 3, 2, 5, leaves);
		addBlock(world, basePos, 5, 2, 3, leaves);
		addBlock(world, basePos, 0, 3, 3, leaves);
		addBlock(world, basePos, 1, 3, 2, leaves);
		addBlock(world, basePos, 1, 3, 3, log);
		addBlock(world, basePos, 1, 3, 4, leaves);
		addBlock(world, basePos, 2, 3, 1, leaves);
		addBlock(world, basePos, 2, 3, 3, log);
		addBlock(world, basePos, 2, 3, 5, leaves);
		addBlock(world, basePos, 3, 3, 0, leaves);
		addBlock(world, basePos, 3, 3, 1, log);
		addBlock(world, basePos, 3, 3, 2, log);
		addBlock(world, basePos, 3, 3, 3, log);
		addBlock(world, basePos, 3, 3, 4, log);
		addBlock(world, basePos, 3, 3, 5, log);
		addBlock(world, basePos, 3, 3, 6, leaves);
		addBlock(world, basePos, 4, 3, 1, leaves);
		addBlock(world, basePos, 4, 3, 3, log);
		addBlock(world, basePos, 4, 3, 5, leaves);
		addBlock(world, basePos, 5, 3, 2, leaves);
		addBlock(world, basePos, 5, 3, 3, log);
		addBlock(world, basePos, 5, 3, 4, leaves);
		addBlock(world, basePos, 6, 3, 3, leaves);
		addBlock(world, basePos, 1, 4, 3, leaves);
		addBlock(world, basePos, 3, 4, 1, leaves);
		addBlock(world, basePos, 3, 4, 3, log);
		addBlock(world, basePos, 3, 4, 5, leaves);
		addBlock(world, basePos, 5, 4, 3, leaves);
		addBlock(world, basePos, 2, 5, 3, leaves);
		addBlock(world, basePos, 3, 5, 2, leaves);
		addBlock(world, basePos, 3, 5, 3, log);
		addBlock(world, basePos, 3, 5, 4, leaves);
		addBlock(world, basePos, 4, 5, 3, leaves);
		addBlock(world, basePos, 3, 6, 3, leaves);
	}
}
