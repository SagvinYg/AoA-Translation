package net.tslat.aoa3.structure.gardencia;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class MagentaTulip extends AoAStructure { //StructureSize: 6x13x6
	private static final IBlockState magentaPetals = BlockRegister.petalsMagenta.getDefaultState();
	private static final IBlockState stem = BlockRegister.plantStem.getDefaultState();

	public MagentaTulip() {
		super("MagentaTulip");
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 2, 0, 2, stem);
		addBlock(world, basePos, 2, 0, 3, stem);
		addBlock(world, basePos, 3, 0, 2, stem);
		addBlock(world, basePos, 3, 0, 3, stem);
		addBlock(world, basePos, 2, 1, 2, stem);
		addBlock(world, basePos, 2, 1, 3, stem);
		addBlock(world, basePos, 3, 1, 2, stem);
		addBlock(world, basePos, 3, 1, 3, stem);
		addBlock(world, basePos, 2, 2, 2, stem);
		addBlock(world, basePos, 2, 2, 3, stem);
		addBlock(world, basePos, 3, 2, 2, stem);
		addBlock(world, basePos, 3, 2, 3, stem);
		addBlock(world, basePos, 2, 3, 2, stem);
		addBlock(world, basePos, 2, 3, 3, stem);
		addBlock(world, basePos, 3, 3, 2, stem);
		addBlock(world, basePos, 3, 3, 3, stem);
		addBlock(world, basePos, 2, 4, 2, stem);
		addBlock(world, basePos, 2, 4, 3, stem);
		addBlock(world, basePos, 3, 4, 2, stem);
		addBlock(world, basePos, 3, 4, 3, stem);
		addBlock(world, basePos, 2, 5, 2, stem);
		addBlock(world, basePos, 2, 5, 3, stem);
		addBlock(world, basePos, 3, 5, 2, stem);
		addBlock(world, basePos, 3, 5, 3, stem);
		addBlock(world, basePos, 2, 6, 2, stem);
		addBlock(world, basePos, 2, 6, 3, stem);
		addBlock(world, basePos, 3, 6, 2, stem);
		addBlock(world, basePos, 3, 6, 3, stem);
		addBlock(world, basePos, 0, 7, 2, magentaPetals);
		addBlock(world, basePos, 0, 7, 3, magentaPetals);
		addBlock(world, basePos, 1, 7, 1, magentaPetals);
		addBlock(world, basePos, 1, 7, 2, stem);
		addBlock(world, basePos, 1, 7, 3, stem);
		addBlock(world, basePos, 1, 7, 4, magentaPetals);
		addBlock(world, basePos, 2, 7, 0, magentaPetals);
		addBlock(world, basePos, 2, 7, 1, stem);
		addBlock(world, basePos, 2, 7, 2, stem);
		addBlock(world, basePos, 2, 7, 3, stem);
		addBlock(world, basePos, 2, 7, 4, stem);
		addBlock(world, basePos, 2, 7, 5, magentaPetals);
		addBlock(world, basePos, 3, 7, 0, magentaPetals);
		addBlock(world, basePos, 3, 7, 1, stem);
		addBlock(world, basePos, 3, 7, 2, stem);
		addBlock(world, basePos, 3, 7, 3, stem);
		addBlock(world, basePos, 3, 7, 4, stem);
		addBlock(world, basePos, 3, 7, 5, magentaPetals);
		addBlock(world, basePos, 4, 7, 1, magentaPetals);
		addBlock(world, basePos, 4, 7, 2, stem);
		addBlock(world, basePos, 4, 7, 3, stem);
		addBlock(world, basePos, 4, 7, 4, magentaPetals);
		addBlock(world, basePos, 5, 7, 2, magentaPetals);
		addBlock(world, basePos, 5, 7, 3, magentaPetals);
		addBlock(world, basePos, 0, 8, 1, magentaPetals);
		addBlock(world, basePos, 0, 8, 2, magentaPetals);
		addBlock(world, basePos, 0, 8, 3, magentaPetals);
		addBlock(world, basePos, 0, 8, 4, magentaPetals);
		addBlock(world, basePos, 1, 8, 0, magentaPetals);
		addBlock(world, basePos, 1, 8, 2, magentaPetals);
		addBlock(world, basePos, 1, 8, 3, magentaPetals);
		addBlock(world, basePos, 1, 8, 5, magentaPetals);
		addBlock(world, basePos, 2, 8, 0, magentaPetals);
		addBlock(world, basePos, 2, 8, 1, magentaPetals);
		addBlock(world, basePos, 2, 8, 2, magentaPetals);
		addBlock(world, basePos, 2, 8, 3, magentaPetals);
		addBlock(world, basePos, 2, 8, 4, magentaPetals);
		addBlock(world, basePos, 2, 8, 5, magentaPetals);
		addBlock(world, basePos, 3, 8, 0, magentaPetals);
		addBlock(world, basePos, 3, 8, 1, magentaPetals);
		addBlock(world, basePos, 3, 8, 2, magentaPetals);
		addBlock(world, basePos, 3, 8, 3, magentaPetals);
		addBlock(world, basePos, 3, 8, 4, magentaPetals);
		addBlock(world, basePos, 3, 8, 5, magentaPetals);
		addBlock(world, basePos, 4, 8, 0, magentaPetals);
		addBlock(world, basePos, 4, 8, 2, magentaPetals);
		addBlock(world, basePos, 4, 8, 3, magentaPetals);
		addBlock(world, basePos, 4, 8, 5, magentaPetals);
		addBlock(world, basePos, 5, 8, 1, magentaPetals);
		addBlock(world, basePos, 5, 8, 2, magentaPetals);
		addBlock(world, basePos, 5, 8, 3, magentaPetals);
		addBlock(world, basePos, 5, 8, 4, magentaPetals);
		addBlock(world, basePos, 0, 9, 1, magentaPetals);
		addBlock(world, basePos, 0, 9, 2, magentaPetals);
		addBlock(world, basePos, 0, 9, 3, magentaPetals);
		addBlock(world, basePos, 0, 9, 4, magentaPetals);
		addBlock(world, basePos, 1, 9, 0, magentaPetals);
		addBlock(world, basePos, 1, 9, 2, magentaPetals);
		addBlock(world, basePos, 1, 9, 3, magentaPetals);
		addBlock(world, basePos, 1, 9, 5, magentaPetals);
		addBlock(world, basePos, 2, 9, 0, magentaPetals);
		addBlock(world, basePos, 2, 9, 1, magentaPetals);
		addBlock(world, basePos, 2, 9, 2, magentaPetals);
		addBlock(world, basePos, 2, 9, 3, magentaPetals);
		addBlock(world, basePos, 2, 9, 4, magentaPetals);
		addBlock(world, basePos, 2, 9, 5, magentaPetals);
		addBlock(world, basePos, 3, 9, 0, magentaPetals);
		addBlock(world, basePos, 3, 9, 1, magentaPetals);
		addBlock(world, basePos, 3, 9, 2, magentaPetals);
		addBlock(world, basePos, 3, 9, 3, magentaPetals);
		addBlock(world, basePos, 3, 9, 4, magentaPetals);
		addBlock(world, basePos, 3, 9, 5, magentaPetals);
		addBlock(world, basePos, 4, 9, 0, magentaPetals);
		addBlock(world, basePos, 4, 9, 2, magentaPetals);
		addBlock(world, basePos, 4, 9, 3, magentaPetals);
		addBlock(world, basePos, 4, 9, 5, magentaPetals);
		addBlock(world, basePos, 5, 9, 1, magentaPetals);
		addBlock(world, basePos, 5, 9, 2, magentaPetals);
		addBlock(world, basePos, 5, 9, 3, magentaPetals);
		addBlock(world, basePos, 5, 9, 4, magentaPetals);
		addBlock(world, basePos, 0, 10, 1, magentaPetals);
		addBlock(world, basePos, 0, 10, 2, magentaPetals);
		addBlock(world, basePos, 0, 10, 3, magentaPetals);
		addBlock(world, basePos, 0, 10, 4, magentaPetals);
		addBlock(world, basePos, 1, 10, 0, magentaPetals);
		addBlock(world, basePos, 1, 10, 2, magentaPetals);
		addBlock(world, basePos, 1, 10, 3, magentaPetals);
		addBlock(world, basePos, 1, 10, 5, magentaPetals);
		addBlock(world, basePos, 2, 10, 0, magentaPetals);
		addBlock(world, basePos, 2, 10, 1, magentaPetals);
		addBlock(world, basePos, 2, 10, 2, magentaPetals);
		addBlock(world, basePos, 2, 10, 3, magentaPetals);
		addBlock(world, basePos, 2, 10, 4, magentaPetals);
		addBlock(world, basePos, 2, 10, 5, magentaPetals);
		addBlock(world, basePos, 3, 10, 0, magentaPetals);
		addBlock(world, basePos, 3, 10, 1, magentaPetals);
		addBlock(world, basePos, 3, 10, 2, magentaPetals);
		addBlock(world, basePos, 3, 10, 3, magentaPetals);
		addBlock(world, basePos, 3, 10, 4, magentaPetals);
		addBlock(world, basePos, 3, 10, 5, magentaPetals);
		addBlock(world, basePos, 4, 10, 0, magentaPetals);
		addBlock(world, basePos, 4, 10, 2, magentaPetals);
		addBlock(world, basePos, 4, 10, 3, magentaPetals);
		addBlock(world, basePos, 4, 10, 5, magentaPetals);
		addBlock(world, basePos, 5, 10, 1, magentaPetals);
		addBlock(world, basePos, 5, 10, 2, magentaPetals);
		addBlock(world, basePos, 5, 10, 3, magentaPetals);
		addBlock(world, basePos, 5, 10, 4, magentaPetals);
		addBlock(world, basePos, 0, 11, 2, magentaPetals);
		addBlock(world, basePos, 0, 11, 3, magentaPetals);
		addBlock(world, basePos, 2, 11, 0, magentaPetals);
		addBlock(world, basePos, 2, 11, 2, magentaPetals);
		addBlock(world, basePos, 2, 11, 3, magentaPetals);
		addBlock(world, basePos, 2, 11, 5, magentaPetals);
		addBlock(world, basePos, 3, 11, 0, magentaPetals);
		addBlock(world, basePos, 3, 11, 2, magentaPetals);
		addBlock(world, basePos, 3, 11, 3, magentaPetals);
		addBlock(world, basePos, 3, 11, 5, magentaPetals);
		addBlock(world, basePos, 5, 11, 2, magentaPetals);
		addBlock(world, basePos, 5, 11, 3, magentaPetals);
		addBlock(world, basePos, 0, 12, 2, magentaPetals);
		addBlock(world, basePos, 0, 12, 3, magentaPetals);
		addBlock(world, basePos, 2, 12, 0, magentaPetals);
		addBlock(world, basePos, 2, 12, 2, magentaPetals);
		addBlock(world, basePos, 2, 12, 3, magentaPetals);
		addBlock(world, basePos, 2, 12, 5, magentaPetals);
		addBlock(world, basePos, 3, 12, 0, magentaPetals);
		addBlock(world, basePos, 3, 12, 2, magentaPetals);
		addBlock(world, basePos, 3, 12, 3, magentaPetals);
		addBlock(world, basePos, 3, 12, 5, magentaPetals);
		addBlock(world, basePos, 5, 12, 2, magentaPetals);
		addBlock(world, basePos, 5, 12, 3, magentaPetals);
	}
}
