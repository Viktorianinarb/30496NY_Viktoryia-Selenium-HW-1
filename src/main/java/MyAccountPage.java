import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends BasePage {

    @FindBy(xpath ="//*[@title = \"Log me out\"]")
    public WebElement SignOutButton;

    public MyAccountPage() {PageFactory.initElements(driver, this);}


}
