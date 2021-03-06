package net.tslat.aoa3.util;

import net.minecraft.block.Block;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.tslat.aoa3.advent.AdventOfAscension;
import net.tslat.aoa3.common.registration.AoABlocks;
import net.tslat.aoa3.common.registration.AoAItemGroups;
import net.tslat.aoa3.common.registration.AoAItems;
import net.tslat.aoa3.library.misc.MutableSupplier;

import javax.annotation.Nullable;

public abstract class BlockUtil {
	public static final float UNBREAKABLE_HARDNESS = -1f;
	public static final float UNBREAKABLE_RESISTANCE = 999999999f;

	public static Block.Properties generateBlockProperties(Material material, MaterialColor mapColour, float hardness, float resistance) {
		return generateBlockProperties(material, mapColour, hardness, resistance, null, null, 0, -1);
	}

	public static Block.Properties generateBlockProperties(Material material, MaterialColor mapColour, float hardness, float resistance, int lightLevel) {
		return generateBlockProperties(material, mapColour, hardness, resistance, null, null, lightLevel, -1);
	}

	public static Block.Properties generateBlockProperties(Material material, MaterialColor mapColour, float hardness, float resistance, ToolType harvestTool, int harvestLevel) {
		return generateBlockProperties(material, mapColour, hardness, resistance, harvestTool, null, 0, harvestLevel);
	}

	public static Block.Properties generateBlockProperties(Material material, MaterialColor mapColour, float hardness, float resistance, SoundType soundType) {
		return generateBlockProperties(material, mapColour, hardness, resistance, null, soundType, 0, -1);
	}

	public static Block.Properties generateBlockProperties(Material material, MaterialColor mapColour, float hardness, float resistance, @Nullable ToolType harvestTool, @Nullable SoundType soundType, int lightLevel, int harvestLevel) {
		Block.Properties properties = Block.Properties.create(material, mapColour);

		properties.hardnessAndResistance(hardness, resistance);
		properties.harvestLevel(harvestLevel);
		properties.lightValue(lightLevel);

		if (hardness == UNBREAKABLE_HARDNESS && resistance == UNBREAKABLE_RESISTANCE)
			properties.noDrops();

		if (harvestTool != null)
			properties.harvestTool(harvestTool);

		if (soundType != null) {
			properties.sound(soundType);
		}
		else {
			if (material == null || material == Material.ROCK) {
				properties.sound(SoundType.STONE);
			}
			else if (material == Material.WOOD) {
				properties.sound(SoundType.WOOD);
			}
			else if (material == Material.GLASS) {
				properties.sound(SoundType.GLASS);
			}
			else if (material == Material.EARTH) {
				properties.sound(SoundType.GROUND);
			}
			else if (material == Material.PLANTS || material == Material.ORGANIC) {
				properties.sound(SoundType.PLANT);
			}
			else if (material == Material.SNOW || material == Material.SNOW_BLOCK) {
				properties.sound(SoundType.SNOW);
			}
			else if (material == Material.SAND) {
				properties.sound(SoundType.SAND);
			}
			else if (material == Material.WOOL) {
				properties.sound(SoundType.CLOTH);
			}
		}

		return properties;
	}

	public static RegistryObject<FlowingFluidBlock> createFluidBlock(String id, Material material, int colour, int viscosity, int density) {
		return createFluidBlock(id, material, colour, viscosity, density, new ResourceLocation("block/water_still"), new ResourceLocation("block/water_flow"), new ResourceLocation("block/water_overlay"));
	}

	public static RegistryObject<FlowingFluidBlock> createFluidBlock(String id, Material material, int colour, int viscosity, int density, ResourceLocation stillTexture, ResourceLocation flowingTexture, ResourceLocation overlay) {
		MutableSupplier<ForgeFlowingFluid.Source> sourceFluid = new MutableSupplier<ForgeFlowingFluid.Source>(null);
		MutableSupplier<ForgeFlowingFluid.Flowing> flowingFluid = new MutableSupplier<ForgeFlowingFluid.Flowing>(null);
		RegistryObject<FlowingFluidBlock> block = AoABlocks.BLOCKS.register(id, () -> new FlowingFluidBlock(flowingFluid, Block.Properties.create(material).doesNotBlockMovement().hardnessAndResistance(100.0F).noDrops()));
		ForgeFlowingFluid.Properties fluidProperties = new ForgeFlowingFluid.Properties(sourceFluid, flowingFluid,
				FluidAttributes.builder(stillTexture, flowingTexture)
						.overlay(overlay)
						.translationKey("block." + AdventOfAscension.MOD_ID + "." + id)
						.color(colour)
						.viscosity(viscosity)
						.density(density)
		)
		.bucket(AoAItems.ITEMS.register(id + "_bucket", () -> new BucketItem(sourceFluid, new Item.Properties().group(AoAItemGroups.MISC_ITEMS).maxStackSize(16))))
		.block(block);

		sourceFluid.update(AoABlocks.FLUIDS.register(id, () -> new ForgeFlowingFluid.Source(fluidProperties)));
		flowingFluid.update(AoABlocks.FLUIDS.register(id + "_flowing", () -> new ForgeFlowingFluid.Flowing(fluidProperties)));

		return block;
	}
}
