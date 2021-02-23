package org.cb.contextCustom.pages;

import org.cb.contextCustom.utils.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrandLogo {

    public BrandLogo() {
        PageFactory.initElements(MyDriver.get(), this);
    }

    @FindBy(xpath = "//h4[contains (text(),'Supply from you print from us')]")
    public WebElement suppy;

    @FindBy(xpath = "//h3[contains (text(),'Bring Your Own Tee')]")
    public  WebElement bring;

    @FindBy(linkText = "Print Now")
    public  WebElement printNowButton;

    @FindBy(xpath = "(//img[@alt='Shop Converse'])[3]")
    public WebElement printImage;

    @FindBy (xpath = "//h2[contains(text(),'Brands')]")
    public WebElement brands;

    @FindBy(xpath = "(//img[@alt='Context Custom'])[3]")
    public WebElement contexCustomLogo;

    @FindBy(xpath = "//img[@alt='Gildan']")
    public WebElement gildan;

    @FindBy(xpath = "//img[@alt='Brand']")
    public WebElement bellaCanvas;

    //(//img[@class='d-block mx-auto'])[1]


}
