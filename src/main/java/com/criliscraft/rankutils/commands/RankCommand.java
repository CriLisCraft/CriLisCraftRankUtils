package com.criliscraft.rankutils.commands;

import com.criliscraft.rankutils.CriLisCraft;
import com.criliscraft.rankutils.api.ChatLib;
import com.criliscraft.rankutils.api.PermLib;
import com.criliscraft.rankutils.api.Manager;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Map;

public class RankCommand implements CommandExecutor {

    private final CriLisCraft plugin;

    public RankCommand(CriLisCraft plugin) {
        this.plugin = plugin;
    }

    /**
     * The method for the /rank command.
     * This command has a few arguments.
     * up - Ranks a player up in their current permission ladder.
     * down - Ranks a player down in their current permission ladder.
     * donation - Adds the donation group to the player and sets their prefix.
     * 1year - Adds 1year to a player and sets their prefix
     * 2year - Adds 2year to a player and sets their prefix
     * @param source
     * @param cmd
     * @param alias
     * @param args
     * @return true
     */
    public boolean onCommand(CommandSender source, Command cmd, String alias, String[] args) {

        int length = args.length;

        if (cmd.getName().equalsIgnoreCase("rank")) {
            if (source.hasPermission(PermLib.CMD_RANK)) {
                if (length <= 1) {
                    source.sendMessage(ChatLib.CHAT_PREFIX + "Too few arguments.");
                } else if (length == 2) {
                    if (args[0].equalsIgnoreCase("up")) {
                        Player player = Bukkit.getPlayer(args[1]);
                        Manager.rankUp(player, source);
                    } else if (args[0].equalsIgnoreCase("down")) {
                        source.sendMessage(ChatLib.CHAT_PREFIX + "This is not yet implemented.");
                    } else if (args[0].equalsIgnoreCase("donation")) {
                        Player player = Bukkit.getPlayer(args[1]);
                        Manager.donation(player, source);
                    } else if (args[0].equalsIgnoreCase("year")) {
                        Player player = Bukkit.getPlayer(args[1]);
                        Manager.year(player, source);
                    } else {
                        source.sendMessage(ChatLib.CHAT_PREFIX + args[0] + ", is an invalid argument.");
                    }
                } else if (length >= 3) {
                    source.sendMessage(ChatLib.CHAT_PREFIX + "Too many arguments.");
                }
            } else {
                source.sendMessage(ChatLib.NO_PERMS);
            }
            return true;
        }
        return false;
    }
}
