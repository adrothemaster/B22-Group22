package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YoutubePage {

    public YoutubePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    // search field in youtube
    @FindBy(xpath = "//input[@id='search']")
    public WebElement searchInput;

    //play all function in youtube
    @FindBy(xpath = "//tp-yt-paper-button[@aria-label='Play all']")
    public WebElement playAll;

    // upload location in youtube
    @FindBy(partialLinkText = "Uploads")
    public WebElement UploadsTag;

    @FindBy(xpath = "//div[@class='ytp-ad-text ytp-ad-skip-button-text']")
    public WebElement Skip;

    /**
     * random video
     */
    @FindBy(xpath = "//ytd-rich-item-renderer[@class='style-scope ytd-rich-grid-renderer'][1]")
    public WebElement randomVideoNumberOneOnPage;

    @FindBy(xpath = "(//button[@class='ytp-ad-overlay-close-button'])[3]")
    public WebElement randomYouTubePopUpAddLocator;

    @FindBy(linkText = "100 Ads In One Video")
   public WebElement OneHundredAdsInOneVideo;

    /**
     * ------------------------------------------------------------------------------------
     *  soups youtube selection specific
     */


    @FindBy(xpath = "//img[@src='//yt3.ggpht.com/ytc/AKedOLR-5ElMuNjHtcbMhIUKvYuuI3kkyOcBRbbXcvYArQ=s176-c-k-c0x00ffffff-no-rj-mo']")
    public WebElement soupFace;

    /**
     * ------------------------------------------------------------------------------------
     * Whistling diesel page links
     */


     @FindBy(xpath = "//img[@src='//yt3.ggpht.com/ytc/AKedOLRknH41_tVuVOZXqQmImwNJxr-mpf0F2I0UObJPAQ=s176-c-k-c0x00ffffff-no-rj-mo']")
     public WebElement WhistlingDieselPage;



}