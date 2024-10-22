package fr.SoloLeveling.uhc.roles.village;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.model.Role;
import fr.SoloLeveling.uhc.roles.RoleEffect;
import fr.SoloLeveling.uhc.utils.Potionutil;

import org.jetbrains.annotations.NotNull;

public class Cha_Hae_In implements RoleEffect {

    @Override
    public String getName() {
        return "Cha_Hae_In";
    }

    @Override
    public Role getRoleEnum() {
        return null;
    }

    @Override
    public String getDescription() {
        return "Cha_Hae_In Description";
    }

    @Override
    public void giveEffects(@NotNull PlayerData playerData) {
        Potionutil.giveSpeed(playerData.getPlayer(), 10, 1);
    }

    @Override
    public void giveEffectAndItems(PlayerData playerData) {

    }
}
