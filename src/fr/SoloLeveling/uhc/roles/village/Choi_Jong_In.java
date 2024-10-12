package fr.SoloLeveling.uhc.roles.village;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.roles.RoleEffect;
import fr.SoloLeveling.uhc.utils.Potionutil;

import org.jetbrains.annotations.NotNull;

public class Choi_Jong_In implements RoleEffect {

        public String getName() {
            return "Choi_Jong_In";
        }

        public String getDescription() {
            return "Choi_Jong_In Description";
        }

    @Override
    public void giveEffects(@NotNull PlayerData playerData) {
        Potionutil.giveFireResistance(playerData.getPlayer(), 10, 1);
    }

    @Override
    public void giveEffectAndItems(PlayerData playerData) {

    }
}
