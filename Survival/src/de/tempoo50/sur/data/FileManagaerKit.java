package de.tempoo50.sur.data;

import java.util.ArrayList;
import de.tempoo50.sur.main.Sur;
import de.tempoo50.sur.data.DataKit;

public class FileManagaerKit {

    private static FileWriter file = new FileWriter(Sur.getInctance().getDataFolder().getPath(), "StarterKit.yml");

    public static FileWriter getFile(){
        return file;
    }

    public static void loadFile(){
        if(!file.exist()){
            file.setValue("KitCooldown", 999999999);
            file.setValue("MySQL.use", false);
            file.setValue("MySQL.Host", "");
            file.setValue("MySQL.Port", 3306);
            file.setValue("MySQL.Database", "");
            file.setValue("MySQL.User", "");
            file.setValue("MySQL.Password", "");
            ArrayList<String> list = new ArrayList<>();
            file.setValue("Users", list);
            file.save();
        }
    }

    public static void readFile(){
        DataKit.KitCooldown = file.getInt("KitCooldown");
        DataKit.useMySQL = file.getBoolean("MySQL.use");
        DataKit.MySQLHost = file.getString("MySQL.Host");
        DataKit.MySQLPort = file.getInt("MySQL.Port");
        DataKit.MySQLDatabase = file.getString("MySQL.Database");
        DataKit.MySQLUser = file.getString("MySQL.User");
        DataKit.MySQLPassword = file.getString("MySQL.Password");
    }

    public static void relaodFile(){
        file = new FileWriter(Sur.getInctance().getDataFolder().getPath(), "StarterKit.yml");
        readFile();
    }

    private static void setValue(final String valuePath, final String value){
        if(!file.valueExist(valuePath)){
            file.setValue(valuePath, value);
        }
    }


}
