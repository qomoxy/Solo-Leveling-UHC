package fr.SoloLeveling.uhc.roles.demon;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.roles.RoleEffect;
import fr.SoloLeveling.uhc.utils.ItemBuilder;

import org.bukkit.Material;
import org.jetbrains.annotations.NotNull;


public class Tarnak implements RoleEffect {

    public String getName(){ return "Tarnak";}

    public String getDescription(){ return "Tarnak Description";}

    @Override
    public void giveEffects(PlayerData playerData) {

    }

    @Override
    public void giveEffectAndItems(@NotNull PlayerData playerData) {
        ItemBuilder Spiritual = new ItemBuilder(Material.BLAZE_ROD);
        Spiritual.name("§6Spiritual bodies");
        Spiritual.lore("§7Transforms the player into a spiritual body for 10 seconds");
        playerData.getInventory().addItem(Spiritual.build());
    }
}
