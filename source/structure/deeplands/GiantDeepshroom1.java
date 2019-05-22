package net.tslat.aoa3.structure.deeplands;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class GiantDeepshroom1 extends AoAStructure { //StructureSize: 5x8x5 variable
	private static final IBlockState mushroom = BlockRegister.mushroomBlack.getDefaultState();
	private static final IBlockState mushroomStem = BlockRegister.mushroomStemBlack.getDefaultState();

	public GiantDeepshroom1() {
		super("GiantDeepshroom1");
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		int tiers = 1 + rand.nextInt(3);
		
		while (tiers > 0) {
			addBlock(world, basePos, 2, 0, 2, mushroomStem);
			addBlock(world, basePos, 2, 1, 2, mushroomStem);
			addBlock(world, basePos, 2, 2, 2, mushroomStem);
			addBlock(world, basePos, 2, 3, 2, mushroomStem);
			addBlock(world, basePos, 0, 4, 1, mushroom);
			addBlock(world, basePos, 0, 4, 2, mushroom);
			addBlock(world, basePos, 0, 4, 3, mushroom);
			addBlock(world, basePos, 1, 4, 0, mushroom);
			addBlock(world, basePos, 1, 4, 1, mushroom);
			addBlock(world, basePos, 1, 4, 2, mushroom);
			addBlock(world, basePos, 1, 4, 3, mushroom);
			addBlock(world, basePos, 1, 4, 4, mushroom);
			addBlock(world, basePos, 2, 4, 0, mushroom);
			addBlock(world, basePos, 2, 4, 1, mushroom);
			addBlock(world, basePos, 2, 4, 2, mushroomStem);
			addBlock(world, basePos, 2, 4, 3, mushroom);
			addBlock(world, basePos, 2, 4, 4, mushroom);
			addBlock(world, basePos, 3, 4, 0, mushroom);
			addBlock(world, basePos, 3, 4, 1, mushroom);
			addBlock(world, basePos, 3, 4, 2, mushroom);
			addBlock(world, basePos, 3, 4, 3, mushroom);
			addBlock(world, basePos, 3, 4, 4, mushroom);
			addBlock(world, basePos, 4, 4, 1, mushroom);
			addBlock(world, basePos, 4, 4, 2, mushroom);
			addBlock(world, basePos, 4, 4, 3, mushroom);
			addBlock(world, basePos, 2, 5, 2, mushroomStem);
			addBlock(world, basePos, 2, 6, 2, mushroomStem);
			addBlock(world, basePos, 0, 7, 2, mushroom);
			addBlock(world, basePos, 1, 7, 1, mushroom);
			addBlock(world, basePos, 1, 7, 2, mushroom);
			addBlock(world, basePos, 1, 7, 3, mushroom);
			addBlock(world, basePos, 2, 7, 0, mushroom);
			addBlock(world, basePos, 2, 7, 1, mushroom);
			addBlock(world, basePos, 2, 7, 2, mushroomStem);
			addBlock(world, basePos, 2, 7, 3, mushroom);
			addBlock(world, basePos, 2, 7, 4, mushroom);
			addBlock(world, basePos, 3, 7, 1, mushroom);
			addBlock(world, basePos, 3, 7, 2, mushroom);
			addBlock(world, basePos, 3, 7, 3, mushroom);
			addBlock(world, basePos, 4, 7, 2, mushroom);

			tiers--;
			basePos = basePos.up(8);
		}
	}
}
