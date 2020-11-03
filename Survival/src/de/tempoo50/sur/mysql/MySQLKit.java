package de.tempoo50.sur.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import de.tempoo50.sur.data.DataKit;
import de.tempoo50.sur.main.Sur;

public class MySQLKit {
    public static Connection connection;

    public static void connect() {
        if (!isConnected()) {
            try {
                connection = DriverManager.getConnection("jdbc:mysql://" + DataKit.MySQLHost + ":" + DataKit.MySQLPort + "/" + DataKit.MySQLDatabase + "?autoReconnect=true", DataKit.MySQLUser, DataKit.MySQLPassword);
                Sur.log("§aDie MySQL Verbindung wurde hergestellt.");
            } catch (SQLException var1) {
                Sur.log("§4Die MySQL Verbindung konnte nicht hergestellt werden.");
            }
        }
    }


    public static ResultSet getResult(String sql) {
        if (isConnected()) {
            try {
                return connection.createStatement().executeQuery(sql);
            } catch (SQLException var2) {
                var2.printStackTrace();
            }
        }

        return null;
    }

    public static void close() {
        if (isConnected()) {
            try {
                connection.close();
            } catch (SQLException var1) {
                var1.printStackTrace();
            }
        }

    }

    public static boolean isConnected() {
        return connection != null;
    }

    public static void update(String qry) {
        try {
            Statement st = connection.createStatement();
            st.executeUpdate(qry);
            st.close();
        } catch (SQLException var2) {
            var2.printStackTrace();
        }
    }

}