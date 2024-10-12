package fr.SoloLeveling.uhc.roles.demon;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.roles.RoleEffect;
import fr.SoloLeveling.uhc.utils.Potionutil;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Antares implements RoleEffect {
    @Override
    public void giveEffects(@NotNull PlayerData player) {
        Potionutil.giveFireResistance(player.getPlayer(), 10, 1);
    }

    @Override
    public void giveEffectAndItems(PlayerData playerData) {
        Potionutil.giveFireResistance((Player) playerData, 10, 1);
    }

    public String getName(){ return "Antares";}

    public String getDescription(){ return "Antares Description";}


}
