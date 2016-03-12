package com.roteminecraftil.te2.event.block;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreak implements Listener {

	@EventHandler
	public void onBlockBreak(BlockBreakEvent event) {
		Player player = event.getPlayer();
		Block block = event.getBlock();
		Material material = block.getType();

		if (material != Material.GRASS) {
			event.setCancelled(true);
			player.sendMessage(ChatColor.RED + "Hey " + player.getName() 
			+ ", You can only break " + material + " blocks!");
		}
	}
}