package fr.SoloLeveling.uhc.roles.demon;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.model.Role;
import fr.SoloLeveling.uhc.roles.RoleEffect;

public class Querehsha implements RoleEffect {

    @Override
    public String getName(){ return "Querehsha";}

    @Override
    public Role getRoleEnum() {
        return Role.QUERESHSA;
    }

    @Override
    public String getDescription(){ return "Querehsha Description";}

    @Override
    public void giveEffects(PlayerData playerData) {

    }

    @Override
    public void giveEffectAndItems(PlayerData playerData) {

    }

    //TODO: voir se qu'on fait pour le monarch des insecte et poissons
}
