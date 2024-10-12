
package fr.SoloLeveling.uhc.task;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.roles.RoleEffect;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.Map;

public class RoleEffectTask implements Runnable {

    private final Map<Player, PlayerData> playerDataMap;

    public RoleEffectTask(Map<Player, PlayerData> playerDataMap) {
        this.playerDataMap = playerDataMap;
    }

    @Override
    public void run() {
        for (Player player : playerDataMap.keySet()) {
            PlayerData playerData = playerDataMap.get(player);
            RoleEffect roleEffect = playerData.getRoleEffect();
            if (roleEffect != null) {
                roleEffect.giveEffects(playerData);
            }
        }
    }
}