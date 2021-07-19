package com.bruh.mcb.core.init;

import com.bruh.mcb.Mcb;
import com.bruh.mcb.common.material.CustomToolMaterial;
import com.bruh.mcb.core.ItemGroup.McbItemGroup;
import com.bruh.mcb.core.ItemGroup.McbItemGroup2;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mcb.MOD_ID);

	

	public static final RegistryObject<Item> STRONG_WEB = ITEMS.register("strong_web",
			() -> new Item(new Item.Properties().tab(McbItemGroup.MINECRAFT_BUT)));

	public static final RegistryObject<Item> INTENSE_WEB = ITEMS.register("intense_web",
			() -> new Item(new Item.Properties().tab(McbItemGroup.MINECRAFT_BUT)));

	public static final RegistryObject<Item> ACTIVATED_SPIDER_IRON_INGOT = ITEMS.register("activated_spider_iron_ingot",
			() -> new Item(new Item.Properties().tab(McbItemGroup.MINECRAFT_BUT)));
	
public static final RegistryObject<Item> SPIDER_SWORD = ITEMS.register("spider_sword",
			() -> new SwordItem(CustomToolMaterial.SPIDER_SWORD, 0, 10,
					new Item.Properties().tab(McbItemGroup.MINECRAFT_BUT)));

	public static final RegistryObject<Item> SPIDER_IRON_INGOT = ITEMS.register("spider_iron_ingot",
			() -> new Item(new Item.Properties().tab(McbItemGroup.MINECRAFT_BUT)));

	public static final RegistryObject<Item> SPIDER_IRON_ORE = ITEMS.register("spider_iron_ore",
			() -> new BlockItem(BlockInit.SPIDER_IRON_ORE.get(),
					new Item.Properties().tab(McbItemGroup.MINECRAFT_BUT)));

	public static final RegistryObject<Item> ACTIVATED_SPIDER_IRON_ORE = ITEMS.register("activated_spider_iron_ore",
			() -> new BlockItem(BlockInit.ACTIVATED_SPIDER_IRON_ORE.get(),
					new Item.Properties().tab(McbItemGroup.MINECRAFT_BUT)));

	public static final RegistryObject<Item> SPIDER_ORE_BLOCK = ITEMS.register("spider_ore_block",
			() -> new BlockItem(BlockInit.SPIDER_ORE_BLOCK.get(),
					new Item.Properties().tab(McbItemGroup.MINECRAFT_BUT)));

	public static final RegistryObject<Item> QUARRY = ITEMS.register("quarry",
			() -> new BlockItem(BlockInit.QUARRY.get(), new Item.Properties().tab(McbItemGroup2.IEM)));

	// dev items
	public static final RegistryObject<Item> ITEM = ITEMS.register("item", () -> new Item(new Item.Properties()));

	public static final RegistryObject<Item> CRAFTING_ARROW = ITEMS.register("crafting_arrow",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC).stacksTo(1)));

}
