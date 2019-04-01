package page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;


public class SearchPage {
    WebDriver driver;

    @FindBy(xpath = "//div[@class='g']")
    private List<WebElement> searchResultElements;

    @FindBy(xpath = "//div[@id='resultStats']")
    private WebElement resultsTotall;

    @FindBy(xpath = "//a[@aria-label='Page 2']")
    private WebElement page2Button;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isPageLoaded() {
        return resultsTotall.isDisplayed()
                && driver.getCurrentUrl().contains("/search")
                && driver.getTitle().contains("Google");
    }

    public int getSearchResultCount() {
        return searchResultElements.size();
    }

    public List<String> getSearchResultLists() {
        List<String> searchResultsList = new ArrayList<String>();
        for (WebElement searchResultElement : searchResultElements) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", searchResultElement);
            searchResultsList.add(searchResultElement.getText());
        }
        return searchResultsList;
    }

    public void clickOnPage2Button(){
        page2Button.sendKeys (Keys.ENTER);
    }
}



