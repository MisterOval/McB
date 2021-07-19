package com.bruh.mcb.core.ItemGroup;

import com.bruh.mcb.core.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class McbItemGroup extends ItemGroup{
	
	public static final McbItemGroup MINECRAFT_BUT = new McbItemGroup(ItemGroup.TABS.length, "minecraft_but");
	

	public McbItemGroup(int p_i1853_1_, String p_i1853_2_) {
		super(p_i1853_1_, p_i1853_2_);
	}

	@Override
	public ItemStack makeIcon() {
		return new ItemStack(ItemInit.SPIDER_ORE_BLOCK.get());
	}
	
}
