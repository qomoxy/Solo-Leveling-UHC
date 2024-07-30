package fr.SoloLeveling.uhc.Event;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Objects;

public class Evenement implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.getInventory().clear();
        Bukkit.broadcastMessage("[SL] " + player.getName() + " a rejoin la partie [number_player / max_nb_player]");

        ItemStack customCompass = new ItemStack(Material.COMPASS);
        ItemMeta customC = customCompass.getItemMeta();
        customC.setDisplayName("§aMenu");
        customC.addEnchant(Enchantment.DURABILITY, 200, true);
        customC.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        customCompass.setItemMeta(customC);

        player.getInventory().setItemInHand(customCompass);

        player.updateInventory();



    }

    @EventHandler
    public void onInteract(PlayerInteractEvent event) {

        Player player = event.getPlayer();
        Action action = event.getAction();
        ItemStack item = event.getItem();

        if(item == null) return;

        if (item.getType() == Material.COMPASS && item.getItemMeta().hasDisplayName() && Objects.equals(item.getItemMeta().getDisplayName(), "§aMenu")){
            if(action == Action.RIGHT_CLICK_AIR || action == Action.RIGHT_CLICK_BLOCK){
                Inventory inv = Bukkit.createInventory(null, 6, "§eMenu");

                player.openInventory(inv);
            }
        }
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        Bukkit.broadcastMessage("[SL]" + player.getName() + "a quitté la partie [number_player / max_nb_player]");
    }
}
