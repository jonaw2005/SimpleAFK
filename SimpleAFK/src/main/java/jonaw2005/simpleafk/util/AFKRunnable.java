package jonaw2005.simpleafk.util;

import jonaw2005.simpleafk.SimpleAFK;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class AFKRunnable {
    private static Runnable checker = () -> {
        for(Player p : Bukkit.getOnlinePlayers()){
            if(!SimpleAFK.mCache.isNew(p)){
                if(SimpleAFK.mCache.lastMove(p) > SimpleAFK.config.getAfktime()){
                    if(!SimpleAFK.handler.isAFK(p)){
                        SimpleAFK.handler.setAFK(p);
                    }else{
                        SimpleAFK.handler.refreshEffect(p);
                    }
                }else{
                    if(SimpleAFK.handler.isAFK(p)){
                        SimpleAFK.handler.setBack(p);
                    }
                }
            }
        }
    };

    public static void startChecking(){
        Bukkit.getScheduler().runTaskTimer(Bukkit.getPluginManager().getPlugin("SimpleAFK"), checker, 1, 0);
    }
}
