package fr.SoloLeveling.uhc.roles.demon;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.roles.RoleEffect;

public class Rakan implements RoleEffect {

    public String getName(){ return "Rakan";}

    public String getDescription(){ return "Rakan Description";}

    @Override
    public void giveEffects(PlayerData playerData) {

    }

    @Override
    public void giveEffectAndItems(PlayerData playerData) {

    }

    //TODO: Faire des items ou une commandes qui donne a un de ses allies un bonus temporaire.
}
