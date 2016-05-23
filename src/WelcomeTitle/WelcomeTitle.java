package WelcomeTitle;

import org.bukkit.plugin.java.JavaPlugin;

public class WelcomeTitle extends JavaPlugin
{
	/*
	 * Message consol on Start of the server
	 */
	@Override
	public void onEnable()
	{
		new EventListener(this);
	}
}
