package com.foxdev.ranks.Commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Diamond implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = (Player) sender;

        ItemStack Gold = new ItemStack(Material.BLUE_WOOL);

        ItemMeta staffMeta = Gold.getItemMeta();
        staffMeta.addEnchant(Enchantment.KNOCKBACK, 1, true);
        staffMeta.setDisplayName(ChatColor.WHITE + "Diamond Rank");
        Gold.setItemMeta(staffMeta);

        p.sendMessage("U heeft een rank gekocht!");


        p.getInventory().addItem(Gold);


        return false;
    }
}
