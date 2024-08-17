package fr.SoloLeveling.uhc.roles.demon;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.utils.Potionutil;

public class Antares {

    public String getName(){ return "Antares";}

    public String getDescription(){ return "Antares Description";}

    public void giveEffect(PlayerData player) {
        Potionutil.giveFireResistance(player.getPlayer(), 10, 1);
    }
}
