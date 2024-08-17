package fr.SoloLeveling.uhc.roles.village;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.utils.Potionutil;

public class Ma_Dongwook {
    public String getName() {
        return "Ma_Dongwook";
    }

    public String getDescription() {
        return "Ma_Dongwook Description";
    }

    public void giveEffect(PlayerData player) {
        Potionutil.giveResistance(player.getPlayer(), 10, 1);
    }
}
