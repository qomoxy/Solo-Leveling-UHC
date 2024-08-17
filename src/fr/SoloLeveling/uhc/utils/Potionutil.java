package fr.SoloLeveling.uhc.utils;

import fr.SoloLeveling.uhc.Player.PlayerData;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.jetbrains.annotations.NotNull;

public class Potionutil {



    //J'aimerais enleve toutes la creations des effets de potions et les mettre dans une seule methode, afin de simplifier et de pouvoir changer la duration et l'amplificateur.
    //Je vais donc creer une methode qui prend en parametre le type de l'effet, la duration et l'amplificateur.


    public static void giveSpeed(@NotNull Player player, int duration, int amplifier) {
        PotionEffect effect = null;
        for (PotionEffect potionEffect : player.getPlayer().getActivePotionEffects()) {
            if (potionEffect.getType().equals(PotionEffectType.SPEED)) {
                effect = potionEffect;
            }
        }
        if (effect == null) {
            player.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SPEED, duration, amplifier, false, false));
        }

    }

    public static void giveRegen(@NotNull Player player, int duration, int amplifier) {
        PotionEffect effect = null;
        for (PotionEffect potionEffect : player.getPlayer().getActivePotionEffects()) {
            if (potionEffect.getType().equals(PotionEffectType.REGENERATION)) {
                effect = potionEffect;
            }
        }
        if (effect == null) {
            player.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, duration, amplifier, false, false));
        }

    }

    public static void giveResistance(@NotNull Player player, int duration, int amplifier) {
        PotionEffect effect = null;
        for (PotionEffect potionEffect : player.getPlayer().getActivePotionEffects()) {
            if (potionEffect.getType().equals(PotionEffectType.DAMAGE_RESISTANCE)) {
                effect = potionEffect;
            }
        }
        if (effect == null) {
            player.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, duration, amplifier, false, false));
        }

    }

    public static void giveStrength(@NotNull Player player, int duration, int amplifier) {
        PotionEffect effect = null;
        for (PotionEffect potionEffect : player.getPlayer().getActivePotionEffects()) {
            if (potionEffect.getType().equals(PotionEffectType.INCREASE_DAMAGE)) {
                effect = potionEffect;
            }
        }
        if (effect == null) {
            player.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, duration, amplifier, false, false));
        }

    }

    public static void giveInvisibility(@NotNull Player player, int duration, int amplifier) {
        PotionEffect effect = null;
        for (PotionEffect potionEffect : player.getPlayer().getActivePotionEffects()) {
            if (potionEffect.getType().equals(PotionEffectType.INVISIBILITY)) {
                effect = potionEffect;
            }
        }
        if (effect == null) {
            player.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, duration, amplifier, false, false));
        }

    }

    public static void giveNightVision(@NotNull Player player, int duration, int amplifier) {
        PotionEffect effect = null;
        for (PotionEffect potionEffect : player.getPlayer().getActivePotionEffects()) {
            if (potionEffect.getType().equals(PotionEffectType.NIGHT_VISION)) {
                effect = potionEffect;
            }
        }
        if (effect == null) {
            player.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, duration, amplifier, false, false));
        }

    }

    public static void giveFireResistance(@NotNull Player player, int duration, int amplifier) {
        PotionEffect effect = null;
        for (PotionEffect potionEffect : player.getPlayer().getActivePotionEffects()) {
            if (potionEffect.getType().equals(PotionEffectType.FIRE_RESISTANCE)) {
                effect = potionEffect;
            }
        }
        if (effect == null) {
            player.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, duration, amplifier, false, false));
        }

    }

    public static void giveSlowness(@NotNull Player player, int duration, int amplifier) {
        PotionEffect effect = null;
        for (PotionEffect potionEffect : player.getPlayer().getActivePotionEffects()) {
            if (potionEffect.getType().equals(PotionEffectType.SLOW)) {
                effect = potionEffect;
            }
        }
        if (effect == null) {
            player.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SLOW, duration, amplifier, false, false));
        }

    }

    public static void giveWeakness(@NotNull Player player, int duration, int amplifier) {
        PotionEffect effect = null;
        for (PotionEffect potionEffect : player.getPlayer().getActivePotionEffects()) {
            if (potionEffect.getType().equals(PotionEffectType.WEAKNESS)) {
                effect = potionEffect;
            }
        }
        if (effect == null) {
            player.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, duration, amplifier, false, false));
        }

    }

    public static void givePoison(@NotNull Player player, int duration, int amplifier) {
        PotionEffect effect = null;
        for (PotionEffect potionEffect : player.getPlayer().getActivePotionEffects()) {
            if (potionEffect.getType().equals(PotionEffectType.POISON)) {
                effect = potionEffect;
            }
        }
        if (effect == null) {
            player.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.POISON, duration, amplifier, false, false));
        }

    }

    public static void giveBlindness(@NotNull Player player, int duration, int amplifier) {
        PotionEffect effect = null;
        for (PotionEffect potionEffect : player.getPlayer().getActivePotionEffects()) {
            if (potionEffect.getType().equals(PotionEffectType.BLINDNESS)) {
                effect = potionEffect;
            }
        }
        if (effect == null) {
            player.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, duration, amplifier, false, false));
        }

    }

    public static void removeSpeed(@NotNull Player player) {
        player.getPlayer().removePotionEffect(PotionEffectType.SPEED);
    }

    public static void removeRegen(@NotNull Player player) {
        player.getPlayer().removePotionEffect(PotionEffectType.REGENERATION);
    }

    public static void removeResistance(@NotNull Player player) {
        player.getPlayer().removePotionEffect(PotionEffectType.DAMAGE_RESISTANCE);
    }

    public static void removeStrength(@NotNull Player player) {
        player.getPlayer().removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
    }

    public static void removeInvisibility(@NotNull Player player) {
        player.getPlayer().removePotionEffect(PotionEffectType.INVISIBILITY);
    }

    public static void removeNightVision(@NotNull Player player) {
        player.getPlayer().removePotionEffect(PotionEffectType.NIGHT_VISION);
    }

    public static void removeFireResistance(@NotNull Player player) {
        player.getPlayer().removePotionEffect(PotionEffectType.FIRE_RESISTANCE);
    }

    public static void removeSlowness(@NotNull Player player) {
        player.getPlayer().removePotionEffect(PotionEffectType.SLOW);
    }

    public static void removeWeakness(@NotNull Player player) {
        player.getPlayer().removePotionEffect(PotionEffectType.WEAKNESS);
    }

    public static void removePoison(@NotNull Player player) {
        player.getPlayer().removePotionEffect(PotionEffectType.POISON);
    }

    public static void removeBlindness(@NotNull Player player) {
        player.getPlayer().removePotionEffect(PotionEffectType.BLINDNESS);
    }

    public static void removeAll(@org.jetbrains.annotations.NotNull Player player) {
        for (PotionEffect potionEffect : player.getPlayer().getActivePotionEffects()) {
            player.getPlayer().removePotionEffect(potionEffect.getType());
        }
    }
}
