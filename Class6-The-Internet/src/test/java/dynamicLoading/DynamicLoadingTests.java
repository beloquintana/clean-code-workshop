package dynamicLoading;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample1Page;
import pages.DynamicLoadingExample2Page;
import pages.DynamicLoadingPage;

public class DynamicLoadingTests extends BaseTest {

    private DynamicLoadingPage dynamicLoadingPage;

    @Test
    public void testExample1Load(){
        dynamicLoadingPage = homePage.clickOnDynamicLoadingLink();
        DynamicLoadingExample1Page dynamicLoadingExample1Page = dynamicLoadingPage.clickOnExample1Link();
        dynamicLoadingExample1Page.clickOnStartButton();

        Assert.assertEquals(dynamicLoadingExample1Page.getLoadedText(),"Hello World!");
    }

    @Test
    public void testExample2Load(){
        webDriver.navigate().back();
        DynamicLoadingExample2Page dynamicLoadingExample2Page = dynamicLoadingPage.clickOnExample2Link();
        dynamicLoadingExample2Page.clickOnStartButton();

        Assert.assertEquals(dynamicLoadingExample2Page.getLoadedText(),"Hello World!");
    }
}
