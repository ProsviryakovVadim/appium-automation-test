import io.qameta.allure.*;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pages.CreditsPage;
import pages.MainPage;
import pages.MenuPage;


@DisplayName("Раздел \"Кредиты\"")
public class SectionCreditTest extends WebDriverConfig {

    @Test
    @DisplayName("Потребительские кредиты")
    @Description("Выбрали поле \"Потребительские кредиты\"")
    public void personalCreditTest() {

        MainPage mainPage = new MainPage(driver);
        MenuPage menuPage = new MenuPage(driver);
        CreditsPage creditsPage = new CreditsPage(driver);

        mainPage.hamburgerMenuClick();
        menuPage.menuNameClick("Кредиты");
        creditsPage.creditNameClick("Потребительские кредиты");

        System.out.println(driver.getCurrentUrl());
    }

    @Test
    @DisplayName("Рефинансирование кредитов")
    @Description("Выбрали поле \"Рефинансирование кредитов\"")
    public void refinancingCreditTest() {

        MainPage mainPage = new MainPage(driver);
        MenuPage menuPage = new MenuPage(driver);
        CreditsPage creditsPage = new CreditsPage(driver);

        mainPage.hamburgerMenuClick();
        menuPage.menuNameClick("Кредиты");
        creditsPage.creditNameClick("Рефинансирование кредитов");
    }
}
