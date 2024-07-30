package fr.SoloLeveling.uhc;

import fr.SoloLeveling.uhc.Cmd.MbCmd;
import fr.SoloLeveling.uhc.Cmd.SayCmd;
import fr.SoloLeveling.uhc.Cmd.SlCmd;
import fr.SoloLeveling.uhc.Event.Evenement;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        System.out.println("Le Plugin Solo Leveling UHC est Active.");

        getCommand("sl").setExecutor(new SlCmd());
        getCommand("say").setExecutor(new SayCmd());
        getCommand("mb").setExecutor(new MbCmd());

        Bukkit.getPluginManager().registerEvents(new Evenement(), this);


    }


    @Override
    public void onDisable() {

        System.out.println("Le plugin Solo leveling est Désactive.");

    }

}
