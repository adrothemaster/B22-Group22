package com.cybertek.tests.PracticeSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args)throws Throwable {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        String url = "https://www.google.com/";
        String url2 = "https://www.amazon.com/";

        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.navigate().to(url2);
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);

        driver.navigate().forward();
        Thread.sleep(3000);

        driver.navigate().refresh();
        Thread.sleep(3000);

        driver.close();



    }
}
