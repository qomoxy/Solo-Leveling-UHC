package fr.SoloLeveling.uhc.roles.village;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.model.Role;
import fr.SoloLeveling.uhc.roles.RoleEffect;

public class Song_Chi_Yul implements RoleEffect {

        @Override
        public String getName(){ return "Song_Chi_Yul";}

        @Override
        public Role getRoleEnum() {
                return Role.SONG_CHI_YUL;
        }

        @Override
        public String getDescription(){ return "Song_Chi_Yul Description";}

        @Override
        public void giveEffects(PlayerData playerData) {

        }

        @Override
        public void giveEffectAndItems(PlayerData playerData) {

        }

        //TODO : Immunisée à tout les effet nefaste
}
