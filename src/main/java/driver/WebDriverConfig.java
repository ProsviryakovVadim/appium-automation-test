package driver;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.logging.Logger;

public class WebDriverConfig {

    private static final Logger LOG = Logger.getLogger(WebDriverConfig.class.getName());

    /**
     * Browsers select
     */
    final static private String IOS = "iOS - Safari";
    final static private String CHROME = "Chrome";
    final static private String FIREFOX = "Firefox";
    final static private String IE = "Ie";
    private static boolean mockKey = false;

    /**
     * Path drivers browser
     */
    private static final String WINDOWS_CHROME_DRIVER_PATH = "src/test/resources/drivers/chromedriver";

    /**
     *  WebDriver
     * */
    public static WebDriver driver;
    public static RemoteWebDriver remoteWebDriver;


    public static void setDriver(String browser) throws Exception {
        if (mockKey) {
            LOG.info("Run selenium grid");
            setUpGrid(browser);
        } else {
            LOG.info("Run selenium local");
            setUp(browser);
        }
        driver.manage().window().maximize();
    }


    private static void setUp(String browser) throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        switch (browser) {
            case IOS:
                capabilities.setCapability("deviceName", "iPhone 7");
                capabilities.setCapability("platformName", "iOS");
                capabilities.setCapability("platformVersion", "11.2");
                capabilities.setCapability("browserName", "safari");
                capabilities.setCapability("AutomationName", "XCUITest");
                driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
                break;
            case CHROME:
                System.setProperty("webdriver.chrome.driver", WINDOWS_CHROME_DRIVER_PATH);
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--window-size=1600,1400");
                capabilities = DesiredCapabilities.chrome();
                capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
                capabilities.setCapability(ChromeOptions.CAPABILITY, options);
                driver = new ChromeDriver();
                break;
        }
    }

    private static void setUpGrid(String browser) throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        switch (browser) {
            case IOS:
                capabilities.setCapability("deviceName", "iPhone 7");
                capabilities.setCapability("platformName", "iOS");
                capabilities.setCapability("platformVersion", "11.2");
                capabilities.setCapability("browserName", "safari");
                capabilities.setCapability("AutomationName", "XCUITest");
                driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
                break;
            case CHROME:
                System.setProperty("webdriver.chrome.driver", WINDOWS_CHROME_DRIVER_PATH);
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--window-size=1600,1400");
                capabilities = DesiredCapabilities.chrome();
                capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
                capabilities.setCapability(ChromeOptions.CAPABILITY, options);
                capabilities.setCapability("enableVNC", true);
                capabilities.setCapability("enableVideo", true);
                capabilities.setCapability("videoScreenSize", "1600x1200");
                capabilities.setCapability("videoFrameRate", "24");
                remoteWebDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
                break;
        }
    }

    /**
     *
     * TODO
     * Example method: Select OS driver for chrome
     *
     */

    public static WebDriver initDriver(String browserName) {
        if (browserName.equals(CHROME)) {
            if ((System.getProperty("os.name")).contains("mac")) {
                System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
            } else {
                System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
            }
        }
        return driver;
    }
}
