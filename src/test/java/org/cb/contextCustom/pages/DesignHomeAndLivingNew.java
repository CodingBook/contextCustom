package org.cb.contextCustom.pages;

import org.cb.contextCustom.utils.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesignHomeAndLivingNew {
    public DesignHomeAndLivingNew(){
        PageFactory.initElements(MyDriver.get(),this);
    }
    @FindBy(xpath = "//a[normalize-space()='All Products']")
    public WebElement allProduct;

    @FindBy(xpath = "//a[@class='dropdown-item dropdown-toggle'][normalize-space()='Home & Living']")
    public WebElement homeAndLiving;

    @FindBy(xpath = "//a[normalize-space()='All Home & Living']")
    public WebElement allHomeAndLiving;

}
