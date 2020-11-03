package de.tempoo50.sur.utils;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

public class TablistUtil {
	
	public static Scoreboard tab;
	
	static File file = new File("plugins//Sur//Tablist.yml");
	static YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
	
	static File pfile = new File("plugins//Sur//Permission.yml");
	static YamlConfiguration pconfig = YamlConfiguration.loadConfiguration(pfile);
	
	public static void loadTab() {
		
		tab = Bukkit.getScoreboardManager().getNewScoreboard();
		
		Team Admin = tab.registerNewTeam("00000T1");
		Team Dev = tab.registerNewTeam("00001T2");
		Team Shulker = tab.registerNewTeam("00002T3");
		Team Elytren = tab.registerNewTeam("00003T4");
		Team MBuilder = tab.registerNewTeam("00004T5");
		Team Builder = tab.registerNewTeam("00005T6");
		Team Mod = tab.registerNewTeam("00006T7");
		Team Sup = tab.registerNewTeam("00007T8");
		Team T1 = tab.registerNewTeam("00008T9");
		Team T2 = tab.registerNewTeam("00009T10");
		Team T3 = tab.registerNewTeam("00010T11");
		Team Freund = tab.registerNewTeam("00011T12");
		Team YT1 = tab.registerNewTeam("00012T13");
		Team Drachent = tab.registerNewTeam("00013T14");
		Team Enderd = tab.registerNewTeam("00014T15");
		Team Drache = tab.registerNewTeam("00015T16");
		Team YT = tab.registerNewTeam("00016T17");
		Team Enderman = tab.registerNewTeam("00017T18");
		Team Ultra = tab.registerNewTeam("00018T19");
		Team Premium = tab.registerNewTeam("00019T20");
		Team Spieler = tab.registerNewTeam("00020T21");
		
		Admin.setPrefix((String) config.get("Prefix.1"));
		Dev.setPrefix((String) config.get("Prefix.2"));
		Shulker.setPrefix((String) config.get("Prefix.3"));
		Elytren.setPrefix((String) config.get("Prefix.4"));
		MBuilder.setPrefix((String) config.get("Prefix.5"));
		Builder.setPrefix((String) config.get("Prefix.6"));
		Mod.setPrefix((String) config.get("Prefix.7"));
		Sup.setPrefix((String) config.get("Prefix.8"));
		T1.setPrefix((String) config.get("Prefix.9"));
		T2.setPrefix((String) config.get("Prefix.10"));
		T3.setPrefix((String) config.get("Prefix.11"));
		Freund.setPrefix((String) config.get("Prefix.12"));
		YT1.setPrefix((String) config.get("Prefix.13"));
		Drachent.setPrefix((String) config.get("Prefix.14"));
		Enderd.setPrefix((String) config.get("Prefix.15"));
		Drache.setPrefix((String) config.get("Prefix.16"));
		YT.setPrefix((String) config.get("Prefix.17"));
		Enderman.setPrefix((String) config.get("Prefix.18"));
		Ultra.setPrefix((String) config.get("Prefix.19"));
		Premium.setPrefix((String) config.get("Prefix.20"));
		Spieler.setPrefix((String) config.get("Prefix.21"));
		
	}
	
