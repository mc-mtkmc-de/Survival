package de.tempoo50.sur.commands;

import java.io.File;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.tempoo50.sur.data.ErschaffeStartKit;
import de.tempoo50.sur.utils.MessagesUtil;

public class StarterKitsCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {
            Player player = (Player) sender;

            File perm = new File("plugins//ServerSystem//Permission.yml");
            YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

            if(player.hasPermission((String) per.get("Start.Player"))) {
                if(args.length == 0) {
                    if(ErschaffeStartKit.blockKit(player)) {

                        Inventory inv = player.getPlayer().getServer().createInventory(null, 9*3, "§e§lStarterKits");

                        ItemStack kit1 = new ItemStack(Material.IRON_PICKAXE);
                        ItemMeta metaKit1 = kit1.getItemMeta();
                        metaKit1.setDisplayName("§f§lFarm");
                        kit1.setItemMeta(metaKit1);

                        ItemStack kit2 = new ItemStack(Material.IRON_SWORD);
                        ItemMeta metaKit2 = kit2.getItemMeta();
                        metaKit2.setDisplayName("§f§lKampf");
                        kit2.setItemMeta(metaKit2);

                        ItemStack kit3 = new ItemStack(Material.STONE);
                        ItemMeta metaKit3 = kit3.getItemMeta();
                        metaKit3.setDisplayName("§f§lBau");
                        kit3.setItemMeta(metaKit3);

                        inv.setItem(1, kit1);
                        inv.setItem(4, kit2);
                        inv.setItem(7, kit3);

                        player.getPlayer().openInventory(inv);

                    } else
                        player.sendMessage(MessagesUtil.PREFIX + "§cDu hast dein StarterKit schon erhalten!");


                }
            }else
                player.sendMessage(MessagesUtil.NOPERM);
        }

        return false;
    }

}
