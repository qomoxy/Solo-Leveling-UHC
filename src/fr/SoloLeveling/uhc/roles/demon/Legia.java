package fr.SoloLeveling.uhc.roles.demon;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.roles.RoleEffect;
import org.jetbrains.annotations.NotNull;

import static fr.SoloLeveling.uhc.utils.Potionutil.giveResistance;
import static fr.SoloLeveling.uhc.utils.Potionutil.giveStrength;

public class Legia  implements RoleEffect {

    public String getName(){ return "Legia";}

    public String getDescription(){ return "Legia Description";}

    @Override
    public void giveEffects(@NotNull PlayerData player) {
        giveResistance(player.getPlayer(), 10, 1);
        giveStrength(player.getPlayer(), 10, 1);
    }

    @Override
    public void giveEffectAndItems(PlayerData playerData) {
        giveResistance(player.getPlayer(), 10, 1);
        giveStrength(player.getPlayer(), 10, 1);
    }
}