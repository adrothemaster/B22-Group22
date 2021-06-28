package com.cybertek.tests.test;

import com.cybertek.tests.VtrackProject02.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class VtrackTest06_06_2021 extends BaseTest {

    @Test

    public void vTruck() throws InterruptedException {

        driver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver().findElement(By.xpath("//input[@id='prependedInput']")).sendKeys("user168");

        WebElement passWord = driver().findElement(By.xpath("//input[@type='password']"));
        passWord.sendKeys("UserUser123"+ Keys.ENTER);
        Thread.sleep(1000);
        driver().navigate().refresh();

        List<WebElement> activitiesButton = driver().findElements(By.xpath("//span[@class='title title-level-1']"));
        activitiesButton.get(2).click();

        Thread.sleep(3000);

        driver().findElement(By.xpath("//span[.='Calendar Events']")).click();

        Thread.sleep(3000);

        WebElement reset = driver().findElement(By.xpath("//i[@class='fa-repeat']"));
        reset.click();


        Thread.sleep(3000);

        WebElement calendarEvent = driver().findElement(By.xpath("//a[@title='Create Calendar event']"));
        Thread.sleep(1000);
        calendarEvent.click();

        driver().findElement(By.xpath("//input[@data-name='field__title']")).sendKeys("Truck Driver");
        Thread.sleep(1000);
        driver().findElement(By.xpath("//button[@class='btn btn-success action-button']")).click();

    }
}

