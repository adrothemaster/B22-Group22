package com.cybertek.tests.day12_actions_upload_jsexecuter;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsPractices {

    @Test
    public void tc15_actions_hover(){

        //1. Go	to	http://practice.cybertekschool.com/hovers
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");

        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement img2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement img3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));

        //locating user text
        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));

        BrowserUtils.sleep(2);

        Actions actions = new Actions(Driver.getDriver());

        //2. Hover	over	to	first	image
        actions.moveToElement(img1).perform();
        //3. Assert:
        //a. “name:	user1”	is	displayed
        Assert.assertTrue(user1.isDisplayed(), "user1 failed to assert: failed");

        //4. Hover	over	to	second	image
        actions.moveToElement(img2).perform();

        //5. Assert:
        //a. “name:	user2”	is	displayed
        Assert.assertTrue(user2.isDisplayed(), " user2 failed to assert: failed");

        //6. Hover	over	to	third	image
        actions.moveToElement(img3).perform();

        //7. Confirm:
        //a. “name:	user3”	is	displayed
        Assert.assertTrue(user3.isDisplayed(), " user1 failed to assert: failed");




    }

    @Test
    public void scrolling_test(){

        // Go to http://practice.cybertekschool.com/
        Driver.getDriver().get("http://practice.cybertekschool.com/");

        // Scroll down to "Powered By Cybertek School"
        Actions actions = new Actions(Driver.getDriver());

        //Locate "Powered By Cybertek School"
        WebElement cybertekSchoolLink = Driver.getDriver().findElement(By.linkText("Cybertek School"));

        //Scroll using actions object
        BrowserUtils.sleep(2);
        actions.moveToElement(cybertekSchoolLink).perform();

        //Scrolling up using Keys.Page_UP button
        BrowserUtils.sleep(2);
        actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP).perform();

//        BrowserUtils.sleep(2);
//        actions.sendKeys(Keys.PAGE_UP).perform();

        BrowserUtils.sleep(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();


    }
}
