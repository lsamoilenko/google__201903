package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.SearchPage;

import java.util.List;

public class SearchTest extends  BaseTest {
    @Test
    public void basicSearchTest() {
        Assert.assertTrue(startPage.isPageLoaded(), "Start page is not loaded");

        String searchTerm = "Selenium";
        SearchPage searchPage = startPage.search(searchTerm);
        Assert.assertTrue(searchPage.isPageLoaded(), "Search page is not loaded");
        Assert.assertEquals(searchPage.getSearchResultCount(), 10, "Search result count is wrong");

        List<String> SearchResultList = searchPage.getSearchResultLists();
        for (String searchResult : SearchResultList) {
            Assert.assertTrue(searchResult.contains(searchTerm), "Search term :  " + searchTerm + " not found in: \n" + searchResult);
        }

        searchPage.clickOnPage2Button();

        Assert.assertEquals(searchPage.getSearchResultCount(), 10, "Search result count is wrong");

        List<String> SearchResultList2 = searchPage.getSearchResultLists();
        for (String searchResult : SearchResultList) {
            Assert.assertTrue(searchResult.contains(searchTerm), "Search term :  " + searchTerm + " not found in: \n" + searchResult);
        }
    }
}


