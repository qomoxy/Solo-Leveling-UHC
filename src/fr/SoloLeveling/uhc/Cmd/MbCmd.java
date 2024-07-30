package fr.SoloLeveling.uhc.Cmd;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MbCmd implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player player = (Player) sender;

        if (sender != null) {

            player.sendMessage("Voici le mumble de la partie: <mumble:port:lien:game>");

            return true;

        }
        return false;
    }
}