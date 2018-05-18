package elements;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

@Name("Main")
@FindBy(xpath = "//header")
public class MainBlock extends HtmlElement {

    @Name("Hamburger menu")
    @FindBy(className = "hamburger-menu")
    private Button hamburgerMenuButton;

    public void hamburgerMenuButton() {
        hamburgerMenuButton.click();
    }
}

