package org.cb.contextCustom.pages;


import org.cb.contextCustom.utils.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LogoPage {

    public LogoPage(){
        PageFactory.initElements(MyDriver.get(),this);
    }

    @FindBy(xpath="//h6[contains(text(),'Fast and free delivery')]")
    public WebElement Fast_and_free_delivery;

    @FindBy(xpath="//h6[contains(text(),'Money back guarantee')]")
    public WebElement Money_back_guarantee;

    @FindBy(xpath="//h6[contains(text(),'24/7 customer support')]")
    public WebElement  customerSupport;

    @FindBy(xpath="//h6[contains(text(),'Secure online payment')]")
    public WebElement SecureOnlinePayment;

    @FindBy(xpath="//body/footer[1]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]/img[1]")
    public WebElement brandLogo;



    @FindBy(xpath="//p[contains(text(),'Address: 1002 Texas Pkwy Suite E Stafford TX 77477')]")
    public WebElement address;


}
