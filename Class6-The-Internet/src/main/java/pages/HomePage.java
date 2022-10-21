package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver webDriver;
    private By dynamicLoadingLink = By.linkText("Dynamic Loading");

    public HomePage(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public DynamicLoadingPage clickOnDynamicLoadingLink(){
        WebElement element = webDriver.findElement(dynamicLoadingLink);
        element.click();
        return new DynamicLoadingPage(webDriver);
    }
}
