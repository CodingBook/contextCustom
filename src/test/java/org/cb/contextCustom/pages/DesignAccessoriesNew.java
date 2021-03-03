package org.cb.contextCustom.pages;

import org.cb.contextCustom.utils.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesignAccessoriesNew {
    public DesignAccessoriesNew(){PageFactory.initElements(MyDriver.get(),this);
    }

    @FindBy(xpath = "//div[@class='navbar-tool-text ml-n3']")
    public WebElement myAccount;

    @FindBy(xpath = "//input[@id='id_username_reg_pg']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='id_password_reg_pg']")
    public WebElement password;

    @FindBy(xpath = "//button[normalize-space()='Sign In']")
    public WebElement signIn;

    @FindBy(xpath = "(//a[@data-toggle='dropdown'])[1]")
    public WebElement categories;

    @FindBy(xpath = "//a[@class='dropdown-item dropdown-toggle'][normalize-space()='Accessories']")
    public WebElement accessories;

    @FindBy(xpath = "//a[normalize-space()='All Accessories']")
    public WebElement allAccessories;

    @FindBy(xpath = "//img[@src='/media/images/EcoToteBack.png']")
    public WebElement firstProduct;

    @FindBy(xpath = "//input[@id='startDesigningButton']")
    public WebElement designingButton;

    @FindBy(xpath = "//input[@id='text-string']")
    public WebElement startTyping;

    @FindBy(xpath = "//button[@id='add-text']")
    public WebElement addTextButton;



    @FindBy(xpath = "//div[@data-original-title='Text Color']//div[@class='sp-dd'][contains(text(),'▼')]")
    public WebElement textColor;
    @FindBy(xpath = "//div[@class='sp-container sp-light sp-alpha-enabled sp-clear-enabled']//div[@class='sp-palette-container']//span[@title='#2986cc']//span[@class='sp-thumb-inner']")
    public WebElement blueSelect;


    @FindBy(xpath = "//div[@data-original-title='Outline']//div[@class='sp-dd'][contains(text(),'▼')]")
    public WebElement outLine;
    @FindBy(xpath = "//div[@class='sp-container sp-light sp-alpha-enabled sp-clear-enabled']//span[@title='#f44336']//span[@class='sp-thumb-inner']")
    public WebElement outLineSelect;


    @FindBy(xpath = "//div[@data-original-title='Shadow']//div[@class='sp-dd'][contains(text(),'▼')]")
    public WebElement shadow;
    @FindBy(xpath = "//div[@class='sp-container sp-light sp-alpha-enabled sp-clear-enabled']//span[@title='black']//span[@class='sp-thumb-inner']")
    public WebElement blackSelect;


    @FindBy(xpath = "//select[@id='font-family']")
    public WebElement fontFamily;
    @FindBy(xpath = "//select[@id='font-family']//option[@value=\"Oswald\"]")
    public WebElement oswaldFont;


    @FindBy(xpath = "//select[@id='id_quantity']")
    public WebElement howMany;
    @FindBy(xpath = "//select[@id='id_quantity']//option[@value=10]")
    public WebElement quantity;
    @FindBy(xpath = "//input[@id='addtocartButton']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//h1[contains(text(),'My cart')]")
    public WebElement cart;

}
