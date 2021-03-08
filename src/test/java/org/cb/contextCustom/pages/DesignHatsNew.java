package org.cb.contextCustom.pages;

import org.cb.contextCustom.utils.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesignHatsNew {
    public DesignHatsNew(){
        PageFactory.initElements(MyDriver.get(),this);
    }

    @FindBy(xpath = "//a[normalize-space()='All Products']")
    public WebElement allProducs;

    @FindBy(xpath = "//a[@class='dropdown-item dropdown-toggle'][normalize-space()='Hats']")
    public WebElement hats;

    @FindBy(xpath = "//a[normalize-space()='All Hats']")
    public WebElement allHats;

    @FindBy(xpath = "//div[@class='row']//div[1]//div[1]//a[1]//img[1]")
    public WebElement firstHat;


}
