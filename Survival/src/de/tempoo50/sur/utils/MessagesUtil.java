package de.tempoo50.sur.utils;

import java.io.File;

import org.bukkit.configuration.file.YamlConfiguration;

import net.md_5.bungee.api.ChatColor;

public class MessagesUtil {

    static File file = new File("plugins//ServerSystem//Message.yml");
    static YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

    public static final String PREFIX = ChatColor.translateAlternateColorCodes('&', (String) config.get("Prefix"));
    public static final String LOAD =  (String) config.get("Load");
    public static final String NOPERM = PREFIX + ChatColor.translateAlternateColorCodes('&', (String) config.get("Noperm"));
    public static final String NOCMD = PREFIX + ChatColor.translateAlternateColorCodes('&', (String) config.get("NoCMD"));
    public static final String BLOCK = PREFIX + ChatColor.translateAlternateColorCodes('&', (String) config.get("Block"));
    public static final String BEW = ChatColor.translateAlternateColorCodes('&', (String) config.get("Bewerbung"));

}