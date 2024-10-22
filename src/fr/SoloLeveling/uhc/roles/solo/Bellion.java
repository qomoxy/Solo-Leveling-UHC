package fr.SoloLeveling.uhc.roles.solo;

import fr.SoloLeveling.uhc.Player.PlayerData;
import fr.SoloLeveling.uhc.model.Role;
import fr.SoloLeveling.uhc.roles.RoleEffect;
import fr.SoloLeveling.uhc.utils.Potionutil;

import org.bukkit.entity.Player;

public class Bellion implements RoleEffect {

    private int pact = 0;

    @Override
    public String getName() { return "Bellion";}

    @Override
    public Role getRoleEnum() {
        return Role.BELLION;
    }

    @Override
    public String getDescription() {return "Bellion Discription";}

    @Override
    public void giveEffects(PlayerData playerData) {
        if (pact == 0) {
            Potionutil.giveStrength(playerData.getPlayer(), 10, 1);
            Potionutil.giveResistance(playerData.getPlayer(), 10, 2);
        } else {
            Potionutil.giveStrength(playerData.getPlayer(), 10, 3);
            playerData.getPlayer().sendMessage("Nom de sung Jin Woo : NamePlayer");
        }
    }

    @Override
    public void giveEffectAndItems(PlayerData playerData) {
        if (pact ==0) {
            Potionutil.giveStrength((Player) playerData, 10, 1);
            Potionutil.giveResistance((Player) playerData, 10, 2);
        } else {
            Potionutil.giveStrength((Player) playerData, 10, 3);
            playerData.getPlayer().sendMessage("Nom de sung Jin Woo : NamePlayer");
        }
    }
}
