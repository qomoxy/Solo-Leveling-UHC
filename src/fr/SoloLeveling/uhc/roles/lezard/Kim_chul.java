package fr.SoloLeveling.uhc.roles.lezard;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.roles.RoleEffect;
import fr.SoloLeveling.uhc.utils.Potionutil;
import org.bukkit.entity.Player;

public class Kim_chul implements RoleEffect {

    public String getName() { return "Kim Chul"; }

    public String getDescription() { return "Kim chul description";}

    @Override
    public void giveEffects(PlayerData playerData) {
        Potionutil.giveResistance((Player) playerData, 10, 1);
    }

    @Override
    public void giveEffectAndItems(PlayerData playerData) {
        Potionutil.giveResistance((Player) playerData, 10, 1);

    }
}
