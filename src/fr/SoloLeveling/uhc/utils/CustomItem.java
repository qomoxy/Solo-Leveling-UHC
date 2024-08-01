package fr.SoloLeveling.uhc.utils;

import java.util.Collections;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CustomItem {
    private final ItemStack itemStack;

    private CustomItem(ItemBuilder builder) {
        this.itemStack = builder.itemStack;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    public static class ItemBuilder {
        private final ItemStack itemStack;
        private final ItemMeta itemMeta;

        public ItemBuilder(Material material, int amount) {
            this.itemStack = new ItemStack(material, amount);
            this.itemMeta = itemStack.getItemMeta();
        }

        public ItemBuilder setDisplayName(String displayName) {
            itemMeta.setDisplayName(displayName);
            return this;
        }

        public ItemBuilder setLore(String lore) {
            itemMeta.setLore(Collections.singletonList(lore));
            return this;
        }

        public ItemBuilder setEnchantment(Enchantment enchantment, int level) {
            itemMeta.addEnchant(enchantment, level, true);
            return this;
        }

        public ItemBuilder setItemFlag(ItemFlag flag) {
            itemMeta.addItemFlags(flag);
            return this;
        }

        public ItemBuilder setDurability(short durability) {
            itemStack.setDurability(durability);
            return this;
        }

        public CustomItem build() {
            itemStack.setItemMeta(itemMeta);
            return new CustomItem(this);
        }

        public ItemBuilder getBuilder() {
            return this;
        }
    }
}
