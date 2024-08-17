package fr.SoloLeveling.uhc.roles.demon;

import fr.SoloLeveling.uhc.Player.PlayerData;

import static fr.SoloLeveling.uhc.utils.Potionutil.giveResistance;
import static fr.SoloLeveling.uhc.utils.Potionutil.giveStrength;

public class Legia {

    public String getName(){ return "Legia";}

    public String getDescription(){ return "Legia Description";}

    public void giveEffects(PlayerData player) {
        giveResistance(player.getPlayer(), 10, 1);
        giveStrength(player.getPlayer(), 10, 1);
    }
}