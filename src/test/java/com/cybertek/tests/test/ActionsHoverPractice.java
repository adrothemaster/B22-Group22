package com.cybertek.tests.test;

import com.cybertek.utilities.Driver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsHoverPractice {

    //TC #15: Hover Test1.Go to
    // 2.Hover over to first image
    // 3.Assert: a.“name: user1” is displayed
    // 4.Hover over to second image
    // 5.Assert: a.“name: user2” is displayed
    // 6.Hover over to third image
    // 7.Confirm: a.“name: user3” is displayed


    @BeforeMethod
    public static void configuration_webpage(){
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");
    }

    @Test
    public void hoverPractice(){
//        HoverPage hoverPage = new HoverPage();
//        Actions actions = new Actions(Driver.getDriver());
//
//        actions.moveToElement(hoverPage.img1).perform();
//        Assert.assertTrue(hoverPage.user1.isDisplayed());
//
//        actions.moveToElement(hoverPage.img2).perform();
//        Assert.assertTrue(hoverPage.user2.isDisplayed());
//
//        actions.moveToElement(hoverPage.img3).perform();
//        Assert.assertTrue(hoverPage.user3.isDisplayed());



        // have a good night :)


//        for next java class HoverPage
//
//         public HoverPage(){
//            PageFactory.initElements(Driver.getDriver(),this);
//        }
//
//        @FindBy(xpath = "//div[@class='figure'][1]")
//        public WebElement img1;
//
//        @FindBy(xpath = "//h5[.='name: user1']")
//        public WebElement user1;
//
//        @FindBy(xpath = "//div[@class='figure'][2]")
//        public WebElement img2;
//
//        @FindBy(xpath = "//h5[.='name: user2']")
//        public WebElement user2;
//
//        @FindBy(xpath = "//div[@class='figure'][3]")
//        public WebElement img3;
//
//        @FindBy(xpath = "//h5[.='name: user3']")
//        public WebElement user3;



    }
}
