package fr.SoloLeveling.uhc.roles.demon;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.model.Role;
import fr.SoloLeveling.uhc.roles.RoleEffect;
import fr.SoloLeveling.uhc.utils.Potionutil;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Igris implements RoleEffect {

    @Override
    public String getName() {
        return "Igris";
    }

    @Override
    public Role getRoleEnum() {
        return Role.IGRIS;
    }

    @Override
    public String getDescription() {
        return "Igris";
    }

    @Override
    public void giveEffectAndItems(PlayerData playerData) {
        Potionutil.giveStrength((Player) playerData, 10, 1);
    }

    @Override
    public void giveEffects(@NotNull PlayerData playerData) {
        Potionutil.giveStrength(playerData.getPlayer(), 10, 1);
    }
}
