package com.bruh.mcb.common.te;

import com.bruh.mcb.core.init.TileEntityTypesInit;

import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class QuarryTileEntity extends TileEntity implements ITickableTileEntity{

	public QuarryTileEntity(TileEntityType<?> p_i48289_1_) {
		super(p_i48289_1_);
	}
	
	public QuarryTileEntity() {
		this(TileEntityTypesInit.QUARRY_TILE_ENTITY_TYPE.get());
	}
	
	@Override
	public void tick() {
		
		if(level.hasNeighborSignal(worldPosition)) {
		level.destroyBlock(worldPosition.below(), true);
		}
	}
	
}
