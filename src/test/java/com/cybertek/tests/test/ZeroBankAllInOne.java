package com.cybertek.tests.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ZeroBankAllInOne {

    public static void main(String[] args) throws Throwable{

        //1. Open Google Browser
        //
        //2. Go to http://zero.webappsecurity.com/   and make the screen full screen
        //
        //3. Click on the Sign In Button
        //
        //4. Locate USERNAME and PASSWORD spaces
        //
        //5. Send keys for both login credential spaces - meaning for Username and Password
        //
        //6. Access to the login page / dashboard right after entering keys.
        //
        //7. Check the Page Title and make sure that is the expected Title with condition
        //
        //8. Switch among the TABS and come to the TRANSFER FUNDS tab
        //
        //9. Locate From Account and Choose the Savings account with "$ 1548"
        //
        //10. Locate  To Account andChoose the account with  "-$500.2"
        //
        //11. Locate Amount space and Insert "$750"
        //
        //12. Locate description space and insert "Save someone from Bankruptcy :)" and CLICK Submit Button

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/");

        driver.manage().window().maximize();

        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        Thread.sleep(2000);
        driver.findElement(By.id("signin_button")).click();

        driver.findElement(By.id("user_login")).sendKeys("username");
        driver.findElement(By.id("user_password")).sendKeys("password"+ Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.id("details-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("proceed-link")).click();
        Thread.sleep(2000);


        String actualTitle = driver.getTitle();
        String expectedTitle = "Zero - Account Summary";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("PASSED! VERIFICATION PASSED!!!");
        }else{
            System.out.println("FAILED! VERIFICATION FAILED!!!");
        }

        driver.findElement(By.id("transfer_funds_tab")).click();
        Thread.sleep(2000);
        WebElement dropDownMenuSave = driver.findElement(By.id("tf_fromAccountId"));
        Thread.sleep(2000);
        dropDownMenuSave.click();

        Select savings = new Select(dropDownMenuSave);
        savings.selectByValue("3");
        Thread.sleep(2000);

        WebElement dropDownMenuChecking = driver.findElement(By.id("tf_toAccountId"));
        dropDownMenuChecking.click();
        Thread.sleep(2000);

        Select checkings = new Select(dropDownMenuChecking);
        checkings.selectByValue("2");
        Thread.sleep(2000);

        driver.findElement(By.id("tf_amount")).sendKeys("750");
        Thread.sleep(2000);

        driver.findElement(By.id("tf_description")).sendKeys("Save someone from Bankruptcy :)");
        Thread.sleep(2000);

        driver.findElement(By.id("btn_submit")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("btn_submit")).click();

        String submitTitle = driver.getTitle();
        String expectedSubmitTitle = "Zero - Transfer Funds";

        if (expectedSubmitTitle.equals(submitTitle)){
            System.out.println("You've transferred your money Correctly!!!!!");
        }else{
            System.out.println("Money not transferred Correctly: Failed!!!!");
        }

        Thread.sleep(2000);
        driver.get("https://giphy.com/clips/fazeclan-celebration-birthday-happy-fWBiMUGXGHBECOJ50Q");








    }
}
