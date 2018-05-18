import io.appium.java_client.ios.IOSDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class WebDriverConfig {

    final static private String MAIN_PAGE = "https://www.raiffeisen.ru/";

    static WebDriver driver;

    @Before
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "iPhone 7");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "11.2");
        capabilities.setCapability("browserName", "safari");
        capabilities.setCapability("AutomationName" ,  "XCUITest");
        driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.get(MAIN_PAGE);

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
