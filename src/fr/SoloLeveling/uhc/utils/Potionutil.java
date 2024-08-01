package fr.SoloLeveling.uhc.utils;

import fr.SoloLeveling.uhc.Player.PlayerData;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.jetbrains.annotations.NotNull;

public class Potionutil {



    //J'aimerais enleve toutes la creations des effets de potions et les mettre dans une seule methode, afin de simplifier et de pouvoir changer la duration et l'amplificateur.
    //Je vais donc creer une methode qui prend en parametre le type de l'effet, la duration et l'amplificateur.

    public static final PotionEffect SPEED =
            new PotionEffect(PotionEffectType.SPEED, 999999, 1, false, false);

    public static final PotionEffect REGEN =
            new PotionEffect(PotionEffectType.REGENERATION, 999999, 1, false, false);

    public static final PotionEffect RESISTANCE =
            new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 999999, 1, false, false);

    public static final PotionEffect STRENGTH =
            new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 999999, 1, false, false);

    public static final PotionEffect INVISIBILITY =
            new PotionEffect(PotionEffectType.INVISIBILITY, 999999, 1, false, false);

    public static final PotionEffect NIGHT_VISION =
            new PotionEffect(PotionEffectType.NIGHT_VISION, 999999, 1, false, false);

    public static final PotionEffect FIRE_RESISTANCE =
            new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 999999, 1, false, false);

    public static final PotionEffect SLOWNESS =
            new PotionEffect(PotionEffectType.SLOW, 999999, 1, false, false);

    public static final PotionEffect WEAKNESS =
            new PotionEffect(PotionEffectType.WEAKNESS, 999999, 1, false, false);

    public static final PotionEffect POISON =
            new PotionEffect(PotionEffectType.POISON, 999999, 1, false, false);

    public static final PotionEffect BLINDNESS =
            new PotionEffect(PotionEffectType.BLINDNESS, 999999, 1, false, false);


    public static void giveSpeed(@NotNull PlayerData player) {
        PotionEffect power = null;
        for (PotionEffect potionEffect : player.getPlayer().getActivePotionEffects()) {
            if (potionEffect.getType().equals(PotionEffectType.SPEED)) {
                power = potionEffect;
            }
        }
        if (power == null) {
            player.getPlayer().addPotionEffect(SPEED);
        }

    }

    public static void giveRegen(@NotNull PlayerData player) {
        PotionEffect power = null;
        for (PotionEffect potionEffect : player.getPlayer().getActivePotionEffects()) {
            if (potionEffect.getType().equals(PotionEffectType.REGENERATION)) {
                power = potionEffect;
            }
        }
        if (power == null) {
            player.getPlayer().addPotionEffect(REGEN);
        }

    }

    public static void giveResistance(@NotNull PlayerData player) {
        PotionEffect power = null;
        for (PotionEffect potionEffect : player.getPlayer().getActivePotionEffects()) {
            if (potionEffect.getType().equals(PotionEffectType.DAMAGE_RESISTANCE)) {
                power = potionEffect;
            }
        }
        if (power == null) {
            player.getPlayer().addPotionEffect(RESISTANCE);
        }

    }

    public static void giveStrength(@NotNull PlayerData player) {
        PotionEffect power = null;
        for (PotionEffect potionEffect : player.getPlayer().getActivePotionEffects()) {
            if (potionEffect.getType().equals(PotionEffectType.INCREASE_DAMAGE)) {
                power = potionEffect;
            }
        }
        if (power == null) {
            player.getPlayer().addPotionEffect(STRENGTH);
        }

    }

    public static void giveInvisibility(@NotNull PlayerData player) {
        PotionEffect power = null;
        for (PotionEffect potionEffect : player.getPlayer().getActivePotionEffects()) {
            if (potionEffect.getType().equals(PotionEffectType.INVISIBILITY)) {
                power = potionEffect;
            }
        }
        if (power == null) {
            player.getPlayer().addPotionEffect(INVISIBILITY);
        }

    }

    public static void giveNightVision(@NotNull PlayerData player) {
        PotionEffect power = null;
        for (PotionEffect potionEffect : player.getPlayer().getActivePotionEffects()) {
            if (potionEffect.getType().equals(PotionEffectType.NIGHT_VISION)) {
                power = potionEffect;
            }
        }
        if (power == null) {
            player.getPlayer().addPotionEffect(NIGHT_VISION);
        }

    }

    public static void giveFireResistance(@NotNull PlayerData player) {
        PotionEffect power = null;
        for (PotionEffect potionEffect : player.getPlayer().getActivePotionEffects()) {
            if (potionEffect.getType().equals(PotionEffectType.FIRE_RESISTANCE)) {
                power = potionEffect;
            }
        }
        if (power == null) {
            player.getPlayer().addPotionEffect(FIRE_RESISTANCE);
        }

    }

    public static void giveSlowness(@NotNull PlayerData player) {
        PotionEffect power = null;
        for (PotionEffect potionEffect : player.getPlayer().getActivePotionEffects()) {
            if (potionEffect.getType().equals(PotionEffectType.SLOW)) {
                power = potionEffect;
            }
        }
        if (power == null) {
            player.getPlayer().addPotionEffect(SLOWNESS);
        }

    }

    public static void giveWeakness(@NotNull PlayerData player) {
        PotionEffect power = null;
        for (PotionEffect potionEffect : player.getPlayer().getActivePotionEffects()) {
            if (potionEffect.getType().equals(PotionEffectType.WEAKNESS)) {
                power = potionEffect;
            }
        }
        if (power == null) {
            player.getPlayer().addPotionEffect(WEAKNESS);
        }

    }

    public static void givePoison(@NotNull PlayerData player) {
        PotionEffect power = null;
        for (PotionEffect potionEffect : player.getPlayer().getActivePotionEffects()) {
            if (potionEffect.getType().equals(PotionEffectType.POISON)) {
                power = potionEffect;
            }
        }
        if (power == null) {
            player.getPlayer().addPotionEffect(POISON);
        }

    }

    public static void giveBlindness(@NotNull PlayerData player) {
        PotionEffect power = null;
        for (PotionEffect potionEffect : player.getPlayer().getActivePotionEffects()) {
            if (potionEffect.getType().equals(PotionEffectType.BLINDNESS)) {
                power = potionEffect;
            }
        }
        if (power == null) {
            player.getPlayer().addPotionEffect(BLINDNESS);
        }

    }

    public static void removeSpeed(@NotNull PlayerData player) {
        player.getPlayer().removePotionEffect(PotionEffectType.SPEED);
    }

    public static void removeRegen(@NotNull PlayerData player) {
        player.getPlayer().removePotionEffect(PotionEffectType.REGENERATION);
    }

    public static void removeResistance(@NotNull PlayerData player) {
        player.getPlayer().removePotionEffect(PotionEffectType.DAMAGE_RESISTANCE);
    }

    public static void removeStrength(@NotNull PlayerData player) {
        player.getPlayer().removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
    }

    public static void removeInvisibility(@NotNull PlayerData player) {
        player.getPlayer().removePotionEffect(PotionEffectType.INVISIBILITY);
    }

    public static void removeNightVision(@NotNull PlayerData player) {
        player.getPlayer().removePotionEffect(PotionEffectType.NIGHT_VISION);
    }

    public static void removeFireResistance(@NotNull PlayerData player) {
        player.getPlayer().removePotionEffect(PotionEffectType.FIRE_RESISTANCE);
    }

    public static void removeSlowness(@NotNull PlayerData player) {
        player.getPlayer().removePotionEffect(PotionEffectType.SLOW);
    }

    public static void removeWeakness(@NotNull PlayerData player) {
        player.getPlayer().removePotionEffect(PotionEffectType.WEAKNESS);
    }

    public static void removePoison(@NotNull PlayerData player) {
        player.getPlayer().removePotionEffect(PotionEffectType.POISON);
    }

    public static void removeBlindness(@NotNull PlayerData player) {
        player.getPlayer().removePotionEffect(PotionEffectType.BLINDNESS);
    }

    public static void removeAll(@org.jetbrains.annotations.NotNull PlayerData player) {
        for (PotionEffect potionEffect : player.getPlayer().getActivePotionEffects()) {
            player.getPlayer().removePotionEffect(potionEffect.getType());
        }
    }
}
