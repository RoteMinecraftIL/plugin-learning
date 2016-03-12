package com.roteminecraftil.te2;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.roteminecraftil.te2.commands.*;
import com.roteminecraftil.te2.event.block.*;

public class Tutorial extends JavaPlugin {
	public void onEnable() {
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = Logger.getLogger("Minecraft");
		RegisterCommands();
		logger.info(pdfFile.getName() + " V: " + pdfFile.getVersion() + " Has been enabled!");
	}

	public void onDisable() {
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = Logger.getLogger("Minecraft");
		logger.info(pdfFile.getName() + " V: " + pdfFile.getVersion() + " Has been disabled!");

	}

	public void RegisterCommands() {
		getCommand("hello").setExecutor(new Hello());
		getCommand("goodbye").setExecutor(new Goodbye());
	}

	public void RegisterEvents() {
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new BlockBreak(), this);
	}

}