package de.tempoo50.sur.commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GamemodeSCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {

            Player player = (Player) sender;

            if(player.hasPermission("sur.gm0")) {

                if(args.length == 0) {

                    player.setGameMode(GameMode.SURVIVAL);

                }else if(args.length == 1) {

                    Player target = Bukkit.getPlayer(args[0]);
                    if(target != null) {

                        target.setGameMode(GameMode.SURVIVAL);

                    }

                }
            }

        }

        return false;
    }

}