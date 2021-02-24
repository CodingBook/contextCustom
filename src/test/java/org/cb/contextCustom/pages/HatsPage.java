package org.cb.contextCustom.pages;

import org.cb.contextCustom.utils.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HatsPage {

    @FindBy(linkText = "Hats")
    public WebElement hats;

    @FindBy(xpath = "//a[normalize-space()='All Hats']")
    public WebElement allHats;

    @FindBy(xpath = "//li[@class='breadcrumb-item text-nowrap active']")
    public WebElement textOfHats;

    public HatsPage(){
        PageFactory.initElements(MyDriver.get(),this);

    }
}
