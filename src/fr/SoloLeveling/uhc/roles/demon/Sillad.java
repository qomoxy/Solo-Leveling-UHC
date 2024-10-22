package fr.SoloLeveling.uhc.roles.demon;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.model.Role;
import fr.SoloLeveling.uhc.roles.RoleEffect;

public class Sillad implements RoleEffect {

    public String getName(){ return "Sillad";}

    @Override
    public Role getRoleEnum() {
        return Role.SILLAD;
    }

    @Override
    public String getDescription(){ return "Sillad Description";}

    @Override
    public void giveEffects(PlayerData playerData) {

    }

    @Override
    public void giveEffectAndItems(PlayerData playerData) {

    }

    //TODO: Zone de freeze
}
