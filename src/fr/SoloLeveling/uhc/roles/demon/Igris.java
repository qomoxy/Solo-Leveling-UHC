package fr.SoloLeveling.uhc.roles.demon;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.roles.RoleEffect;
import fr.SoloLeveling.uhc.utils.Potionutil;
import org.bukkit.entity.Player;

public class Igris implements RoleEffect {
    public String getName() {
        return "Igris";
    }

    public String getDescription() {
        return "Igris";
    }

    public void giveEffectAndItems(PlayerData playerData) {
        Potionutil.giveStrength((Player) playerData, 10, 1);
    }

    @Override
    public void giveEffects(PlayerData playerData) {
        Potionutil.giveStrength(playerData.getPlayer(), 10, 1);
    }
}
