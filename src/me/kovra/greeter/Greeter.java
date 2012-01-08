package me.kovra.greeter;

import java.util.logging.Logger;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Greeter extends JavaPlugin {

	Logger log = Logger.getLogger("Minecraft");

	@Override
	public void onEnable() {
		log.info("Greeter plugin loaded complete");
	}

	
	@Override
	public void onDisable() {
		log.info("Greeter plugin unloaded complete");
	}
	
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
    	if(cmd.getName().equalsIgnoreCase("greet")){
    		if (args.length < 1) {
    			log.info("You have not specified a person to greet");
    		} else {
    			log.info("Hello "+args[0]);
    			return true;
    		}
    	}
    	return false; 
    }
}
