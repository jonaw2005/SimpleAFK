package jonaw2005.simpleafk.util;

import jonaw2005.simpleafk.SimpleAFK;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.HashMap;

public class AFKHandler {
    private static HashMap<Player, Boolean> save;

    public AFKHandler(){
        save = new HashMap<>();
    }

    /*
    sets the player as afk and gives him blindness
     */
    public static void setAFK(Player p){
        if(!save.containsKey(p)){
            save.put(p, true);
        }else{
            save.remove(p);
            save.put(p, true);
        }
        giveAFKeffect(p);
    }

    /*
    sets the player as not afk and removes his blindness
     */
    public static void setBack(Player p){
        if(!save.containsKey(p)){
            save.put(p, false);
        }else{
            save.remove(p);
            save.put(p, false);
        }
        takeAFKeffect(p);
    }

    public static void giveAFKeffect(Player p){
        p.sendTitle(SimpleAFK.config.getAfktitle(), SimpleAFK.config.getAfksubtitle(), 10, 100, 10);
        p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 30, 4));
    }
    public static void refreshEffect(Player p){
        p.sendTitle(SimpleAFK.config.getAfktitle(), SimpleAFK.config.getAfksubtitle(), 1, 100, 1);
        p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 30, 4));
    }

    public static void takeAFKeffect(Player p){
        p.sendTitle(SimpleAFK.config.getResumetitle(), SimpleAFK.config.getResumesubtitle(), 10, 30, 10);
        p.removePotionEffect(PotionEffectType.BLINDNESS);
    }

    public static boolean isAFK(Player p){
        if(save.containsKey(p)){
            return save.get(p);
        }else{
            return false;
        }

    }

}
