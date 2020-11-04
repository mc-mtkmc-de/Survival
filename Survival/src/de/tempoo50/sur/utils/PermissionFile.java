package de.tempoo50.sur.utils;

import java.io.File;
import java.io.IOException;
import org.bukkit.configuration.file.YamlConfiguration;

public class PermissionFile {

    public static void loadPermission() {

        File file = new File("plugins//Sur//Permission.yml");
        YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

        config.addDefault("Chat.Team1", "tab.admin");
        config.addDefault("Chat.Team2", "tab.dev");
        config.addDefault("Chat.Team3", "tab.shulker");
        config.addDefault("Chat.Team4", "tab.elytren");
        config.addDefault("Chat.Team5", "tab.mbuilder");
        config.addDefault("Chat.Team6", "tab.builder");
        config.addDefault("Chat.Team7", "tab.mod");
        config.addDefault("Chat.Team8", "tab.sup");
        config.addDefault("Chat.Team9", "sys.Team9");
        config.addDefault("Chat.Team10", "sys.Team10");
        config.addDefault("Chat.Team11", "sys.Team11");
        config.addDefault("Chat.Player1", "tab.freund");
        config.addDefault("Chat.Player2", "tab.yt+");
        config.addDefault("Chat.Player3", "tab.champ");
        config.addDefault("Chat.Player4", "tab.drache");
        config.addDefault("Chat.Player5", "tab.titan");
        config.addDefault("Chat.Player6", "tab.yt");
        config.addDefault("Chat.Player7", "tab.legende");
        config.addDefault("Chat.Player8", "tab.ultra");
        config.addDefault("Chat.Player9", "tab.premium");
        config.addDefault("Chat.Color", "sys.chat.color");
        config.addDefault("Start.Player", "sys.start");

        config.options().copyDefaults(true);

        try {
            config.save(file);
        } catch (IOException e) {

            e.printStackTrace();
        }

    }

}
