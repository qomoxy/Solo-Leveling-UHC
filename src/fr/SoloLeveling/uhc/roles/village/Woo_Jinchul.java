package fr.SoloLeveling.uhc.roles.village;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.model.Role;
import fr.SoloLeveling.uhc.roles.RoleEffect;

public class Woo_Jinchul implements RoleEffect {

    @Override
    public String getName(){ return "Woo_Jinchul";}

    @Override
    public Role getRoleEnum() {
        return null;
    }

    @Override
    public String getDescription(){ return "Woo_Jinchul Description";}

    @Override
    public void giveEffects(PlayerData playerData) {

    }

    @Override
    public void giveEffectAndItems(PlayerData playerData) {

    }
}
