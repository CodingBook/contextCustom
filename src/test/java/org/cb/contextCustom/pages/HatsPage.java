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

    @FindBy(xpath = "(//img[@alt='Product'])[1]")
    public WebElement cuffedBeanieImage;

    @FindBy(xpath = "(//a[text()='Context'])[1]")
    public WebElement cuffedBeanieBrand;

    @FindBy(linkText = "Cuffed Beanie | Context B110")
    public WebElement cuffedBeanieText;

    @FindBy(xpath = "//span[text()='$4.50']")
    public WebElement cuffedBeaniePrice;

    public HatsPage(){
        PageFactory.initElements(MyDriver.get(),this);

    }
}
