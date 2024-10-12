package fr.SoloLeveling.uhc.roles.village;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.roles.RoleEffect;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.jetbrains.annotations.NotNull;

public class Min_Byung_Gyu implements RoleEffect {

    public String getName() {
        return "Min_Byung_Gyu";
    }

    public String getDescription() {
        return "Min_Byung_Gyu Description";
    }

    @Override
    public void giveEffects(PlayerData playerData) {

    }

    @Override
    public void giveEffectAndItems(PlayerData playerData) {
        ItemStack item = new ItemStack(Material.POTION);
        PotionMeta meta = (PotionMeta) item.getItemMeta();
        meta.addCustomEffect( new PotionEffect(PotionEffectType.HEAL, 30, 1), true );
        item.setItemMeta(meta);
        playerData.getPlayer().getInventory().addItem(item);
    }

    //TODO: Add the revive player
}
