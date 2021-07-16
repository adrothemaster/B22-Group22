package com.cybertek.tests.test;

import com.cybertek.pages.amazonWoodenSpoonPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class amazonWoodenSpoonBuy {

    /**
     * search for wooden spoon click enter...done...
     * navigate the page to find wooden spoon for under 15$...done...
     * add to chart
     * proceed to check out
     */

    @BeforeMethod
    public static void amazon_constructor(){
        Driver.getDriver().get("https://www.amazon.com/");
    }
    @Test
    public void woodenSpoonBuy(){
        amazonWoodenSpoonPage amazonWoodenSpoonpage = new amazonWoodenSpoonPage();
        Actions actions = new Actions(Driver.getDriver());
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        amazonWoodenSpoonpage.searchBarLocator.sendKeys("wooden spoon"+ Keys.ENTER);

        amazonWoodenSpoonpage.minPriceLocator.sendKeys("5");
        amazonWoodenSpoonpage.maxPriceLocator.sendKeys("15");
        amazonWoodenSpoonpage.goButtonLocator.click();

        amazonWoodenSpoonpage.RiveiraWoodenSpoon.click();
        Driver.getDriver().navigate().back();
        BrowserUtils.sleep(1);
        amazonWoodenSpoonpage.faaySpoonLocator.click();
        Driver.getDriver().navigate().back();
        BrowserUtils.sleep(1);
        amazonWoodenSpoonpage.faaySpoonLocator2.click();
        Driver.getDriver().navigate().back();
        BrowserUtils.sleep(1);
        amazonWoodenSpoonpage.oxoSpoonLocator.click();
        Driver.getDriver().navigate().back();
        BrowserUtils.sleep(1);
        amazonWoodenSpoonpage.woodenKitchenSpoon.click();
        Driver.getDriver().navigate().back();
        BrowserUtils.sleep(1);
        amazonWoodenSpoonpage.smallWoodenSpoonsLocator.click();

        amazonWoodenSpoonpage.addToCartButton.click();
       // amazonWoodenSpoonpage.proceedToCheckoutLocator.click();
        amazonWoodenSpoonpage.proceedByName.click();




    }
}
