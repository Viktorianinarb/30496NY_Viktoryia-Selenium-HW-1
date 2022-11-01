import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static base.BasePage.driver;

public class SearchResultPage extends BasePage {

    @FindBy (id = "search_query_top")
    public WebElement searchText;

    @FindBy (xpath = "//*[@class=\"alert alert-warning\"]")
    public WebElement noSuchItemAlert;

    public SearchResultPage() {PageFactory.initElements(driver, this);}

    public String getSearchText() {
        return getTextFromElement(searchText);
    }

}
