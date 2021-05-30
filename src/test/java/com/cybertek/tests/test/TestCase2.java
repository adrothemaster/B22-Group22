package com.cybertek.tests.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {
    public static void main(String[] args)throws Throwable {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();


        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("blue - one love" + Keys.ENTER);
        Thread.sleep(3000);



    }
}
// WebDriver driver = WebDriverFactory.getDriver("chrome");
//        driver.manage().window().maximize();
//        driver.get("https://www.youtube.com/%22);
//        WebElement searchBox = driver.findElement(By.xpath("//input[@id = 'search']"));
//        searchBox.sendKeys("Blue - One Love");
//        Thread.sleep(3000);
//        searchBox.submit();
//        Thread.sleep(3000);
//        WebElement clip =  driver.findElement(By.cssSelector("yt-formatted-string[aria-label='Blue - One Love" +
//                " (Official Music Video) by Relie Helei 4 years ago 3 minutes, 32 seconds 1,095,458 views']"));
//        clip.click();
//    }
//}
