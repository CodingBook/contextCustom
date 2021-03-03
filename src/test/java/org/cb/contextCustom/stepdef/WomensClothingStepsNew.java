package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.WomensClothingNew;

public class WomensClothingStepsNew extends Base {
    WomensClothingNew womensClothingNew = new WomensClothingNew();

    @When("user lands on All Women's Clothing page and verifies")
    public void userLandsOnAllWomenSClothingPageAndVerifies() {
        moveToElement(womensClothingNew.categories);
        moveToElement(womensClothingNew.womenscloth);
        waitSomeTime(1000L);
        moveAndClickToElement(womensClothingNew.allWomen);
        String expected = "Women's Clothing";
        waitSomeTime(1000L);
        textIsDisplayedAndEnabled(expected, womensClothingNew.womensClothingText);
    }

    @And("user verifies that first women product's features are present")
    public void userVerifiesThatFirstWomenProductSFeaturesArePresent() {
        imageIsDisplayedAndEnabled(womensClothingNew.firstItemImage);
        String expected = "Bella canvas";
        textIsDisplayedAndEnabled(expected, womensClothingNew.firstItemBrandName);
        expected = "Unisex CVC SS Tee | 3001 Bella Canvas";
        textIsDisplayedAndEnabled(expected, womensClothingNew.firstItemTitle);
        expected = "$9.99";
        textIsDisplayedAndEnabled(expected, womensClothingNew.firstItemPrice);
    }

    @Then("user clicks on first women product and verifies")
    public void userClicksOnFirstWomenProductAndVerifies() {
        imageIsDisplayedAndEnabled(womensClothingNew.firstItemImage);
        String expected = "Unisex CVC SS Tee …";
        waitSomeTime(1000L);
        textIsDisplayedAndEnabled(expected, womensClothingNew.firstItemName);
    }
}
