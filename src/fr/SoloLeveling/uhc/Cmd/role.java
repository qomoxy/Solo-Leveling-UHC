package fr.SoloLeveling.uhc.Cmd;

import fr.SoloLeveling.uhc.Player.PlayerData;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class role implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player p) {

            PlayerData playerData = new PlayerData(p);

            if (playerData.getRole() == null) {
                playerData.setRole(s);
            } else {
                p.sendMessage(String.valueOf(playerData.getRole()));
            }

            return true;
        }
        return false;
    }
}
