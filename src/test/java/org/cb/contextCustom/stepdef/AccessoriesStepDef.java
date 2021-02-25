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
    @Then("verify ToteBag image is present")
    public void verify_ToteBag_image_is_present() {
        (accessoriesPage.toteBagImage).isDisplayed();
    }


    @Then("verify  ToteBag item brand name is present")
    public void verify_ToteBag_item_brand_name_is_present() {
        String expected="Contex";
        String actual=accessoriesPage.toteBagBrand.getText();
        verifyTheText(actual,expected);
    }

    @Then("verify ToteBag item text is present")
    public void verify_ToteBag_item_text_is_present() {
        String expected="Organic Tote Bag";
        String actual=accessoriesPage.organicToteBagText.getText();
        verifyTheText(actual,expected);
    }

    @Then("verify ToteBag item price is present")
    public void verify_ToteBag_item_price_is_present() {
        String expected="$19.99";
        String actual=accessoriesPage.toteBagPrice.getText();
        verifyTheText(actual,expected);
    }

    @Then("click on ToteBag item picture")
    public void click_on_ToteBag_item_picture() {
        click(accessoriesPage.toteBagImage);
    }

    @Then("verify ToteBag item name is present")
    public void verify_ToteBag_item_name_is_present() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
