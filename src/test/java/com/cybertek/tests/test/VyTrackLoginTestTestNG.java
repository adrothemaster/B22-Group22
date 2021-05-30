package com.cybertek.tests.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VyTrackLoginTestTestNG {

    static WebDriver driver;

    @AfterMethod
    public void  Close () {
        driver.close();

    }
    @BeforeMethod
    public void setUp (){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://qa3.vytrack.com/user/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void Test1_Positive_Test_Login() throws InterruptedException {

        driver.findElement(By.id("prependedInput")).sendKeys("user162");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123" + Keys.ENTER);

        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String expectedInTitle = "Dashboard";
        String actualTitle = driver.getTitle();

        Thread.sleep(2000);
        String checkTitle = actualTitle.equals(expectedInTitle) ? "PASSED" : "FAILED";
        System.out.println(checkTitle);

        Thread.sleep(2000);
        Assert.assertEquals(actualTitle, expectedInTitle);
    }
    @Test
    public void Test2_Negative_Test_Login() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.id("prependedInput")).sendKeys("TruckDriver");// not functional
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123" + Keys.ENTER);

        WebElement errorMessageElement = driver.findElement(By.xpath("//div[@class='alert alert-error']"));
        String errorMessage = errorMessageElement.getText();
        System.out.println(errorMessage);

        Thread.sleep(2000);
        Assert.assertEquals(errorMessage,"Invalid user name or password.");
    }
}
