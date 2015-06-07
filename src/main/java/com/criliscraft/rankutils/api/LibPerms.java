package com.criliscraft.rankutils.api;

import org.bukkit.permissions.Permission;
import org.bukkit.plugin.PluginManager;

public class LibPerms {

    /**
     * This class makes the main class a little bit less bulky.
     * @param pm
     */
    public static void init(PluginManager pm) {
        pm.addPermission(CMD_RANK);
        pm.addPermission(Group.Perm.ADMIN);
        pm.addPermission(Group.Perm.CRILISMOD);
        pm.addPermission(Group.Perm.MODERATOR);
        pm.addPermission(Group.Perm.ASCENDED);
        pm.addPermission(Group.Perm.ANCIENT);
        pm.addPermission(Group.Perm.ELDER);
        pm.addPermission(Group.Perm.VETERAN);
        pm.addPermission(Group.Perm.REGULAR);
        pm.addPermission(Group.Perm.NEWBIE);
        pm.addPermission(Group.Perm.GUEST);
        pm.addPermission(Group.Perm.DONATOR);
        pm.addPermission(Group.Perm.YEAR1);
        pm.addPermission(Group.Perm.YEAR2);
    }

    public static Permission CMD_RANK = new Permission("clcr.cmd.rank");
}
