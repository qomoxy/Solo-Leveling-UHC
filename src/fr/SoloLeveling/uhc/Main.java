package fr.SoloLeveling.uhc;

import fr.SoloLeveling.uhc.Cmd.SlCmd;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        System.out.println("LE Plugin Solo Leveling UHC est Active.");

        getCommand("sl").setExecutor(new SlCmd());

    }


    @Override
    public void onDisable() {

        System.out.println("Le plugin Solo leveling est Désactive.");

    }

}
