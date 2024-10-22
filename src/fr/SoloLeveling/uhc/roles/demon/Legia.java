package fr.SoloLeveling.uhc.roles.demon;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.model.Role;
import fr.SoloLeveling.uhc.roles.RoleEffect;

import org.jetbrains.annotations.NotNull;

import static fr.SoloLeveling.uhc.utils.Potionutil.giveResistance;
import static fr.SoloLeveling.uhc.utils.Potionutil.giveStrength;

public class Legia  implements RoleEffect {

    @Override
    public String getName(){ return "Legia";}

    @Override
    public Role getRoleEnum() {
        return Role.LEGIA;
    }

    @Override
    public String getDescription(){ return "Legia Description";}

    @Override
    public void giveEffects(@NotNull PlayerData player) {
        giveResistance(player.getPlayer(), 10, 1);
        giveStrength(player.getPlayer(), 10, 1);
    }

    @Override
    public void giveEffectAndItems(@NotNull PlayerData playerData) {
        giveResistance(playerData.getPlayer(), 10, 1);
        giveStrength(playerData.getPlayer(), 10, 1);
    }
}