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
}
