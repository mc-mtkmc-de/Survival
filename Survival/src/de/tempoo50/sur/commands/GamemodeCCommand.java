package de.tempoo50.sur.commands;

import java.io.File;
import java.io.IOException;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GamemodeCCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {

            Player player = (Player) sender;

            if(player.hasPermission("sur.gm1")) {
                if(args.length == 0) {

                    player.setGameMode(GameMode.CREATIVE);

                }
            }

        }

        return false;
    }

}
