package fr.SoloLeveling.uhc.roles.village;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.model.Role;
import fr.SoloLeveling.uhc.roles.RoleEffect;
import fr.SoloLeveling.uhc.utils.Potionutil;

import org.jetbrains.annotations.NotNull;

public class Go_Gun_Hee implements RoleEffect {

    @Override
    public String getName() {
            return "Go_Gun_Hee";
        }

    @Override
    public Role getRoleEnum() {
        return Role.GO_GUN_HEE;
    }

    @Override
    public String getDescription() {
            return "Go_Gun_Hee Description";
        }

    @Override
    public void giveEffects(@NotNull PlayerData playerData) {
        Potionutil.giveStrength(playerData.getPlayer(), 10, 1);
    }

    @Override
    public void giveEffectAndItems(@NotNull PlayerData playerData) {
        Potionutil.giveStrength(playerData.getPlayer(), 10, 1);
    }
}
