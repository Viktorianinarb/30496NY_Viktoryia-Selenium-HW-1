import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPageThroughAddFromHomepage extends BasePage {

    @FindBy(xpath = "//*[@class = \"icon-ok\"]")
    public WebElement itemAddedMessage;

    @FindBy (xpath = "//*[@title = \"Proceed to checkout\"]")
    public WebElement proceedToCheckOutButton;

    public CartPageThroughAddFromHomepage() {PageFactory.initElements(driver, this);}

    public ShoppingCartPage clickOnProceedToCheckOutButton(){
        proceedToCheckOutButton.click();
        return new ShoppingCartPage();
    }


}
