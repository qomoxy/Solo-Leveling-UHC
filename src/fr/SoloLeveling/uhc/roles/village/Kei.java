package fr.SoloLeveling.uhc.roles.village;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.model.Role;
import fr.SoloLeveling.uhc.roles.RoleEffect;

public class Kei implements RoleEffect {

    @Override
    public String getName() {
        return "Kei";
    }

    @Override
    public Role getRoleEnum() {
        return Role.KEI;
    }

    @Override
    public String getDescription() {
        return "Kei Description";
    }

    @Override
    public void giveEffects(PlayerData playerData) {

    }

    @Override
    public void giveEffectAndItems(PlayerData playerData) {

    }

    //TODO: odeur effect
}
