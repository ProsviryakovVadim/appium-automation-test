package WEB.Desctop;

import driver.BaseTest;
import driver.WebDriverConfig;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.CreditsPage;
import pages.MenuPage;

@Features(@Feature("Раздел \"Кредиты\""))
public class SectionCreditTest extends BaseTest {

    @Test(priority = 10)
    @Stories(@Story("Потребительские кредиты"))
    @Description("Выбрали поле \"Потребительские кредиты\"")
    public void personalCreditTest() {

        MenuPage menuPage = new MenuPage(WebDriverConfig.driver);
        CreditsPage creditsPage = new CreditsPage(WebDriverConfig.driver);

        menuPage.menuNameClick("Кредиты");
        creditsPage.creditNameClick("Потребительские кредиты");
    }

    @Test
    @Stories(@Story("Рефинансирование кредитов"))
    @Description("Выбрали поле \"Рефинансирование кредитов\"")
    public void refinancingCreditTest() {

        MenuPage menuPage = new MenuPage(WebDriverConfig.driver);
        CreditsPage creditsPage = new CreditsPage(WebDriverConfig.driver);

        menuPage.menuNameClick("Кредиты");
        creditsPage.creditNameClick("Рефинансирование кредитов");
    }
}
