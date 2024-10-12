package fr.SoloLeveling.uhc.roles;

import fr.SoloLeveling.uhc.Player.PlayerData;

public interface RoleEffect {
    void giveEffects(PlayerData playerData);

    void giveEffectAndItems(PlayerData playerData);
}
