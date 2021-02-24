package org.cb.contextCustom.stepdef;

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
}
