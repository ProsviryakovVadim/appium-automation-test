package WEB.Mobile;

import driver.BaseTest;
import driver.WebDriverConfig;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.CreditsPage;
import pages.MainPage;
import pages.MenuPage;

@Features(@Feature("Раздел \"Кредиты\""))
public class SectionCreditTest extends BaseTest {

    @Test(dependsOnMethods = "testForExample")
    @Stories(@Story("Потребительские кредиты"))
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
    @Stories(@Story("Рефинансирование кредитов"))
    @Description("Выбрали поле \"Рефинансирование кредитов\"")
    public void refinancingCreditTest() {

        MainPage mainPage = new MainPage(WebDriverConfig.driver);
        MenuPage menuPage = new MenuPage(WebDriverConfig.driver);
        CreditsPage creditsPage = new CreditsPage(WebDriverConfig.driver);

        mainPage.hamburgerMenuClick();
        menuPage.menuNameClick("Кредиты");
        creditsPage.creditNameClick("Рефинансирование кредитов");
    }

    @Test
    @Stories(@Story("Запрос на одобрение"))
    @Description("Запрос на одобрение")
    public void testForExample(){
        System.out.println("PASS");
    }
}
