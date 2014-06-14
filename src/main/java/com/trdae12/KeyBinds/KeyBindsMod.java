package com.trdae12.KeyBinds;

import java.util.logging.Level;
import java.util.logging.Logger;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = "KeyBinds", name = "Key Binds Mod", version = "0.0.1")

public class KeyBindsMod {

    @Instance("Key binds")
    public static KeyBindsMod instance;
    
    public static Console console;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {

    }

    @EventHandler
    public static void init(FMLInitializationEvent event) {
    	if(event.getSide() == Side.CLIENT){
	    	log("Initializing Binds Mod!");
	    	log("#######################");
	    	console = new Console();
	    /*	TickRegistry.registerTickHandler(new Ticker(), Side.CLIENT); */
	    	FMLCommonHandler.instance().bus().register(new Ticker());
	    	FMLCommonHandler.instance().bus().register(new KeyBinds());
	    	KeyBindsMain.init();
    	}
    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) {

    }
    
    public static Logger logger = Logger.getLogger("Binds Mod");
    
    static{
    	logger.setParent((Logger) FMLLog.getLogger());
    }


    public static void log(String s, boolean warning) {
        logger.log(warning ? Level.WARNING : Level.INFO, s);
    }

    public static void log(String s) {
        log(s, false);
    }
}
