package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.KidsAndYouth;

public class KidsAndYouthSteps extends Base {
    KidsAndYouth kidsAndYouth = new KidsAndYouth();

    @When("user lands on All Kids&Youth's Clothing page and verifies")
    public void userLandsOnAllKidsYouthSClothingPageAndVerifies() {
        moveToElement(kidsAndYouth.categories);
        moveToElement(kidsAndYouth.kidsAndYouth);
        moveAndClickToElement(kidsAndYouth.allKids);
        String expected = "Kids & Youth Clothing";
        waitSomeTime(1000L);
        textIsDisplayedAndEnabled(expected, kidsAndYouth.KidsYouthClothingText);
    }

    @And("user verifies that first Kids&Youth product's features are present")
    public void userVerifiesThatFirstKidsYouthProductSFeaturesArePresent() {
        imageIsDisplayedAndEnabled(kidsAndYouth.firstItemImage);
        String expected = "Bella canvas";
        textIsDisplayedAndEnabled(expected, kidsAndYouth.firstItemBrandName);

        expected = "Baby Jersey Short Sleeve Tee | 3001B Bella Canvas";
        textIsDisplayedAndEnabled(expected, kidsAndYouth.firstItemTitle);

        expected = "$8.76";
        textIsDisplayedAndEnabled(expected, kidsAndYouth.firstItemPrice);

    }

    @Then("user clicks on first Kids&Youth product and verifies")
    public void userClicksOnFirstKidsYouthProductAndVerifies() {
        click(kidsAndYouth.firstItemImage);
        waitSomeTime(1000L);
        String expected = "Baby Jersey Short Sleeve …";
        textIsDisplayedAndEnabled(expected, kidsAndYouth.firstItemName);

    }
}
