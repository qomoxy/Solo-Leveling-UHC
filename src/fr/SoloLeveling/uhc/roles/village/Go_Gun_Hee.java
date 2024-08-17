package fr.SoloLeveling.uhc.roles.village;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.utils.Potionutil;

public class Go_Gun_Hee {

        public String getname() {
            return "Go_Gun_Hee";
        }

        public String getDescription() {
            return "Go_Gun_Hee Description";
        }

        public void giveEffect(PlayerData player) {
            Potionutil.giveStrength(player.getPlayer(), 10, 1);
        }
}
