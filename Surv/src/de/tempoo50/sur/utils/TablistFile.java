package de.tempoo50.sur.utils;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

public class TablistFile {
	
	public static void loadFile() {

		File file = new File("plugins//Sur//Tablist.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		config.addDefault("Prefix.1", "§a[Admin]");
		config.addDefault("Prefix.2", "§b[Dev]");
		config.addDefault("Prefix.3", "§f[Shulker]");
		config.addDefault("Prefix.4", "§4[Elytren]");
		config.addDefault("Prefix.5", "§2[MBuilder]");
		config.addDefault("Prefix.6", "§a[Builder]");
		config.addDefault("Prefix.7", "§3[Mod]");
		config.addDefault("Prefix.8", "§2[Sup]");
		config.addDefault("Prefix.9", "§a[]");
		config.addDefault("Prefix.10", "§a[]");
		config.addDefault("Prefix.11", "§a[]");
		config.addDefault("Prefix.12", "§c[Freund]");
		config.addDefault("Prefix.13", "§5[YT§4+§5]");
		config.addDefault("Prefix.14", "§e[Drachentöter]");
		config.addDefault("Prefix.15", "§4[Enderdrache]");
		config.addDefault("Prefix.16", "§9[Drache]");
		config.addDefault("Prefix.17", "§5[YT]");
		config.addDefault("Prefix.18", "§c[Enderman]");
		config.addDefault("Prefix.19", "§b[Ultra]");
		config.addDefault("Prefix.20", "§6[Premium]");
		config.addDefault("Prefix.21", "§7[Spieler]");
		
		config.options().copyDefaults(true);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
