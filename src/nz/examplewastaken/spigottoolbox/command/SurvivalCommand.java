//This class was created by ExampleWasTaken
package nz.examplewastaken.spigottoolbox.command;

import nz.examplewastaken.spigottoolbox.util.Util;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Represents the survival game mode command.
 * @author ExampleWasTaken
 */
public class SurvivalCommand implements CommandExecutor {

    /**
     * Sets the executing player into survival mode.
     * @see <a href="https://hub.spigotmc.org/javadocs/spigot/index.html">Official Spigot Documentaion</a>
     */
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.getGameMode() != GameMode.SURVIVAL) {
                player.setGameMode(GameMode.SURVIVAL);
                player.sendMessage(Util.getPrefix() + ChatColor.GREEN + "Changed to " + ChatColor.WHITE + "Survival");
            } else {
                player.sendMessage(Util.getPrefix() + ChatColor.RED + "Your game mode is already " + ChatColor.WHITE + "Survival" + ChatColor.RED + "!");
            }
        } else {
            sender.sendMessage(Util.getConsoleSenderMessage());
        }

        return true;
    }
}
