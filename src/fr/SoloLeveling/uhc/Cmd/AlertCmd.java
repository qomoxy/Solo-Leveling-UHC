package fr.SoloLeveling.uhc.Cmd;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AlertCmd implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {

        if(sender instanceof Player p){

            if(cmd.getName().equalsIgnoreCase("alert")){

                if(args.length == 0){
                    p.sendMessage("[SL] La commande est : /alert <message>");
                }

                else if(args.length == 1){

                    StringBuilder bc = new StringBuilder();

                    for(String part : args){

                        bc.append(part).append(" ");
                    }

                    Bukkit.broadcastMessage(" [" + p.getName() + "] " + bc);
                }

                return true;
            }
        }


        return false;
    }
}
