package fr.SoloLeveling.uhc.roles.village;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.roles.RoleEffect;
import fr.SoloLeveling.uhc.utils.Potionutil;
import org.jetbrains.annotations.NotNull;

public class Ma_Dongwook implements RoleEffect {
    public String getName() {
        return "Ma_Dongwook";
    }

    public String getDescription() {
        return "Ma_Dongwook Description";
    }

    @Override
    public void giveEffects(@NotNull PlayerData playerData) {
        Potionutil.giveResistance(playerData.getPlayer(), 10, 1);
    }

    @Override
    public void giveEffectAndItems(PlayerData playerData) {

    }
}
