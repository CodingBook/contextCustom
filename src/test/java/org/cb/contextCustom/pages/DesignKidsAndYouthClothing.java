package org.cb.contextCustom.pages;

import org.cb.contextCustom.utils.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesignKidsAndYouthClothing {

    public DesignKidsAndYouthClothing(){
        PageFactory.initElements(MyDriver.get(),this);
    }

    @FindBy(xpath = "//a[@class='dropdown-item dropdown-toggle'][normalize-space()='Kids & Youth Clothing']")
    public WebElement kidsAndYouthClothing;

    @FindBy(xpath = "//a[normalize-space()='All Kids & Youth Clothing']")
    public WebElement allKindAndYouthClothing;

    @FindBy(xpath = "//div[@class='row']//div[1]//div[1]//a[1]//img[1]")
    public WebElement firstKindAndYouthClothingProduct;

}
