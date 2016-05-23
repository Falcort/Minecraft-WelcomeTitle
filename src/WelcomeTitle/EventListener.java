package WelcomeTitle;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;


public class EventListener implements Listener
{
	private WelcomeTitle plugin;
	
	public EventListener(WelcomeTitle plugin)
	{
		this.plugin = plugin;
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onPlayerLogin(PlayerLoginEvent login)
	{
		String titleText = "Bienvenue";
		String subtitleText = "Sur le serveur Minedaeron";
		String titleColor = "blue";
		String subtitleColor = "green";
		
		Player player = login.getPlayer();
		String playerName = player.getName();
		
		String titleCom = "title " + playerName + " title {\"text\":\"" + titleText +"\",\"color\":\"" + titleColor + "\"}";
		String subtitleCom = "title " + playerName + " subtitle {\"text\":\"" + subtitleText +"\",\"color\":\"" + subtitleColor + "\"}";
		
		Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this.plugin, new Runnable()
		{
			public void run()
			{
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), titleCom);
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), subtitleCom);
			}
		}, 60);
	}
}
