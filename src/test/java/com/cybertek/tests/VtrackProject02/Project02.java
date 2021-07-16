package com.cybertek.tests.VtrackProject02;

import com.cybertek.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Project02 extends BaseTest{

    @Test

    public void vTruck() {

        driver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // Input user name
        driver().findElement(By.xpath("//input[@id='prependedInput']")).sendKeys("user162");
        // input password
        WebElement passWord = driver().findElement(By.xpath("//input[@type='password']"));
        passWord.sendKeys("UserUser123"+ Keys.ENTER);

        //refresh page to remove pop up
        driver().navigate().refresh();

        //navigate to activities drop down
        List<WebElement> Activities = driver().findElements(By.xpath("//span[@class='title title-level-1']"));
        BrowserUtils.sleep(1);
        // click activities
        Activities.get(2).click();
        BrowserUtils.sleep(1);
        // navigate to calender events and click
        driver().findElement(By.xpath("/html/body/div[2]/div[2]/header/div[2]/ul/li[3]/div/div/ul/li[3]/a")).click();
        BrowserUtils.sleep(1);
        // locate table body within events
        WebElement Table = driver().findElement(By.xpath("//tbody[@class='grid-body']"));////tr[@class='grid-row row-click-action']
        //locate Table rows within body
        List<WebElement> rowsTable = Table.findElements(By.tagName("tr"));
        //count table rows by size of list
        int rowsCount = rowsTable.size();
        // print number of events at the beginning via rows count
        System.out.println("number of events at Beginning = " + rowsCount);

        BrowserUtils.sleep(1);
        // navigate and locate fleet dropdown
        List<WebElement> fleetToVehicles = driver().findElements(By.xpath("//span[@class='title title-level-1']"));
        BrowserUtils.sleep(1);
        // click fleet to open dropdown
        fleetToVehicles.get(0).click();
        BrowserUtils.sleep(1);
        // locate and select vehicle within drop down
        WebElement VehicleSelect = driver().findElement(By.xpath("//li[@class='dropdown-menu-single-item first']"));
        //click vehicle selection
        VehicleSelect.click();

        BrowserUtils.sleep(1);
        // verifying page is correct with expectTitle and ActualTitle
        String expectedInTitle = "Car - Entities - System - Car - Entities - System";//is not unique
        String ActualTitle = driver().getTitle();
        // asserting that expectTitle == ActualTitle
        Assert.assertEquals(expectedInTitle,ActualTitle);

        // locating and selecting #7 in vehicle table row and clicking it
        WebElement carType = driver().findElement(By.xpath("//tr[@class='grid-row row-click-action'][7]"));
        carType.click();
        BrowserUtils.sleep(1);

        // verifying page is correct with expectTest and ActualTest
        String expectedText = "Entities";
        String ActualText = driver().findElement(By.xpath("//a[.='Entities']")).getText();
        // asserting that expectTest == ActualTest
        Assert.assertEquals(expectedText,ActualText);
        BrowserUtils.sleep(1);

        // locating add events button and clicking on it
        driver().findElement(By.xpath("//a[@class='btn icons-holder-text no-hash']")).click();
        BrowserUtils.sleep(1);

        // locate title within event and add text my rental
        driver().findElement(By.xpath("//input[@data-name='field__title']")).sendKeys("my rental");
        BrowserUtils.sleep(1);

        // locate save button and click
        WebElement save = driver().findElement(By.xpath("//button[@class='btn btn-primary']"));
        save.click();
        BrowserUtils.sleep(1);

        // navigate back to vehicle list
        driver().navigate().back();
        BrowserUtils.sleep(1);

        //navigate to activities drop down
        List<WebElement> Activities2 = driver().findElements(By.xpath("//span[@class='title title-level-1']"));
        BrowserUtils.sleep(1);
        // click activities
        Activities2.get(2).click();
        BrowserUtils.sleep(1);
        // navigate to calender events and click
        driver().findElement(By.xpath("/html/body/div[2]/div[2]/header/div[2]/ul/li[3]/div/div/ul/li[3]/a")).click();
        BrowserUtils.sleep(1);
        // locate table body within events
        WebElement Table2 = driver().findElement(By.xpath("//tbody[@class='grid-body']"));////tr[@class='grid-row row-click-action']
        //locate Table rows within body
        List<WebElement> rowsTable2 = Table2.findElements(By.tagName("tr"));
        //count table rows by size of list
        int rowsCount2 = rowsTable2.size();
        // print number of events at the End via rows count this will verify that an event was added and saved
        System.out.println("number of events at End = " + rowsCount2);

        // navigating back to vehicle selection page
        driver().navigate().back();
        BrowserUtils.sleep(1);

        //locate next page button and clicking next
        driver().findElement(By.xpath("//i[@class='fa-chevron-right hide-text']")).click();
        BrowserUtils.sleep(1);
        //locate rest button and clicking reset
        WebElement reset = driver().findElement(By.xpath("//a[@class='action btn reset-action mode-text-only']"));
        reset.click();
        BrowserUtils.sleep(1);

        // this next part will verify that when the reset button is pushed it will check to see if the page has been reset to page #1
        WebElement ActualNumber = driver().findElement(By.xpath("//input[@type='number']"));
        WebElement expectedNumber = driver().findElement(By.xpath("//input[@value='1']"));

        Assert.assertEquals(expectedNumber,ActualNumber);
        BrowserUtils.sleep(1);
    }
}

