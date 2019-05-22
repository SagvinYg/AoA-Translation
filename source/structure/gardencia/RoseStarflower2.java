package net.tslat.aoa3.structure.gardencia;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class RoseStarflower2 extends AoAStructure { //StructureSize: 1x17x11
	private static final IBlockState rosePetals = BlockRegister.petalsRose.getDefaultState();
	private static final IBlockState redPetals = BlockRegister.petalsRed.getDefaultState();
	private static final IBlockState stem = BlockRegister.plantStem.getDefaultState();
	private static final IBlockState flowerCore = BlockRegister.flowerCore.getDefaultState();

	public RoseStarflower2() {
		super("RoseStarflower2");
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 0, 0, 5, stem);
		addBlock(world, basePos, 0, 1, 5, stem);
		addBlock(world, basePos, 0, 2, 5, stem);
		addBlock(world, basePos, 0, 3, 0, rosePetals);
		addBlock(world, basePos, 0, 3, 1, rosePetals);
		addBlock(world, basePos, 0, 3, 2, rosePetals);
		addBlock(world, basePos, 0, 3, 3, rosePetals);
		addBlock(world, basePos, 0, 3, 5, stem);
		addBlock(world, basePos, 0, 3, 7, rosePetals);
		addBlock(world, basePos, 0, 3, 8, rosePetals);
		addBlock(world, basePos, 0, 3, 9, rosePetals);
		addBlock(world, basePos, 0, 3, 10, rosePetals);
		addBlock(world, basePos, 0, 4, 0, rosePetals);
		addBlock(world, basePos, 0, 4, 1, redPetals);
		addBlock(world, basePos, 0, 4, 2, redPetals);
		addBlock(world, basePos, 0, 4, 3, rosePetals);
		addBlock(world, basePos, 0, 4, 4, rosePetals);
		addBlock(world, basePos, 0, 4, 5, stem);
		addBlock(world, basePos, 0, 4, 6, rosePetals);
		addBlock(world, basePos, 0, 4, 7, rosePetals);
		addBlock(world, basePos, 0, 4, 8, redPetals);
		addBlock(world, basePos, 0, 4, 9, redPetals);
		addBlock(world, basePos, 0, 4, 10, rosePetals);
		addBlock(world, basePos, 0, 5, 0, rosePetals);
		addBlock(world, basePos, 0, 5, 1, redPetals);
		addBlock(world, basePos, 0, 5, 2, redPetals);
		addBlock(world, basePos, 0, 5, 3, redPetals);
		addBlock(world, basePos, 0, 5, 4, rosePetals);
		addBlock(world, basePos, 0, 5, 5, stem);
		addBlock(world, basePos, 0, 5, 6, rosePetals);
		addBlock(world, basePos, 0, 5, 7, redPetals);
		addBlock(world, basePos, 0, 5, 8, redPetals);
		addBlock(world, basePos, 0, 5, 9, redPetals);
		addBlock(world, basePos, 0, 5, 10, rosePetals);
		addBlock(world, basePos, 0, 6, 0, rosePetals);
		addBlock(world, basePos, 0, 6, 1, redPetals);
		addBlock(world, basePos, 0, 6, 2, redPetals);
		addBlock(world, basePos, 0, 6, 3, redPetals);
		addBlock(world, basePos, 0, 6, 4, redPetals);
		addBlock(world, basePos, 0, 6, 5, redPetals);
		addBlock(world, basePos, 0, 6, 6, redPetals);
		addBlock(world, basePos, 0, 6, 7, redPetals);
		addBlock(world, basePos, 0, 6, 8, redPetals);
		addBlock(world, basePos, 0, 6, 9, redPetals);
		addBlock(world, basePos, 0, 6, 10, rosePetals);
		addBlock(world, basePos, 0, 7, 0, rosePetals);
		addBlock(world, basePos, 0, 7, 1, rosePetals);
		addBlock(world, basePos, 0, 7, 2, redPetals);
		addBlock(world, basePos, 0, 7, 3, redPetals);
		addBlock(world, basePos, 0, 7, 4, redPetals);
		addBlock(world, basePos, 0, 7, 5, redPetals);
		addBlock(world, basePos, 0, 7, 6, redPetals);
		addBlock(world, basePos, 0, 7, 7, redPetals);
		addBlock(world, basePos, 0, 7, 8, redPetals);
		addBlock(world, basePos, 0, 7, 9, rosePetals);
		addBlock(world, basePos, 0, 7, 10, rosePetals);
		addBlock(world, basePos, 0, 8, 1, rosePetals);
		addBlock(world, basePos, 0, 8, 2, rosePetals);
		addBlock(world, basePos, 0, 8, 3, redPetals);
		addBlock(world, basePos, 0, 8, 4, flowerCore);
		addBlock(world, basePos, 0, 8, 5, flowerCore);
		addBlock(world, basePos, 0, 8, 6, flowerCore);
		addBlock(world, basePos, 0, 8, 7, redPetals);
		addBlock(world, basePos, 0, 8, 8, rosePetals);
		addBlock(world, basePos, 0, 8, 9, rosePetals);
		addBlock(world, basePos, 0, 9, 2, rosePetals);
		addBlock(world, basePos, 0, 9, 3, redPetals);
		addBlock(world, basePos, 0, 9, 4, flowerCore);
		addBlock(world, basePos, 0, 9, 5, flowerCore);
		addBlock(world, basePos, 0, 9, 6, flowerCore);
		addBlock(world, basePos, 0, 9, 7, redPetals);
		addBlock(world, basePos, 0, 9, 8, rosePetals);
		addBlock(world, basePos, 0, 10, 2, rosePetals);
		addBlock(world, basePos, 0, 10, 3, redPetals);
		addBlock(world, basePos, 0, 10, 4, flowerCore);
		addBlock(world, basePos, 0, 10, 5, flowerCore);
		addBlock(world, basePos, 0, 10, 6, flowerCore);
		addBlock(world, basePos, 0, 10, 7, redPetals);
		addBlock(world, basePos, 0, 10, 8, rosePetals);
		addBlock(world, basePos, 0, 10, 9, rosePetals);
		addBlock(world, basePos, 0, 11, 1, rosePetals);
		addBlock(world, basePos, 0, 11, 2, rosePetals);
		addBlock(world, basePos, 0, 11, 3, redPetals);
		addBlock(world, basePos, 0, 11, 4, redPetals);
		addBlock(world, basePos, 0, 11, 5, redPetals);
		addBlock(world, basePos, 0, 11, 6, redPetals);
		addBlock(world, basePos, 0, 11, 7, redPetals);
		addBlock(world, basePos, 0, 11, 8, redPetals);
		addBlock(world, basePos, 0, 11, 9, rosePetals);
		addBlock(world, basePos, 0, 11, 10, rosePetals);
		addBlock(world, basePos, 0, 12, 0, rosePetals);
		addBlock(world, basePos, 0, 12, 1, rosePetals);
		addBlock(world, basePos, 0, 12, 2, redPetals);
		addBlock(world, basePos, 0, 12, 3, redPetals);
		addBlock(world, basePos, 0, 12, 4, redPetals);
		addBlock(world, basePos, 0, 12, 5, redPetals);
		addBlock(world, basePos, 0, 12, 6, redPetals);
		addBlock(world, basePos, 0, 12, 7, redPetals);
		addBlock(world, basePos, 0, 12, 8, redPetals);
		addBlock(world, basePos, 0, 12, 9, redPetals);
		addBlock(world, basePos, 0, 12, 10, rosePetals);
		addBlock(world, basePos, 0, 13, 0, rosePetals);
		addBlock(world, basePos, 0, 13, 1, redPetals);
		addBlock(world, basePos, 0, 13, 2, redPetals);
		addBlock(world, basePos, 0, 13, 3, redPetals);
		addBlock(world, basePos, 0, 13, 4, redPetals);
		addBlock(world, basePos, 0, 13, 5, redPetals);
		addBlock(world, basePos, 0, 13, 6, redPetals);
		addBlock(world, basePos, 0, 13, 7, redPetals);
		addBlock(world, basePos, 0, 13, 8, redPetals);
		addBlock(world, basePos, 0, 13, 9, redPetals);
		addBlock(world, basePos, 0, 13, 10, rosePetals);
		addBlock(world, basePos, 0, 14, 0, rosePetals);
		addBlock(world, basePos, 0, 14, 1, redPetals);
		addBlock(world, basePos, 0, 14, 2, redPetals);
		addBlock(world, basePos, 0, 14, 3, redPetals);
		addBlock(world, basePos, 0, 14, 4, rosePetals);
		addBlock(world, basePos, 0, 14, 5, rosePetals);
		addBlock(world, basePos, 0, 14, 6, rosePetals);
		addBlock(world, basePos, 0, 14, 7, redPetals);
		addBlock(world, basePos, 0, 14, 8, redPetals);
		addBlock(world, basePos, 0, 14, 9, redPetals);
		addBlock(world, basePos, 0, 14, 10, rosePetals);
		addBlock(world, basePos, 0, 15, 0, rosePetals);
		addBlock(world, basePos, 0, 15, 1, redPetals);
		addBlock(world, basePos, 0, 15, 2, redPetals);
		addBlock(world, basePos, 0, 15, 3, rosePetals);
		addBlock(world, basePos, 0, 15, 4, rosePetals);
		addBlock(world, basePos, 0, 15, 6, rosePetals);
		addBlock(world, basePos, 0, 15, 7, rosePetals);
		addBlock(world, basePos, 0, 15, 8, redPetals);
		addBlock(world, basePos, 0, 15, 9, redPetals);
		addBlock(world, basePos, 0, 15, 10, rosePetals);
		addBlock(world, basePos, 0, 16, 0, rosePetals);
		addBlock(world, basePos, 0, 16, 1, rosePetals);
		addBlock(world, basePos, 0, 16, 2, rosePetals);
		addBlock(world, basePos, 0, 16, 3, rosePetals);
		addBlock(world, basePos, 0, 16, 7, rosePetals);
		addBlock(world, basePos, 0, 16, 8, rosePetals);
		addBlock(world, basePos, 0, 16, 9, rosePetals);
		addBlock(world, basePos, 0, 16, 10, rosePetals);
	}
}
