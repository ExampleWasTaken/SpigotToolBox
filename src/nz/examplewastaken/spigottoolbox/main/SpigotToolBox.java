//This class was created by ExampleWasTaken
package nz.examplewastaken.spigottoolbox.main;

import nz.examplewastaken.spigottoolbox.command.*;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * The main class is only used for load and unloading of SpigotToolBox.
 * @author ExampleWasTaken
 */
public class SpigotToolBox extends JavaPlugin {

    /**
     * Used to register all commands.
     * <br>Command-registering is outsourced to make {@link #onEnable()} more readable.
     */
    private void registerCommands() {
        this.getCommand("rlc").setExecutor(new ReloadCommand());
        this.getCommand("night").setExecutor(new NightVisionCommand());
        this.getCommand("gmc").setExecutor(new CreativeCommand());
        this.getCommand("gms").setExecutor(new SurvivalCommand());
        this.getCommand("gma").setExecutor(new AdventureCommand());
        this.getCommand("gmsp").setExecutor(new SpectatorCommand());
    }

    /**
     * @see <a href="https://hub.spigotmc.org/javadocs/spigot/index.html">Official Spigot Documentaion</a>
     * @author ExampleWasTaken
     */
    @Override
    public void onEnable() {
        registerCommands();
    }
}
