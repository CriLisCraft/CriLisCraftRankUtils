package com.criliscraft.rankutils.api;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RankChangeManager {

    public static void rankUp(Player player, CommandSender sender) {
        String name = player.getName();

        if (player.hasPermission(Group.Perm.GUEST)) {
            if (player.hasPermission(Group.Perm.DONATOR)) {
                if (player.hasPermission(Group.Perm.YEAR1)) {
                    setPrefix(name, Group.Prefix.YEAR1 + Group.Prefix.DONATOR + Group.Prefix.NEWBIE);
                } else if (player.hasPermission(Group.Perm.YEAR2)) {
                    setPrefix(name, Group.Prefix.YEAR2 + Group.Prefix.DONATOR + Group.Prefix.NEWBIE);
                } else {
                    setPrefix(name, Group.Prefix.DONATOR + Group.Prefix.NEWBIE);
                }
            } else {
                if (player.hasPermission(Group.Perm.YEAR1)) {
                    setPrefix(name, Group.Prefix.YEAR1 + Group.Prefix.NEWBIE);
                } else if (player.hasPermission(Group.Perm.YEAR2)) {
                    setPrefix(name, Group.Prefix.YEAR2 + Group.Prefix.NEWBIE);
                } else {
                    setPrefix(name, Group.Prefix.NEWBIE);
                }
            }
            promote(name);
            broadcastRankup(name, Group.FormattedName.NEWBIE);
        } else if (player.hasPermission(Group.Perm.NEWBIE)) {
            if (player.hasPermission(Group.Perm.DONATOR)) {
                if (player.hasPermission(Group.Perm.YEAR1)) {
                    setPrefix(name, Group.Prefix.YEAR1 + Group.Prefix.DONATOR + Group.Prefix.REGULAR);
                } else if (player.hasPermission(Group.Perm.YEAR2)) {
                    setPrefix(name, Group.Prefix.YEAR2 + Group.Prefix.DONATOR + Group.Prefix.REGULAR);
                } else {
                    setPrefix(name, Group.Prefix.DONATOR + Group.Prefix.REGULAR);
                }
            } else {
                if (player.hasPermission(Group.Perm.YEAR1)) {
                    setPrefix(name, Group.Prefix.YEAR1 + Group.Prefix.REGULAR);
                } else if (player.hasPermission(Group.Perm.YEAR2)) {
                    setPrefix(name, Group.Prefix.YEAR2 + Group.Prefix.REGULAR);
                } else {
                    setPrefix(name, Group.Prefix.REGULAR);
                }
            }
            promote(name);
            broadcastRankup(name, Group.FormattedName.REGULAR);
        } else if (player.hasPermission(Group.Perm.REGULAR)) {
            if (player.hasPermission(Group.Perm.DONATOR)) {
                if (player.hasPermission(Group.Perm.YEAR1)) {
                    setPrefix(name, Group.Prefix.YEAR1 + Group.Prefix.DONATOR + Group.Prefix.VETERAN);
                } else if (player.hasPermission(Group.Perm.YEAR2)) {
                    setPrefix(name, Group.Prefix.YEAR2 + Group.Prefix.DONATOR + Group.Prefix.VETERAN);
                } else {
                    setPrefix(name, Group.Prefix.DONATOR + Group.Prefix.VETERAN);
                }
            } else {
                if (player.hasPermission(Group.Perm.YEAR1)) {
                    setPrefix(name, Group.Prefix.YEAR1 + Group.Prefix.VETERAN);
                } else if (player.hasPermission(Group.Perm.YEAR2)) {
                    setPrefix(name, Group.Prefix.YEAR2 + Group.Prefix.VETERAN);
                } else {
                    setPrefix(name, Group.Prefix.VETERAN);
                }
            }
            promote(name);
            broadcastRankup(name, Group.FormattedName.VETERAN);
        } else if (player.hasPermission(Group.Perm.VETERAN)) {
            if (player.hasPermission(Group.Perm.DONATOR)) {
                if (player.hasPermission(Group.Perm.YEAR1)) {
                    setPrefix(name, Group.Prefix.YEAR1 + Group.Prefix.DONATOR + Group.Prefix.ELDER);
                } else if (player.hasPermission(Group.Perm.YEAR2)) {
                    setPrefix(name, Group.Prefix.YEAR2 + Group.Prefix.DONATOR + Group.Prefix.ELDER);
                } else {
                    setPrefix(name, Group.Prefix.DONATOR + Group.Prefix.ELDER);
                }
            } else {
                if (player.hasPermission(Group.Perm.YEAR1)) {
                    setPrefix(name, Group.Prefix.YEAR1 + Group.Prefix.ELDER);
                } else if (player.hasPermission(Group.Perm.YEAR2)) {
                    setPrefix(name, Group.Prefix.YEAR2 + Group.Prefix.ELDER);
                } else {
                    setPrefix(name, Group.Prefix.ELDER);
                }
            }
            promote(name);
            broadcastRankup(name, Group.FormattedName.ELDER);
        } else if (player.hasPermission(Group.Perm.ELDER)) {
            if (player.hasPermission(Group.Perm.DONATOR)) {
                if (player.hasPermission(Group.Perm.YEAR1)) {
                    setPrefix(name, Group.Prefix.YEAR1 + Group.Prefix.DONATOR + Group.Prefix.ANCIENT);
                } else if (player.hasPermission(Group.Perm.YEAR2)) {
                    setPrefix(name, Group.Prefix.YEAR2 + Group.Prefix.DONATOR + Group.Prefix.ANCIENT);
                } else {
                    setPrefix(name, Group.Prefix.DONATOR + Group.Prefix.ANCIENT);
                }
            } else {
                if (player.hasPermission(Group.Perm.YEAR1)) {
                    setPrefix(name, Group.Prefix.YEAR1 + Group.Prefix.ANCIENT);
                } else if (player.hasPermission(Group.Perm.YEAR2)) {
                    setPrefix(name, Group.Prefix.YEAR2 + Group.Prefix.ANCIENT);
                } else {
                    setPrefix(name, Group.Prefix.ANCIENT);
                }
            }
            promote(name);
            broadcastRankup(name, Group.FormattedName.ANCIENT);
        } else if (player.hasPermission(Group.Perm.ANCIENT)) {
            if (player.hasPermission(Group.Perm.DONATOR)) {
                if (player.hasPermission(Group.Perm.YEAR1)) {
                    setPrefix(name, Group.Prefix.YEAR1 + Group.Prefix.DONATOR + Group.Prefix.ASCENDED);
                } else if (player.hasPermission(Group.Perm.YEAR2)) {
                    setPrefix(name, Group.Prefix.YEAR2 + Group.Prefix.DONATOR + Group.Prefix.ASCENDED);
                } else {
                    setPrefix(name, Group.Prefix.DONATOR + Group.Prefix.ASCENDED);
                }
            } else {
                if (player.hasPermission(Group.Perm.YEAR1)) {
                    setPrefix(name, Group.Prefix.YEAR1 + Group.Prefix.ASCENDED);
                } else if (player.hasPermission(Group.Perm.YEAR2)) {
                    setPrefix(name, Group.Prefix.YEAR2 + Group.Prefix.ASCENDED);
                } else {
                    setPrefix(name, Group.Prefix.ASCENDED);
                }
            }
            promote(name);
            broadcastRankup(name, Group.FormattedName.ASCENDED);
        } else {
            sender.sendMessage(ChatLib.CHAT_PREFIX + name + ", can not be promoted.");
        }
    }

    public static void promote(String playerName) {
        CommandSender console = Bukkit.getConsoleSender();

        Bukkit.dispatchCommand(console, "pex promote " + playerName);
    }

    public static void setPrefix(String playerName, String prefix) {
        CommandSender console = Bukkit.getConsoleSender();

        Bukkit.dispatchCommand(console, "pex user " + playerName + " prefix " + prefix);
    }

    public static void broadcastRankup(String playerName, String formattedGroup) {
        Bukkit.broadcastMessage(ChatLib.CHAT_PREFIX + ChatColor.AQUA + playerName + ChatColor.YELLOW + ", has just been promoted to, " + formattedGroup + ChatColor.YELLOW + ".");
    }
}
