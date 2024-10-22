package fr.SoloLeveling.uhc.Player;

import fr.SoloLeveling.uhc.model.Role;
import fr.SoloLeveling.uhc.roles.RoleEffect;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.Map;

public class PlayerData {

    private Role role;

    private static final Map<Role, RoleEffect> roleEffects = new HashMap<>();

    private boolean alive;
    private boolean canUsePower;

    private boolean scoreboard;

    private int nbKill;

    private int nbdiamond;

    private Player player;

    public PlayerData(Player player) {
        this.player = player;
        Role role = null;
        this.alive = true;
        this.canUsePower = false;
        this.nbKill = 0;
        this.nbdiamond = 0;
    }

    public void setRole(String role) {
        this.role = Role.valueOf(role);
        applyRoleEffects();
    }

    public String getRole() {
        return role.name();
    }

    public void applyRoleEffects() {
        RoleEffect roleEffect = roleEffects.get(role);
        if (roleEffect != null) {
            roleEffect.giveEffects(this);
        }
    }
    public RoleEffect getRoleEffect() {
        return roleEffects.get(role);
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

    public void addItem(ItemStack item){
        player.getInventory().addItem(item);
    }

    public void reset() {
        this.role = null;
        this.alive = true;
        this.canUsePower = false;
        this.nbKill = 0;
        this.nbdiamond = 0;
    }

    public PlayerData getInventory() {
        return this;
    }
}
