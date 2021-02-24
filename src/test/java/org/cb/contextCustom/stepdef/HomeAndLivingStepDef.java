package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.HomeAndLivingPage;

public class HomeAndLivingStepDef extends Base {

    HomeAndLivingPage homeAndLivingPage=new HomeAndLivingPage();

    @When("move on to Categories dropdown menu for Home & Living")
    public void move_on_to_Categories_dropdown_menu_for_Home_Living() {
        moveToElement(homeAndLivingPage.categories);
    }

    @When("move on to Home & Living")
    public void move_on_to_Home_Living() {
       moveToElement(homeAndLivingPage.homeAndLiving);
    }

    @Then("move on to All Home & Living Page and click")
    public void move_on_to_All_Home_Living_Page_and_click() {
       moveAndClickToElement(homeAndLivingPage.allHomeAndLiving);
    }

    @Then("verify  Home & Living  text is present")
    public void verify_Home_Living_text_is_present() {
        String expected="Home & Living";
        String actual = homeAndLivingPage.textOfHomeAndLiving.getText();
        verifyTheText(actual, expected);
    }

}
