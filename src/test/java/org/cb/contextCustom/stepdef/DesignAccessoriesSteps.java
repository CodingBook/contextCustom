package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.cb.contextCustom.pages.DesignAccessories;
import org.cb.contextCustom.pages.MainPage;
import org.cb.contextCustom.utils.MyDriver;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DesignAccessoriesSteps extends Base{

    DesignAccessories designAccessories = new DesignAccessories();
    Logger logger = LoggerFactory.getLogger(DesignAccessoriesSteps.class);

    @Then("Login an account")
    public void loginAnAccount() {
        waitSomeTime(5L);
        designAccessories.myAccount.click();
        designAccessories.username.sendKeys("fakirsule001@gmail.com");
        designAccessories.password.sendKeys("1qaz2wsx");
        designAccessories.signIn.click();
        waitSomeTime(1000L);
    }

    @And("move on to categories button")
    public void moveOnToCategoriesButton() {moveToElement(designAccessories.categories); }

    @And("move on to accessories button")
    public void moveOnToAccessoriesButton() {
        moveToElement(designAccessories.accessories);
    }

    @And("move on to All accessories button and click")
    public void moveOnToAllAccessoriesButtonAndClick() {
        moveAndClickToElement(designAccessories.allAccessories);
    }

    @And("selects the first product in the page")
    public void selectsTheFirstProductInThePage() {
        waitSomeTime(5L);
        moveAndClickToElement(designAccessories.firstProduct);
    }

    @And("clicks on Start Designing button")
    public void clicksOnStartDesigningButton() {
        designAccessories.designingButton.click();
        designAccessories.startTyping.sendKeys("hello");
        designAccessories.addTextButton.click();
    }

    @And("selecting text color, outline shadow and font")
    public void selectingTextColorOutlineShadowAndFont() {
        designAccessories.textColor.click();
        designAccessories.blueSelect.click();
        designAccessories.outLine.click();
        designAccessories.outLineSelect.click();
        designAccessories.shadow.click();
        designAccessories.blackSelect.click();
    }

    @And("select The oswald font And Verify")
    public void selectTheOswaldFontAndVerify() {
        waitSomeTime(5L);
        Select select = new Select(designAccessories.fontFamily);
        scrollDown(designAccessories.oswaldFont);
        select.selectByVisibleText("Oswald");
    }

    @And("select The quantity And Verify")
    public void selectTheQuantityAndVerify() {
        waitSomeTime(5L);
        Select select = new Select(designAccessories.howMany);
        scrollDown(designAccessories.quantity);
        select.selectByVisibleText("10");
        waitSomeTime(5L);
        designAccessories.addToCartButton.click();
        waitSomeTime(5L);
    }

    @And("User verifies that cart heading is present")
    public void userVerifiesThatCartHeadingIsPresent() {
        String expected = "Your cart";
        textIsDisplayedAndEnabled(expected,designAccessories.cart);
    }

}
