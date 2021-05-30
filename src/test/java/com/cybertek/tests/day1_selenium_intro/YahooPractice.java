package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooPractice {
    public static void main(String[] args) {

        //TC #1: Yahoo Title Verification
        //1. Open Chrome browser
        //2. Go to https://www.yahoo.com
        //3. Verify title:
        //   Expected: Yahoo

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.yahoo.com");

        String expectedTitle = "yahoo";

        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("title is as expected");
        }else{
            System.out.println("title is not as expected");
        }
        driver.close();

    }
}
