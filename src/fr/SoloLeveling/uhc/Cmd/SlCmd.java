package fr.SoloLeveling.uhc.Cmd;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SlCmd implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (sender instanceof Player player) {

            if (args.length == 1) {

                if (args[0].equalsIgnoreCase(player.getName())) {

                    player.sendMessage("Bienvenue dans l'UHC Solo Leveling !");

                    player.setFoodLevel(5);
                }
                else{
                    player.sendMessage("[Erreur] La commande : /sl <arguments>");
                }

            }

        }
        return false;
    }
}
