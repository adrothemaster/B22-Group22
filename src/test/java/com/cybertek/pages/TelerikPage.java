package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TelerikPage {

    public TelerikPage() {
        // creating constructor
        PageFactory.initElements(Driver.getDriver(), this);

    }
    // finding small ball on page
    @FindBy(id = "draggable")
    public WebElement smallCircle;

    // finding big ball on page
    @FindBy(id = "droptarget")
    public WebElement bigCircle;

    // finding cookies accept button
    @FindBy(id = "onetrust-accept-btn-handler")
    public WebElement acceptCookiesButton;


}
