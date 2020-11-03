package de.tempoo50.sur.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class LeavListener implements Listener {
	
	@EventHandler
	
	public void Leav(PlayerQuitEvent event) {
		
		event.setQuitMessage("Auf Wiedersehen " + event.getPlayer().getName());
		
	}

}
