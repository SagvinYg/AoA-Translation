package net.tslat.aoa3.structure.abyss;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.entity.npcs.lottoman.EntityAbyssalLottoman;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class AbyssalLottoHut extends AoAStructure { //StructureSize: 8x6x8
	private static final IBlockState ironBars = Blocks.IRON_BARS.getDefaultState();
	private static final IBlockState glass = Blocks.GLASS.getDefaultState();
	private static final IBlockState bloodstoneBricks = BlockRegister.bricksBloodstone.getDefaultState();
	private static final IBlockState bloodStrands = BlockRegister.plantBloodStrands.getDefaultState();
	private static final IBlockState eyeBlock = BlockRegister.eyeBlock.getDefaultState();

	public AbyssalLottoHut() {
		super("AbyssalLottoHut");
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 2, 0, 2, eyeBlock);
		addBlock(world, basePos, 2, 0, 5, eyeBlock);
		addBlock(world, basePos, 5, 0, 2, eyeBlock);
		addBlock(world, basePos, 5, 0, 5, eyeBlock);
		addBlock(world, basePos, 2, 1, 2, bloodStrands);
		addBlock(world, basePos, 2, 1, 5, bloodStrands);
		addBlock(world, basePos, 5, 1, 2, bloodStrands);
		addBlock(world, basePos, 5, 1, 5, bloodStrands);
		addBlock(world, basePos, 2, 2, 2, bloodStrands);
		addBlock(world, basePos, 2, 2, 5, bloodStrands);
		addBlock(world, basePos, 5, 2, 2, bloodStrands);
		addBlock(world, basePos, 5, 2, 5, bloodStrands);
		addBlock(world, basePos, 0, 3, 0, bloodstoneBricks);
		addBlock(world, basePos, 0, 3, 1, bloodstoneBricks);
		addBlock(world, basePos, 0, 3, 2, bloodstoneBricks);
		addBlock(world, basePos, 0, 3, 3, bloodstoneBricks);
		addBlock(world, basePos, 0, 3, 4, bloodstoneBricks);
		addBlock(world, basePos, 0, 3, 5, bloodstoneBricks);
		addBlock(world, basePos, 0, 3, 6, bloodstoneBricks);
		addBlock(world, basePos, 0, 3, 7, bloodstoneBricks);
		addBlock(world, basePos, 1, 3, 0, bloodstoneBricks);
		addBlock(world, basePos, 1, 3, 1, glass);
		addBlock(world, basePos, 1, 3, 2, glass);
		addBlock(world, basePos, 1, 3, 3, glass);
		addBlock(world, basePos, 1, 3, 4, glass);
		addBlock(world, basePos, 1, 3, 5, glass);
		addBlock(world, basePos, 1, 3, 6, glass);
		addBlock(world, basePos, 1, 3, 7, bloodstoneBricks);
		addBlock(world, basePos, 2, 3, 0, bloodstoneBricks);
		addBlock(world, basePos, 2, 3, 1, glass);
		addBlock(world, basePos, 2, 3, 2, bloodstoneBricks);
		addBlock(world, basePos, 2, 3, 3, bloodstoneBricks);
		addBlock(world, basePos, 2, 3, 4, bloodstoneBricks);
		addBlock(world, basePos, 2, 3, 5, bloodstoneBricks);
		addBlock(world, basePos, 2, 3, 6, glass);
		addBlock(world, basePos, 2, 3, 7, bloodstoneBricks);
		addBlock(world, basePos, 3, 3, 0, bloodstoneBricks);
		addBlock(world, basePos, 3, 3, 1, glass);
		addBlock(world, basePos, 3, 3, 2, bloodstoneBricks);
		addBlock(world, basePos, 3, 3, 3, glass);
		addBlock(world, basePos, 3, 3, 4, glass);
		addBlock(world, basePos, 3, 3, 5, bloodstoneBricks);
		addBlock(world, basePos, 3, 3, 6, glass);
		addBlock(world, basePos, 3, 3, 7, bloodstoneBricks);
		addBlock(world, basePos, 4, 3, 0, bloodstoneBricks);
		addBlock(world, basePos, 4, 3, 1, glass);
		addBlock(world, basePos, 4, 3, 2, bloodstoneBricks);
		addBlock(world, basePos, 4, 3, 3, glass);
		addBlock(world, basePos, 4, 3, 4, glass);
		addBlock(world, basePos, 4, 3, 5, bloodstoneBricks);
		addBlock(world, basePos, 4, 3, 6, glass);
		addBlock(world, basePos, 4, 3, 7, bloodstoneBricks);
		addBlock(world, basePos, 5, 3, 0, bloodstoneBricks);
		addBlock(world, basePos, 5, 3, 1, glass);
		addBlock(world, basePos, 5, 3, 2, bloodstoneBricks);
		addBlock(world, basePos, 5, 3, 3, bloodstoneBricks);
		addBlock(world, basePos, 5, 3, 4, bloodstoneBricks);
		addBlock(world, basePos, 5, 3, 5, bloodstoneBricks);
		addBlock(world, basePos, 5, 3, 6, glass);
		addBlock(world, basePos, 5, 3, 7, bloodstoneBricks);
		addBlock(world, basePos, 6, 3, 0, bloodstoneBricks);
		addBlock(world, basePos, 6, 3, 1, glass);
		addBlock(world, basePos, 6, 3, 2, glass);
		addBlock(world, basePos, 6, 3, 3, glass);
		addBlock(world, basePos, 6, 3, 4, glass);
		addBlock(world, basePos, 6, 3, 5, glass);
		addBlock(world, basePos, 6, 3, 6, glass);
		addBlock(world, basePos, 6, 3, 7, bloodstoneBricks);
		addBlock(world, basePos, 7, 3, 0, bloodstoneBricks);
		addBlock(world, basePos, 7, 3, 1, bloodstoneBricks);
		addBlock(world, basePos, 7, 3, 2, bloodstoneBricks);
		addBlock(world, basePos, 7, 3, 3, bloodstoneBricks);
		addBlock(world, basePos, 7, 3, 4, bloodstoneBricks);
		addBlock(world, basePos, 7, 3, 5, bloodstoneBricks);
		addBlock(world, basePos, 7, 3, 6, bloodstoneBricks);
		addBlock(world, basePos, 7, 3, 7, bloodstoneBricks);
		addBlock(world, basePos, 0, 4, 0, bloodstoneBricks);
		addBlock(world, basePos, 0, 4, 1, ironBars);
		addBlock(world, basePos, 0, 4, 2, ironBars);
		addBlock(world, basePos, 0, 4, 3, ironBars);
		addBlock(world, basePos, 0, 4, 4, ironBars);
		addBlock(world, basePos, 0, 4, 5, ironBars);
		addBlock(world, basePos, 0, 4, 6, ironBars);
		addBlock(world, basePos, 0, 4, 7, bloodstoneBricks);
		addBlock(world, basePos, 1, 4, 0, ironBars);
		addBlock(world, basePos, 1, 4, 7, ironBars);
		addBlock(world, basePos, 2, 4, 0, ironBars);
		addBlock(world, basePos, 2, 4, 7, ironBars);
		addBlock(world, basePos, 3, 4, 0, ironBars);
		addBlock(world, basePos, 3, 4, 7, ironBars);
		addBlock(world, basePos, 4, 4, 0, ironBars);
		addBlock(world, basePos, 4, 4, 7, ironBars);
		addBlock(world, basePos, 5, 4, 0, ironBars);
		addBlock(world, basePos, 5, 4, 7, ironBars);
		addBlock(world, basePos, 6, 4, 0, ironBars);
		addBlock(world, basePos, 6, 4, 7, ironBars);
		addBlock(world, basePos, 7, 4, 0, bloodstoneBricks);
		addBlock(world, basePos, 7, 4, 1, ironBars);
		addBlock(world, basePos, 7, 4, 2, ironBars);
		addBlock(world, basePos, 7, 4, 3, ironBars);
		addBlock(world, basePos, 7, 4, 4, ironBars);
		addBlock(world, basePos, 7, 4, 5, ironBars);
		addBlock(world, basePos, 7, 4, 6, ironBars);
		addBlock(world, basePos, 7, 4, 7, bloodstoneBricks);
		addBlock(world, basePos, 0, 5, 0, bloodstoneBricks);
		addBlock(world, basePos, 0, 5, 7, bloodstoneBricks);
		addBlock(world, basePos, 7, 5, 0, bloodstoneBricks);
		addBlock(world, basePos, 7, 5, 7, bloodstoneBricks);
	}

	@Override
	protected void spawnEntities(World world, Random rand, BlockPos basePos) {
		EntityAbyssalLottoman lottoman = new EntityAbyssalLottoman(world);

		lottoman.setLocationAndAngles(basePos.getX() + 3, basePos.getY() + 4, basePos.getZ() + 3, rand.nextFloat() * 360, 0);
		world.spawnEntity(lottoman);
	}
}
