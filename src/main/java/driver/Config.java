package driver;

import ru.yandex.qatools.properties.PropertyLoader;
import ru.yandex.qatools.properties.annotations.Property;
import ru.yandex.qatools.properties.annotations.Resource;

/**
 * Class works with properties from "test.properties" file
 */

@Resource.Classpath("test.properties")
public class Config {

    private static Config config;

    private Config() {
        PropertyLoader.populate(this);
    }

    public static Config getInstance() {
        if (config == null) {
            config = new Config();
        }
        return config;
    }


    @Property("browser")
    private String browser;

    private String getBrowser() {
        return browser;
    }
}