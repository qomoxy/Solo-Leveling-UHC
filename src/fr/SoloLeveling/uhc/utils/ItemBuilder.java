package fr.SoloLeveling.uhc.utils;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;


public class ItemBuilder {

    private final ItemStack is;

    public ItemBuilder(Material m) {
        this.is = new ItemStack(m);
    }

    public void amount(int amount) {
        this.is.setAmount(amount);
    }

    public ItemBuilder name(String name) {
        ItemMeta meta = is.getItemMeta();
        meta.setDisplayName(name);
        is.setItemMeta(meta);
        return this;
    }

    public void lore(String name) {
        ItemMeta meta = is.getItemMeta();
        meta.setDisplayName(name);
        is.setItemMeta(meta);
    }

    public ItemBuilder durability(int durability) {
        is.setDurability((short) durability);
        return this;
    }

    public ItemBuilder data(int data) {
        is.setDurability((short) data);
        return this;
    }

    public void enchantment(Enchantment enchantment, int level) {
        is.addUnsafeEnchantment(enchantment, level);
    }

    public ItemBuilder enchantment(Enchantment enchantment) {
        is.addUnsafeEnchantment(enchantment, 1);
        return this;
    }

    public ItemBuilder type(Material material) {
        is.setType(material);
        return this;
    }

    public ItemBuilder clearLore() {
        ItemMeta meta = is.getItemMeta();
        meta.setLore(null);
        is.setItemMeta(meta);
        return this;
    }

    public ItemBuilder clearenchantment() {
        is.getEnchantments().clear();
        return this;
    }

    public ItemBuilder owner(String owner) {
        SkullMeta meta = (SkullMeta) is.getItemMeta();
        meta.setOwner(owner);
        is.setItemMeta(meta);
        return this;
    }

    public void itemStoreEnchantement(Enchantment enchantement, int level) {
        ItemMeta meta = is.getItemMeta();
        meta.addEnchant(enchantement, level, true);
        is.setItemMeta(meta);
    }

    public ItemStack build() {
        return is;
    }
}
