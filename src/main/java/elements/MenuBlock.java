package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

import java.util.List;

@Name("Menu")
@FindBy(className = "header__menu")
public class MenuBlock extends HtmlElement {

    @Name("Credits")
    @FindBy(linkText = "Кредиты")
    private Button creditButton;

    @Name("Menu")
    @FindBy(xpath = "//ul[*][@class='main-menu']")
    private List<WebElement> mainMenuItems;

    public void creditButton(){
      creditButton.click();
    }

    public List<WebElement> getmainMenuItems() {
        return mainMenuItems;
    }
}


