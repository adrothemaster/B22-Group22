package com.cybertek.tests.day8_windows_javafaker;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MultipleWindowsPractice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");
    }
    @Test
    public void multiple_window_test(){
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");



        for (String each: driver.getWindowHandles()){
            driver.switchTo().window(each);
            System.out.println("title in current page: " + driver.getTitle());

            if (driver.getTitle().contains("Etsy")){
                break;
            }

        }






    }
}
