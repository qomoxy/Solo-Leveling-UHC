package fr.SoloLeveling.uhc.roles.demon;

import fr.SoloLeveling.uhc.utils.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class Tarnak {

    public String getName(){ return "Tarnak";}

    public String getDescription(){ return "Tarnak Description";}

    public void giveitem(Player player) {
        ItemBuilder Spiritual = new ItemBuilder(Material.BLAZE_ROD);
        Spiritual.name("§6Spiritual bodies");
        Spiritual.lore("§7Transforms the player into a spiritual body for 10 seconds");
        player.getInventory().addItem(Spiritual.build());
    }
}
