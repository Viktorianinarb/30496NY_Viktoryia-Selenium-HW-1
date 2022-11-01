import base.BasePage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestItemSearch extends BasePage {

    @Test
    public void testSearchWrongItem() {
        HomePage homePage = new HomePage();
        String searchTerm = "black pants";
        SearchResultPage searchResultPage = homePage.doSearch(searchTerm);
        Assert.assertTrue(searchResultPage.noSuchItemAlert.isDisplayed());
    }
}
