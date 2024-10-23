package fr.SoloLeveling.uhc;

import fr.SoloLeveling.uhc.Cmd.*;
import fr.SoloLeveling.uhc.Event.Evenement;
import fr.SoloLeveling.uhc.Event.GPlayerListerner;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.model.GState;
import fr.SoloLeveling.uhc.task.RoleEffect;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.Map;

public class Main extends JavaPlugin {

    private final Map<Player, PlayerData> playerDataMap = new HashMap<>();

    @Override
    public void onEnable() {

        System.out.println("Le Plugin Solo Leveling UHC est Active.");

        PluginManager pm = getServer().getPluginManager();

        pm.registerEvents(new GPlayerListerner(this), this);
        pm.registerEvents(new Evenement(), this);

        getCommand("sl").setExecutor(new SlCmd());
        getCommand("say").setExecutor(new SayCmd());
        getCommand("mb").setExecutor(new MbCmd());
        getCommand("start").setExecutor(new StartCmd());
        getCommand("test").setExecutor(new TestCmd());
        getCommand("role").setExecutor(new role());

        Bukkit.getScheduler().runTaskTimer(this, new RoleEffect(playerDataMap), 0L, 200L);

    }

    public Map<Player, PlayerData> getPlayerDataMap() {
        return playerDataMap;
    }
}


