package fr.SoloLeveling.uhc.roles.demon;

import static fr.SoloLeveling.uhc.utils.Potionutil.giveFireResistance;

import fr.SoloLeveling.uhc.Player.PlayerData;



public class Kargalgan {
    public String getName() {
        return "Kargalgan";
    }

    public String getDescription() {
        return "Kargalgan";
    }

    public void giveEffectAndItems(PlayerData player) {
        //giveFireResistance(player, 10, 1);
        //ItemBuilder book = new ItemBuilder(ENCHANTED_BOOK, 1);
        //book.itemStoreEnchantement(Enchantment.ARROW_FIRE, 1);
        //player.addItem(book);
    }

    public void giveEffect(PlayerData player) {
        giveFireResistance(player.getPlayer(), 10, 1);
    }
}
