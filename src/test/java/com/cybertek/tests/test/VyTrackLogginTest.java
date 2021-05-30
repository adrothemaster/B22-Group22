package com.cybertek.tests.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VyTrackLogginTest {

    public static void main(String[] args) throws Throwable {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa3.vytrack.com/user/login");
        driver.manage().window().maximize();

        driver.findElement(By.id("prependedInput")).sendKeys("user162");// truck driver
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123" + Keys.ENTER);

        Thread.sleep(2000);
        String expectedInTitle = "Dashboard";
        String actualTitle = driver.getTitle();

        String checkTitle = actualTitle.equals(expectedInTitle) ? "PASSED" : "FAILED";
        System.out.println(checkTitle);



    }
}
