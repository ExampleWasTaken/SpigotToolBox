//This class was created by ExampleWasTaken
package nz.examplewastaken.spigottoolbox.command;

import nz.examplewastaken.spigottoolbox.util.Util;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * Represents the reload command.
 * @author ExampleWasTaken
 */
public class ReloadCommand implements CommandExecutor {

    /**
     * Reloads the server.
     * <br>This command is implemented to get rid of the warning message and to shorten the reload process.
     * @see <a href="https://hub.spigotmc.org/javadocs/spigot/index.html">Official Spigot Documentaion</a>
     */
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {

        Bukkit.broadcastMessage(Util.getPrefix() + ChatColor.RED + "Reloading server...");
        Bukkit.reload();
        Bukkit.broadcastMessage(Util.getPrefix() + ChatColor.GREEN + "Reloaded finished");

        return true;
    }
}
