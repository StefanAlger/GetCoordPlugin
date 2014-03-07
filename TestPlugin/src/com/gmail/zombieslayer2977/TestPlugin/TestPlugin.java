package com.gmail.zombieslayer2977.TestPlugin;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class TestPlugin extends JavaPlugin
{
	
	public void onEnable()
	{
		getLogger().info("TestPlugin has been activated");
	}

	public void onDisable()
	{
		getLogger().info("TestPlugin has been deactivated");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[]args)
	{
		if(cmd.getName().equalsIgnoreCase("getmycoords") && (sender instanceof Player))
		{	
			Player player = (Player) sender;
			Location playerLocation = player.getLocation();
			int x =  (int) playerLocation.getX();
			int y =  (int) playerLocation.getY();
			int z =  (int) playerLocation.getZ();
			player.sendMessage("Your coords are " + x + ", " + y + ", " + z);
			getLogger().info("Command Successfull");
			return true;
		}
		else
		{
			sender.sendMessage("You must be a player!");
			getLogger().info("Unsuccessfull");
			return false;
			
		}
		
		
		
		
	}
	
}
