package com.cybertek.tests.test;

import com.cybertek.pages.VytrackPage;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class newVyTrackProject07_11_2021 {
/**
 * Store Manager
 * user162 , user163 , user164
 *  pass word UserUser123
 *
 */

    @BeforeMethod
    public static void VytrackStart(){
        Driver.getDriver().get("https://qa3.vytrack.com/user/login");
    }

    @Test
    public void blabla1(){

        VytrackPage Vytrack = new VytrackPage();
        Actions actions = new Actions(Driver.getDriver());
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        // WebDriverWait wait = new WebDriverWait(driver,30);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));

        Vytrack.userName.sendKeys("storemanager95");
        Vytrack.Password.sendKeys("UserUser123");
        Vytrack.LogIn.click();

        wait.until(ExpectedConditions.visibilityOf(Vytrack.getStoreManagerFleetSelector)).click();
        wait.until(ExpectedConditions.elementToBeClickable(Vytrack.storeManagerVehicleContracts)).click();

        wait.until(ExpectedConditions.elementToBeClickable(Vytrack.storeManagerCreateVehicleContractButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(Vytrack.storeManagerVehicleContractsCancel)).click();

        wait.until(ExpectedConditions.elementToBeClickable(Vytrack.storeManagerChooseVariable)).click();
        wait.until(ExpectedConditions.elementToBeClickable(Vytrack.storeManagerEditButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(Vytrack.storeMangerDeleteButton)).click();


    }


}




