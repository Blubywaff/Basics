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
            boolean isGod = player.getNoDamageTicks() > 100;
            player.setNoDamageTicks(isGod?0:Integer.MAX_VALUE);
            sender.sendMessage("God mode " + (isGod?"disabled":"enabled"));
            return true;
        }
        return false;
    }
}
