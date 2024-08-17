package fr.SoloLeveling.uhc.Cmd;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.utils.ItemBuilder;
import  fr.SoloLeveling.uhc.utils.Potionutil;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;

public class TestCmd implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (sender instanceof Player p) {

            p.sendMessage("Test");

            if (args.length == 1 && args[0].equalsIgnoreCase("item")) {
                ItemBuilder item = new ItemBuilder(Material.DIAMOND_SWORD);
                item.enchantment(Enchantment.DAMAGE_ALL, 1);
                item.name("Epée de test");
                item.amount(1);
                p.getInventory().addItem(item.build());
                ItemBuilder item2 = new ItemBuilder(Material.ENCHANTED_BOOK);
                item2.enchantment(Enchantment.ARROW_FIRE, 1);
                item2.amount(1);
                p.getInventory().addItem(item2.build());
                p.sendMessage("Item created");
            }
            else if (args.length == 1 && args[0].equalsIgnoreCase("potion")) {
                Potionutil.giveFireResistance(p, 10, 1);
                p.sendMessage("Potion given");
            }
            return true;

        }
        return false;
    }
}
