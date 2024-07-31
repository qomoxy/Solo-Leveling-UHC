package fr.SoloLeveling.uhc.Cmd;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.Collections;


public class SlCmd implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {

        if (sender instanceof Player player) {

            if (args.length == 1) {

                if (args[0].equalsIgnoreCase(player.getName())) {

                    player.sendMessage("Bienvenue dans l'UHC Solo Leveling !");

                } else if (args[0].equalsIgnoreCase("me")) {

                    player.sendMessage("En dev");

                } else if (args[0].equalsIgnoreCase("color")){

                    Inventory inv_color = Bukkit.createInventory(null, 9, "§eMenu des couleurs");

                    for (Player p1 : Bukkit.getOnlinePlayers()) {

                        ItemStack head = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
                        SkullMeta meta = (SkullMeta) head.getItemMeta();
                        meta.setDisplayName(p1.getDisplayName());
                        meta.setOwner(p1.getName());
                        meta.setLore(Collections.singletonList("lore"));
                        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                        head.setItemMeta(meta);

                        inv_color.addItem(head);
                    }
                        player.openInventory(inv_color);

                } else{
                    player.sendMessage("[Erreur] La commande : /sl <arguments>");
                }

                return true;
            }

            else {
                player.sendMessage("[Erreur] La commande : /sl <arguments>");
            }
            return true;
        }
        return false;
    }
}
