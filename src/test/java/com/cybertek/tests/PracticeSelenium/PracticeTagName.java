package com.cybertek.tests.PracticeSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTagName {
    public static void main(String[] args)throws Throwable {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        String url = "https://www.google.com";
        driver.get(url);
        WebElement input = driver.findElement(By.tagName("a"));
        System.out.println(input.getText());
        driver.close();

    }
}
