package blubywaff.learnery;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandItem implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            int amount = (args.length<2)?1:Integer.parseInt(args[1]);
            Material material = Material.matchMaterial(args[0]);
            ItemStack itemStack = new ItemStack(material, amount);
            player.getInventory().addItem(itemStack);
            player.sendMessage("Gave " + amount + " " + material.name());
            return true;
        }
        return false;
    }
}
