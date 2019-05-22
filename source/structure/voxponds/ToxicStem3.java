package net.tslat.aoa3.structure.voxponds;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class ToxicStem3 extends AoAStructure { //StructureSize: 2x4x1
	private static final IBlockState toxicStem = BlockRegister.toxicStem.getDefaultState();

	public ToxicStem3() {
		super("ToxicStem3");
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 0, 0, 0, toxicStem);
		addBlock(world, basePos, 0, 1, 0, toxicStem);
		addBlock(world, basePos, 0, 2, 0, toxicStem);
		addBlock(world, basePos, 1, 2, 0, toxicStem);
		addBlock(world, basePos, 1, 3, 0, toxicStem);
	}
}
