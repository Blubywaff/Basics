package blubywaff.learnery;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandGod implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            if(player.getNoDamageTicks() < 10) {
                player.setNoDamageTicks(Integer.MAX_VALUE);
                sender.sendMessage("God mode enabled");
            } else {
                player.setNoDamageTicks(0);
                sender.sendMessage("God mode disabled");
            }
            return true;
        }
        return false;
    }
}
