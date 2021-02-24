package org.cb.contextCustom.pages;

import org.cb.contextCustom.utils.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomeAndLivingPage {

    public HomeAndLivingPage(){
        PageFactory.initElements(MyDriver.get(),this);
    }

    @FindBy(tagName = "a")
    public List<WebElement> allLinks ;

    @FindBy(xpath = "(//a[@data-toggle='dropdown'])[1]")
    public WebElement categories;

    @FindBy(xpath = "(//a[@class='dropdown-item dropdown-toggle'])[3]")
    public WebElement homeAndLiving;

    @FindBy(xpath = "//a[text()='All Home & Living']")
    public WebElement allHomeAndLiving;

    @FindBy(xpath = "//li[@class='breadcrumb-item text-nowrap active']")
    public WebElement textOfHomeAndLiving;

    @FindBy(xpath = "(//img[@alt='Product'])[1]")
    public WebElement ceramicMugImage;

    @FindBy(xpath = "//a[@class='product-meta d-block font-size-xs pb-1 center']")
    public WebElement ceramicMugBrand;

    @FindBy(linkText = "Ceramic Mug | Context")
    public WebElement ceramicMugText;

    @FindBy(xpath = "//span[text()='$7.49']")
    public WebElement ceramicMugPrice;

}
