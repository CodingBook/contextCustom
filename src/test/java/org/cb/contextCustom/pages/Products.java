package org.cb.contextCustom.pages;

import org.cb.contextCustom.utils.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Products {

    public Products() {
        PageFactory.initElements(MyDriver.get(), this);
    }

    @FindBy(xpath = "//img[@alt='accessories']")
    public WebElement accessoriesImage;

    @FindBy(xpath = "//h2[@class='h5']//a[contains(text(), 'Accessories')]")
    public WebElement accessories;

    @FindBy(xpath = "//a[@class='nav-link-style'][normalize-space()='Backpacks']")
    public WebElement backpacks;

    @FindBy(css = "img[alt='hats']")
    public WebElement hatImage;

    @FindBy(xpath = "//h2[@class='h5']//a[contains(text(),'Hats')]")
    public WebElement hats;

    @FindBy (xpath = "//a[@class='nav-link-style'][normalize-space()='Beanies']")
    public WebElement beanies;

    @FindBy (xpath = "//img[@alt='home-living']")
    public WebElement homeLivingImage;

    @FindBy (xpath = "//h2[@class='h5']//a[contains(text(),'Home & Living')]" )
    public WebElement homeLiving;

    @FindBy (xpath = "//a[@class='nav-link-style'][normalize-space()='Blankets']" )
    public WebElement blankets;

    @FindBy (xpath = "//img[@alt='kids-youth-clothing']")
    public WebElement kidsYouthImage;

    @FindBy (xpath = "//h2[@class='h5']//a[contains(text(),'Kids & Youth Clothing')]")
    public WebElement kidsYouthClothing;

    @FindBy (xpath = "//a[@class='nav-link-style'][contains(text(),'Baby Bibs')]")
    public WebElement babybibs;

    @FindBy (xpath = "//img[@alt='mens-clothing']")
    public WebElement mensClothingImage;

    @FindBy (xpath = "(//h2[@class='h5'])[5]")
    public WebElement mensClothing;

    @FindBy (xpath = "(//a[@class='nav-link-style'][contains(text(),'Bottoms')])[1]")
    public WebElement bottomsM;

    @FindBy (xpath = "//img[@alt='womens-clothing']")
    public WebElement womensClothingImage;

    @FindBy (xpath = "(//h2[@class='h5'])[6]")
    public WebElement womensClothing;

    @FindBy (xpath = "(//a[@class='nav-link-style'][contains(text(),'Bottoms')])[2]")
    public WebElement bottomsW;

    @FindBy (xpath = "//li[contains(text(),'Bottoms')]")
    public WebElement verifyBottomsPageW;
}
