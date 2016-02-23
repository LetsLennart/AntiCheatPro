package de.LetsLennart.AntiCheatPro.main;

import org.bukkit.event.Listener;

public class AntiCheatProAPI implements Listener {

	private AntiCheatPro plugin;

	public AntiCheatProAPI(AntiCheatPro plugin) {
		this.plugin = plugin;
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
}