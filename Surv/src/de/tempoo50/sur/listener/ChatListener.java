package de.tempoo50.sur.listener;

import java.io.File;
import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import de.tempoo50.sur.main.Sur;
import net.md_5.bungee.api.ChatColor;

public class ChatListener implements Listener {

	private ArrayList<String> chatspam = new ArrayList<>();
	
	private Sur plugin;

	public ChatListener(Sur plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onChat(final AsyncPlayerChatEvent event) {
		
		File perm = new File("plugins//Sur//Permission.yml");
		YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);
		
		File file = new File("plugins//Sur//Chat//ChatSystem.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		final Player player = event.getPlayer();
        String msg = event.getMessage().replaceAll("%", "%%").trim();
        float uppercaseLetter = 0;
        
        for(int i = 0; i < msg.length(); i++) {
        	if(Character.isUpperCase(msg.charAt(i)) && Character.isLetter(msg.charAt(i))) {
        		uppercaseLetter++;
        	}
        }
        
        if(player.hasPermission((String) per.get("Chat.Team1"))) {
			String ms = (String) config.get("Chat.Team1");
			ms = ms.replace("ß", "&").replace("/n", "\n").replace("[Player]", player.getName()).replace("message", msg).replace("[Prefix]", (String) config.get("Prefix.Team1")).replace("[Clan]", " ");
			event.setFormat(ChatColor.translateAlternateColorCodes('&', ms));
			
		}else if(player.hasPermission((String) per.get("Chat.Team2"))) {
			String ms = (String) config.get("Chat.Team2");
			ms = ms.replace("ß", "&").replace("/n", "\n").replace("[Player]", player.getName()).replace("message", msg).replace("[Prefix]", (String) config.get("Prefix.Team2")).replace("[Clan]", " "); 
			event.setFormat(ChatColor.translateAlternateColorCodes('&', ms));
		}else if(player.hasPermission((String) per.get("Chat.Team3"))) {
			String ms = (String) config.get("Chat.Team3");
			ms = ms.replace("ß", "&").replace("/n", "\n").replace("[Player]", player.getName()).replace("message", msg).replace("[Prefix]", (String) config.get("Prefix.Team3")).replace("[Clan]", " "); 
			event.setFormat(ChatColor.translateAlternateColorCodes('&', ms));
		}else if(player.hasPermission((String) per.get("Chat.Team4"))) {
			String ms = (String) config.get("Chat.Team4");
			ms = ms.replace("ß", "&").replace("/n", "\n").replace("[Player]", player.getName()).replace("message", msg).replace("[Prefix]", (String) config.get("Prefix.Team4")).replace("[Clan]", " "); 
			event.setFormat(ChatColor.translateAlternateColorCodes('&', ms));
		}else if(player.hasPermission((String) per.get("Chat.Team5"))) {
			String ms = (String) config.get("Chat.Team5");
			ms = ms.replace("ß", "&").replace("/n", "\n").replace("[Player]", player.getName()).replace("message", msg).replace("[Prefix]", (String) config.get("Prefix.Team5")).replace("[Clan]", " "); 
			event.setFormat(ChatColor.translateAlternateColorCodes('&', ms));
		}else if(player.hasPermission((String) per.get("Chat.Team6"))) {
			String ms = (String) config.get("Chat.Team6");
			ms = ms.replace("ß", "&").replace("/n", "\n").replace("[Player]", player.getName()).replace("message", msg).replace("[Prefix]", (String) config.get("Prefix.Team6")).replace("[Clan]", " "); 
			event.setFormat(ChatColor.translateAlternateColorCodes('&', ms));
		}else if(player.hasPermission((String) per.get("Chat.Team7"))) {
			String ms = (String) config.get("Chat.Team7");
			ms = ms.replace("ß", "&").replace("/n", "\n").replace("[Player]", player.getName()).replace("message", msg).replace("[Prefix]", (String) config.get("Prefix.Team7")).replace("[Clan]", " "); 
			event.setFormat(ChatColor.translateAlternateColorCodes('&', ms));
		}else if(player.hasPermission((String) per.get("Chat.Team8"))) {
			String ms = (String) config.get("Chat.Team8");
			ms = ms.replace("ß", "&").replace("/n", "\n").replace("[Player]", player.getName()).replace("message", msg).replace("[Prefix]", (String) config.get("Prefix.Team8")).replace("[Clan]", " "); 
			event.setFormat(ChatColor.translateAlternateColorCodes('&', ms));
		}else if(player.hasPermission((String) per.get("Chat.Team9"))) {
			String ms = (String) config.get("Chat.Team9");
			ms = ms.replace("ß", "&").replace("/n", "\n").replace("[Player]", player.getName()).replace("message", msg).replace("[Prefix]", (String) config.get("Prefix.Team9")).replace("[Clan]", " "); 
			event.setFormat(ChatColor.translateAlternateColorCodes('&', ms));
		}else if(player.hasPermission((String) per.get("Chat.Team10"))) {
			String ms = (String) config.get("Chat.Team10");
			ms = ms.replace("ß", "&").replace("/n", "\n").replace("[Player]", player.getName()).replace("message", msg).replace("[Prefix]", (String) config.get("Prefix.Team10")).replace("[Clan]", " "); 
			event.setFormat(ChatColor.translateAlternateColorCodes('&', ms));
		}else if(player.hasPermission((String) per.get("Chat.Team11"))) {
			String ms = (String) config.get("Chat.Team11");
			ms = ms.replace("ß", "&").replace("/n", "\n").replace("[Player]", player.getName()).replace("message", msg).replace("[Prefix]", (String) config.get("Prefix.Team11")).replace("[Clan]", " "); 
			event.setFormat(ChatColor.translateAlternateColorCodes('&', ms));
		}else if(player.hasPermission((String) per.get("Chat.Player1"))) {
			String ms = (String) config.get("Chat.Player1");
			ms = ms.replace("ß", "&").replace("/n", "\n").replace("[Player]", player.getName()).replace("message", msg).replace("[Prefix]", (String) config.get("Prefix.Player1")).replace("[Clan]", " "); 
			event.setFormat(ChatColor.translateAlternateColorCodes('&', ms));
		}else if(player.hasPermission((String) per.get("Chat.Player2"))) {
			String ms = (String) config.get("Chat.Player2");
			ms = ms.replace("ß", "&").replace("/n", "\n").replace("[Player]", player.getName()).replace("message", msg).replace("[Prefix]", (String) config.get("Prefix.Player2")).replace("[Clan]", " "); 
			event.setFormat(ChatColor.translateAlternateColorCodes('&', ms));
		}else if(player.hasPermission((String) per.get("Chat.Player3"))) {
			String ms = (String) config.get("Chat.Player3");
			ms = ms.replace("ß", "&").replace("/n", "\n").replace("[Player]", player.getName()).replace("message", msg).replace("[Prefix]", (String) config.get("Prefix.Player3")).replace("[Clan]", " "); 
			event.setFormat(ChatColor.translateAlternateColorCodes('&', ms));
		}else if(player.hasPermission((String) per.get("Chat.Player4"))) {
			String ms = (String) config.get("Chat.Player4");
			ms = ms.replace("ß", "&").replace("/n", "\n").replace("[Player]", player.getName()).replace("message", msg).replace("[Prefix]", (String) config.get("Prefix.Player4")).replace("[Clan]", " "); 
			event.setFormat(ChatColor.translateAlternateColorCodes('&', ms));
		}else if(player.hasPermission((String) per.get("Chat.Player5"))) {
			String ms = (String) config.get("Chat.Player5");
			ms = ms.replace("ß", "&").replace("/n", "\n").replace("[Player]", player.getName()).replace("message", msg).replace("[Prefix]", (String) config.get("Prefix.Player5")).replace("[Clan]", " "); 
			event.setFormat(ChatColor.translateAlternateColorCodes('&', ms));
		}else if(player.hasPermission((String) per.get("Chat.Player6"))) {
			String ms = (String) config.get("Chat.Player6");
			ms = ms.replace("ß", "&").replace("/n", "\n").replace("[Player]", player.getName()).replace("message", msg).replace("[Prefix]", (String) config.get("Prefix.Player6")).replace("[Clan]", " "); 
			event.setFormat(ChatColor.translateAlternateColorCodes('&', ms));
		}else if(player.hasPermission((String) per.get("Chat.Player7"))) {
			String ms = (String) config.get("Chat.Player7");
			ms = ms.replace("ß", "&").replace("/n", "\n").replace("[Player]", player.getName()).replace("message", msg).replace("[Prefix]", (String) config.get("Prefix.Player7")).replace("[Clan]", " "); 
			event.setFormat(ChatColor.translateAlternateColorCodes('&', ms));
		}else if(player.hasPermission((String) per.get("Chat.Player8"))) {
			String ms = (String) config.get("Chat.Player8");
			ms = ms.replace("ß", "&").replace("/n", "\n").replace("[Player]", player.getName()).replace("message", msg).replace("[Prefix]", (String) config.get("Prefix.Player8")).replace("[Clan]", " "); 
			event.setFormat(ChatColor.translateAlternateColorCodes('&', ms));
		}else if(player.hasPermission((String) per.get("Chat.Player9"))) {
			String ms = (String) config.get("Chat.Player9");
			ms = ms.replace("ß", "&").replace("/n", "\n").replace("[Player]", player.getName()).replace("message", msg).replace("[Prefix]", (String) config.get("Prefix.Player9")).replace("[Clan]", " "); 
			event.setFormat(ChatColor.translateAlternateColorCodes('&', ms));
		}else if(player.hasPermission((String) per.get("Chat.Color"))) {
			String ms = (String) config.get("Chat.Player10");
			ms = ms.replace("ß", "&").replace("/n", "\n").replace("[Player]", player.getName()).replace("message", msg).replace("[Prefix]", (String) config.get("Prefix.Player10")).replace("[Clan]", " "); 
            event.setFormat(ChatColor.translateAlternateColorCodes('&' , ms));
        }else {
			String ms = (String) config.get("Chat.Player11");
			ms = ms.replace("/n", "\n").replace("[Player]", player.getName()).replace("message", msg).replace("[Prefix]", (String) config.get("Prefix.Player10")).replace("[Clan]", " "); 
			event.setFormat(ms);
        }
        
	     
	        
	        if(!chatspam.contains(player.getName())) {
	        	event.setCancelled(false);
				chatspam.add(player.getName());
				
				Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
					
					@Override
					public void run() {
						chatspam.remove(player.getName());
						
					}
				}, 100);
				
			} else if(chatspam.contains(player.getName())) {
				event.setCancelled(true);
				player.sendMessage("ßcBitte unterlasse das Spammen!!");
			}
	        
	        if(uppercaseLetter / (float) msg.length() > 0.3F) {
	        	event.setCancelled(true);
	        	player.sendMessage("ßcBitte benutze weniger Groﬂbuchstaben!");
	        }
		
	}

}
