package de.tempoo50.sur.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import de.tempoo50.sur.commands.GamemodeCCommand;
import de.tempoo50.sur.commands.GamemodeSCommand;
import de.tempoo50.sur.listener.ChatListener;
import de.tempoo50.sur.listener.DeathListener;
import de.tempoo50.sur.listener.JoinListener;
import de.tempoo50.sur.listener.LeavListener;
import de.tempoo50.sur.utils.PermissionFile;
import de.tempoo50.sur.utils.TablistFile;
import de.tempoo50.sur.utils.TablistUtil;

public class Sur extends JavaPlugin {
	
	private static Sur plugin;
	private static Sur inctance;
	
	public void onEnable() {
		
		inctance = this;
		plugin = this;
		
		
		TablistFile.loadFile();
		TablistUtil.loadTab();
		
		
		PermissionFile.loadPermission();
		
		getCommand("gm1").setExecutor(new GamemodeCCommand());
		getCommand("gm0").setExecutor(new GamemodeSCommand());
		
		Bukkit.getPluginManager().registerEvents(new ChatListener(this), this);
		Bukkit.getPluginManager().registerEvents(new DeathListener(), this);
		Bukkit.getPluginManager().registerEvents(new JoinListener(), this);
		Bukkit.getPluginManager().registerEvents(new LeavListener(), this);
		
	}
	
	public static Sur getPlugin() {
		return plugin;
	}
	
	public static Sur getInctance() {
		return inctance;
	}

}
