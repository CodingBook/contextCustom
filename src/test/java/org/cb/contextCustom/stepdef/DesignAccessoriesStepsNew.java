package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.DesignAccessoriesNew;
import org.openqa.selenium.support.ui.Select;

public class DesignAccessoriesStepsNew extends Base{

    DesignAccessoriesNew designAccessoriesNew = new DesignAccessoriesNew();

    @When("user lands on all accessories and verifies")
    public void userLandsOnAllAccessoriesAndVerifies() {
        moveToElement(designAccessoriesNew.categories);
        moveToElement(designAccessoriesNew.accessories);
        moveAndClickToElement(designAccessoriesNew.allAccessories);
    }

    @And("user clicks the first product in the page")
    public void userClicksTheFirstProductInThePage() {
        waitSomeTime(5L);
        moveAndClickToElement(designAccessoriesNew.firstProduct);
    }

    @And("user sets the design features")
    public void userSetsTheDesignFeatures() {
        designAccessoriesNew.designingButton.click();
        designAccessoriesNew.startTyping.sendKeys("hello");
        designAccessoriesNew.addTextButton.click();

        designAccessoriesNew.textColor.click();
        designAccessoriesNew.blueSelect.click();
        designAccessoriesNew.outLine.click();
        designAccessoriesNew.outLineSelect.click();
        designAccessoriesNew.shadow.click();
        designAccessoriesNew.blackSelect.click();

        waitSomeTime(5L);
        Select select = new Select(designAccessoriesNew.fontFamily);
        scrollDown(designAccessoriesNew.oswaldFont);
        select.selectByVisibleText("Oswald");
    }

    @Then("User selects the product quantity and verifies")
    public void userSelectsTheProductQuantityAndVerifies() {

        waitSomeTime(5L);
        Select select = new Select(designAccessoriesNew.howMany);
        scrollDown(designAccessoriesNew.quantity);
        select.selectByVisibleText("10");
        waitSomeTime(5L);
        designAccessoriesNew.addToCartButton.click();
        waitSomeTime(5L);

        String expected = "Your cart";
        textIsDisplayedAndEnabled(expected,designAccessoriesNew.cart);

    }
}
