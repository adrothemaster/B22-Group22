package com.cybertek.tests.test;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase3 {
    public static void main(String[] args)throws Throwable {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%22");
                driver.manage().window().maximize();

        String expectedTitle = "Yahoo";
        String actualTitle = driver.getTitle();

        String checkTitle = actualTitle.equals(expectedTitle) ? "PASSED" : "FAILED";

        WebElement userNameBox = driver.findElement(By.xpath("//input[@id='login-username']"));
        userNameBox.sendKeys("batch22@yahoo.com");
        userNameBox.submit();
        Thread.sleep(3000);

        WebElement password = driver.findElement(By.xpath("//input[@id='login-passwd']"));
        password.sendKeys("Feb21@2021");
        Thread.sleep(3000);

        WebElement clickLogIn = driver.findElement(By.xpath("//button[@id='login-signin']"));
        clickLogIn.click();

        String expectedTitle2 = "(8 unread) - batch22@yahoo.com - Yahoo Mail";
        String actualTitle2 = driver.getTitle();

        String checkInboxTitle = actualTitle2.equals(expectedTitle2) ? "PASSED!" : "FAILED!";
        System.out.println(checkInboxTitle);

        Thread.sleep(8000);
        driver.close();
    }
}

// andrey C way
//  WebDriver driver = WebDriverFactory.getDriver("chrome");
//        driver.manage().window().maximize();
//        driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%22);
//
//        String expectedTitle = "Yahoo";
//        String actualTitle = driver.getTitle();
//
//        if (expectedTitle.equals(actualTitle)){
//            System.out.println("verification was successful.");
//        }else{
//            System.out.println("verification had failed");
//        }
//
//        WebElement username = driver.findElement(By.xpath("//input[@id='login-username']"));
//        username.sendKeys("batch22@yahoo.com");
//        Thread.sleep(1000);
//
//        username.submit();
//
////        WebElement signinbutt1 = driver.findElement(By.xpath("//input[@id='login-signin']"));
////        signinbutt1.click();
//
//        Thread.sleep(1000);
//
//        WebElement password = driver.findElement(By.xpath("//input[@id='login-passwd']"));
//        password.sendKeys("Feb21@2021");
//
//        Thread.sleep(1000);
//
////        WebElement signinbutt2 = driver.findElement(By.xpath("//button[@id='login-signin']"));
////        signinbutt2.click();
//        password.submit();
//
//        String expectedTitle2 = "(8 unread) - batch22@yahoo.com - Yahoo Mail";
//        String actualTitle2 = driver.getTitle();
//
//        System.out.println(actualTitle2.equals(expectedTitle2) ? "Pass" : "Fail");
//
//        Thread.sleep(3000);
//
//driver.quit();
//    }
//}
