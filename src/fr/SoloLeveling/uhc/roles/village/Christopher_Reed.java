package fr.SoloLeveling.uhc.roles.village;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.model.Role;
import fr.SoloLeveling.uhc.roles.RoleEffect;
import fr.SoloLeveling.uhc.utils.ItemBuilder;

import org.bukkit.Material;
import org.jetbrains.annotations.NotNull;

public class Christopher_Reed implements RoleEffect {

    @Override
    public String getName() {
        return "Christopher_Reed";
    }

    @Override
    public Role getRoleEnum() {
        return Role.CHRISTOPHER_REED;
    }

    @Override
    public String getDescription() {
        return "Christopher_Reed Description";
    }

    @Override
    public void giveEffects(PlayerData playerData) {

    }

    @Override
    public void giveEffectAndItems(@NotNull PlayerData playerData) {
        ItemBuilder item = new ItemBuilder(Material.NETHER_STAR);
        item.name("§6§lTransformation");
        playerData.getPlayer().getInventory().addItem(item.build());
    }
}
