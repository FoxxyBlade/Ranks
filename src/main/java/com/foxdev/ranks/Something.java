package com.foxdev.ranks;

import net.luckperms.api.LuckPerms;
import org.bukkit.entity.Player;

public class Something {

    public void runThis(Player player) {
        LuckPerms luckPerms = Ranks.getInstance().getLuckPerms();

        luckPerms.getUserManager().getUser(player.getName()).setPrimaryGroup("gold");
    }
}
