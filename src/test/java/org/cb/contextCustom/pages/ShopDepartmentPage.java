package org.cb.contextCustom.pages;

import org.cb.contextCustom.utils.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ShopDepartmentPage {
    public ShopDepartmentPage(){
        PageFactory.initElements(MyDriver.get(), this);
    }

    @FindBy(xpath="//body/footer[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    public WebElement Accesories;

    @FindBy(xpath="(//a[@class=\"widget-list-link\"])[2]")
    public WebElement Hats;

    @FindBy(xpath="(//a[@class=\"widget-list-link\"])[3]")
    public WebElement Home_Living;

    @FindBy(xpath="(//a[@class=\"widget-list-link\"])[4]")
    public WebElement Kids_YouthClothing;

    @FindBy(xpath="(//a[@class=\"widget-list-link\"])[5]")
    public WebElement Men_Clothing;

    @FindBy(xpath="(//a[@class=\"widget-list-link\"])[6]")
    public WebElement Women_Clothing;

    @FindBy(xpath="(//a[@class=\"widget-list-link\"])[7]")
    public WebElement Women_Clothing_2;
}
