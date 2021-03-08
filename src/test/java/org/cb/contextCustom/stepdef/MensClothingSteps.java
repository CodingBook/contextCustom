package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.MensClothing;

public class MensClothingSteps extends Base{
    MensClothing mensClothing = new MensClothing();

    @Given("user is in landing page and signs in")
    public void userIsInLandingPageAndSignsIn() {
        // login the website
        click(mensClothing.signIn);
        waitSomeTime(1000L);

        String email = "mehmetvural@chindamanee.ac.th";
        String password = "Context@2021";
        sendKeysValue(email, mensClothing.username);
        sendKeysValue(password, mensClothing.password);
        click(mensClothing.signInButton);
        waitSomeTime(1000L);
    }

    @When("user lands on All Men's Clothing page and verifies")
    public void userLandsOnAllMenSClothingPageAndVerifies() {
        //click menu
        moveToElement(mensClothing.categories);
        moveToElement(mensClothing.menscloth);
        waitSomeTime(1000L);
        moveAndClickToElement(mensClothing.allMen);
        //verify the page
        String expected = "Men's Clothing";
        waitSomeTime(1000L);
        textIsDisplayedAndEnabled(expected, mensClothing.mensClothingText);
    }

    @And("user verifies that first product's features are present")
    public void userVerifiesThatFirstProductSFeaturesArePresent() {
        //verifies product's features
        imageIsDisplayedAndEnabled(mensClothing.firstItemImage);
        String expected = "Bella canvas";
        textIsDisplayedAndEnabled(expected, mensClothing.firstItemBrandName);
        expected = "Unisex CVC SS Tee | 3001 Bella Canvas";
        textIsDisplayedAndEnabled(expected, mensClothing.firstItemTitle);
        expected = "$9.99";
        textIsDisplayedAndEnabled(expected, mensClothing.firstItemPrice);
    }

    @Then("user clicks on first product and verifies")
    public void userClicksOnFirstProductAndVerifies() {
        click(mensClothing.firstItemImage);
        waitSomeTime(1000L);
        String expected = "Unisex CVC SS Tee …";
        textIsDisplayedAndEnabled(expected, mensClothing.firstItemName);
    }
}
