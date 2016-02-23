package de.LetsLennart.AntiCheatPro.main;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class AntiCheatPro extends JavaPlugin implements Listener {

	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(this, this);
	}
}