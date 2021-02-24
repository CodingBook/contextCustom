package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.cb.contextCustom.pages.MensClothing;

public class MensClothingSteps extends Base{
    MensClothing mensClothing = new MensClothing();

    @Then("move on to Men's Clothing sub-menu")
    public void moveOnToMenSClothingSubMenu() {
        moveToElement(mensClothing.menscloth);
        waitSomeTime(1000L);
    }

    @And("move and click on All Men's Clothing")
    public void moveAndClickOnAllMenSClothing() {
        moveAndClickToElement(mensClothing.allMen);
    }

    @Then("verify that Men's Clothing text is present")
    public void verifyThatMenSClothingTextIsPresent() {
        String expected = "Men's Clothing";
        waitSomeTime(1000L);
        textIsDisplayedAndEnabled(expected, mensClothing.mensClothingText);
    }
}
