package fr.SoloLeveling.uhc.roles.lezard;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.model.Role;
import fr.SoloLeveling.uhc.roles.RoleEffect;

public class Hwang_Dongsuk implements RoleEffect {

    @Override
    public String getName() { return "Hwang Dongsuk"; }

    @Override
    public Role getRoleEnum() {
        return Role.HWANG_DONGSUK;
    }

    @Override
    public String getDescription() { return "Discription";}

    @Override
    public void giveEffects(PlayerData playerData) {

    }

    @Override
    public void giveEffectAndItems(PlayerData playerData) {

    }
}
