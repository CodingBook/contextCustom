package org.cb.contextCustom.pages;

import org.cb.contextCustom.utils.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewProducts {

    public NewProducts() {

        PageFactory.initElements(MyDriver.get(), this);
    }

    //images
    @FindBy(xpath = "//img[@alt='Embroidered Apron']")
    public WebElement embroideredApronImage;

    @FindBy(xpath = "//img[contains(@alt,'3945 Bella Canvas')]")
    public WebElement unisexSpongeFleeceImage;

    @FindBy(xpath = "//img[contains(@alt,'100B Bella Canvas')]")
    public WebElement babyJerseyImage;

    @FindBy(xpath = "//img[@alt='Unisex V-Neck Tee | Bella + Canvas 3005']")
    public WebElement unisexVNeckTeeImage;

    //names
    @FindBy(xpath = "//a[normalize-space()='Embroidered Apron']")
    public WebElement embroideredApronName;

    @FindBy(xpath = "//a[contains(text(),'Unisex Sponge Fleece Drop Shoulder Sweatshirt')]")
    public WebElement unisexSpongeFleeceName;

    @FindBy(xpath = "//a[contains(text(),'Baby Jersey Short Sleeve One Piece |')]")
    public WebElement babyJerseyName;

    @FindBy(xpath = "//a[normalize-space()='Unisex V-Neck Tee | Bella + Canvas 3005']")
    public WebElement unisexVNeckTeeName;

    //prices
    @FindBy(xpath = "//span[contains(text(),'$16.50')]")
    public WebElement embroideredApronPrice;

    @FindBy(xpath = "//span[contains(text(),'$18.73')]")
    public WebElement unisexSpongeFleecePrice;

    @FindBy(xpath = "//span[contains(text(),'$9.95')]")
    public WebElement babyJerseyPrice;

    @FindBy(xpath = "//span[normalize-space()='$4.85']")
    public WebElement unisexVNeckTeePrice;

    //brands
    @FindBy(xpath = "//a[contains(text(),'Context')]")
    public WebElement embroideredApronBrand;

    @FindBy(xpath = "(//a[contains(text(),'Bella canvas')])[2]")
    public WebElement unisexSpongeFleeceBrand;

    @FindBy(xpath = "(//a[@class='product-meta d-block font-size-xs pb-1'])[3]")
    public WebElement babyJerseyBrand;

    @FindBy(xpath = "(//a[contains(text(),'Bella canvas')])[1]")
    public WebElement unisexVNeckTeeBrand;

    //images and design & buy buttons
    @FindBy(xpath = "//img[@alt='Unisex V-Neck Tee | Bella + Canvas 3005']")
    public WebElement vNeckTee;

    @FindBy(xpath = "(//input[@class='btn btn-primary btn-sm btn-block mb-2']//parent::div)[3]")
    public WebElement unisexVNeckTeeDesignButton;

    @FindBy(xpath = "//img[contains(@alt,'3945 Bella Canvas')]")
    public WebElement sweatshirt;

    @FindBy(xpath = "(//input[@class='btn btn-primary btn-sm btn-block mb-2']//parent::div)[1]")
    public WebElement unisexSpongeFleeceDesignButton;

    @FindBy(xpath = "//img[contains(@alt,'100B Bella Canvas')]")
    public WebElement babyJersey;

    @FindBy(xpath = "(//input[@class='btn btn-primary btn-sm btn-block mb-2']//parent::div)[2]")
    public WebElement babyJerseyDesignButton;

    @FindBy(xpath = "//img[@alt='Embroidered Apron']")
    public WebElement apron;

    @FindBy(xpath = "(//input[@class='btn btn-primary btn-sm btn-block mb-2']//parent::div)[4]")
    public WebElement embroideredApronDesignButton;


    @FindBy(xpath = "//a[normalize-space()='More products']")
    public WebElement moreProductsButton;

    @FindBy(xpath = "//li[@class='breadcrumb-item text-nowrap active']//a[normalize-space()='Product Catalog']")
    public WebElement productCatalog;

}
