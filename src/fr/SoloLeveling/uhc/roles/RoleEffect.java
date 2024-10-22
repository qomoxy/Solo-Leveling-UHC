package fr.SoloLeveling.uhc.roles;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.model.Role;

public interface RoleEffect {

    Role getRoleEnum();

    String getDescription();

    String getName();

    void giveEffects(PlayerData playerData);

    void giveEffectAndItems(PlayerData playerData);

}
