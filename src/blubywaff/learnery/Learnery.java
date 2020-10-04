package blubywaff.learnery;

import org.bukkit.plugin.java.JavaPlugin;

public class Learnery extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getCommand("fly").setExecutor(new CommandFly());
        this.getCommand("god").setExecutor(new CommandGod());
        this.getCommand("speed").setExecutor(new CommandSpeed());
        this.getCommand("item").setExecutor(new CommandItem());
        this.getCommand("heal").setExecutor(new CommandHeal());
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
