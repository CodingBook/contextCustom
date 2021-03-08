package org.cb.contextCustom.pages;

import org.cb.contextCustom.utils.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrandLogos {
    public BrandLogos() {
        PageFactory.initElements(MyDriver.get(), this);
    }

    @FindBy(xpath = "//h2[contains(text(),'Brands')]")
    public WebElement brands;

    @FindBy(xpath = "(//img[@alt='Context Custom'])[3]")
    public WebElement contexCustomLogo;

    @FindBy(xpath = "//img[@alt='Gildan']")
    public WebElement gildan;

    @FindBy(xpath = "//img[@alt='Brand']")
    public WebElement bellaCanvas;

}
