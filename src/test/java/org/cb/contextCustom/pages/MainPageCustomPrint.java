package org.cb.contextCustom.pages;

import org.cb.contextCustom.utils.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageCustomPrint {

        public MainPageCustomPrint(){
            PageFactory.initElements(MyDriver.get(),this);
        }

        @FindBy(xpath = "//h1[normalize-space()='Custom printed & embroidered products']")
        public WebElement customPrintHeading;

        @FindBy(xpath = "//h5[contains(text(),'Order custom design products for yourself or sell ')]")
        public WebElement customPrintSubheading;

        @FindBy(xpath = "//h4[normalize-space()='Customize for yourself or for your customers']")
        public WebElement customizeYourselfText;

        @FindBy(xpath = "//h3[normalize-space()=\"We'll print & ship it for you!\"]")
        public WebElement printAndShip;

        @FindBy(xpath = "//h4[normalize-space()='Supply from you print from us']")
        public WebElement supplyFromYouText;

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
