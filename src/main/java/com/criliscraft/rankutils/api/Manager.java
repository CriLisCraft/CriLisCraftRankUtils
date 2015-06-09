package com.criliscraft.rankutils.api;

import com.criliscraft.rankutils.CriLisCraft;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Manager {

    private static CommandSender console = Bukkit.getConsoleSender();
    private static CriLisCraft plugin = null;

    public Manager(CriLisCraft plugin) {
        this.plugin = plugin;
    }

    /**
     * Checks a players current group based off of a permission, Then promotes them adding the proper prefix.
     * @param player
     * @param sender
     */
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

    /**
     * Checks a players group and assings them a donation prefix if they dont have one.  It will announce that the player has donated if it is their first time.
     * If it is not their first time donating it thanks them in a private message.
     * @param player
     * @param sender
     */
    public static void donation(Player player, CommandSender sender) {

        String name = player.getName();

        if (player.hasPermission(Group.Perm.GUEST)) {
            if (player.hasPermission(Group.Perm.DONATOR)) {
                player.sendMessage(ChatLib.CHAT_PREFIX + "Thank you for supporting the server.");
            } else {
                if (player.hasPermission(Group.Perm.YEAR1)) {
                    setPrefix(name, Group.Prefix.YEAR1 + Group.Prefix.DONATOR + Group.Prefix.GUEST);
                } else if (player.hasPermission(Group.Perm.YEAR2)) {
                    setPrefix(name, Group.Prefix.YEAR2 + Group.Prefix.DONATOR + Group.Prefix.GUEST);
                } else {
                    setPrefix(name, Group.Prefix.DONATOR + Group.Prefix.GUEST);
                }
                broadcastDonation(name);
            }
            addGroup(name, Group.Name.DONATOR);
        } else if (player.hasPermission(Group.Perm.NEWBIE)) {
            if (player.hasPermission(Group.Perm.DONATOR)) {
                player.sendMessage(ChatLib.CHAT_PREFIX + "Thank you for supporting the server.");
            } else {
                if (player.hasPermission(Group.Perm.YEAR1)) {
                    setPrefix(name, Group.Prefix.YEAR1 + Group.Prefix.DONATOR + Group.Prefix.NEWBIE);
                } else if (player.hasPermission(Group.Perm.YEAR2)) {
                    setPrefix(name, Group.Prefix.YEAR2 + Group.Prefix.DONATOR + Group.Prefix.NEWBIE);
                } else {
                    setPrefix(name, Group.Prefix.DONATOR + Group.Prefix.NEWBIE);
                }
                broadcastDonation(name);
            }
            addGroup(name, Group.Name.DONATOR);
        } else if (player.hasPermission(Group.Perm.REGULAR)) {
            if (player.hasPermission(Group.Perm.DONATOR)) {
                player.sendMessage(ChatLib.CHAT_PREFIX + "Thank you for supporting the server.");
            } else {
                if (player.hasPermission(Group.Perm.YEAR1)) {
                    setPrefix(name, Group.Prefix.YEAR1 + Group.Prefix.DONATOR + Group.Prefix.REGULAR);
                } else if (player.hasPermission(Group.Perm.YEAR2)) {
                    setPrefix(name, Group.Prefix.YEAR2 + Group.Prefix.DONATOR + Group.Prefix.REGULAR);
                } else {
                    setPrefix(name, Group.Prefix.DONATOR + Group.Prefix.REGULAR);
                }
                broadcastDonation(name);
            }
            addGroup(name, Group.Name.DONATOR);
        } else if (player.hasPermission(Group.Perm.VETERAN)) {
            if (player.hasPermission(Group.Perm.DONATOR)) {
                player.sendMessage(ChatLib.CHAT_PREFIX + "Thank you for supporting the server.");
            } else {
                if (player.hasPermission(Group.Perm.YEAR1)) {
                    setPrefix(name, Group.Prefix.YEAR1 + Group.Prefix.DONATOR + Group.Prefix.VETERAN);
                } else if (player.hasPermission(Group.Perm.YEAR2)) {
                    setPrefix(name, Group.Prefix.YEAR2 + Group.Prefix.DONATOR + Group.Prefix.VETERAN);
                } else {
                    setPrefix(name, Group.Prefix.DONATOR + Group.Prefix.VETERAN);
                }
                broadcastDonation(name);
            }
            addGroup(name, Group.Name.DONATOR);
        } else if (player.hasPermission(Group.Perm.ELDER)) {
            if (player.hasPermission(Group.Perm.DONATOR)) {
                player.sendMessage(ChatLib.CHAT_PREFIX + "Thank you for supporting the server.");
            } else {
                if (player.hasPermission(Group.Perm.YEAR1)) {
                    setPrefix(name, Group.Prefix.YEAR1 + Group.Prefix.DONATOR + Group.Prefix.ELDER);
                } else if (player.hasPermission(Group.Perm.YEAR2)) {
                    setPrefix(name, Group.Prefix.YEAR2 + Group.Prefix.DONATOR + Group.Prefix.ELDER);
                } else {
                    setPrefix(name, Group.Prefix.DONATOR + Group.Prefix.ELDER);
                }
                broadcastDonation(name);
            }
            addGroup(name, Group.Name.DONATOR);
        } else if (player.hasPermission(Group.Perm.ANCIENT)) {
            if (player.hasPermission(Group.Perm.DONATOR)) {
                player.sendMessage(ChatLib.CHAT_PREFIX + "Thank you for supporting the server.");
            } else {
                if (player.hasPermission(Group.Perm.YEAR1)) {
                    setPrefix(name, Group.Prefix.YEAR1 + Group.Prefix.DONATOR + Group.Prefix.ANCIENT);
                } else if (player.hasPermission(Group.Perm.YEAR2)) {
                    setPrefix(name, Group.Prefix.YEAR2 + Group.Prefix.DONATOR + Group.Prefix.ANCIENT);
                } else {
                    setPrefix(name, Group.Prefix.DONATOR + Group.Prefix.ANCIENT);
                }
                broadcastDonation(name);
            }
            addGroup(name, Group.Name.DONATOR);
        } else if (player.hasPermission(Group.Perm.ASCENDED)) {
            if (player.hasPermission(Group.Perm.DONATOR)) {
                player.sendMessage(ChatLib.CHAT_PREFIX + "Thank you for supporting the server.");
            } else {
                if (player.hasPermission(Group.Perm.YEAR1)) {
                    setPrefix(name, Group.Prefix.YEAR1 + Group.Prefix.DONATOR + Group.Prefix.ASCENDED);
                } else if (player.hasPermission(Group.Perm.YEAR2)) {
                    setPrefix(name, Group.Prefix.YEAR2 + Group.Prefix.DONATOR + Group.Prefix.ASCENDED);
                } else {
                    setPrefix(name, Group.Prefix.DONATOR + Group.Prefix.ASCENDED);
                }
                broadcastDonation(name);
            }
            addGroup(name, Group.Name.DONATOR);
        } else if (player.hasPermission(Group.Perm.MODERATOR)) {
            if (player.hasPermission(Group.Perm.DONATOR)) {
                player.sendMessage(ChatLib.CHAT_PREFIX + "Thank you for supporting the server.");
            } else {
                if (player.hasPermission(Group.Perm.YEAR1)) {
                    setPrefix(name, Group.Prefix.YEAR1 + Group.Prefix.DONATOR + Group.Prefix.MODERATOR);
                } else if (player.hasPermission(Group.Perm.YEAR2)) {
                    setPrefix(name, Group.Prefix.YEAR2 + Group.Prefix.DONATOR + Group.Prefix.MODERATOR);
                } else {
                    setPrefix(name, Group.Prefix.DONATOR + Group.Prefix.MODERATOR);
                }
                broadcastDonation(name);
            }
            addGroup(name, Group.Name.DONATOR);
        } else if (player.hasPermission(Group.Perm.CRILISMOD)) {
            if (player.hasPermission(Group.Perm.DONATOR)) {
                player.sendMessage(ChatLib.CHAT_PREFIX + "Thank you for supporting the server.");
            } else {
                if (player.hasPermission(Group.Perm.YEAR1)) {
                    setPrefix(name, Group.Prefix.YEAR1 + Group.Prefix.DONATOR + Group.Prefix.CRILISMOD);
                } else if (player.hasPermission(Group.Perm.YEAR2)) {
                    setPrefix(name, Group.Prefix.YEAR2 + Group.Prefix.DONATOR + Group.Prefix.CRILISMOD);
                } else {
                    setPrefix(name, Group.Prefix.DONATOR + Group.Prefix.CRILISMOD);
                }
                broadcastDonation(name);
            }
            addGroup(name, Group.Name.DONATOR);
        } else {
            sender.sendMessage(ChatLib.CHAT_PREFIX + name + ", Can not receive this prefix.");
        }
    }

    /**
     * Promotes a player to the next group.
     * @param playerName
     */
    private static void promote(String playerName) {
        Bukkit.dispatchCommand(console, "pex promote " + playerName);
    }

    /**
     * Adds a group to a player.
     * @param playerName
     * @param groupName
     */
    private static void addGroup(String playerName, String groupName) {
        Bukkit.dispatchCommand(console, "pex user " + playerName + " group add " + groupName);
    }

    /**
     * Adds a parmission to a user.
     * @param playerName
     * @param permission
     */
    private static void addPermission(String playerName, String permission) {
        Bukkit.dispatchCommand(console, "pex user " + playerName + " add " + permission);
    }

    /**
     * Adds a permission to a user for 90 days
     * @param playerName
     * @param permission
     */
    private static void addPermission90Days(String playerName, String permission) {
        Bukkit.dispatchCommand(console, "pex user " + playerName + " timed add " + permission + " 7776000");
    }

    /**
     * Gives a player the permissions for a pet for 90 days.
     * It also messages them on how to use their new pet.
     * @param player
     * @param petType
     */
    public static void givePet90Days(Player player, String petType) {
        String playerName = player.getName();

        if (plugin.getConfig().getBoolean("echopet.rideall") == true) {
            addPermission90Days(playerName, "echopet.pet.ride." + petType);
        }
        addPermission90Days(playerName, "echopet.pet.show");
        addPermission90Days(playerName, "echopet.pet.hide");
        addPermission90Days(playerName, "echopet.pet.call");
        addPermission90Days(playerName, "echopet.pet.name");
        addPermission90Days(playerName, "echopet.pet.type." + petType);
        player.sendMessage(ChatLib.CHAT_PREFIX + "You may now use the following commands.");
        player.sendMessage(ChatLib.CHAT_PREFIX + "/pet show - Shows your hidden pet.");
        player.sendMessage(ChatLib.CHAT_PREFIX + "/pet hide - Hides your current pet.");
        player.sendMessage(ChatLib.CHAT_PREFIX + "/pet call - Summons your pet to your side.");
        if (plugin.getConfig().getBoolean("echopet.rideall") == true) {
            player.sendMessage(ChatLib.CHAT_PREFIX + "/pet rides - Allows you to ride your pet.");
        }
        player.sendMessage(ChatLib.CHAT_PREFIX + "/pet name [name] - Names your pet.");
        player.sendMessage(ChatLib.CHAT_PREFIX + "/pet " + petType + " - Summons a pet " + petType + ".");
    }

    /**
     * Gives a player the permissions for a pet.
     * It also messages them on how to use their new pet.
     * @param player
     * @param petType
     */
    public static void givePet(Player player, String petType) {
        String playerName = player.getName();

        if (plugin.getConfig().getBoolean("echopet.rideall") == true) {
            addPermission(playerName, "echopet.pet.ride." + petType);
        }
        addPermission(playerName, "echopet.pet.show");
        addPermission(playerName, "echopet.pet.hide");
        addPermission(playerName, "echopet.pet.call");
        addPermission(playerName, "echopet.pet.name");
        addPermission(playerName, "echopet.pet.type." + petType);
        player.sendMessage(ChatLib.CHAT_PREFIX + "You may now use the following commands.");
        player.sendMessage(ChatLib.CHAT_PREFIX + "/pet show - Shows your hidden pet.");
        player.sendMessage(ChatLib.CHAT_PREFIX + "/pet hide - Hides your current pet.");
        player.sendMessage(ChatLib.CHAT_PREFIX + "/pet call - Summons your pet to your side.");
        if (plugin.getConfig().getBoolean("echopet.rideall") == true) {
            player.sendMessage(ChatLib.CHAT_PREFIX + "/pet rides - Allows you to ride your pet.");
        }
        player.sendMessage(ChatLib.CHAT_PREFIX + "/pet name [name] - Names your pet.");
        player.sendMessage(ChatLib.CHAT_PREFIX + "/pet " + petType + " - Summons a pet " + petType + ".");
    }

    /**
     * Sets a players prefix.
     * @param playerName
     * @param prefix
     */
    private static void setPrefix(String playerName, String prefix) {
        Bukkit.dispatchCommand(console, "pex user " + playerName + " prefix " + prefix);
    }

    /**
     * Broadcasts a rankup.
     * @param playerName
     * @param formattedGroup
     */
    private static void broadcastRankup(String playerName, String formattedGroup) {
        Bukkit.broadcastMessage(ChatLib.CHAT_PREFIX + ChatColor.AQUA + playerName + ChatColor.YELLOW + ", has just been promoted to, " + formattedGroup + ChatColor.YELLOW + ".");
    }

    /**
     * Broadcasts two messages to the server thanking the user for supporting us.
     * @param playerName
     */
    private static void broadcastDonation(String playerName) {
        Bukkit.broadcastMessage(ChatLib.CHAT_PREFIX + ChatColor.AQUA + playerName + ChatColor.YELLOW + ", has just donated to the server!");
        Bukkit.broadcastMessage(ChatLib.CHAT_PREFIX + "Thank you, " + playerName + ", for supporting the server!");
    }
}
