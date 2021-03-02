package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.HatsPage;

public class HatsStepDef extends Base {

    HatsPage hatsPage=new HatsPage();

    @When("user lands on All Hats page and verifies")
    public void userLandsOnAllHatsPageAndVerifies() {
        waitSomeTime(2000L);
        moveToElement(hatsPage.allProducts);
        moveToElement(hatsPage.hats);
        moveAndClickToElement(hatsPage.allHats);

        String expected = "Hats";
        String actual = hatsPage.textOfHats.getText();
        verifyTheText(actual, expected);

    }

    @And("user verifies that first Hats product features are present")
    public void userVerifiesThatFirstHatsProductFeaturesArePresent() {

        hatsPage.cuffedBeanieImage.isDisplayed();
        hatsPage.cuffedBeanieBrand.isDisplayed();
        String expected1="Cuffed Beanie | Context B110";
        String actual1=hatsPage.cuffedBeanieText.getText();
        verifyTheText(actual1,expected1);
        hatsPage.cuffedBeaniePrice.isDisplayed();
    }

    @Then("user clicks on first Hats product and verifies")
    public void userClicksOnFirstHatsProductAndVerifies() {
        click(hatsPage.cuffedBeanieImage);//nothing behind
       // hatsPage.cuffedBeanieTextOnPage.isDisplayed();
    }
}
