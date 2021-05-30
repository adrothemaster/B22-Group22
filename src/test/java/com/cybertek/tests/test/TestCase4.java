package com.cybertek.tests.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase4 {
    public static void main(String[] args)throws Throwable {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cargurus.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//select[@id='carPickerUsed_makerSelect']")).click();
        Thread.sleep(1000);
        WebElement dropDownMenu = driver.findElement(By.xpath("//select//option[@value='m3']"));
        Thread.sleep(1000);
        dropDownMenu.click();


    }
}

//
