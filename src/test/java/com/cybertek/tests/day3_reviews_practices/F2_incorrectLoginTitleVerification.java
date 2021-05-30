package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2_incorrectLoginTitleVerification {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        WebElement inputUsername = driver.findElement(By.id("email"));

        inputUsername.sendKeys("something123@gmail.com");

        WebElement inputPassword = driver.findElement(By.id("pass"));

        inputPassword.sendKeys(("some wrong password" + Keys.ENTER));

        String expectedTitle = "log into facebook";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("login passed!");
        }else{
            System.out.println("login failed!");
        }



    }
}


