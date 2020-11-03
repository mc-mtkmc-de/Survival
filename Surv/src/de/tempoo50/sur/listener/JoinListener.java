package de.tempoo50.sur.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import de.tempoo50.sur.utils.TablistUtil;

public class JoinListener implements Listener {
	
	@EventHandler
	public void Join(PlayerJoinEvent event) {
		
		TablistUtil.setPrefix(event.getPlayer());
		
		event.setJoinMessage("Willkommen auf unserem kleinen Survival Server " + event.getPlayer().getName());
		
	}

}
