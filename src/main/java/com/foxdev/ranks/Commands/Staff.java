package com.foxdev.ranks.Commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Staff implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        ItemStack staff = new ItemStack(Material.RED_WOOL);

        ItemMeta staffMeta = staff.getItemMeta();
        staffMeta.addEnchant(Enchantment.KNOCKBACK, 1, true);

        staff.setItemMeta(staffMeta);

        Player p = (Player) sender;

        p.getInventory().addItem(staff);




        return false;
    }
}
