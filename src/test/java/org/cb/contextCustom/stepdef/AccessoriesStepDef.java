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

    @Then("move on to Accessories and move on to All Accessories and click")
    public void moveOnToAccessoriesAndMoveOnToAllAccessoriesAndClick() {
        moveAndClickToElement(accessoriesPage.allAccessories);
        moveToElement(accessoriesPage.categories);
    }

    @Then("verify  Accessories text is present")
    public void verify_Accessories_text_is_present() {
        String expected = "Accessories";
        String actual = accessoriesPage.textOfAccessories.getText();
        verifyTheText(actual, expected);
    }

    @Then("verify ToteBag image,brand,price is present")
    public void verifyToteBagImageBrandPriceIsPresent() {
        (accessoriesPage.toteBagImage).isDisplayed();
        //brand
        String expected="Context";
        String actual=accessoriesPage.toteBagBrand.getText();
        verifyTheText(actual,expected);
        //price
        String expectedP="$19.99";
        String actualP=accessoriesPage.toteBagPrice.getText();
        verifyTheText(actualP,expectedP);
    }

    @Then("verify ToteBag item text is present")
    public void verify_ToteBag_item_text_is_present() {
        String expected="Organic Tote Bag";
        String actual=accessoriesPage.organicToteBagText.getText();
        verifyTheText(actual,expected);
    }

    @Then("click on ToteBag item picture")
    public void click_on_ToteBag_item_picture() {
        click(accessoriesPage.toteBagImage);
    }

    @Then("verify ToteBag item name is present")
    public void verify_ToteBag_item_name_is_present() {

    }


}
