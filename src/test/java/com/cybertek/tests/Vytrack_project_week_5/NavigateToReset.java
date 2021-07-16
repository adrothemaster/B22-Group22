package com.cybertek.tests.Vytrack_project_week_5;

import com.cybertek.pages.VytrackPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NavigateToReset {

    @BeforeMethod
    public void driverConstructor(){
        Driver.getDriver().get("https://qa3.vytrack.com/user/login");

    }

    @Test
    public void click_reset_button_test(){
        VytrackPage vytrackPage = new VytrackPage();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        //navigate to username and input
        vytrackPage.userName.sendKeys("User165");
        //navigate to password and input
        vytrackPage.Password.sendKeys("UserUser123");
        //click login
        vytrackPage.LogIn.click();
        wait.until(ExpectedConditions.titleIs("Dashboard"));

        // find and select the fleet dropdown selection
        vytrackPage.FleetDropdownLocation.click();
        //locate and select vehicle
        vytrackPage.vehicleSelect.click();
        wait.until(ExpectedConditions.titleIs("Car - Entities - System - Car - Entities - System"));


        // navigate to views per page dropdown
        vytrackPage.ViewPerPage.click();
        //change page views per page to 10
        vytrackPage.ViewPerPage10.click();
        BrowserUtils.sleep(2);

        //verifying views on page has been changed to 10
        String expectedInViews = "10";
        String actualViews = vytrackPage.ViewPerPage.getText();
        Assert.assertEquals(actualViews,expectedInViews);


        vytrackPage.resetButton.click();
        BrowserUtils.sleep(2);

        // verifying views on page has been changed back to 25
        String expectedViewsAfter = "25";
        String actualViewsAfter = vytrackPage.ViewPerPage.getText();
        Assert.assertEquals(actualViewsAfter,expectedViewsAfter);

    }
    @AfterMethod
    public void tearDownMethod(){
       // Driver.closeDriver();
    }

}
