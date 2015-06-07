package com.criliscraft.rankutils.api;

import org.bukkit.ChatColor;
import org.bukkit.permissions.Permission;

public class Group {

    /**
     * The names of each group.
     */
    public static class Name {
        public static final String GUEST = "Guest";
        public static final String NEWBIE = "Newbie";
        public static final String REGULAR = "Regular";
        public static final String VETERAN = "Veteran";
        public static final String ELDER = "Elder";
        public static final String ANCIENT = "Ancient";
        public static final String ASCENDED = "Ascended";
        public static final String MODERATOR = "Moderator";
        public static final String CRILISMOD = "CriLisMod";
        public static final String ADMIN = "Admin";
        public static final String DONATOR = "Donator";
        public static final String YEAR1 = "1Year";
        public static final String YEAR2 = "2Year";
    }

    /**
     * A formatted name of each group.
     */
    public static class FormattedName {
        public static final String GUEST = ChatColor.WHITE + "Guest" + ChatColor.RESET;
        public static final String NEWBIE = ChatColor.GOLD + "Newbie" + ChatColor.RESET;
        public static final String REGULAR = ChatColor.GREEN + "Regular" + ChatColor.RESET;
        public static final String VETERAN = ChatColor.DARK_GREEN + "Veteran" + ChatColor.RESET;
        public static final String ELDER = ChatColor.BLUE + "Elder" + ChatColor.RESET;
        public static final String ANCIENT = ChatColor.DARK_BLUE + "Ancient" + ChatColor.RESET;
        public static final String ASCENDED = ChatColor.DARK_PURPLE + "Ascended" + ChatColor.RESET;
        public static final String MODERATOR = ChatColor.DARK_AQUA + "Moderator" + ChatColor.RESET;
        public static final String CRILISMOD = ChatColor.AQUA + "CriLisMod" + ChatColor.RESET;
        public static final String ADMIN = ChatColor.DARK_RED + "Admin" + ChatColor.RESET;
    }

    public static class GroupColor {
        public static final ChatColor GUEST = ChatColor.WHITE;
        public static final ChatColor NEWBIE = ChatColor.GOLD;
        public static final ChatColor REGULAR = ChatColor.GREEN;
        public static final ChatColor VETERAN = ChatColor.DARK_GREEN;
        public static final ChatColor ELDER = ChatColor.BLUE;
        public static final ChatColor ANCIENT = ChatColor.DARK_BLUE;
        public static final ChatColor ASCENDED = ChatColor.DARK_PURPLE;
        public static final ChatColor MODERATOR = ChatColor.DARK_AQUA;
        public static final ChatColor CRILISMOD = ChatColor.AQUA;
        public static final ChatColor ADMIN = ChatColor.DARK_RED;
    }

    public static class Perm {
        public static Permission GUEST = new Permission("clcr.group.guest");
        public static Permission NEWBIE = new Permission("clcr.group.newbie");
        public static Permission REGULAR = new Permission("clcr.group.regular");
        public static Permission VETERAN = new Permission("clcr.group.veteran");
        public static Permission ELDER = new Permission("clcr.group.elder");
        public static Permission ANCIENT = new Permission("clcr.group.ancient");
        public static Permission ASCENDED = new Permission("clcr.group.ascended");
        public static Permission MODERATOR = new Permission("clcr.group.moderator");
        public static Permission CRILISMOD = new Permission("clcr.group.crilismod");
        public static Permission ADMIN = new Permission("clcr.group.admin");
        public static Permission DONATOR = new Permission("clcr.group.donator");
        public static Permission YEAR1 = new Permission("clcr.group.1year");
        public static Permission YEAR2 = new Permission("clcr.group.2year");
    }

    public static class Prefix {
        public static final String GUEST = "&f";
        public static final String NEWBIE = "&6";
        public static final String REGULAR = "&a";
        public static final String VETERAN = "&2";
        public static final String ELDER = "&9";
        public static final String ANCIENT = "&1";
        public static final String ASCENDED = "&5";
        public static final String MODERATOR = "&3";
        public static final String CRILISMOD = "&f[&4CM&f]&b ";
        public static final String ADMIN = "&4";
        public static final String DONATOR = "&b$";
        public static final String YEAR1 = "&6[1Y]";
        public static final String YEAR2 = "&6[2Y]";
    }
}
