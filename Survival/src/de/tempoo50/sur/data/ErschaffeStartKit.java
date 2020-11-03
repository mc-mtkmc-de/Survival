package de.tempoo50.sur.data;

import java.io.File;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.sur.data.FileManagaerKit;
import de.tempoo50.sur.data.DataKit;
import de.tempoo50.sur.main.Sur;
import de.tempoo50.sur.mysql.SQLManagerKit;

public class ErschaffeStartKit {

    public static boolean blockKit(Player player) {

        File perm = new File("plugins//ServerSystem//Permission.yml");
        YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

        long end;
        if(player.hasPermission((String) per.get("Start.Admin"))){
            return true;
        }
        if(DataKit.useMySQL){
            end = Sur.kits.get(player).getTime() + DataKit.KitCooldown*1000L;
        }else{
            end = FileManagaerKit.getFile().getLong("Users." + player.getUniqueId().toString() + ".Time") + DataKit.KitCooldown*1000L;
        }


        if(System.currentTimeMillis() >= end){
            return true;
        }else{
            return false;
        }
    }


    public static Long getRemindingTIme(Player player){
        if(DataKit.useMySQL){
            return (Sur.kits.get(player).getTime() + DataKit.KitCooldown*1000L);
        }else{
            return (FileManagaerKit.getFile().getLong("Users." + player.getUniqueId().toString() + ".Time") + DataKit.KitCooldown*1000L);
        }
    }

    public static void setWatingTime(Player player){
        if(DataKit.useMySQL){
            SQLManagerKit.updateData(player, System.currentTimeMillis());
        }else{
            FileManagaerKit.getFile().setValue("Users." + player.getUniqueId().toString() + ".Time", System.currentTimeMillis());
            FileManagaerKit.getFile().save();
        }
    }


}