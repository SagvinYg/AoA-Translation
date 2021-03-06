package net.tslat.aoa3.entity.npc.banker;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;
import net.tslat.aoa3.common.container.BankerContainer;
import net.tslat.aoa3.common.registration.AoADimensions;
import net.tslat.aoa3.entity.base.AoATrader;
import net.tslat.aoa3.entity.npc.AoATraderRecipe;

import javax.annotation.Nullable;

public class ZalBankerEntity extends AoATrader {
	public ZalBankerEntity(EntityType<? extends CreatureEntity> entityType, World world) {
		super(entityType, world);
	}

	@Override
	protected float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn) {
		return 0.6875f;
	}

	@Override
	protected double getBaseMaxHealth() {
		return 30;
	}

	@Override
	protected double getBaseMovementSpeed() {
		return 0.329;
	}

	@Override
	protected boolean isFixedTradesList() {
		return true;
	}

	@Override
	public boolean canDespawn(double distanceToClosestPlayer) {
		return world.getDimension().getType() != AoADimensions.LUNALUS.type();
	}

	@Override
	protected void openGui(PlayerEntity player) {
		NetworkHooks.openGui((ServerPlayerEntity)player, new INamedContainerProvider() {
			@Override
			public ITextComponent getDisplayName() {
				return ZalBankerEntity.this.getDisplayName();
			}

			@Nullable
			@Override
			public Container createMenu(int screenId, PlayerInventory inv, PlayerEntity player) {
				return new BankerContainer(screenId, player.inventory, ZalBankerEntity.this);
			}
		}, buffer -> buffer.writeInt(getEntityId()));
	}

	@Override
	protected void getTradesList(NonNullList<AoATraderRecipe> newTradesList) {
		newTradesList.add(new AoATraderRecipe(ItemStack.EMPTY, ItemStack.EMPTY));
	}
}
