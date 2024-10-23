package fr.SoloLeveling.uhc.model;

import fr.SoloLeveling.uhc.Player.PlayerData;
import org.bukkit.Location;

import java.util.ArrayList;
import java.util.List;

public class GameData {

    private static GState GStatu;

    private static final List<PlayerData> players = new ArrayList<>();

    private static Location lobbyLocation;

    private GameData() {
        GStatu = GState.WAITING;
    }

    public static int getNumberOfPlayersAlive() {
        int PlayerAlive = 0;
        for (PlayerData player : players) {
             if (player.isAlive()) {
                 PlayerAlive++;
             }
        }
        return PlayerAlive;
    }

    public static Location getLobbyLocation() {
        return lobbyLocation;
    }

    public static void setLobbyLocation(Location lobbyLocation) {
        GameData.lobbyLocation = lobbyLocation;
    }

    public static GState getGStatu() {
        return GStatu;
    }

    public static void setGStatu(GState gStatu) {
        GameData.GStatu = gStatu;
    }

    public static List<PlayerData> getPlayers() {
        return players;
    }

}
