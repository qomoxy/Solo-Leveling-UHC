package fr.SoloLeveling.uhc.task;

import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.Bukkit;

public class TimerTask  extends BukkitRunnable {

    private int time = 0;
    private int minute = 0;
    private int hour = 0;


    @Override
    public void run() {
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
}
