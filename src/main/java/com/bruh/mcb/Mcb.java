package com.bruh.mcb;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bruh.mcb.core.init.BlockInit;
import com.bruh.mcb.core.init.FeatureInit;
import com.bruh.mcb.core.init.ItemInit;
import com.bruh.mcb.core.init.TileEntityTypesInit;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("mcb")
public class Mcb {
	
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "mcb";

	public Mcb() {

		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		ItemInit.ITEMS.register(bus);
		TileEntityTypesInit.TILE_ENTITY_TYPE.register(bus);
		BlockInit.BLOCKS.register(bus);

		MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, FeatureInit::addOres);
		MinecraftForge.EVENT_BUS.register(this);

	}
}
