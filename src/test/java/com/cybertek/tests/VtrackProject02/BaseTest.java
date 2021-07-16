package com.cybertek.tests.VtrackProject02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected static ThreadLocal<ChromeDriver> driver = new ThreadLocal<>();

    @BeforeMethod

    public void setup(){

        WebDriverManager.chromedriver().setup();
        driver.set(new ChromeDriver());

        driver().get("https://qa3.vytrack.com/user/login");

        driver().manage().window().maximize();

    }

    public WebDriver driver(){
        return driver.get();
    }

    @AfterMethod

    public void tearDown(){
        driver().close();
    }

}

