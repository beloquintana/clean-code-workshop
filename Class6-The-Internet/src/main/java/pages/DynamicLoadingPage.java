package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicLoadingPage {
    private WebDriver webDriver;
    private By example1Link = By.linkText("Example 1: Element on page that is hidden");
    private By example2Link = By.linkText("Example 2: Element rendered after the fact");

    public DynamicLoadingPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public DynamicLoadingExample1Page clickOnExample1Link(){
        WebElement element = webDriver.findElement(example1Link);
        element.click();
        return new DynamicLoadingExample1Page(webDriver);
    }

    public DynamicLoadingExample2Page clickOnExample2Link(){
        WebElement element = webDriver.findElement(example2Link);
        element.click();
        return new DynamicLoadingExample2Page(webDriver);
    }
}
