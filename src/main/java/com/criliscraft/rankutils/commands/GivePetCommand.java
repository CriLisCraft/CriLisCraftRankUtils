package com.criliscraft.rankutils.commands;

import com.criliscraft.rankutils.CriLisCraft;
import com.criliscraft.rankutils.api.ChatLib;
import com.criliscraft.rankutils.api.Manager;
import com.criliscraft.rankutils.api.PermLib;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GivePetCommand implements CommandExecutor {

    private final CriLisCraft plugin;

    public GivePetCommand(CriLisCraft plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender source, Command cmd, String alias, String[] args) {

        int length = args.length;

        if (cmd.getName().equalsIgnoreCase("givepet")) {
            if (source.hasPermission(PermLib.CMD_GIVEPERM)) {
                if (length < 2) {
                    source.sendMessage(ChatLib.CHAT_PREFIX + "Too few arguments.");
                } if (length == 3) {
                    Player player = Bukkit.getPlayer(args[0]);
                    if (args[2].equalsIgnoreCase("90")) {
                        Manager.givePet90Days(player, args[1]);
                    } else if (args[2].equalsIgnoreCase("perm")) {
                        Manager.givePet(player, args[1]);
                    } else {
                        source.sendMessage(ChatLib.CHAT_PREFIX + args[2] + ", Invalid argument.");
                    }
                } else if (length > 3) {
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
