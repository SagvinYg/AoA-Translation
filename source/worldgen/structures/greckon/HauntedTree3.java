package net.tslat.aoa3.worldgen.structures.greckon;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.tslat.aoa3.common.registration.AoABlocks;
import net.tslat.aoa3.worldgen.structures.AoAStructure;

import java.util.Random;

public class HauntedTree3 extends AoAStructure { //StructureSize: 9x11x9
	private static final BlockState hauntedLeaves = AoABlocks.HAUNTED_LEAVES.get().getDefaultState();
	private static final BlockState hauntedLog = AoABlocks.HAUNTED_LOG.get().getDefaultState();
	private static final BlockState hauntedLogBark = AoABlocks.HAUNTED_WOOD.get().getDefaultState();
	private static final BlockState hauntedEyesLeaves = AoABlocks.HAUNTED_EYES_LEAVES.get().getDefaultState();
	private static final BlockState hauntedEyesLog = AoABlocks.HAUNTED_EYES_LOG.get().getDefaultState();
	private static final BlockState hauntedLargeEyeLog = AoABlocks.HAUNTED_EYE_LOG.get().getDefaultState();

	public HauntedTree3() {
		super("HauntedTree3");
	}

	@Override
	protected void build(IWorld world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 4, 0, 4, hauntedLog);
		addBlock(world, basePos, 4, 1, 4, hauntedLog);
		addBlock(world, basePos, 4, 2, 4, hauntedLog);
		addBlock(world, basePos, 0, 3, 3, hauntedLeaves);
		addBlock(world, basePos, 0, 3, 4, hauntedLeaves);
		addBlock(world, basePos, 0, 3, 5, hauntedLeaves);
		addBlock(world, basePos, 1, 3, 3, hauntedLeaves);
		addBlock(world, basePos, 1, 3, 4, hauntedLeaves);
		addBlock(world, basePos, 1, 3, 5, hauntedLeaves);
		addBlock(world, basePos, 2, 3, 3, hauntedLeaves);
		addBlock(world, basePos, 2, 3, 4, hauntedLeaves);
		addBlock(world, basePos, 2, 3, 5, hauntedLeaves);
		addBlock(world, basePos, 4, 3, 4, hauntedLog);
		addBlock(world, basePos, 0, 4, 4, hauntedLog);
		addBlock(world, basePos, 3, 4, 6, hauntedLeaves);
		addBlock(world, basePos, 3, 4, 7, hauntedLeaves);
		addBlock(world, basePos, 3, 4, 8, hauntedLeaves);
		addBlock(world, basePos, 4, 4, 4, hauntedLog);
		addBlock(world, basePos, 4, 4, 6, hauntedLeaves);
		addBlock(world, basePos, 4, 4, 7, hauntedLeaves);
		addBlock(world, basePos, 4, 4, 8, hauntedLeaves);
		addBlock(world, basePos, 5, 4, 6, hauntedLeaves);
		addBlock(world, basePos, 5, 4, 7, hauntedLeaves);
		addBlock(world, basePos, 5, 4, 8, hauntedLeaves);
		addBlock(world, basePos, 6, 4, 3, hauntedLeaves);
		addBlock(world, basePos, 6, 4, 4, hauntedLeaves);
		addBlock(world, basePos, 7, 4, 3, hauntedLeaves);
		addBlock(world, basePos, 7, 4, 4, hauntedLeaves);
		addBlock(world, basePos, 7, 4, 5, hauntedLeaves);
		addBlock(world, basePos, 8, 4, 3, hauntedLeaves);
		addBlock(world, basePos, 8, 4, 4, hauntedLeaves);
		addBlock(world, basePos, 8, 4, 5, hauntedLeaves);
		addBlock(world, basePos, 0, 5, 4, hauntedLogBark);
		addBlock(world, basePos, 1, 5, 4, hauntedLogBark);
		addBlock(world, basePos, 2, 5, 4, hauntedLogBark);
		addBlock(world, basePos, 3, 5, 4, hauntedLogBark);
		addBlock(world, basePos, 3, 5, 0, hauntedLeaves);
		addBlock(world, basePos, 3, 5, 1, hauntedLeaves);
		addBlock(world, basePos, 3, 5, 2, hauntedLeaves);
		addBlock(world, basePos, 4, 5, 1, hauntedLeaves);
		addBlock(world, basePos, 4, 5, 2, hauntedLeaves);
		addBlock(world, basePos, 4, 5, 4, hauntedLog);
		addBlock(world, basePos, 4, 5, 6, hauntedLog);
		addBlock(world, basePos, 5, 5, 0, hauntedLeaves);
		addBlock(world, basePos, 5, 5, 1, hauntedLeaves);
		addBlock(world, basePos, 5, 5, 2, hauntedLeaves);
		addBlock(world, basePos, 6, 5, 4, hauntedLog);
		addBlock(world, basePos, 8, 5, 4, hauntedLog);
		addBlock(world, basePos, 4, 6, 0, hauntedLog);
		addBlock(world, basePos, 4, 6, 2, hauntedLog);
		addBlock(world, basePos, 4, 6, 4, hauntedLog);
		addBlock(world, basePos, 4, 6, 5, hauntedLogBark);
		addBlock(world, basePos, 4, 6, 6, hauntedLogBark);
		addBlock(world, basePos, 4, 6, 7, hauntedLogBark);
		addBlock(world, basePos, 4, 6, 8, hauntedLogBark);
		addBlock(world, basePos, 5, 6, 4, hauntedLogBark);
		addBlock(world, basePos, 6, 6, 4, hauntedLogBark);
		addBlock(world, basePos, 7, 6, 4, hauntedLogBark);
		addBlock(world, basePos, 8, 6, 4, hauntedLogBark);
		addBlock(world, basePos, 0, 7, 3, hauntedLeaves);
		addBlock(world, basePos, 0, 7, 4, hauntedLeaves);
		addBlock(world, basePos, 0, 7, 5, hauntedLeaves);
		addBlock(world, basePos, 1, 7, 3, hauntedLeaves);
		addBlock(world, basePos, 1, 7, 5, hauntedLeaves);
		addBlock(world, basePos, 2, 7, 3, hauntedLeaves);
		addBlock(world, basePos, 2, 7, 4, hauntedLeaves);
		addBlock(world, basePos, 2, 7, 5, hauntedLeaves);
		addBlock(world, basePos, 4, 7, 0, hauntedLogBark);
		addBlock(world, basePos, 4, 7, 1, hauntedLogBark);
		addBlock(world, basePos, 4, 7, 2, hauntedLogBark);
		addBlock(world, basePos, 4, 7, 3, hauntedLogBark);
		addBlock(world, basePos, 4, 7, 4, hauntedLog);
		addBlock(world, basePos, 0, 8, 4, hauntedLog);
		addBlock(world, basePos, 2, 8, 4, hauntedLog);
		addBlock(world, basePos, 4, 8, 4, hauntedLog);
		addBlock(world, basePos, 6, 8, 3, hauntedLeaves);
		addBlock(world, basePos, 6, 8, 4, hauntedLeaves);
		addBlock(world, basePos, 6, 8, 5, hauntedLeaves);
		addBlock(world, basePos, 7, 8, 3, hauntedLeaves);
		addBlock(world, basePos, 7, 8, 4, hauntedLeaves);
		addBlock(world, basePos, 7, 8, 5, hauntedLeaves);
		addBlock(world, basePos, 8, 8, 3, hauntedLeaves);
		addBlock(world, basePos, 8, 8, 4, hauntedLeaves);
		addBlock(world, basePos, 8, 8, 5, hauntedLeaves);
		addBlock(world, basePos, 0, 9, 4, hauntedLogBark);
		addBlock(world, basePos, 1, 9, 4, hauntedLogBark);
		addBlock(world, basePos, 2, 9, 4, hauntedLogBark);
		addBlock(world, basePos, 3, 9, 4, hauntedLogBark);
		addBlock(world, basePos, 4, 9, 4, hauntedLog);
		addBlock(world, basePos, 6, 9, 4, hauntedLog);
		addBlock(world, basePos, 8, 9, 4, hauntedLog);
		addBlock(world, basePos, 4, 10, 4, hauntedLogBark);
		addBlock(world, basePos, 5, 10, 4, hauntedLogBark);
		addBlock(world, basePos, 6, 10, 4, hauntedLogBark);
		addBlock(world, basePos, 7, 10, 4, hauntedLogBark);
		addBlock(world, basePos, 8, 10, 4, hauntedLogBark);

		if (rand.nextInt(3) == 0) {
			addBlock(world, basePos, 1, 7, 4, hauntedLeaves);
		}
		else {
			addBlock(world, basePos, 1, 7, 4, hauntedEyesLeaves);
		}

		if (rand.nextInt(3) == 0) {
			addBlock(world, basePos, 2, 4, 4, hauntedLogBark);
		}
		else {
			addBlock(world, basePos, 2, 4, 4, hauntedLargeEyeLog);
		}

		if (rand.nextInt(3) == 0) {
			addBlock(world, basePos, 4, 5, 0, hauntedLeaves);
		}
		else {
			addBlock(world, basePos, 4, 5, 0, hauntedEyesLeaves);
		}

		if (rand.nextInt(3) == 0) {
			addBlock(world, basePos, 4, 5, 8, hauntedLog);
		}
		else {
			addBlock(world, basePos, 4, 5, 8, hauntedEyesLog);
		}

		if (rand.nextInt(3) == 0) {
			addBlock(world, basePos, 6, 4, 5, hauntedLeaves);
		}
		else {
			addBlock(world, basePos, 6, 4, 5, hauntedEyesLeaves);
		}

	}
}
