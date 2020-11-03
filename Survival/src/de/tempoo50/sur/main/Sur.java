package de.tempoo50.sur.main;

import de.tempoo50.sur.commands.StarterKitsCommand;
import de.tempoo50.sur.data.FileManagaerKit;
import de.tempoo50.sur.mysql.MySQLKit;
import de.tempoo50.sur.utils.*;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import de.tempoo50.sur.commands.GamemodeCCommand;
import de.tempoo50.sur.commands.GamemodeSCommand;
import de.tempoo50.sur.listener.ChatListener;
import de.tempoo50.sur.listener.DeathListener;
import de.tempoo50.sur.listener.JoinListener;
import de.tempoo50.sur.listener.LeaveListener;

import java.util.HashMap;

public class Sur extends JavaPlugin {

    private static Sur plugin;
    private static Sur inctance;
    public static HashMap<Player, KitPlayer> kits = new HashMap<>();


    public void onEnable() {

        inctance = this;
        plugin = this;



        TablistFile.loadFile();
        TablistUtil.loadTab();


        PermissionFile.loadPermission();

        getCommand("gm1").setExecutor(new GamemodeCCommand());
        getCommand("gm0").setExecutor(new GamemodeSCommand());
        getCommand("start").setExecutor(new StarterKitsCommand());

        Bukkit.getPluginManager().registerEvents(new ChatListener(this), this);
        Bukkit.getPluginManager().registerEvents(new DeathListener(), this);
        Bukkit.getPluginManager().registerEvents(new JoinListener(), this);
        Bukkit.getPluginManager().registerEvents(new LeaveListener(), this);

    }

    private void loadFile() {

        FileManagaerKit.loadFile();
        FileManagaerKit.readFile();
        ChatSystemFile.loadChatSystem();
        PermissionFile.loadPermission();
        TablistFile.loadFile();


    }

    private void loadMySQL() {

        MySQLKit.connect();
        MySQLKit.update("CREATE TABLE IF NOT EXISTS Kit (UUID VARCHAR(255),Time LONG)");
    }

    public static void logs(final String message) {

        Bukkit.getConsoleSender().sendMessage(MessagesUtil.LOAD + message);

    }

    public static void log(String msg) {

        Bukkit.getConsoleSender().sendMessage(MessagesUtil.LOAD + msg);

    }

    public static Sur getPlugin() {
        return plugin;
    }

    public static Sur getInctance() {

        return inctance;

    }

}