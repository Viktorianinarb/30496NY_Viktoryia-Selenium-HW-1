import base.BasePage;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static base.BasePage.driver;

public class SignInPage extends Serializers.Base {

    @FindBy (xpath = "//button[@id=\"SubmitLogin\"]")
    public WebElement SignInButtonOnSignInPage;

    @FindBy (id = "email")
    public WebElement EmailEntryField;

    @FindBy (id="passwd")
    public WebElement PasswordEntryField;

    @FindBy (id = "SubmitLogin")
    public WebElement SignInButtonSignInPage;


    public SignInPage() {PageFactory.initElements(driver, this);
    }

//    public SignInPage clickOnSignInButton(){
//        signInButton.click();
//        return new SignInPage();
//    }
}
