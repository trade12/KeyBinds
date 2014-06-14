package com.trdae12.KeyBinds;

import java.util.EnumSet;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class KeyBinds extends KeyBinding{

	public Minecraft mc = Minecraft.getMinecraft();
	/*	public static KeyBinding openConsole = new KeyBinding("Show Binds Console", Keyboard.KEY_C);
	public static KeyBinding openConsole = new KeyBinding("Show Binds Console", Keyboard.KEY_C); */
	public static KeyBinding openConsole = new KeyBinding("Show Binds Console", 67 , "Keyboard.KEY_C");
	
	public KeyBinds() {
		super(new KeyBinding[]{openConsole}, new boolean[]{true});
	}

	@Override
	public String getLabel() {
		return "Key Bindings";
	}
	

	@Override
	public void keyDown(EnumSet<TickType> types, KeyBinding kb, boolean tickEnd, boolean isRepeat) {
		if(kb.getKeyCode() == openConsole.getKeyCode() && tickEnd && mc.currentScreen == null && !isRepeat){
			Minecraft.getMinecraft().displayGuiScreen(KeyBindsMod.console);
		}
	}

	@Override
	public EnumSet<TickType> ticks() {
		return EnumSet.of(TickType.CLIENT);
	}

	@Override
	public void keyUp(EnumSet<TickType> types, KeyBinding kb, boolean tickEnd) {

	}
}
