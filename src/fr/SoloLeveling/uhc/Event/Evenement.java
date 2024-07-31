package fr.SoloLeveling.uhc.Event;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Evenement implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {

        Player player = event.getPlayer();
        player.getInventory().clear();
        Bukkit.broadcastMessage("[SL] " + player.getName() + " a rejoin la partie [number_player / max_nb_player]");

        player.updateInventory();


    }

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        ItemStack item = event.getItem();

        if (item == null) return;

        if (item.getType() == Material.SKULL_ITEM && !item.getItemMeta().getLore().isEmpty()) {

            Inventory inv_color = Bukkit.createInventory(null, 18, "§eMenu des couleurs");

            inv_color.addItem(getItem(Material.WOOL, "Green"), getItem(Material.WOOL, "Rouge"), getItem(Material.WOOL, "violet"), getItem(Material.WOOL, "jaune"));
        }

    }

    @EventHandler
    public void onClick(InventoryClickEvent event) {

        Inventory inv = event.getInventory();
        Player player = (Player) event.getWhoClicked();
        ItemStack current = event.getCurrentItem();

        if (current == null) return;

        if(inv.getName().equals("§eMenu des couleurs")) {

            event.setCancelled(true);
            player.closeInventory();

            switch (current.getItemMeta().getDisplayName()) {

                case "rouge":
                    player.setDisplayName("§4" + current.getItemMeta().getLore().get(0));
                    player.setPlayerListName("§4" + current.getItemMeta().getLore().get(0));
                    break;
                case "green":
                    player.setDisplayName("§2" + current.getItemMeta().getLore().get(0));
                    player.setPlayerListName("§2" + current.getItemMeta().getLore().get(0));
                    break;
                case "violet":
                    player.setDisplayName("§d" + current.getItemMeta().getLore().get(0));
                    player.setPlayerListName("§d" + current.getItemMeta().getLore().get(0));
                    break;
                case "jaune":
                    player.setDisplayName("§e" + current.getItemMeta().getLore().get(0));
                    player.setPlayerListName("§e" + current.getItemMeta().getLore().get(0));
                    break;
                default: break;
            }
        }

    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        Bukkit.broadcastMessage("[SL]" + player.getName() + "a quitté la partie [number_player / max_nb_player]");
    }


    public ItemStack getItem(Material material, String customName) {
        ItemStack IT = new ItemStack(material, 1);
        ItemMeta meta = IT.getItemMeta();
        meta.setDisplayName(customName);
        IT.setItemMeta(meta);
        return IT;
    }

}