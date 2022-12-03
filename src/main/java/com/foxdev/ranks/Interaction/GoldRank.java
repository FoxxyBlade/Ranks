package com.foxdev.ranks.Interaction;

import com.foxdev.ranks.Ranks;
import net.luckperms.api.LuckPerms;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;


public class GoldRank implements Listener {

    private LuckPerms luckPerms;

    @EventHandler
    public void giveRank(PlayerInteractEvent e) {
        LuckPerms luckPerms = Ranks.getInstance().getLuckPerms();
        Player p = e.getPlayer();

        if (p.getInventory().getItemInMainHand().getType().equals(Material.NAME_TAG)) {
            if (e.getAction() == Action.RIGHT_CLICK_BLOCK) {
                p.getInventory().getItemInMainHand().setAmount(p.getInventory().getItemInMainHand().getAmount() - 1);

                Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "lp user " + p.getName() + " parent set gold");
                p.sendTitle(ChatColor.GOLD + "Gold", ChatColor.GOLD + "U heeft nu de gold rank!");
            }
        }
    }
}
