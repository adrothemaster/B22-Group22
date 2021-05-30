package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F3_HeaderVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://facebook.com");

        WebElement header = driver.findElement(By.className("_8eso"));

        String expectedTitle = "Connect with friends and the world around you on Facebook.";
        String actualTitle = header.getText();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("header verification passed");
        }else{
            System.out.println("header verification failed");
        }


    }
}
