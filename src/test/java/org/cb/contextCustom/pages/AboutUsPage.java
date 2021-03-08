package org.cb.contextCustom.pages;


import org.cb.contextCustom.utils.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AboutUsPage {
    public AboutUsPage(){
        PageFactory.initElements(MyDriver.get(),this);
    }
@FindBy(xpath="//h3[contains(text(),'About us')]")
public WebElement About_Us;

@FindBy(linkText = "About company")
public WebElement About_Company;

@FindBy(linkText = "Our team")
public WebElement Our_Team;

@FindBy(linkText="Careers")
public WebElement Careers;

@FindBy(xpath= "//h3[contains(text(),'Follow us')]")
public WebElement Follow_Us;

@FindBy(xpath = "//a[@href='https://twitter.com/ContextCustom']")
public WebElement Twitter;

@FindBy(xpath ="//a[@class=\"social-btn sb-light sb-facebook mr-2 mb-2\"] " )
public WebElement Facebook;

@FindBy(xpath="//a[@href='https://www.instagram.com/contextcustom/']")
public WebElement Instagram;

@FindBy(xpath="//body/footer[1]/div[1]/div[1]/div[2]/div[2]/a[4]")
public WebElement Youtube;

}
