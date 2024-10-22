package fr.SoloLeveling.uhc.roles.demon;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.model.Role;
import fr.SoloLeveling.uhc.roles.RoleEffect;

public class Baran implements RoleEffect {

        @Override
        public String getName(){ return "Baran";}

        @Override
        public Role getRoleEnum() {
                return Role.BARAN;
        }

        @Override
        public String getDescription(){ return "Baran Description";}

        @Override
        public void giveEffects(PlayerData playerData) {

        }

        @Override
        public void giveEffectAndItems(PlayerData playerData) {
                 //TODO: Epee de Baran plus le fait qui fly

        }
}
