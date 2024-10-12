package fr.SoloLeveling.uhc.roles.village;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.roles.RoleEffect;

public class Kei implements RoleEffect {
    public String getName() {
        return "Kei";
    }

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
