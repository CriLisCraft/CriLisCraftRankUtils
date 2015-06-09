package com.criliscraft.rankutils;

import com.criliscraft.rankutils.commands.RankCommand;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CriLisCraft extends JavaPlugin {

    /**
     * Is called when the plugin is being loaded.
     */
    @Override
    public void onEnable() {

        //Register Commands
        this.getCommand("rank").setExecutor(new RankCommand(this));

        this.getLogger().log(Level.INFO, "Enabled");
    }

    /**
     * Is called when the plugin is bein unloaded.
     */
    @Override
    public void onDisable() {

        this.getLogger().log(Level.INFO, "Disabled");
    }
}
