package org.cb.contextCustom.pages;

import org.cb.contextCustom.utils.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {
    public LogIn(){
        PageFactory.initElements(MyDriver.get(), this);
    }
    @FindBy(xpath = "//div[@class='navbar-tool-text ml-n3']")
    public WebElement signIn;
    
    @FindBy(xpath = "//input[@id='id_username_reg_pg']")
    public WebElement eMail;

    @FindBy(xpath = "//input[@id='id_password_reg_pg']")
    public WebElement password;
    
    @FindBy(xpath = "//button[normalize-space()='Sign In']")
    public WebElement signInButton;

    @FindBy(xpath = "//div[@class='custom-control custom-checkbox']//input[@id='id_remember_me']")
    public WebElement rememberMe;

    @FindBy(xpath = "//a[@class='nav-link-inline font-size-sm']")
    public WebElement passwordReset;
}
