package fr.SoloLeveling.uhc.roles.demon;

import static fr.SoloLeveling.uhc.utils.Potionutil.giveFireResistance;
import static org.bukkit.Material.ENCHANTED_BOOK;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.model.Role;
import fr.SoloLeveling.uhc.roles.RoleEffect;
import fr.SoloLeveling.uhc.utils.ItemBuilder;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;


public class Kargalgan implements RoleEffect {

    @Override
    public String getName() {
        return "Kargalgan";
    }

    @Override
    public Role getRoleEnum() {
        return Role.KARGALGAN;
    }

    @Override
    public String getDescription() {
        return "Kargalgan";
    }

    @Override
    public void giveEffectAndItems(@NotNull PlayerData player) {
        giveFireResistance((Player) player, 10, 1);
        ItemBuilder book = new ItemBuilder(ENCHANTED_BOOK);
        book.itemStoreEnchantement(Enchantment.ARROW_FIRE, 1);
        player.getInventory().addItem(book.build());
    }

    @Override
    public void giveEffects(@NotNull PlayerData playerData) {
        giveFireResistance(playerData.getPlayer(), 10, 1);
    }
}
