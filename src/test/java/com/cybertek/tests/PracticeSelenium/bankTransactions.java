package com.cybertek.tests.PracticeSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class bankTransactions {

    public static void main(String[] args) throws InterruptedException {

        //12. Locate description space and insert "Save someone from Bankruptcy :)" and CLICK Submit Button
        //_____________________________________________________________________________________________
        //1. Open Google Browser......
        //2. Go to http://zero.webappsecurity.com/   and make the screen full screen........
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/");

        driver.manage().window().maximize();

        //3. Click on the Sign In Button.........
        driver.findElement(By.id("signin_button")).click();


        //4. Locate USERNAME and PASSWORD spaces........
        //5. Send keys for both login credential spaces - meaning for Username and Password.....
        driver.findElement(By.id("user_login")).sendKeys("username");
        driver.findElement(By.id("user_password")).sendKeys("password" + Keys.ENTER);

        //6. Access to the login page / dashboard right after entering keys......
        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.id("proceed-link")).click();

        //7. Check the Page Title and make sure that is the expected Title with condition.......

        String actualTitle = driver.getTitle();
        String expectedTitle = "Zero - Account Summary";

        if (actualTitle.equals("Zero - Account Summary")) {
            System.out.println("Passed!!!!");
        }else{
            System.out.println("Failed!!!!!");
        }
        //8. Switch among the TABS and come to the TRANSFER FUNDS tab........

        driver.findElement(By.id("transfer_funds_tab")).click();


        //9. Locate From Account and Choose the Savings account with "$ 1548"
        //10. Locate  To Account andChoose the account with  "-$500.2"
        WebElement dropDownMenuSave = driver.findElement(By.id("tf_fromAccountId"));

        dropDownMenuSave.click();

        Select savings = new Select(dropDownMenuSave);
        savings.selectByValue("3");
        Thread.sleep(2000);

        WebElement dropDownMenuCheckings = driver.findElement(By.id("tf_toAccountId"));
        Thread.sleep(2000);
        dropDownMenuCheckings.click();

        Select Checkings = new Select(dropDownMenuCheckings);
        Checkings.selectByValue("2");
        Thread.sleep(2000);

        //11. Locate Amount space and Insert "$750"........
        driver.findElement(By.id("tf_amount")).sendKeys("750");
        Thread.sleep(2000);

        //12. Locate description space and insert "Save someone from Bankruptcy :)" and CLICK Submit Button......
        driver.findElement(By.id("tf_description")).sendKeys("Save someone from Bankruptcy :)");
        Thread.sleep(2000);

        driver.findElement(By.id("btn_submit")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("btn_submit")).click();


        String submitTitle = driver.getTitle();
        String expectedSubmitTitle = "Zero - Transfer Funds";

        if (expectedSubmitTitle.equals(submitTitle)){
            System.out.println("Passed!!!!!");
        }else{
            System.out.println("Failed!!!!");
        }

        Thread.sleep(2000);
        driver.get("https://giphy.com/clips/fazeclan-celebration-birthday-happy-fWBiMUGXGHBECOJ50Q");

    }
}
