package fr.SoloLeveling.uhc.roles.demon;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.roles.RoleEffect;

public class Baran implements RoleEffect {

        public String getName(){ return "Baran";}

        public String getDescription(){ return "Baran Description";}

        @Override
        public void giveEffects(PlayerData playerData) {

        }

        @Override
        public void giveEffectAndItems(PlayerData playerData) {
                 //TODO: Epee de Baran plus le fait qui fly

        }
}
