package fr.SoloLeveling.uhc.Cmd;

import fr.SoloLeveling.uhc.task.TimerTask;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StartCmd implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        if(sender instanceof Player) {

            TimerTask timerTask = new TimerTask();
            timerTask.runTaskTimer(null,0,20);

            return true;
        }
        return false;
    }
}
