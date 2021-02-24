package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.AccessoriesPage;

public class AccessoriesStepDef extends Base{

    AccessoriesPage accessoriesPage=new AccessoriesPage();

    @When("move on to Categories dropdown menu for Accessories")
    public void moveOnToCategoriesDropdownMenuForAccessories() {
        moveToElement(accessoriesPage.categories);

    }
    @When("move on to Accessories")
    public void move_on_to_Accessories() {
      //  waitSomeTime(3000L);
        moveToElement(accessoriesPage.accessories);
    }
    @Then("move on to All Accessories and click")
    public void move_on_to_All_Accessories_and_click() {
       moveAndClickToElement(accessoriesPage.allAccessories);
    }
    @Then("verify  Accessories text is present")
    public void verify_Accessories_text_is_present() {
        String expected = "Accessories";
        String actual = accessoriesPage.textOfAccessories.getText();
        verifyTheText(actual, expected);
    }


}
