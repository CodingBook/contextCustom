package org.cb.contextCustom.pages;

import org.cb.contextCustom.utils.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageOne {

    public MainPageOne() {

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


}
