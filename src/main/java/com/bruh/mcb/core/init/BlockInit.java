package com.bruh.mcb.core.init;

import com.bruh.mcb.Mcb;
import com.bruh.mcb.common.block.QuarryBlock;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mcb.MOD_ID);

	public static final RegistryObject<Block> SPIDER_ORE_BLOCK = BLOCKS.register("spider_ore_block",
			() -> new Block(AbstractBlock.Properties.of(Material.SNOW, MaterialColor.COLOR_BLACK).harvestLevel(3)
					.strength(50, 1200).harvestTool(ToolType.PICKAXE).harvestLevel(3).sound(SoundType.ANCIENT_DEBRIS)));
	
	public static final RegistryObject<Block> SPIDER_IRON_ORE = BLOCKS.register("spider_iron_ore",
			() -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).harvestLevel(2)
					.strength(4,10).harvestTool(ToolType.PICKAXE).sound(SoundType.LODESTONE)));
	
	public static final RegistryObject<Block> ACTIVATED_SPIDER_IRON_ORE = BLOCKS.register("activated_spider_iron_ore",
			() -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).harvestLevel(3)
					.strength(6,15).harvestTool(ToolType.PICKAXE).sound(SoundType.LODESTONE)));
	
	public static final RegistryObject<Block> QUARRY = BLOCKS.register("quarry", () -> new QuarryBlock());
}
