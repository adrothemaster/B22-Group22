package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonWoodenSpoonPage {


    public amazonWoodenSpoonPage(){PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy (xpath = "//input[@id='twotabsearchtextbox']")


    public WebElement searchBarLocator;

    @FindBy (xpath = "//input[@placeholder='Min']")
    public WebElement minPriceLocator;

    @FindBy (xpath = "//input[@id='high-price']")
    public WebElement maxPriceLocator;

    @FindBy (xpath = "//span[@id='a-autoid-1']")
    public WebElement goButtonLocator;

    @FindBy (css = "img[src='https://m.media-amazon.com/images/I/61LAafkn1nL._AC_UL320_.jpg']")
    public WebElement faaySpoonLocator;

    @FindBy (css = "a[class='a-link-normal a-text-normal']")
    public WebElement faaySpoonLocator2;

    @FindBy(linkText = "OXO Good Grips Large Wooden Spoon")
   // @FindBy(xpath = "(//a[@class='a-size-base a-link-normal a-text-normal'])[4]")
    // @FindBy(css = "img[data-image-index='4']")
    public WebElement oxoSpoonLocator;

    @FindBy(xpath = "(//img[@class='s-image'])[4]")
    public WebElement woodenKitchenSpoon;

    @FindBy (xpath = "(//img[@class='s-image'])[1]")
    public WebElement RiveiraWoodenSpoon;

    @FindBy (linkText = "Small Wooden Spoons, 6pcs Wooden Teaspoon Sevensun Small Teaspoons Serving Wooden Utensils For Cooking Small Condiments Spoon, Mini Wooden Honey Spoon For Daily Use")
    public WebElement smallWoodenSpoonsLocator;

    @FindBy(id = "add-to-cart-button")
    public WebElement addToCartButton;

    @FindBy (id= "hlb-ptc-btn-native")
    public WebElement proceedToCheckoutLocator;

    @FindBy(name = "proceedToRetailCheckout")
    public WebElement proceedByName;
}
