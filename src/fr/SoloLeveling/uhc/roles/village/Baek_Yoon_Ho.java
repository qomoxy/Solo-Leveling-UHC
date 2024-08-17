package fr.SoloLeveling.uhc.roles.village;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.utils.ItemBuilder;

import org.bukkit.Material;

public class Baek_Yoon_Ho {

    public String getname() {
        return "Baek_Yoon_Ho";
    }

    public String getDescription() {
        return "Baek_Yoon_Ho Description";
    }

    public void giveItem(PlayerData player) {
        ItemBuilder trans = new ItemBuilder(Material.NETHER_STAR);
        trans.name("§6§lBaek_Yoon_Ho");
        trans.lore("§7Clique droit pour vous transformer en bete");
        player.getPlayer().getInventory().addItem(trans.build());
        //TODO: Add transformation code
    }
}
