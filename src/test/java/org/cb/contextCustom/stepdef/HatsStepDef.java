package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.cb.contextCustom.pages.HatsPage;

public class HatsStepDef extends Base {

    HatsPage hatsPage=new HatsPage();

    @Then("move to Hats and click on All Hats")
    public void moveToHatsAndClickOnAllHats() {
        moveToElement(hatsPage.hats);
        moveAndClickToElement(hatsPage.allHats);
    }

    @Then("verify Hats page is displayed")
    public void verify_Hats_page_is_displayed() {
        String expected = "Hats";
        String actual = hatsPage.textOfHats.getText();
        verifyTheText(actual, expected);
    }

    @Then("verify Cuffed Beanie image,brand,text,price is present")
    public void verifyCuffedBeanieImageBrandTextPriceIsPresent() {
        hatsPage.cuffedBeanieImage.isDisplayed();
        hatsPage.cuffedBeanieBrand.isDisplayed();
        String expected="Cuffed Beanie | Context B110";
        String actual=hatsPage.cuffedBeanieText.getText();
        verifyTheText(actual,expected);
        hatsPage.cuffedBeaniePrice.isDisplayed();
    }

    @And("click on Cuffed Beanie item picture")
    public void clickOnCuffedBeanieItemPicture() {
        click(hatsPage.cuffedBeanieImage);
    }

    @Then("verify Cuffed Beanie item name is present")
    public void verifyCuffedBeanieItemNameIsPresent() {
    }
}
