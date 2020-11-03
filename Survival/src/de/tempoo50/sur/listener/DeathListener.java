package de.tempoo50.sur.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathListener implements Listener {

    @EventHandler
    public void Death(PlayerDeathEvent event) {

        event.setDeathMessage("Juhu wieder einer weniger! " + event.getEntity().getName() + " Ist gerade gestorben!");

    }

}