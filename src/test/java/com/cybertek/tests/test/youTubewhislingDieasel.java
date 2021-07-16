package com.cybertek.tests.test;

import com.cybertek.pages.YoutubePage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class youTubewhislingDieasel {

    @BeforeMethod
    public void driverConstructor() {
        Driver.getDriver().get("https://www.youtube.com/");

    }
    @Test
    public void find_whistling_diesels_newest_video(){

        YoutubePage youtubePage = new YoutubePage();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        wait.until(ExpectedConditions.titleIs("YouTube"));

        youtubePage.searchInput.click();
        BrowserUtils.sleep(1);
        youtubePage.searchInput.sendKeys("whistling diesel"+ Keys.ENTER);

        youtubePage.WhistlingDieselPage.click();

        wait.until(ExpectedConditions.titleIs("whistling diesel - YouTube"));
        youtubePage.UploadsTag.click();

        wait.until(ExpectedConditions.urlToBe("https://www.youtube.com/channel/UCdqp0KK_Io7TwK5cJMBvB0Q/videos?view=0&sort=dd&shelf_id=0"));
        youtubePage.playAll.click();

        youtubePage.Skip.click();

        //for (int i = 0; i < 10000; i++) {
           // wait.until(ExpectedConditions.visibilityOf(youtubePage.Skip));
         //   BrowserUtils.sleep(5);
         //   if (youtubePage.Skip.isDisplayed()) {
         //       youtubePage.Skip.click();
         //   }

      //  }

    }

}
