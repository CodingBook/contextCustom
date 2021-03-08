package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.AccessoriesPage;

public class AccessoriesStepDef extends Base{

    AccessoriesPage accessoriesPage=new AccessoriesPage();

    @When("user lands on All Accessories page and verifies")
    public void userLandsOnAllAccessoriesPageAndVerifies() {
        moveToElement(accessoriesPage.allProducts);
        moveToElement(accessoriesPage.accessories);
        moveAndClickToElement(accessoriesPage.allAccessories);

        String expected = "Accessories";
        String actual = accessoriesPage.textOfAccessories.getText();
        verifyTheText(actual, expected);
    }

    @And("user verifies that first Accessories product features are present")
    public void userVerifiesThatFirstAccessoriesProductFeaturesArePresent() {
        (accessoriesPage.toteBagImage).isDisplayed();
        //brand
        String expected="Context";
        String actual=accessoriesPage.toteBagBrand.getText();
        verifyTheText(actual,expected);
        //price
        String expectedP="$19.99";
        String actualP=accessoriesPage.toteBagPrice.getText();
        verifyTheText(actualP,expectedP);
        //text
        String expectedB="Organic Tote Bag";
        String actualB=accessoriesPage.organicToteBagText.getText();
        verifyTheText(actualB,expectedB);
    }

    @Then("user clicks on first Accessories product and verifies")
    public void userClicksOnFirstAccessoriesProductAndVerifies() {
        click(accessoriesPage.toteBagImage);
        //nothing behind
    }

}
