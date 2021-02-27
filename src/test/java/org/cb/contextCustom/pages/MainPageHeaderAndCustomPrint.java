package org.cb.contextCustom.pages;

import org.cb.contextCustom.utils.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageHeaderAndCustomPrint {

    public MainPageHeaderAndCustomPrint() {

        PageFactory.initElements(MyDriver.get(), this);
    }

    @FindBy(xpath = "//a[@class='navbar-brand d-none d-sm-block mr-4 order-lg-1']//img[1]")
    public WebElement logo;

    @FindBy(xpath = "//a[normalize-space()='How It Works?']")
    public WebElement howItWorks;

    @FindBy(xpath ="//a[normalize-space()='Free Mockups']" )
    public WebElement freeMockups;

    @FindBy(xpath = "//a[normalize-space()='Buy Designs']")
    public WebElement buyDesigns;

    @FindBy(xpath = "//i[@class='navbar-tool-icon czi-search']")
    public WebElement searchIcon;

    @FindBy(xpath = "//div[@class='navbar-tool-text ml-n3']")
    public WebElement myAccount;

    @FindBy(xpath = "//i[@class='navbar-tool-icon czi-cart']")
    public WebElement cartIcon;

    @FindBy(xpath = "//a[@class='navbar-tool-text']")
    public WebElement myCart;

    @FindBy(xpath = "//h1[normalize-space()='Custom printed & embroidered products']")
    public WebElement customPrintHeading;

    @FindBy(xpath = "//h3[normalize-space()=\"We'll print & ship it for you!\"]")
    public WebElement printAndShip;

    @FindBy(xpath = "//h3[normalize-space()='Bring Your Own Tee']")
    public WebElement bringYourTee;

    @FindBy(xpath = "//a[normalize-space()='Make an Order']")
    public WebElement makeAnOrderButton;

    @FindBy(xpath = "//a[normalize-space()='Print Now']")
    public WebElement printNowButton;

    @FindBy(xpath = "//div[@class='row my-4']//div[1]//div[1]//img[1]")
    public WebElement makeAnOrderImage;

    @FindBy(xpath = "//div[@class='row my-4']//div[1]//div[1]//img[1]")
    public WebElement printNowImage;

}
