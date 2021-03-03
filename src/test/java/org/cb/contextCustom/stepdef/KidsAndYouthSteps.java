package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.KidsAndYouthNew;

public class KidsAndYouthSteps extends Base {
    KidsAndYouthNew kidsAndYouthNew = new KidsAndYouthNew();

    @When("user lands on All Kids&Youth's Clothing page and verifies")
    public void userLandsOnAllKidsYouthSClothingPageAndVerifies() {
        moveToElement(kidsAndYouthNew.categories);
        moveToElement(kidsAndYouthNew.kidsAndYouth);
        moveAndClickToElement(kidsAndYouthNew.allKids);
        String expected = "Kids & Youth Clothing";
        waitSomeTime(1000L);
        textIsDisplayedAndEnabled(expected, kidsAndYouthNew.KidsYouthClothingText);
    }

    @And("user verifies that first Kids&Youth product's features are present")
    public void userVerifiesThatFirstKidsYouthProductSFeaturesArePresent() {
        imageIsDisplayedAndEnabled(kidsAndYouthNew.firstItemImage);
        String expected = "Bella canvas";
        textIsDisplayedAndEnabled(expected, kidsAndYouthNew.firstItemBrandName);

        expected = "Baby Jersey Short Sleeve Tee | 3001B Bella Canvas";
        textIsDisplayedAndEnabled(expected, kidsAndYouthNew.firstItemTitle);

        expected = "$8.76";
        textIsDisplayedAndEnabled(expected, kidsAndYouthNew.firstItemPrice);

    }

    @Then("user clicks on first Kids&Youth product and verifies")
    public void userClicksOnFirstKidsYouthProductAndVerifies() {
        click(kidsAndYouthNew.firstItemImage);
        waitSomeTime(1000L);
        String expected = "Baby Jersey Short Sleeve …";
        textIsDisplayedAndEnabled(expected, kidsAndYouthNew.firstItemName);

    }
}
