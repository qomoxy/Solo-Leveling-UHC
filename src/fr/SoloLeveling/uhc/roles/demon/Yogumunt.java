package fr.SoloLeveling.uhc.roles.demon;

import fr.SoloLeveling.uhc.utils.ItemBuilder;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Yogumunt {
    public String getName() {
        return "Yogumunt";
    }

    public String getDescription() {
        return "Yogumunt";
    }

    public void giveEffectAndItems(@NotNull Player player) {
        ItemBuilder itemTP = new ItemBuilder(Material.FEATHER);
        itemTP.name("§6§lTP");
        itemTP.lore("§7Clic droit pour vous téléporter");
        itemTP.amount(1);
        player.getInventory().addItem(itemTP.build());


    }
}
