package com.roteminecraftil.te2.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Hello implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (!(sender instanceof Player)) {
			sender.sendMessage("You MUST be a Player to use this command");
			return false;
		}
		Player player = (Player) sender;
		player.sendMessage(ChatColor.AQUA + "You typed the cmd, player " + player.getName() + "!");
		return true;
	}
}
