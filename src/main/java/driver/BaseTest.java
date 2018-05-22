package driver;

import io.qameta.allure.Step;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import static driver.WebDriverConfig.*;

public class BaseTest {

    @BeforeMethod
    @Parameters({ "browser", "urlSend"})
    @Step("Выбрали платформу {0} и перешли по адресу {1}.")
    public void setUp(@Optional("iOS - Safari") String browser, @Optional("https://www.raiffeisen.ru/") String urlSend) throws Exception {
        setDriver(browser, urlSend);
    }

    @Step("Завершение инициализации драйвера.")
    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        } else if (remoteWebDriver != null) {
            remoteWebDriver.quit();
        }
    }
}
