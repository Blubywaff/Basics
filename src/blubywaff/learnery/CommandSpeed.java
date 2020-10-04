package blubywaff.learnery;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandSpeed implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            if(args.length == 0) {
                player.sendMessage("Speed is " + player.getWalkSpeed()*400 + "% " + player.getFlySpeed()*400 + "%");
                return true;
            }
            float inputSpeed = Float.parseFloat(args[0]);
            player.setWalkSpeed(inputSpeed/400);
            player.setFlySpeed(inputSpeed/400);
            player.sendMessage("Speed set to " + inputSpeed + "%");
            return true;
        }
        return false;
    }
}
