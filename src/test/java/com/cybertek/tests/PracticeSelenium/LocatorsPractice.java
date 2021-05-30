package com.cybertek.tests.PracticeSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LocatorsPractice {
    public static void main(String[] args)throws Throwable {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");

        WebElement btn1 = driver.findElement(By.id("gbqfbb"));
        btn1.click();
        String actualText = btn1.getAttribute("value");
        String expectedText = "I'm Feeling Lucky";
        if (actualText.equals(expectedText)){
            System.out.println("passed!");
        }else{
            System.out.println("failed");
            System.out.println("expected text: " +expectedText);
            System.out.println("actual text: " + actualText);
        }
        Thread.sleep(5000);
        driver.close();

    }
}
