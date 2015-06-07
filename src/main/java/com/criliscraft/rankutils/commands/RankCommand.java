package com.criliscraft.rankutils.commands;

import com.criliscraft.rankutils.CriLisCraft;
import com.criliscraft.rankutils.api.ChatLib;
import com.criliscraft.rankutils.api.LibPerms;
import com.criliscraft.rankutils.api.RankChangeManager;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RankCommand implements CommandExecutor {

    private final CriLisCraft plugin;

    public RankCommand(CriLisCraft plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender source, Command cmd, String alias, String[] args) {

        int length = args.length;

        if (cmd.getName().equalsIgnoreCase("rank")) {
            if (source.hasPermission(LibPerms.CMD_RANK)) {
                if (length <= 1) {
                    source.sendMessage(ChatLib.CHAT_PREFIX + "Too few arguments.");
                } else if (length == 2) {
                    if (args[0].equalsIgnoreCase("up")) {
                        for (Player p : Bukkit.getOnlinePlayers()) {
                            if (!(args[1].equalsIgnoreCase(p.getName()))) {
                                source.sendMessage(ChatLib.CHAT_PREFIX + args[1] + ", is not online.");
                                return true;
                            }
                        }
                        Player player = Bukkit.getPlayer(args[1]);
                        RankChangeManager.rankUp(player, source);
                    } else if (args[0].equalsIgnoreCase("down")) {

                    } else if (args[0].equalsIgnoreCase("donation")) {

                    } else if (args[0].equalsIgnoreCase("1year")) {

                    } else if (args[0].equalsIgnoreCase("2year")) {

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
