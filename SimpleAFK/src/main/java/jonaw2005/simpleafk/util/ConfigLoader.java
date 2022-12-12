package jonaw2005.simpleafk.util;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ConfigLoader {
    public Config getConfig() throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("./AFKconfig.yml");
        Yaml yaml = new Yaml(new Constructor(Config.class));
        Config config = yaml.load(inputStream);
        return config;
    }
}
