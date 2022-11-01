import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends BasePage {

    @FindBy(xpath = "//*[@id = \"emptyCartWarning\"]")
    public WebElement emptyCartAlert;
    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);}


}
