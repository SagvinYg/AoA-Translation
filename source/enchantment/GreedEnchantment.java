package net.tslat.aoa3.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.tslat.aoa3.common.registration.AoAEnchantments;
import net.tslat.aoa3.item.weapon.blaster.BaseBlaster;
import net.tslat.aoa3.item.weapon.gun.BaseGun;
import net.tslat.aoa3.item.weapon.staff.BaseStaff;

public class GreedEnchantment extends Enchantment {
	public GreedEnchantment() {
		super(Enchantment.Rarity.VERY_RARE, AoAEnchantments.AMMO_CONSUMING, new EquipmentSlotType[] {EquipmentSlotType.MAINHAND});
	}

	@Override
	public boolean isCurse() {
		return true;
	}

	public boolean canApply(ItemStack stack) {
		Item item = stack.getItem();

		return item instanceof BaseGun || item instanceof BaseBlaster || item instanceof BaseStaff;
	}

	@Override
	public int getMinEnchantability(int enchantmentLevel) {
		return 20;
	}

	@Override
	public int getMaxEnchantability(int enchantmentLevel) {
		return 100;
	}
}
