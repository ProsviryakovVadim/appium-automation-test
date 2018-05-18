package pages;

import elements.CreditsBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

public class CreditsPage {

    private CreditsBlock creditsPage;

    @FindBy(className = "menu-body")
    private CreditsBlock creditsPageResults;

    public CreditsPage(WebDriver driver) {
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(driver)), this);
    }

    public void creditNameClick(String name){
        for(WebElement element : creditsPageResults.personalCreditButton()){
            element.findElement(By.linkText(name)).click();
        }
    }
}
