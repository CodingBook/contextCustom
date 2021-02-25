package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.cb.contextCustom.pages.HatsPage;

public class HatsStepDef extends Base {

    HatsPage hatsPage=new HatsPage();

    @Then("move to Hats")
    public void move_to_Hats() {
        moveToElement(hatsPage.hats);
    }


    @Then("click on All Hats")
    public void click_on_All_Hats() {
       moveAndClickToElement(hatsPage.allHats);
    }


    @Then("verify Hats page is displayed")
    public void verify_Hats_page_is_displayed() {
        String expected = "Hats";
        String actual = hatsPage.textOfHats.getText();
        verifyTheText(actual, expected);
    }
    @Then("verify Cuffed Beanie image is present")
    public void verifyCuffedBeanieImageIsPresent() {
        hatsPage.cuffedBeanieImage.isDisplayed();
    }

    @And("verify  Cuffed Beanie item brand name is present")
    public void verifyCuffedBeanieItemBrandNameIsPresent() {
        hatsPage.cuffedBeanieBrand.isDisplayed();
    }

    @Then("verify Cuffed Beanie item text is present")
    public void verifyCuffedBeanieItemTextIsPresent() {
        String expected="Cuffed Beanie | Context B110";
        String actual=hatsPage.cuffedBeanieText.getText();
        verifyTheText(actual,expected);
    }

    @And("verify Cuffed Beanie item price is present")
    public void verifyCuffedBeanieItemPriceIsPresent() {
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
