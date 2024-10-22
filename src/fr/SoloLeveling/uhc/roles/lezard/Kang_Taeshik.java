package fr.SoloLeveling.uhc.roles.lezard;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.model.Role;
import fr.SoloLeveling.uhc.roles.RoleEffect;

public class Kang_Taeshik  implements RoleEffect {

    @Override
    public String getName() {
        return "Kang_Taeshik";
    }

    @Override
    public Role getRoleEnum() {
        return Role.KANG_TAESHIK;
    }

    @Override
    public String getDescription() { return "Kang_Taeshik Description"; }

    @Override
    public void giveEffects(PlayerData playerData) {
        //TODO: Implement la speed quand il est invisible (ex petite fille) et affligent saigenement quand il tape de l'invisiblement.
    }

    @Override
    public void giveEffectAndItems(PlayerData playerData) {

    }
}
