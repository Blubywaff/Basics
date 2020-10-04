package blubywaff.learnery;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandHeal implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            player.setHealth(20);
            player.setFoodLevel(20);
            player.sendMessage("Healed");
            return true;
        }
        return false;
    }
}
