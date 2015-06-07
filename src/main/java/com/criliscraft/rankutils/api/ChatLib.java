package com.criliscraft.rankutils.api;

import org.bukkit.ChatColor;

public class ChatLib {

    /**
     * The prefix seen in chat.
     */
    public static final String CHAT_PREFIX = ChatColor.WHITE + "[" + ChatColor.DARK_BLUE + "CriLis" + ChatColor.DARK_GREEN + "Craft" + ChatColor.WHITE + "] " + ChatColor.YELLOW;

    /**
     * This message is returned when a player does not have permission for a command.
     */
    public static final String NO_PERMS = CHAT_PREFIX + ChatColor.RED + "You do not have permission to use that command.";
}
