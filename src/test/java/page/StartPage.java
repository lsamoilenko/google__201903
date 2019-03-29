package page;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * Class that describes StartPage pageObject
 */
 public class StartPage {
    WebDriver driver;

    @FindBy(xpath = "//input[@name='q']")
    private WebElement searchField;

    /**
     * Constructor of StartPage class
     * @param driver Browser object from Test
     */
    public StartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isPageLoaded() {
        return searchField.isDisplayed()
                && driver.getCurrentUrl().contains("https://www.google.com.ua/")
                && driver.getTitle().equals("Google");
    }

    public SearchPage search(String searchTerm){
        searchField.sendKeys(searchTerm);
        searchField.sendKeys(Keys.ENTER);
        return new SearchPage(driver);
    }
}
