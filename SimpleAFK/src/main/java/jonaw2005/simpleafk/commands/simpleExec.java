package jonaw2005.simpleafk.commands;

import jonaw2005.simpleafk.SimpleAFK;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class simpleExec implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)){
            sender.sendMessage("This command is only executable by a player!");
            return false;
        }
        Player player = (Player) sender;
        if(command.getName().equals("AFK")){
            SimpleAFK.mCache.setAfkTime(player);
            return true;
        }
        else if(command.getName().equals("unAFK")){
            SimpleAFK.mCache.update(player);
            return true;
        }
        return false;
    }
}
