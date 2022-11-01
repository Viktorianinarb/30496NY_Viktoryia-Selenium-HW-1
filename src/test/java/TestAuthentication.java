import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestAuthentication extends BasePage {

    @Test
    public void testNavigateToSignInPage(){
        HomePage homepage = new HomePage();
        SignInPage signinpage = homepage.clickOnSignInButton();
        Assert.assertTrue(signinpage.SignInButtonOnSignInPage.isDisplayed());
    }

    @Test
    public void testLogInWithValidCredentials(){
        HomePage homepage = new HomePage();
        SignInPage signinpage = homepage.clickOnSignInButton();
        signinpage.EmailEntryField.sendKeys(config.appUser);
        signinpage.PasswordEntryField.sendKeys(config.appPassword);
        signinpage.SignInButtonOnSignInPage.click();
        Assert.assertTrue(new MyAccountPage().SignOutButton.isDisplayed());
    }

}

