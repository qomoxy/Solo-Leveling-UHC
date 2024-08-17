package fr.SoloLeveling.uhc.roles.village;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.utils.Potionutil;

public class Cha_Hae_In {

    public String getname() {
        return "Cha_Hae_In";
    }

    public String getDescription() {
        return "Cha_Hae_In Description";
    }

    public void giveEffect(PlayerData player) {
        Potionutil.giveSpeed(player.getPlayer(), 10, 1);
    }
}
