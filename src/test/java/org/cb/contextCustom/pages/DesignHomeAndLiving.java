package org.cb.contextCustom.pages;

import org.cb.contextCustom.utils.MyDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesignHomeAndLiving {
    public DesignHomeAndLiving(){
        PageFactory.initElements(MyDriver.get(),this);
    }

    @FindBy(xpath = "//a[@class='dropdown-item dropdown-toggle'][normalize-space()='Home & Living']")
    public WebElement homeAndLiving;

    @FindBy(xpath = "//a[normalize-space()='All Home & Living']")
    public WebElement allHomeAndLiving;

    @FindBy(xpath = "//div[@class='row']//div[1]//div[1]//a[1]//img[1]")
    public WebElement firstHomeAndLivingProduct;

}
