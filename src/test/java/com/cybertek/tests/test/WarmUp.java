package com.cybertek.tests.test;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class WarmUp {
    public static void main(String[] args)throws Throwable {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://qa3.vytrack.com/user/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Login";

        String check = actualTitle.equals(expectedTitle) ? "Passed actual title matches expected" : "Failed actual title dose not match expected";
        System.out.println(check);

        WebElement userNameLoginPage = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        userNameLoginPage.sendKeys("Storemanager201");

        WebElement passwordLoginPage = driver.findElement(By.xpath("//input[@type='password']"));
        passwordLoginPage.sendKeys("UserUser123");
        passwordLoginPage.submit();



        String ActualTitle02 = driver.getTitle();
        String ExpectedTitle02 = "Dashboard";
        System.out.println(ActualTitle02);



        String check2 = ActualTitle02.equals(ExpectedTitle02) ? "Passed" : "Failed";
        System.out.println(check2);

        String checkLoginDashboard = ActualTitle02.equals(actualTitle) ? "Failed" : "Passed";
        System.out.println(checkLoginDashboard);



    }
}
