package fr.SoloLeveling.uhc.roles.demon;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.roles.RoleEffect;
import fr.SoloLeveling.uhc.utils.ItemBuilder;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Yogumunt implements RoleEffect {

    public String getName() {
        return "Yogumunt";
    }

    public String getDescription() {
        return "Yogumunt";
    }


    @Override
    public void giveEffects(PlayerData playerData) {

    }

    @Override
    public void giveEffectAndItems(@NotNull PlayerData playerData) {
        ItemBuilder itemTP = new ItemBuilder(Material.FEATHER);
        itemTP.name("§6§lTP");
        itemTP.lore("§7Clic droit pour vous téléporter");
        itemTP.amount(1);
        playerData.getInventory().addItem(itemTP.build());
    }
}
