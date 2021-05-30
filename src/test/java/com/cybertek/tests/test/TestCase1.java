package com.cybertek.tests.test;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TestCase1 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("wooden spoon" + Keys.ENTER);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Amazon.com : wooden spoon";

        String check = actualTitle.equals(expectedTitle) ? "Passed actual title matches expected" : "Failed actual title dose not match expected";
        System.out.println(check);

    }
}
