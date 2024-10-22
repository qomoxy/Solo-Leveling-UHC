package fr.SoloLeveling.uhc.roles.village;

import javax.management.ObjectName;
import java.util.List;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.model.Role;
import fr.SoloLeveling.uhc.roles.RoleEffect;
import org.jetbrains.annotations.NotNull;

import static fr.SoloLeveling.uhc.utils.Potionutil.giveSpeed;


public class Sun_IL_HWAN implements RoleEffect {

    private List<ObjectName> roles;

    public List<ObjectName> getRoles() {
        return roles;
    }

    @Override
    public String getName() {
        return "Sun IL HWAN";
    }

    @Override
    public Role getRoleEnum() {
        return null;
    }

    @Override
    public String getDescription() {
        return "Sun IL HWAN";
    }



    @Override
    public void giveEffects(PlayerData playerData) {
        giveSpeed(playerData.getPlayer(), 100, 1);
    }

    @Override
    public void giveEffectAndItems(@NotNull PlayerData player) {
        giveSpeed(player.getPlayer(), 100, 1);
    }

}
