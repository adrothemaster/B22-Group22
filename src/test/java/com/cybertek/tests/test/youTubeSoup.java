package com.cybertek.tests.test;

import com.cybertek.pages.YoutubePage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class youTubeSoup {

    @BeforeMethod
    public void driverConstructor() {
        Driver.getDriver().get("https://www.youtube.com/");

    }
    @Test
    public void find_soup_newest_video(){

        YoutubePage youtubePage = new YoutubePage();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        wait.until(ExpectedConditions.titleIs("YouTube"));

        youtubePage.searchInput.click();
        BrowserUtils.sleep(1);
        youtubePage.searchInput.sendKeys("soup"+ Keys.ENTER);

        youtubePage.soupFace.click();

        wait.until(ExpectedConditions.titleIs("Soup - YouTube"));
        youtubePage.UploadsTag.click();

        wait.until(ExpectedConditions.titleIs("Soup - YouTube"));
        youtubePage.playAll.click();


        for (int i = 0; i < 10000; i++) {
            wait.until(ExpectedConditions.visibilityOf(youtubePage.Skip));
            if (youtubePage.Skip.isDisplayed()) {
                youtubePage.Skip.click();
            }

        }



    }

}
