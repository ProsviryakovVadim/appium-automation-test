package pages;

import elements.MenuBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

public class MenuPage {

    private MenuBlock menuPage;

    @FindBy(className = "header__menu")
    private MenuBlock menuBlockResults;

    public MenuPage(WebDriver driver) {
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(driver)), this);
    }

    public void personalCreditClick() {
        menuPage.creditButton();
    }

    public void menuNameClick(String name) {
        for(WebElement element : menuBlockResults.getmainMenuItems()){
            element.findElement(By.linkText(name)).click();
        }
    }
}
