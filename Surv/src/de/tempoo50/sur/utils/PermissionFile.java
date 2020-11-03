package de.tempoo50.sur.utils;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

public class PermissionFile {
	
	public static void loadPermission() {
		
		File file = new File("plugins//Sur//Permission.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		config.addDefault("Chat.Team1", "tab.admin");//fertig
		config.addDefault("Chat.Team2", "tab.dev");//fertig
		config.addDefault("Chat.Team3", "tab.shulker");//fertig
		config.addDefault("Chat.Team4", "tab.elytren");//fertig
		config.addDefault("Chat.Team5", "tab.mbuilder");//fertig
		config.addDefault("Chat.Team6", "tab.builder");//fertig
		config.addDefault("Chat.Team7", "tab.mod");//fertig
		config.addDefault("Chat.Team8", "tab.sup");//fertig
		config.addDefault("Chat.Team9", "sys.Team9");//fertig
		config.addDefault("Chat.Team10", "sys.Team10");//fertig
		config.addDefault("Chat.Team11", "sys.Team11");//fertig
		config.addDefault("Chat.Player1", "tab.freund");//fertig
		config.addDefault("Chat.Player2", "tab.yt+");//fertig
		config.addDefault("Chat.Player3", "tab.champ");//fertig
		config.addDefault("Chat.Player4", "tab.drache");//fertig
		config.addDefault("Chat.Player5", "tab.titan");//fertig
		config.addDefault("Chat.Player6", "tab.yt");//fertig
		config.addDefault("Chat.Player7", "tab.legende");//fertig
		config.addDefault("Chat.Player8", "tab.ultra");//fertig
		config.addDefault("Chat.Player9", "tab.premium");//fertig
		config.addDefault("Chat.Color", "sys.chat.color");//fertig
		
		config.options().copyDefaults(true);
		
	    try {
			config.save(file);
		} catch (IOException e) {
			
			e.printStackTrace();	
		}
		
		}

}
