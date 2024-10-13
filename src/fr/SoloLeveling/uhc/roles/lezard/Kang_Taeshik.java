package fr.SoloLeveling.uhc.roles.lezard;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.roles.RoleEffect;

public class Kang_Taeshik  implements RoleEffect {

    public String getName() {
        return "Kang_Taeshik";
    }

    public String getDescription() { return "Kang_Taeshik Description"; }

    @Override
    public void giveEffects(PlayerData playerData) {
        //TODO: Implement la speed quand il est invisible (ex petite fille) et affligent saigenement quand il tape de l'invisiblement.
    }

    @Override
    public void giveEffectAndItems(PlayerData playerData) {

    }
}
