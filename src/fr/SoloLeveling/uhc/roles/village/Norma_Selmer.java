package fr.SoloLeveling.uhc.roles.village;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.model.Role;
import fr.SoloLeveling.uhc.roles.RoleEffect;

public class Norma_Selmer implements RoleEffect {

    @Override
    public String getName() {
        return "Norma_Selmer";
    }

    @Override
    public Role getRoleEnum() {
        return Role.NORMA_SELMER;
    }

    @Override
    public String getDescription() {
        return "Norma_Selmer Description";
    }

    @Override
    public void giveEffects(PlayerData playerData) {

    }

    @Override
    public void giveEffectAndItems(PlayerData playerData) {

    }

    //TODO: Add temporary boost code
}
