import base.BasePage;
import org.testng.annotations.Test;
import org.testng.Assert;


public class TestCartFunctionality extends BasePage {

    @Test
    public void addItemToCart() throws InterruptedException {
        HomePage homepage = new HomePage();
        CartPageThroughAddFromHomepage itemAdded = homepage.clickOnAddToCartButton();
        ShoppingCartPage scp = itemAdded.clickOnProceedToCheckOutButton();
        Assert.assertFalse(scp.emptyCartAlert.isDisplayed());
    }
}


