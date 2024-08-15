package fr.SoloLeveling.uhc.utils;

import java.util.Collections;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

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

        public ItemBuilder setEnchantment(Enchantment enchantment, int level, boolean ignoreLevelRestriction) {
            itemMeta.addEnchant(enchantment, level, ignoreLevelRestriction);
            return this;
        }

        public ItemBuilder setEnchantment(Enchantment enchantment) {
            itemMeta.addEnchant(enchantment, 1, true);
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

        public ItemBuilder owner(String owner) {
            SkullMeta meta = (SkullMeta) itemMeta;
            meta.setOwner(owner);
            itemStack.setItemMeta(meta);
            return this;
        }

        public ItemBuilder setUnbreakable(boolean unbreakable) {
            itemMeta.spigot().setUnbreakable(unbreakable);
            return this;
        }

        public ItemBuilder type(Material material) {
            itemStack.setType(material);
            return this;
        }

        public ItemBuilder clearLore() {
            itemMeta.setLore(null);
            return this;
        }

        public ItemBuilder clearEnchantments() {
            itemMeta.getEnchants().keySet().forEach(itemMeta::removeEnchant);
            return this;
        }

        public ItemBuilder itemStoreEnchantement(Enchantment enchantment, int level) {
            EnchantmentStorageMeta meta = (EnchantmentStorageMeta) itemStack.getItemMeta();
            meta.addStoredEnchant(enchantment, level, true);
            return this;
        }

        public CustomItem build() {
            itemStack.setItemMeta(itemMeta);
            return new CustomItem(this);
        }
    }
}
