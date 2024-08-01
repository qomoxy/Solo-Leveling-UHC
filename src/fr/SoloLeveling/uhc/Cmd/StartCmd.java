package fr.SoloLeveling.uhc.Cmd;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StartCmd implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        if(sender instanceof Player) {
            sender.sendMessage("Vous devez être un joueur pour executer cette commande.");
            return true;
        }
        return false;
    }
}
