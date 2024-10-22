package fr.SoloLeveling.uhc.roles.village;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.model.Role;
import fr.SoloLeveling.uhc.roles.RoleEffect;
import fr.SoloLeveling.uhc.utils.ItemBuilder;

import org.bukkit.Material;
import org.jetbrains.annotations.NotNull;

public class Baek_Yoon_Ho implements RoleEffect {

    @Override
    public String getName() {
        return "Baek_Yoon_Ho";
    }

    @Override
    public Role getRoleEnum() {
        return Role.BAEK_YOON_HO;
    }

    @Override
    public String getDescription() {
        return "Baek_Yoon_Ho Description";
    }

    @Override
    public void giveEffects(PlayerData playerData) {

    }

    @Override
    public void giveEffectAndItems(@NotNull PlayerData playerData) {
        ItemBuilder trans = new ItemBuilder(Material.NETHER_STAR);
        trans.name("§6§lBaek_Yoon_Ho");
        trans.lore("§7Clique droit pour vous transformer en bete");
        playerData.getPlayer().getInventory().addItem(trans.build());
        //TODO: Add transformation code
    }
}
