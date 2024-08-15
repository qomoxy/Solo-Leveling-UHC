package fr.SoloLeveling.uhc.roles.village;

import javax.management.ObjectName;
import java.util.List;

import fr.SoloLeveling.uhc.Player.PlayerData;

import static fr.SoloLeveling.uhc.utils.Potionutil.giveSpeed;


public class Sun_IL_HWAN {

    private List<ObjectName> roles;

    public String getName() {
        return "Sun IL HWAN";
    }

    public String getDescription() {
        return "Sun IL HWAN";
    }

    public List<ObjectName> getRoles() {
        return roles;
    }

    public void giveEffectAndItems(PlayerData player) {
        giveSpeed(player, 100, 1);
    }

    public void giveEffect(PlayerData player) {
        giveSpeed(player, 100, 1);
    }

}
