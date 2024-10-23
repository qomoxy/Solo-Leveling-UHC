package fr.SoloLeveling.uhc.task;

import fr.SoloLeveling.uhc.Main;
import fr.SoloLeveling.uhc.model.GState;
import fr.SoloLeveling.uhc.model.GameData;
import fr.SoloLeveling.uhc.model.Timestatu;
import org.bukkit.World;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.Bukkit;

public class TimerTask  extends BukkitRunnable {

    private final static int day_duration = 1200;
    private final static int PVP = 2400;

    private static final int start_of_day = 0;

    private static final int start_of_night = 600;

    private static Timestatu timestatu;

    private static boolean pvp;

    private int time = 0;
    private int minute = 0;
    private int hour = 0;


    @Override
    public void run() {
        if (GameData.getGStatu().equals(GState.STARTING)) {
            SetWorldTime();
        }
        time++;

        if (time == 60) {
            time = 0;
            minute++;
            Bukkit.broadcastMessage("[SL] Il est actuellement " + hour + "h" + minute + "m");
        }

        if (minute == 60) {
            minute = 0;
            hour++;
        }

        int role_time = 20;
        if (role_time == time) {
            Bukkit.broadcastMessage("[SL] Les rôles vont être distribués");
        }

    }

    private void SetWorldTime() {
        World w = Bukkit.getWorld("world");
        w.setTime(0);
        w.setPVP(false);
        w.setGameRuleValue("doDaylightCycle", "false");
        
    }
}
