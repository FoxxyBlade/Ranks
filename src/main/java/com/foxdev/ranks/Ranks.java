package com.foxdev.ranks;

import com.foxdev.ranks.Commands.Diamond;
import com.foxdev.ranks.Commands.Gold;
import com.foxdev.ranks.Commands.Iron;
import com.foxdev.ranks.Commands.Staff;
import com.foxdev.ranks.Interaction.DiamondRank;
import com.foxdev.ranks.Interaction.GoldRank;
import com.foxdev.ranks.Interaction.IronRank;
import com.foxdev.ranks.Interaction.StaffRank;
import net.luckperms.api.LuckPerms;
import org.bukkit.Bukkit;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public final class Ranks extends JavaPlugin {

    private LuckPerms luckPerms;

    @Override
    public void onEnable() {
        super.onEnable();

        // Set up LuckPerms
        RegisteredServiceProvider<LuckPerms> provider = Bukkit.getServicesManager().getRegistration(LuckPerms.class);
        if (provider != null) luckPerms = provider.getProvider();

        getServer().getPluginManager().registerEvents(new GoldRank(), this);
        getCommand("gold").setExecutor(new Gold());

        getCommand("staffitem").setExecutor(new Staff());
        getServer().getPluginManager().registerEvents(new StaffRank(), this);

        getCommand("diamond").setExecutor(new Diamond());
        getServer().getPluginManager().registerEvents(new DiamondRank(), this);

        getCommand("iron").setExecutor(new Iron());
        getServer().getPluginManager().registerEvents(new IronRank(),this);
    }

    public static Ranks getInstance() {
        return Ranks.getPlugin(Ranks.class);
    }

    public LuckPerms getLuckPerms() {
        return luckPerms;
    }
}

