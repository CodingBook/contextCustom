package org.cb.contextCustom.pages;

import org.cb.contextCustom.utils.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesignMensClothing {

    public DesignMensClothing(){
        PageFactory.initElements(MyDriver.get(),this);
    }

    @FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[5]/a[1]")
    public WebElement mensClothing;

    @FindBy(xpath = "//a[normalize-space()=\"All Men's Clothing\"]")
    public WebElement allMensClothing;

    @FindBy(xpath = "//div[@class='row']//div[1]//div[1]//a[1]//img[1]")
    public WebElement firstMensClothingProduct;

}
