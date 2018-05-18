package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

import java.util.List;

@Name("Credits")
@FindBy(className = "menu-block")
public class CreditsBlock extends HtmlElement {

    @Name("Personal credit")
    @FindBy(xpath = "//a[@class='menu-link']")
    private List<WebElement> personalCreditButton;

    public List<WebElement> personalCreditButton(){
        return personalCreditButton;
    }
}
