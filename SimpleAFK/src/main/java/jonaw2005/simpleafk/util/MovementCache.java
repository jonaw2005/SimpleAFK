package jonaw2005.simpleafk.util;

import org.bukkit.entity.Player;
import java.util.HashMap;

public class MovementCache {

    private static HashMap<Player, Long> save;

    public MovementCache (){
        save = new HashMap<>();
    }

    public static void update(Player p){
        long time = System.currentTimeMillis();

        if(save.containsKey(p)){
            save.remove(p);
            save.put(p, time);
        }else{
            save.put(p, time);
        }

    }

    public long lastMove(Player p){
        long dif;
        long last = save.get(p);
        dif = System.currentTimeMillis() - last;
        return dif;
    }

    public boolean isNew(Player p){
        if(save.containsKey(p)){
            return false;
        }else{
            update(p);
            return true;
        }
    }

    public static void setAfkTime(Player p){
        save.remove(p);
        save.put(p, System.currentTimeMillis()-10000l);
    }

}
