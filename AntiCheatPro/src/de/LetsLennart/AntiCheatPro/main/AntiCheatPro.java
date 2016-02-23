package de.LetsLennart.AntiCheatPro.main;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class AntiCheatPro extends JavaPlugin implements Listener {

	//////////////////////////////////////////////////////////////////////
	// AntiCheatPro v0.1
	// Developer: LetsLennart
	// YouTube (LetsLennart): https://www.yotuube.com/CraftingPlaysHDx
	// Twitter (LetsLennart): http://www.twitter.com/LetsLennart
	// Website: http://letslennart.de
	// Skype: letslennart
	//////////////////////////////////////////////////////////////////////

	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(this, this);
		new AntiCheatProAPI(this);
		System.out.println("[AntiCheatPro] enabled");
	}

	public void onDsiable() {
		System.out.println("[AntiCheatPro] disabled");
	}
}