package de.tempoo50.sur.mysql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.bukkit.entity.Player;

import de.tempoo50.sur.main.Sur;
import de.tempoo50.sur.utils.KitPlayer;

public class SQLManagerKit {


    public static boolean inKit(String uuid){
        String qry = "SELECT * FROM Kit WHERE UUID=?";
        try{
            PreparedStatement stmt = MySQLKit.connection.prepareStatement(qry);
            stmt.setString(1,uuid);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        }catch (SQLException e) {
            return false;
        }
    }

    public static void addToKit(String uuid, long time){
        if(!inKit(uuid)){
            String qry = "INSERT INTO Kit (UUID,Time) VALUES (?,?)";
            try{
                PreparedStatement stmt = MySQLKit.connection.prepareStatement(qry);
                stmt.setString(1, uuid);
                stmt.setLong(2, time);
                stmt.execute();
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static KitPlayer getData(String uuid){
        String qry = "SELECT * FROM Kit WHERE UUID=?";
        Long t = 0L;
        try{
            PreparedStatement stmt = MySQLKit.connection.prepareStatement(qry);
            stmt.setString(1,uuid);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                t = rs.getLong("Time");
            }
            return new KitPlayer(uuid, t);
        }catch (SQLException e) {
            return null;
        }
    }

    public static void updateData(Player player, Long time){
        setData(player.getUniqueId().toString(), time);
        Sur.kits.put(player, new KitPlayer(player.getUniqueId().toString(), time));
    }

    private static void setData(String uuid, long Time){
        String qry = "UPDATE Kit SET Time=? WHERE UUID=?";
        try{
            PreparedStatement stmt = MySQLKit.connection.prepareStatement(qry);
            stmt.setLong(1, Time);
            stmt.setString(2, uuid);
            stmt.execute();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }




}