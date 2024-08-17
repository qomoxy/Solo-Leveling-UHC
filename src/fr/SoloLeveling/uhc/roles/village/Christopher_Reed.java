package fr.SoloLeveling.uhc.roles.village;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.utils.ItemBuilder;
import org.bukkit.Material;
import org.jetbrains.annotations.NotNull;

public class Christopher_Reed {
    public String getName() {
        return "Christopher_Reed";
    }

    public String getDescription() {
        return "Christopher_Reed Description";
    }

    public void giveItem(@NotNull PlayerData player) {
        ItemBuilder item = new ItemBuilder(Material.NETHER_STAR);
        item.name("§6§lTransformation");
        player.getPlayer().getInventory().addItem(item.build());
    }
}
