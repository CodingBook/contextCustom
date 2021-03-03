package org.cb.contextCustom.pages;

import org.cb.contextCustom.utils.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KidsAndYouthNew {
    public KidsAndYouthNew() {
        PageFactory.initElements(MyDriver.get(),this);
    }

    @FindBy(xpath = "//div[@class='navbar-tool-text ml-n3']")
    public WebElement signIn;

    @FindBy(xpath = "//*[@id='id_username_reg_pg']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='id_password_reg_pg']")
    public WebElement password;

    @FindBy(xpath = "//button[normalize-space()='Sign In']")
    public WebElement signInButton;

    @FindBy(xpath = "(//a[@data-toggle='dropdown'])[1]")
    public WebElement categories;

    @FindBy(xpath = "(//a[@data-toggle='dropdown'])[5]")
    public WebElement kidsAndYouth;

    @FindBy(linkText = "All Kids & Youth Clothing")
    public WebElement allKids;

    @FindBy(xpath = "//li[@class='breadcrumb-item text-nowrap active']")
    public WebElement KidsYouthClothingText;

    @FindBy(xpath = "(//img[@alt='Product'])[1]")
    public WebElement firstItemImage;

    @FindBy(xpath = "(//div[@class='card-body py-2']//a)[1]")
    public WebElement firstItemBrandName;

    @FindBy(xpath = "(//h3[@class='product-title font-size-sm']//a)[1]")
    public WebElement firstItemTitle;

    @FindBy(xpath = "(//span[@class='text-accent'])[1]")
    public WebElement firstItemPrice;

    @FindBy(xpath = "//li[@class='breadcrumb-item text-nowrap active']")
    public WebElement firstItemName;
}