	@SuppressWarnings("deprecation")
	public static void setPrefix(Player player) {
		
		String team = "";
		
		if(player.hasPermission((String) pconfig.get("Chat.Team1"))) {
			String msg = (String) config.get("Prefix.1");
			msg = msg.replace("&", "§").replace("§", "&");
			team = "00000T1";
			
		}else if(player.hasPermission((String) pconfig.get("Chat.Team2"))) {
			String msg = (String) config.get("Prefix.2");
			msg = msg.replace("&", "§").replace("§", "&");
			team = "00001T2";
			
		}else if(player.hasPermission((String) pconfig.get("Chat.Team3"))) {
			String msg = (String) config.get("Prefix.3");
			msg = msg.replace("&", "§").replace("§", "&");
			team = "00002T3";
			
		}else if(player.hasPermission((String) pconfig.get("Chat.Team4"))) {
			String msg = (String) config.get("Prefix.4");
			msg = msg.replace("&", "§").replace("§", "&");
			team = "00003T4";
			
		}else if(player.hasPermission((String) pconfig.get("Chat.Team5"))) {
			String msg = (String) config.get("Prefix.5");
			msg = msg.replace("&", "§").replace("§", "&");
			team = "00004T5";
			
		}else if(player.hasPermission((String) pconfig.get("Chat.Team6"))) {
			String msg = (String) config.get("Prefix.6");
			msg = msg.replace("&", "§").replace("§", "&");
			team = "00005T6";
			
		}else if(player.hasPermission((String) pconfig.get("Chat.Team7"))) {
			String msg = (String) config.get("Prefix.7");
			msg = msg.replace("&", "§").replace("§", "&");
			team = "00006T7";
			
		}else if(player.hasPermission((String) pconfig.get("Chat.Team8"))) {
			String msg = (String) config.get("Prefix.8");
			msg = msg.replace("&", "§").replace("§", "&");
			team = "00007T8";
			
		}else if(player.hasPermission((String) pconfig.get("Chat.Team9"))) {
			String msg = (String) config.get("Prefix.9");
			msg = msg.replace("&", "§").replace("§", "&");
			team = "00008T9";
			
		}else if(player.hasPermission((String) pconfig.get("Chat.Team10"))) {
			String msg = (String) config.get("Prefix.10");
			msg = msg.replace("&", "§").replace("§", "&");
			team = "00009T10";
			
		}else if(player.hasPermission((String) pconfig.get("Chat.Team11"))) {
			String msg = (String) config.get("Prefix.11");
			msg = msg.replace("&", "§").replace("§", "&");
			team = "00010T11";
			
		}else if(player.hasPermission((String) pconfig.get("Chat.Player1"))) {
			String msg = (String) config.get("Prefix.12");
			msg = msg.replace("&", "§").replace("§", "&");
			team = "00011T12";
			
		}else if(player.hasPermission((String) pconfig.get("Chat.Player2"))) {
			String msg = (String) config.get("Prefix.13");
			msg = msg.replace("&", "§").replace("§", "&");
			team = "00012T13";
			
		}else if(player.hasPermission((String) pconfig.get("Chat.Player3"))) {
			String msg = (String) config.get("Prefix.14");
			msg = msg.replace("&", "§").replace("§", "&");
			team = "00013T14";
			
		}else if(player.hasPermission((String) pconfig.get("Chat.Player4"))) {
			String msg = (String) config.get("Prefix.15");
			msg = msg.replace("&", "§").replace("§", "&");
			team = "00014T15";
			
		}else if(player.hasPermission((String) pconfig.get("Chat.Player5"))) {
			String msg = (String) config.get("Prefix.16");
			msg = msg.replace("&", "§").replace("§", "&");
			team = "00015T16";
			
		}else if(player.hasPermission((String) pconfig.get("Chat.Player6"))) {
			String msg = (String) config.get("Prefix.17");
			msg = msg.replace("&", "§").replace("§", "&");
			team = "00016T17";
			
		}else if(player.hasPermission((String) pconfig.get("Chat.Player7"))) {
			String msg = (String) config.get("Prefix.18");
			msg = msg.replace("&", "§").replace("§", "&");
			team = "00017T18";
			
		}else if(player.hasPermission((String) pconfig.get("Chat.Player8"))) {
			String msg = (String) config.get("Prefix.19");
			msg = msg.replace("&", "§").replace("§", "&");
			team = "00018T19";
			
		}else if(player.hasPermission((String) pconfig.get("Chat.Player9"))) {
			String msg = (String) config.get("Prefix.20");
			msg = msg.replace("&", "§").replace("§", "&");
			team = "00019T20";
			
		}else {
			String msg = (String) config.get("Prefix.21");
			msg = msg.replace("&", "§").replace("§", "&");
			team = "00020T21";
			
		}
		
		tab.getTeam(team).addPlayer(player);
		player.setDisplayName(tab.getTeam(team).getPrefix() + player.getName());
		
		for(Player all : Bukkit .getOnlinePlayers()) {
			all.setScoreboard(tab);
		
		}
		
	}

}
