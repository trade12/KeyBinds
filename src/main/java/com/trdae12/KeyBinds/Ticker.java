
package com.trdae12.KeyBinds;

import java.util.EnumSet;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.ServerTickEvent;

public class Ticker
{
@SubscribeEvent
public void onServerTick(ServerTickEvent event)
	{
	
	}
}
/*
public class Ticker implements ITickHandler{


	public void tickStart(EnumSet<TickType> type, Object... tickData) {
		if(type.equals(EnumSet.of(TickType.CLIENT))){
			KeyBindsMain.tick();
		}
	}


	public void tickEnd(EnumSet<TickType> type, Object... tickData) {
	
	}

	public EnumSet<TickType> ticks() {
		return EnumSet.of(TickType.CLIENT);
	}

	public String getLabel() {
		return "KeyBinds Mod Ticker";
	}

}
*/

