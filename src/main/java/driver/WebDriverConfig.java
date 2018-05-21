package driver;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.net.URL;

public class WebDriverConfig {

    final static private String IOS = "iOS";
    final static private String CHROME = "Chrome";
    final static private String FIREFOX = "Firefox";
    final static private String IE = "Ie";

    public static WebDriver driver;


    @BeforeMethod
    @Parameters({ "browser", "urlSend"})
    public void setUp(@Optional("iOS") String browser, @Optional("https://www.raiffeisen.ru/") String urlSend) throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        switch (browser) {
            case IOS:
                capabilities.setCapability("deviceName", "iPhone 7");
                capabilities.setCapability("platformName", "iOS");
                capabilities.setCapability("platformVersion", "11.2");
                capabilities.setCapability("browserName", "safari");
                capabilities.setCapability("AutomationName", "XCUITest");
                driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
                driver.get(urlSend);
            case CHROME:
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--window-size=1600,1400");
                capabilities = DesiredCapabilities.chrome();
                capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
                capabilities.setCapability(ChromeOptions.CAPABILITY, options);
                capabilities.setCapability("enableVNC", true);
                capabilities.setCapability("enableVideo", true);
                capabilities.setCapability("videoScreenSize", "1600x1200");
                capabilities.setCapability("videoFrameRate", "24");
                driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
        }

    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}
