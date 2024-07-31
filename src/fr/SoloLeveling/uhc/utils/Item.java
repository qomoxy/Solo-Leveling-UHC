package fr.SoloLeveling.uhc.utils;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;
import java.util.List;

public class Item
{

    private final ItemStack item;

    private final String displayName;
    private final String lore;
    private final String enchantment;
    private final String flag;

    private final int durability;
    private final int amount;

    private Item(ItemBuilder builder) {

        this.item = builder.item;
        this.displayName = builder.displayName;
        this.lore = builder.lore;
        this.enchantment = builder.enchantment;
        this.flag = builder.flag;
        this.durability = builder.durability;
        this.amount = builder.amount;
    }

        public ItemStack getItem() {
        return item;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getLore() {
        return lore;
    }

    public String getEnchantment() {
        return enchantment;
    }

    public String getFlag() {
        return flag;
    }

    public int getDurability() {
        return durability;
    }

    public int getAmount() {
        return amount;
    }

    public static class ItemBuilder
    {
        private final ItemStack item;
        private final String displayName;
        private String lore;
        private String enchantment;
        private String flag;
        private int durability;
        private int amount;

        public ItemBuilder(ItemStack item, String displayName) {
            this.item = item;
            this.displayName = displayName;
        }

        public ItemBuilder setLore(String lore) {
            this.lore = lore;
            return this;
        }

        public ItemBuilder setEnchantment(String enchantment) {
            this.enchantment = enchantment;
            return this;
        }

        public ItemBuilder setFlag(String flag) {
            this.flag = flag;
            return this;
        }

        public ItemBuilder setDurability(int durability) {
            this.durability = durability;
            return this;
        }

        public ItemBuilder setAmount(int amount) {
            this.amount = amount;
            return this;
        }

        public Item build() {
            Item item1 = new Item(this);
            ItemStack stack = new ItemStack(build().getItem().getType(), build().getAmount());
            ItemMeta meta = stack.getItemMeta();
            if (displayName != null) {
                meta.setDisplayName(build().getDisplayName());
            }
            if (lore != null) {
                meta.setLore(Collections.singletonList(build().getLore()));
            }
            return item1;
        }
    }

}
