package com.criliscraft.rankutils;

import com.criliscraft.rankutils.commands.GivePetCommand;
import com.criliscraft.rankutils.commands.RankCommand;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class CriLisCraft extends JavaPlugin {

    /**
     * Is called when the plugin is being loaded.
     */
    @Override
    public void onEnable() {

        this.getConfig().addDefault("echopet.rideall", true);
        this.getConfig().options().copyDefaults(true);
        this.saveConfig();


        //Register Commands
        this.getCommand("rank").setExecutor(new RankCommand(this));
        this.getCommand("givepet").setExecutor(new GivePetCommand(this));

        this.getLogger().log(Level.INFO, "Enabled");
    }

    /**
     * Is called when the plugin is bein unloaded.
     */
    @Override
    public void onDisable() {

        this.saveConfig();

        this.getLogger().log(Level.INFO, "Disabled");
    }
}
