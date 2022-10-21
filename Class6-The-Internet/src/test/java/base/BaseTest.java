package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import pages.HomePage;

public class BaseTest {
    protected WebDriver webDriver;
    protected HomePage homePage;

    @BeforeSuite
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(webDriver);
    }

    @AfterSuite
    public void tearDown(){
        if(webDriver != null)
            webDriver.quit();
    }
}
