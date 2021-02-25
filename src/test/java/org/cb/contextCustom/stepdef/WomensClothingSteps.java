package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.WomensClothing;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WomensClothingSteps extends Base{
    WomensClothing womensClothing = new WomensClothing();
    Logger logger = LoggerFactory.getLogger(WomensClothingSteps.class);

    @When("move on to Categories dropdown menu")
    public void moveOnToCategoriesDropdownMenu() {
        moveToElement(womensClothing.categories);
    }

    @Then("move on to Women's Clothing sub-menu")
    public void moveOnToWomenSClothingSubMenu() {
        moveToElement(womensClothing.womenscloth);
        waitSomeTime(1000L);
    }

    @And("move and click on All Women's Clothing")
    public void moveAndClickOnAllWomenSClothing() {
        moveAndClickToElement(womensClothing.allWomen);
    }

    @Then("verify that Women's Clothing text is present")
    public void verifyThatWomenSClothingTextIsPresent() {
        String expected = "Women's Clothing";
        waitSomeTime(1000L);
        textIsDisplayedAndEnabled(expected, womensClothing.womensClothingText);
    }

    @And("verify that first women item image is present")
    public void verifyThatFirstWomenItemImageIsPresent() {
        imageIsDisplayedAndEnabled(womensClothing.firstItemImage);
    }

    @And("verify that women item brand name is present")
    public void verifyThatWomenItemBrandNameIsPresent() {
        String expected = "Bella canvas";
        textIsDisplayedAndEnabled(expected, womensClothing.firstItemBrandName);
    }

    @Then("verify that women item title is present")
    public void verifyThatWomenItemTitleIsPresent() {
        String expected = "Unisex CVC SS Tee | 3001 Bella Canvas";
        textIsDisplayedAndEnabled(expected, womensClothing.firstItemTitle);
    }

    @And("verify that women item price is present")
    public void verifyThatWomenItemPriceIsPresent() {
        String expected = "$9.99";
        textIsDisplayedAndEnabled(expected, womensClothing.firstItemPrice);
    }

    @And("click on first women item picture")
    public void clickOnFirstWomenItemPicture() {
        imageIsDisplayedAndEnabled(womensClothing.firstItemImage);

    }

    @Then("verify that first women item name is present")
    public void verifyThatFirstWomenItemNameIsPresent() {
        String expected = "Unisex CVC SS Tee …";
        textIsDisplayedAndEnabled(expected, womensClothing.firstItemName);
    }
}
