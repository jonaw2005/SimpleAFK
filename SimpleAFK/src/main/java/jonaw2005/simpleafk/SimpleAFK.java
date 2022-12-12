package jonaw2005.simpleafk;

import jonaw2005.simpleafk.commands.simpleExec;
import jonaw2005.simpleafk.events.onJoin;
import jonaw2005.simpleafk.events.onMove;
import jonaw2005.simpleafk.util.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.Level;

public final class SimpleAFK extends JavaPlugin {

    public static MovementCache mCache;
    public static AFKRunnable checker;
    public static AFKHandler handler;

    public static Config config;
    public static ConfigLoader loader;

    @Override
    public void onEnable() {
        // Plugin startup logic
        mCache = new MovementCache();
        checker = new AFKRunnable();
        handler = new AFKHandler();
        loader = new ConfigLoader();

        try{
            config = loader.getConfig();
        }catch (Exception e){
            e.printStackTrace();
            Bukkit.getLogger().log(Level.WARNING, "Could not find AFKconfig.yml, using default values!");
            config = new Config();
            config.setAfktitle("You are afk!");
            config.setAfksubtitle("move to verify you're back");
            config.setResumetitle("You are no longer afk");
            config.setResumesubtitle("");
        }

        this.getCommand("AFK").setExecutor(new simpleExec());
        this.getCommand("unAFK").setExecutor(new simpleExec());
        Bukkit.getPluginManager().registerEvents(new onJoin(), this);
        Bukkit.getPluginManager().registerEvents(new onMove(), this);

        checker.startChecking();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getScheduler().cancelTasks(this);

    }
}
