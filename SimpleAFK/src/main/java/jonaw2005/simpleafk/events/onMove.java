package jonaw2005.simpleafk.events;

import jonaw2005.simpleafk.SimpleAFK;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class onMove implements Listener {
    @EventHandler
    public void OnPlayerMove(PlayerMoveEvent e){
        Player p = e.getPlayer();
        SimpleAFK.mCache.update(p);
    }
}
