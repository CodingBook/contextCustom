package org.cb.contextCustom.pages;

import org.cb.contextCustom.utils.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessoriesPage {

    public AccessoriesPage(){
        PageFactory.initElements(MyDriver.get(),this);
    }

    @FindBy(xpath = "(//a[@data-toggle='dropdown'])[1]")
    public WebElement categories;
    //@FindBy(css ="(//a[text()='Accessories'])[1]")
    //xpath="//a[@class='dropdown-item dropdown-toggle'][normalize-space()='Accessories']"
    //linkText="Accessories"
   //@FindBy(xpath = "(//a[@class='dropdown-item dropdown-toggle'])[1]")

    @FindBy(linkText = "Accessories")
    public WebElement accessories;

    @FindBy(xpath = "//li[@class='nav-item dropdown']//li[1]//ul[1]//li[1]")
    public WebElement allAccessories;

    @FindBy(xpath = "//li[@class='breadcrumb-item text-nowrap active']")
    public WebElement textOfAccessories;



}
