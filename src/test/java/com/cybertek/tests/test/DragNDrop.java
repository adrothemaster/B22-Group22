package com.cybertek.tests.test;

import com.cybertek.pages.TelerikPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragNDrop {
    //TC #16: Hover Test1.Go to https://demos.telerik.com/kendo-ui/dragdrop/index
    // Drag and drop the small circle to bigger circle
    // .3.Assert: -Text in big circle changed to:
    // “You did great!”
    WebDriver driver;
    @BeforeMethod
    public static void DriverGo(){
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
    }
    @Test
    public static void telerik_drag_n_drop(){

        TelerikPage telerikPage = new TelerikPage();
        Actions actions = new Actions(Driver.getDriver());
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        BrowserUtils.sleep(2);
        wait.until(ExpectedConditions.elementToBeClickable(telerikPage.acceptCookiesButton));
        telerikPage.acceptCookiesButton.click();

        actions.dragAndDrop(telerikPage.smallCircle, telerikPage.bigCircle).perform();

        String expected = "You did great!";
        String actual = telerikPage.bigCircle.getText();
        Assert.assertEquals(actual,expected);



    }
}
