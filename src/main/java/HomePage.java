import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[@title=\"Log in to your customer account\"]")
    WebElement signInButton;

    @FindBy (xpath = "//li[@class = \"ajax_block_product col-xs-12 col-sm-4 col-md-3 first-in-line first-item-of-tablet-line first-item-of-mobile-line\"]")
    public WebElement hoveredWindow;
    @FindBy (xpath = "//*[@class = \"button ajax_add_to_cart_button btn btn-default\" and @title = \"Add to cart\" and @data-id-product = \"1\"]")
    public WebElement hoveredAddToCardButton;

    @FindBy (xpath = "//*[@class = \"icon-ok\"]")
    public WebElement iconItemInCart;

    @FindBy (xpath = "//*[@id = \"search_query_top\" ]")
    public WebElement searchBar;

    @FindBy (xpath = "//*[@name = \"submit_search\" ]")
    public WebElement searchButton;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public static String getURL(){
        String url = "";

        if (config.properties!=null){
            url = config.appURL;
        }return url;
    }
    public void inputSearchText(String searchTerm) {
        sendKeysToElement(searchBar, searchTerm);
    }

    public void clickSearchButton() {
        searchButton.click();
    }


    public SearchResultPage doSearch(String searchTerm) {
        inputSearchText(searchTerm);
        clickSearchButton();

        return new SearchResultPage();
    }

    public SignInPage clickOnSignInButton(){
    signInButton.click();
    return new SignInPage();
    }

    public CartPageThroughAddFromHomepage clickOnAddToCartButton() throws InterruptedException {
        hoverOverElement(hoveredWindow);
        hoveredAddToCardButton.click();
        return new CartPageThroughAddFromHomepage();
    }
}
