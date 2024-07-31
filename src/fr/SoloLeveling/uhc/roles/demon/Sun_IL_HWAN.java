package fr.SoloLeveling.uhc.roles.demon;

import org.bukkit.potion.PotionEffect;

import javax.management.ObjectName;
import javax.management.relation.Role;
import java.util.List;

public class Sun_IL_HWAN extends Role {

    /**
     * <p>Make a new Role object.
     * No check is made that the ObjectNames in the role value exist in
     * an MBean server.  That check will be made when the role is set
     * in a relation.
     *
     * @param roleName  role name
     * @param roleValue role value (List of ObjectName objects)
     * @throws IllegalArgumentException if null parameter
     */
    public Sun_IL_HWAN(String roleName, List<ObjectName> roleValue) throws IllegalArgumentException {
        super(roleName, roleValue);
    }


}
