
package fr.SoloLeveling.uhc.task;

import fr.SoloLeveling.uhc.Player.PlayerData;
import org.bukkit.entity.Player;

import java.util.Map;

public class RoleEffect implements Runnable {

    private final Map<Player, PlayerData> playerDataMap;

    public RoleEffect(Map<Player, PlayerData> playerDataMap) {
        this.playerDataMap = playerDataMap;
    }

    @Override
    public void run() {
        for (Player player : playerDataMap.keySet()) {
            PlayerData playerData = playerDataMap.get(player);
            fr.SoloLeveling.uhc.roles.RoleEffect roleEffect = playerData.getRoleEffect();
            if (roleEffect != null) {
                roleEffect.giveEffects(playerData);
            }
        }
    }
}