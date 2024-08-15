package fr.SoloLeveling.uhc.Player;

import fr.SoloLeveling.uhc.utils.CustomItem;
import org.bukkit.entity.Player;

public class PlayerData {

    private String role;

    private boolean alive;
    private boolean canUsePower;
    private boolean connected;

    private int nbKill;

    private int nbdiamond;

    private Player player;

    public PlayerData(Player player) {
        this.player = player;
        this.role = "";
        this.alive = true;
        this.canUsePower = false;
        this.connected = true;
        this.nbKill = 0;
        this.nbdiamond = 0;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setCanUsePower(boolean canUsePower) {
        this.canUsePower = canUsePower;
    }

    public boolean canUsePower() {
        return canUsePower;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }

    public boolean isConnected() {
        return connected;
    }

    public void setNbKill(int nbKill) {
        this.nbKill = nbKill;
    }

    public int getNbKill() {
        return nbKill;
    }

    public void setNbdiamond(int nbdiamond) {
        this.nbdiamond = nbdiamond;
    }

    public int getNbdiamond() {
        return nbdiamond;
    }

    public void addKill() {
        nbKill++;
    }

    public void addDiamond() {
        nbdiamond++;
    }

    public void removeDiamond() {
        nbdiamond--;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void addItem(CustomItem.ItemBuilder item){
        player.getInventory().addItem(item);
    }

    public void reset() {
        this.role = "";
        this.alive = true;
        this.canUsePower = false;
        this.connected = true;
        this.nbKill = 0;
        this.nbdiamond = 0;
    }
}
