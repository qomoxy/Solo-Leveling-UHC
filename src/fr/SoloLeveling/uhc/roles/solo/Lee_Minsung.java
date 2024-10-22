package fr.SoloLeveling.uhc.roles.solo;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.model.Role;
import fr.SoloLeveling.uhc.roles.RoleEffect;

public class Lee_Minsung  implements RoleEffect {

    @Override
    public String getName() {return "Lee Minsung";}

    @Override
    public Role getRoleEnum() {
        return null;
    }

    @Override
    public String getDescription() { return "Lee Minsung Description";}

    @Override
    public void giveEffects(PlayerData playerData) {

    }

    @Override
    public void giveEffectAndItems(PlayerData playerData) {

    }
}
