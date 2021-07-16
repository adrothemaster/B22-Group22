package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VytrackPage {

    public VytrackPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "prependedInput")
    public WebElement userName;

    @FindBy(id = "prependedInput2")
    public WebElement Password;

    @FindBy(id = "_submit")
    public WebElement LogIn;

    // fleet dropdown location
    @FindBy(xpath = "//span[@class='title title-level-1']")
    public WebElement FleetDropdownLocation;

    // fleet dropdown select vehicle
    @FindBy(xpath = "//li[@class='dropdown-menu-single-item first']")
    public WebElement vehicleSelect;

    // resetButton
    @FindBy(xpath = "//a[@class='action btn reset-action mode-text-only']")
    public WebElement resetButton;

    // view count per page selector //
    @FindBy(xpath = "//button[@class='btn dropdown-toggle ']")
    public WebElement ViewPerPage;

    // view per page selector 10
    @FindBy(xpath = "//a[@data-size='10']")
    public WebElement ViewPerPage10;

    @FindBy(linkText = "Vehicle Contracts")
    public WebElement storeManagerVehicleContracts;

    @FindBy(xpath = "//a[@class='btn main-group btn-primary pull-right ']")
    public WebElement storeManagerCreateVehicleContractButton;

    @FindBy(linkText = "Cancel")
    public WebElement storeManagerVehicleContractsCancel;

    @FindBy(linkText = "Fleet")
    public WebElement getStoreManagerFleetSelector;

    @FindBy(xpath = "//tr[@class='grid-row row-click-action'][1]")
    public WebElement storeManagerChooseVariable;

    @FindBy(linkText = "Edit")
    public WebElement storeManagerEditButton;

    @FindBy(linkText = "Delete")
    public WebElement storeMangerDeleteButton;




}
