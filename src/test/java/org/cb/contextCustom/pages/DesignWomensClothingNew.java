package org.cb.contextCustom.pages;

import org.cb.contextCustom.utils.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesignWomensClothingNew {

    public DesignWomensClothingNew(){
        PageFactory.initElements(MyDriver.get(),this);
    }

    @FindBy(xpath = "//a[normalize-space()='All Products']")
    public WebElement allProducs;
    @FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[6]/a[1]")
    public WebElement womensClothing;

    @FindBy(xpath = "//a[normalize-space()=\"All Women's Clothing\"]")
    public WebElement allWomensClothing;

}
