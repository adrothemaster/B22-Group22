package com.cybertek.tests.test;

import com.cybertek.pages.YoutubePage;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class randomYouTubeVideo {

    @BeforeMethod
    public void driverConstructor() {
        Driver.getDriver().get("https://www.youtube.com/");
    }
    @Test
    public void randomVideo(){
        YoutubePage youtubePage = new YoutubePage();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 1000);

        wait.until(ExpectedConditions.titleIs("YouTube"));

        youtubePage.searchInput.click();

        youtubePage.searchInput.sendKeys("most adds in one video" + Keys.ENTER);
        //wait.until(ExpectedConditions.titleIs("most adds one one video - YouTube"));
        youtubePage.OneHundredAdsInOneVideo.click();


       for (int i = 0; i < 10000; i++) {
            //Driver.remindHeapOfSomething();
            wait.until(ExpectedConditions.visibilityOf(youtubePage.randomYouTubePopUpAddLocator));
            if (youtubePage.randomYouTubePopUpAddLocator.isDisplayed()) {
                youtubePage.randomYouTubePopUpAddLocator.click();
            }

        }

    }
}
