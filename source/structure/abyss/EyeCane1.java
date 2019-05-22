package net.tslat.aoa3.structure.abyss;

import net.minecraft.block.BlockLog;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

import static net.minecraft.block.BlockLog.LOG_AXIS;

public class EyeCane1 extends AoAStructure { //StructureSize: 1x8x3
	private static final IBlockState bloodLog = BlockRegister.logBlood.getDefaultState();
	private static final IBlockState bloodLogBark = BlockRegister.logBlood.getDefaultState().withProperty(LOG_AXIS, BlockLog.EnumAxis.NONE);
	private static final IBlockState bloodStrands = BlockRegister.plantBloodStrands.getDefaultState();
	private static final IBlockState eyeBlock = BlockRegister.eyeBlock.getDefaultState();

	public EyeCane1() {
		super("EyeCane1");
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 0, 0, 2, bloodLog);
		addBlock(world, basePos, 0, 1, 2, bloodLog);
		addBlock(world, basePos, 0, 2, 2, bloodLog);
		addBlock(world, basePos, 0, 3, 0, eyeBlock);
		addBlock(world, basePos, 0, 3, 2, bloodLog);
		addBlock(world, basePos, 0, 4, 0, bloodStrands);
		addBlock(world, basePos, 0, 4, 2, bloodLog);
		addBlock(world, basePos, 0, 5, 0, bloodStrands);
		addBlock(world, basePos, 0, 5, 2, bloodLog);
		addBlock(world, basePos, 0, 6, 0, bloodStrands);
		addBlock(world, basePos, 0, 6, 2, bloodLog);
		addBlock(world, basePos, 0, 7, 0, bloodLogBark);
		addBlock(world, basePos, 0, 7, 1, bloodLogBark);
		addBlock(world, basePos, 0, 7, 2, bloodLogBark);
	}
}
