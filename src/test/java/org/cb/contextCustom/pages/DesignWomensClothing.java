package org.cb.contextCustom.pages;

import org.cb.contextCustom.utils.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesignWomensClothing {

    public DesignWomensClothing(){
        PageFactory.initElements(MyDriver.get(),this);
    }

    @FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[6]/a[1]")
    public WebElement womensClothing;

    @FindBy(xpath = "//a[normalize-space()=\"All Women's Clothing\"]")
    public WebElement allWomensClothing;

    @FindBy(xpath = "//div[@class='row mx-n2']//div[2]//div[1]//a[1]//img[1]")
    public WebElement firstWomensClothingProduct;

}
