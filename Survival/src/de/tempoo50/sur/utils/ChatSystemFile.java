package de.tempoo50.sur.utils;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

public class ChatSystemFile {

    public static void loadChatSystem() {

        File file = new File("plugins//Sur//Chat//ChatSystem.yml");
        YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

        config.options().header("Here you can set up your chat system");
        config.addDefault("Chat.Team1", "/n[Prefix][Player][Clan]§7: §amessage /n ");
        config.addDefault("Chat.Team2", "/n[Prefix][Player][Clan]§7: §amessage /n ");
        config.addDefault("Chat.Team3", "/n[Prefix][Player][Clan]§7: §amessage /n ");
        config.addDefault("Chat.Team4", "/n[Prefix][Player][Clan]§7: §amessage /n ");
        config.addDefault("Chat.Team5", "/n[Prefix][Player][Clan]§7: §amessage /n ");
        config.addDefault("Chat.Team6", "/n[Prefix][Player][Clan]§7: §amessage /n ");
        config.addDefault("Chat.Team7", "/n[Prefix][Player][Clan]§7: §amessage /n ");
        config.addDefault("Chat.Team8", "/n[Prefix][Player][Clan]§7: §amessage /n ");
        config.addDefault("Chat.Team9", "/n[Prefix][Player][Clan]§7: §amessage /n ");
        config.addDefault("Chat.Team10", "/n[Prefix][Player][Clan]§7: §amessage /n ");
        config.addDefault("Chat.Team11", "/n[Prefix][Player][Clan]§7: §amessage /n ");
        config.addDefault("Chat.Player1", "[Prefix][Player][Clan]§7: §amessage");
        config.addDefault("Chat.Player2", "[Prefix][Player][Clan]§7: §amessage");
        config.addDefault("Chat.Player3", "[Prefix][Player][Clan]§7: §amessage");
        config.addDefault("Chat.Player4", "[Prefix][Player][Clan]§7: §amessage");
        config.addDefault("Chat.Player5", "[Prefix][Player][Clan]§7: §amessage");
        config.addDefault("Chat.Player6", "[Prefix][Player][Clan]§7: §amessage");
        config.addDefault("Chat.Player7", "[Prefix][Player][Clan]§7: §amessage");
        config.addDefault("Chat.Player8", "[Prefix][Player][Clan]§7: §amessage");
        config.addDefault("Chat.Player9", "[Prefix][Player][Clan]§7: §amessage");
        config.addDefault("Chat.Player10", "[Prefix][Player][Clan]§7: §amessage");
        config.addDefault("Chat.Player11", "[Prefix][Player][Clan]: message");
        config.isString("#");
        config.addDefault("Prefix.Team1", "&a[Admin]");
        config.addDefault("Prefix.Team2", "§b[Dev]");
        config.addDefault("Prefix.Team3", "§f[Shulker]");
        config.addDefault("Prefix.Team4", "§4[Elytren]");
        config.addDefault("Prefix.Team5", "§2[MBuilder]");
        config.addDefault("Prefix.Team6", "§a[Builder]");
        config.addDefault("Prefix.Team7", "§3[Mod]");
        config.addDefault("Prefix.Team8", "§2[Sup]");
        config.addDefault("Prefix.Team9", "&a[YourPrefix]");
        config.addDefault("Prefix.Team10", "&a[YourPrefix]");
        config.addDefault("Prefix.Team11", "&a[YourPrefix]");
        config.addDefault("Prefix.Player1", "§c[Freund]");
        config.addDefault("Prefix.Player2", "§5[YT§4+§5]");
        config.addDefault("Prefix.Player3", "§e[Drachentöter]");
        config.addDefault("Prefix.Player4", "§4[Enderdrache]");
        config.addDefault("Prefix.Player5", "§9[Drache]");
        config.addDefault("Prefix.Player6", "§5[YT]");
        config.addDefault("Prefix.Player7", "§c[Enderman]");
        config.addDefault("Prefix.Player8", "§b[Ultra]");
        config.addDefault("Prefix.Player9", "§6[Premium]");
        config.addDefault("Prefix.Player10", "§7[Spieler]");

        config.options().copyDefaults(true);
        try {
            config.save(file);
        } catch (IOException e) {

            e.printStackTrace();
        }

    }

}