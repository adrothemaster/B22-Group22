package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {
    WebDriver driver;


    @BeforeClass
    public void setupClass(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

    }
        @Test
        public void tc1_simple_dropdown_test(){
            Select simpledropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

            WebElement currentlySelectedOption = simpledropdown.getFirstSelectedOption();
            String actualTextOfCurrentOption = currentlySelectedOption.getText();
            String expectedText = "Please select an option";

            Assert.assertTrue(actualTextOfCurrentOption.equals(expectedText));

            // below is an option but not one that's recommended looks ugly!!!
            //Assert.assertEquals(simpledropdown.getFirstSelectedOption().getText(), "Please select an option");

            Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
            // or i can use... Select stateDropdown = new Select(driver.findElement(By.id("state")));

            String actualStateDropdownText = stateDropdown.getFirstSelectedOption().getText();
            String expectedStateDropdownText = "Select a State";

            Assert.assertEquals(actualStateDropdownText,expectedStateDropdownText);


    }
    @AfterClass
    public void tearDownClass(){
        driver.close();
    }

    @Test
    public void tc2_state_dropdown_test(){

        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        //select by text == "ILLINOIS"
        stateDropdown.selectByVisibleText("Illinois");
        //select by value == "VA"
        stateDropdown.selectByValue("VA");
        //select by index o,1,2,3,4,5 == "5"
        stateDropdown.selectByIndex(5);

        // verify last option selected is California
        String expectedOptionText = "California";
        String actualOptionText = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionText,expectedOptionText,
                "this message will be printed if the test is failing to pass: Assertion FAILS");




    }
}

