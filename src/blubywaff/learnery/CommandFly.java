package blubywaff.learnery;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandFly implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            boolean fly = !player.getAllowFlight();
            player.setAllowFlight(fly);
            sender.sendMessage("Fly " + (fly?"enabled":"disabled"));
            return true;
        }
        return false;
    }
}
