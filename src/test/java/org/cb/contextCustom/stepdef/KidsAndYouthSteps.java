package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.KidsAndYouth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KidsAndYouthSteps extends Base{
    KidsAndYouth kidsAndYouth = new KidsAndYouth();
    Logger logger = LoggerFactory.getLogger(KidsAndYouthSteps.class);

    @Given("User is in landing page and sign in")
    public void userIsInLandingPageAndSignIn() {
        click(kidsAndYouth.signIn);
        waitSomeTime(1000L);
        String email = "mehmetvural@chindamanee.ac.th";
        String password = "Context@2021";
        sendKeysValue(email, kidsAndYouth.username);
        sendKeysValue(password, kidsAndYouth.password);
        click(kidsAndYouth.signInButton);
        waitSomeTime(1000L);
    }

    @Then("move on to Kids&Youth Clothing sub-menu")
    public void moveOnToKidsYouthClothingSubMenu() {
        moveToElement(kidsAndYouth.kidsAndYouth);
        waitSomeTime(1000L);
    }

    @And("move and click on All Kids&Youth Clothing")
    public void moveAndClickOnAllKidsYouthClothing() {
        moveAndClickToElement(kidsAndYouth.allKids);
    }

    @Then("verify that Kids&Youth Clothing text is present")
    public void verifyThatKidsYouthClothingTextIsPresent() {
        String expected = "Kids & Youth Clothing";
        waitSomeTime(1000L);
        textIsDisplayedAndEnabled(expected, kidsAndYouth.KidsYouthClothingText);
    }

    @And("verify that first kids item image is present")
    public void verifyThatFirstKidsItemImageIsPresent() {
        imageIsDisplayedAndEnabled(kidsAndYouth.firstItemImage);
    }

    @And("verify that kids item brand name is present")
    public void verifyThatKidsItemBrandNameIsPresent() {
        String expected = "Bella canvas";
        textIsDisplayedAndEnabled(expected, kidsAndYouth.firstItemBrandName);
    }

    @Then("verify that kids item title is present")
    public void verifyThatKidsItemTitleIsPresent() {
        String expected = "Baby Jersey Short Sleeve Tee | 3001B Bella Canvas";
        textIsDisplayedAndEnabled(expected, kidsAndYouth.firstItemTitle);
    }

    @And("verify that kids item price is present")
    public void verifyThatKidsItemPriceIsPresent() {
        String expected = "$8.76";
        textIsDisplayedAndEnabled(expected, kidsAndYouth.firstItemPrice);
    }

    @And("click on first kids item picture")
    public void clickOnFirstKidsItemPicture() {
        click(kidsAndYouth.firstItemImage);
        waitSomeTime(1000L);
    }

    @Then("verify that first kids item name is present")
    public void verifyThatFirstKidsItemNameIsPresent() {
        String expected = "Baby Jersey Short Sleeve …";
        textIsDisplayedAndEnabled(expected, kidsAndYouth.firstItemName);
    }
}
