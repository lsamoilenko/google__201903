package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import page.StartPage;


/**
     * Prerequisites page which executing during every run
     */
    public class BaseTest {
        private WebDriver driver;
        protected StartPage startPage;

        /**
         * Method for opening new Chrome browser window and transition to LinkedIn site after starting test execution
         */
        @BeforeMethod
        public void beforeMethod() {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\samoilenko_l\\IdeaProjects\\google__201903\\chromedriver.exe");
            driver = new ChromeDriver();//запуск приложения chromedriver, открывется новое окно браузера
            driver.get("http://www.google.com.ua");
            startPage = new StartPage(driver);
        }

        /**
         * Method for closing Chrome Browser after finishing test execution
         */
        @AfterMethod
        public void afterMethod() {
            driver.quit();
        }

    }

