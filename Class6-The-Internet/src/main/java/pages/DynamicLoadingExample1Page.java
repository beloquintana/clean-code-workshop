package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingExample1Page {
    private WebDriver webDriver;
    private By startButton = By.xpath("//*[@id=\"start\"]/button");
    private By loadedText = By.xpath("//*[@id=\"finish\"]/h4");

    public DynamicLoadingExample1Page(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public void clickOnStartButton(){
        WebElement element = webDriver.findElement(startButton);
        element.click();
        WebDriverWait wait = new WebDriverWait(webDriver, 5);
        wait.until(ExpectedConditions.visibilityOf(webDriver.findElement(loadedText)));
    }

    public String getLoadedText(){
        WebElement element = webDriver.findElement(loadedText);
        return element.getText();
    }
}
