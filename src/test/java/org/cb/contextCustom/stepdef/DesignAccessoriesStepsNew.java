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
        waitSomeTime(500L);
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

        waitSomeTime(1000L);
        scrollDown(designAccessoriesNew.oswaldFont);
//        Select select = new Select(designAccessoriesNew.fontFamily);
//        select.selectByVisibleText("Oswald");
        selectFromDropDownMenu("Oswald", designAccessoriesNew.fontFamily);
    }

    @Then("User selects the product quantity and verifies")
    public void userSelectsTheProductQuantityAndVerifies() {

        waitSomeTime(1000L);
        Select select = new Select(designAccessoriesNew.howMany);
        scrollDown(designAccessoriesNew.quantity);
        select.selectByVisibleText("10");
        waitSomeTime(1000L);
        designAccessoriesNew.addToCartButton.click();
        waitSomeTime(1000L);

        String expected = "My cart";
        textIsDisplayedAndEnabled(expected,designAccessoriesNew.cart);
    }
}
