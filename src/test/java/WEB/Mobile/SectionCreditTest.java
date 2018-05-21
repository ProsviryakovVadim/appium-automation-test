package WEB.Mobile;

import driver.WebDriverConfig;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.testng.annotations.Test;
import pages.CreditsPage;
import pages.MainPage;
import pages.MenuPage;



@DisplayName("Раздел \"Кредиты\"")
public class SectionCreditTest extends WebDriverConfig {

    @Test
    @DisplayName("Потребительские кредиты")
    @Description("Выбрали поле \"Потребительские кредиты\"")
    public void personalCreditTest() {

        MainPage mainPage = new MainPage(WebDriverConfig.driver);
        MenuPage menuPage = new MenuPage(WebDriverConfig.driver);
        CreditsPage creditsPage = new CreditsPage(WebDriverConfig.driver);

        mainPage.hamburgerMenuClick();
        menuPage.menuNameClick("Кредиты");
        creditsPage.creditNameClick("Потребительские кредиты");

        System.out.println(WebDriverConfig.driver.getCurrentUrl());
    }

    @Test(enabled = false)
    @DisplayName("Рефинансирование кредитов")
    @Description("Выбрали поле \"Рефинансирование кредитов\"")
    public void refinancingCreditTest() {

        MainPage mainPage = new MainPage(WebDriverConfig.driver);
        MenuPage menuPage = new MenuPage(WebDriverConfig.driver);
        CreditsPage creditsPage = new CreditsPage(WebDriverConfig.driver);

        mainPage.hamburgerMenuClick();
        menuPage.menuNameClick("Кредиты");
        creditsPage.creditNameClick("Рефинансирование кредитов");
    }
}
