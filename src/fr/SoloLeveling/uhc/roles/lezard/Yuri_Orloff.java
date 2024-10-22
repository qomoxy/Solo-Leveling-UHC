package fr.SoloLeveling.uhc.roles.lezard;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.model.Role;
import fr.SoloLeveling.uhc.roles.RoleEffect;

public class Yuri_Orloff implements RoleEffect {

    @Override
    public String getName() { return "Yuri_Orloff"; }

    @Override
    public Role getRoleEnum() {
        return Role.YURI_ORLOFF;
    }

    @Override
    public String getDescription() { return "Yuri Orloff"; }

    //TODO: Gere sa bariere magique (donne resistance)
    @Override
    public void giveEffects(PlayerData playerData) {

    }

    @Override
    public void giveEffectAndItems(PlayerData playerData) {

    }
}
