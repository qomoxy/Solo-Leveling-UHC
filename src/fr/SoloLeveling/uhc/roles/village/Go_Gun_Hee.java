package fr.SoloLeveling.uhc.roles.village;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.roles.RoleEffect;
import fr.SoloLeveling.uhc.utils.Potionutil;
import org.jetbrains.annotations.NotNull;

public class Go_Gun_Hee implements RoleEffect {

        public String getname() {
            return "Go_Gun_Hee";
        }

        public String getDescription() {
            return "Go_Gun_Hee Description";
        }

        public void giveEffect(@NotNull PlayerData player) {
            Potionutil.giveStrength(player.getPlayer(), 10, 1);
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
