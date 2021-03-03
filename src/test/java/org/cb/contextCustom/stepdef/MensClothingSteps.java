package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.MensClothingNew;

public class MensClothingSteps extends Base{
    MensClothingNew mensClothingNew = new MensClothingNew();

    @Given("user is in landing page and signs in")
    public void userIsInLandingPageAndSignsIn() {
        // login the website
        click(mensClothingNew.signIn);
        waitSomeTime(1000L);

        String email = "mehmetvural@chindamanee.ac.th";
        String password = "Context@2021";
        sendKeysValue(email, mensClothingNew.username);
        sendKeysValue(password, mensClothingNew.password);
        click(mensClothingNew.signInButton);
        waitSomeTime(1000L);
    }

    @When("user lands on All Men's Clothing page and verifies")
    public void userLandsOnAllMenSClothingPageAndVerifies() {
        //click menu
        moveToElement(mensClothingNew.categories);
        moveToElement(mensClothingNew.menscloth);
        waitSomeTime(1000L);
        moveAndClickToElement(mensClothingNew.allMen);
        //verify the page
        String expected = "Men's Clothing";
        waitSomeTime(1000L);
        textIsDisplayedAndEnabled(expected, mensClothingNew.mensClothingText);
    }

    @And("user verifies that first product's features are present")
    public void userVerifiesThatFirstProductSFeaturesArePresent() {
        //verifies product's features
        imageIsDisplayedAndEnabled(mensClothingNew.firstItemImage);
        String expected = "Bella canvas";
        textIsDisplayedAndEnabled(expected, mensClothingNew.firstItemBrandName);
        expected = "Unisex CVC SS Tee | 3001 Bella Canvas";
        textIsDisplayedAndEnabled(expected, mensClothingNew.firstItemTitle);
        expected = "$9.99";
        textIsDisplayedAndEnabled(expected, mensClothingNew.firstItemPrice);
    }

    @Then("user clicks on first product and verifies")
    public void userClicksOnFirstProductAndVerifies() {
        click(mensClothingNew.firstItemImage);
        waitSomeTime(1000L);
        String expected = "Unisex CVC SS Tee …";
        textIsDisplayedAndEnabled(expected, mensClothingNew.firstItemName);
    }
}
