package fr.SoloLeveling.uhc.roles.village;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.model.Role;
import fr.SoloLeveling.uhc.roles.RoleEffect;

public class Yoo_Jinho implements RoleEffect {

    // TODO: Il peut revive si un gentil le tue

    @Override
    public String getName(){ return "Yoo_Jinho";}

    @Override
    public Role getRoleEnum() {
        return Role.YOO_JINHO;
    }

    @Override
    public String getDescription(){ return "Yoo_Jinho Description";}

    @Override
    public void giveEffects(PlayerData playerData) {

    }

    @Override
    public void giveEffectAndItems(PlayerData playerData) {

    }
}
