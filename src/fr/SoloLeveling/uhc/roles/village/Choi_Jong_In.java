package fr.SoloLeveling.uhc.roles.village;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.utils.Potionutil;

public class Choi_Jong_In {

        public String getName() {
            return "Choi_Jong_In";
        }

        public String getDescription() {
            return "Choi_Jong_In Description";
        }

        public void giveEffect(PlayerData player) {
            Potionutil.giveFireResistance(player.getPlayer(), 10, 1);
        }
}
