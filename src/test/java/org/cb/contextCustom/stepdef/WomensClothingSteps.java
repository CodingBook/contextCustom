package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.WomensClothing;

public class WomensClothingSteps extends Base {
    WomensClothing womensClothing = new WomensClothing();

    @When("user lands on All Women's Clothing page and verifies")
    public void userLandsOnAllWomenSClothingPageAndVerifies() {
        moveToElement(womensClothing.categories);
        moveToElement(womensClothing.womenscloth);
        waitSomeTime(1000L);
        moveAndClickToElement(womensClothing.allWomen);
        String expected = "Women's Clothing";
        waitSomeTime(1000L);
        textIsDisplayedAndEnabled(expected, womensClothing.womensClothingText);
    }

    @And("user verifies that first women product's features are present")
    public void userVerifiesThatFirstWomenProductSFeaturesArePresent() {
        imageIsDisplayedAndEnabled(womensClothing.firstItemImage);
        String expected = "Bella canvas";
        textIsDisplayedAndEnabled(expected, womensClothing.firstItemBrandName);
        expected = "Unisex CVC SS Tee | 3001 Bella Canvas";
        textIsDisplayedAndEnabled(expected, womensClothing.firstItemTitle);
        expected = "$9.99";
        textIsDisplayedAndEnabled(expected, womensClothing.firstItemPrice);
    }

    @Then("user clicks on first women product and verifies")
    public void userClicksOnFirstWomenProductAndVerifies() {
        imageIsDisplayedAndEnabled(womensClothing.firstItemImage);
        String expected = "Unisex CVC SS Tee …";
        waitSomeTime(1000L);
        textIsDisplayedAndEnabled(expected, womensClothing.firstItemName);
    }
}
