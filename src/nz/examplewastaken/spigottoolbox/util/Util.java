//This class was created by ExampleWasTaken
package nz.examplewastaken.spigottoolbox.util;

import org.bukkit.ChatColor;

/**
 * Utility class with static methods that are used multiple times.
 * @author ExampleWasTaken
 */
public class Util {

    /**
     * Get the chat prefix SpigotToolBox uses.
     * @return The formatted prefix as string.
     */
    public static String getPrefix() {
        return ChatColor.WHITE + "[" + ChatColor.YELLOW + "\u25b6" + ChatColor.WHITE + "] ";
    }

    /**
     * Get the message that is sent if the console tries to execute a player-command.
     * Example:
     * <br>
     * <br><code>
     *     Player player = (Player) sender;
     *     player.sendMessage(Util.getConsoleSenderMessage());
     * </code>
     * @return The formatted message.
     */
    public static String getConsoleSenderMessage() {
        return getPrefix() + ChatColor.RED + "Only players can run this command!";
    }
}
