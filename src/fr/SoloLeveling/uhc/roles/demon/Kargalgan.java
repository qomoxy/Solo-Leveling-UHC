package fr.SoloLeveling.uhc.roles.demon;

import static fr.SoloLeveling.uhc.utils.Potionutil.giveFireResistance;
import static org.bukkit.Material.ENCHANTED_BOOK;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.roles.RoleEffect;
import fr.SoloLeveling.uhc.utils.ItemBuilder;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;


public class Kargalgan implements RoleEffect {
    public String getName() {
        return "Kargalgan";
    }

    public String getDescription() {
        return "Kargalgan";
    }

    @Override
    public void giveEffectAndItems(PlayerData player) {
        giveFireResistance((Player) player, 10, 1);
        ItemBuilder book = new ItemBuilder(ENCHANTED_BOOK);
        book.itemStoreEnchantement(Enchantment.ARROW_FIRE, 1);
        player.getInventory().addItem(book.build());
    }

    @Override
    public void giveEffects(PlayerData playerData) {
        giveFireResistance(playerData.getPlayer(), 10, 1);
    }
}
