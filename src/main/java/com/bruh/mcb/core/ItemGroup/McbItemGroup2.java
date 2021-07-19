package com.bruh.mcb.core.ItemGroup;

import com.bruh.mcb.core.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class McbItemGroup2 extends ItemGroup{
	
	public static final McbItemGroup2 IEM = new McbItemGroup2(ItemGroup.TABS.length, "iem");
	

	public McbItemGroup2(int p_i1853_1_, String p_i1853_2_) {
		super(p_i1853_1_, p_i1853_2_);
	}

	@Override
	public ItemStack makeIcon() {
		return new ItemStack(ItemInit.QUARRY.get());
	}
	
}
