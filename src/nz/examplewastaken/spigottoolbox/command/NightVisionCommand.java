//This class was created by ExampleWasTaken
package nz.examplewastaken.spigottoolbox.command;

import nz.examplewastaken.spigottoolbox.util.Util;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

/**
 * Represents the night vision command.
 * @author ExampleWasTaken
 */
public class NightVisionCommand implements CommandExecutor {

    /**
     * Gives the executing player night vision.
     * @see <a href="https://hub.spigotmc.org/javadocs/spigot/index.html">Official Spigot Documentaion</a>
     */
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, Integer.MAX_VALUE, 255, false, false, false));
            player.sendMessage(Util.getPrefix() + ChatColor.GREEN + "You have been given night vision.");
        } else {
            sender.sendMessage(Util.getConsoleSenderMessage());
        }

        return true;
    }
}
