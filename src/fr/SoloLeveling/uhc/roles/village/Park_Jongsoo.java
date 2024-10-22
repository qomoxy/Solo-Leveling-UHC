package fr.SoloLeveling.uhc.roles.village;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.model.Role;
import fr.SoloLeveling.uhc.roles.RoleEffect;

public class Park_Jongsoo implements RoleEffect {

        @Override
        public String getName(){ return "Park_Jongsoo";}

        @Override
        public Role getRoleEnum() {
                return Role.PARK_JONGSOO;
        }

        @Override
        public String getDescription(){ return "Park_Jongsoo Description";}

        @Override
        public void giveEffects(PlayerData playerData) {

        }

        @Override
        public void giveEffectAndItems(PlayerData playerData) {

        }
}
