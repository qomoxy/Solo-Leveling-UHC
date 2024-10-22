package fr.SoloLeveling.uhc.roles.village;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.model.Role;
import fr.SoloLeveling.uhc.roles.RoleEffect;
import fr.SoloLeveling.uhc.utils.Potionutil;

import org.jetbrains.annotations.NotNull;

public class Ma_Dongwook implements RoleEffect {

    @Override
    public String getName() {
        return "Ma_Dongwook";
    }

    @Override
    public Role getRoleEnum() {
        return Role.MA_DONGWOOK;
    }

    @Override
    public String getDescription() {
        return "Ma_Dongwook Description";
    }

    @Override
    public void giveEffects(@NotNull PlayerData playerData) {
        Potionutil.giveResistance(playerData.getPlayer(), 10, 1);
    }

    @Override
    public void giveEffectAndItems(@NotNull PlayerData playerData) {
        Potionutil.giveResistance(playerData.getPlayer(), 10, 1);
    }
}
