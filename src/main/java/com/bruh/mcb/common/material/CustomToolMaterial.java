package com.bruh.mcb.common.material;

import java.util.function.Supplier;

import com.bruh.mcb.core.init.ItemInit;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum CustomToolMaterial implements IItemTier{
	
	SPIDER_SWORD(4, 20000, 19f, 49f, 17, () -> Ingredient.of(ItemInit.ACTIVATED_SPIDER_IRON_INGOT.get()));
	
	private final int harvestLevel;
	private final int maxUsees;
	private final float efficiency;
	private final float attackDamage;
	private final int enchantability;
	private final Ingredient repairMaterial;
	
	CustomToolMaterial(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial){
		this.harvestLevel = harvestLevel;
		this.maxUsees = maxUses;
		this.efficiency = efficiency;
		this.attackDamage = attackDamage;
		this.enchantability = enchantability;
		this.repairMaterial = repairMaterial.get();
	}
	
	@Override
	public int getUses() {
		return this.maxUsees;
	}
	@Override
	public float getSpeed() {
		return this.efficiency;
	}
	@Override
	public float getAttackDamageBonus() {
		return this.attackDamage;
	}
	@Override
	public int getLevel() {
		return this.harvestLevel;
	}
	@Override
	public int getEnchantmentValue() {
		// TODO Auto-generated method stub
		return enchantability;
	}
	@Override
	public Ingredient getRepairIngredient() {
		return repairMaterial;
	}
	

}
