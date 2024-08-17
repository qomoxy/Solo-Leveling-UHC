package fr.SoloLeveling.uhc.roles.demon;

import static fr.SoloLeveling.uhc.utils.Potionutil.giveFireResistance;
import static org.bukkit.Material.ENCHANTED_BOOK;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.utils.ItemBuilder;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;


public class Kargalgan {
    public String getName() {
        return "Kargalgan";
    }

    public String getDescription() {
        return "Kargalgan";
    }

    public void giveEffectAndItems(Player player) {
        giveFireResistance(player, 10, 1);
        ItemBuilder book = new ItemBuilder(ENCHANTED_BOOK);
        book.itemStoreEnchantement(Enchantment.ARROW_FIRE, 1);
        player.getInventory().addItem(book.build());
    }

    public void giveEffect(PlayerData player) {
        giveFireResistance(player.getPlayer(), 10, 1);
    }
}
