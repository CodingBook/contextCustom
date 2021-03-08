package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.Then;

import org.cb.contextCustom.pages.LogoPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogoStepDefinitions extends Base {

    LogoPage logopage=new LogoPage();
    Logger logger = LoggerFactory.getLogger(LogoStepDefinitions.class);

    @Then("user should click Logo")
    public void user_should_click_Logo() {
    logopage.brandLogo.click();
    waitSomeTime(1000L);
    logger.info("Logo is clickable");
    }


    @Then("user verify the Logo  is displayed")
    public void user_verify_the_Logo_is_displayed() {
    logopage.brandLogo.isDisplayed();
    waitSomeTime(1000L);
    logger.info("Logo image is displayed");
    }

    @Then("user  enabled to see {string}")
    public void userEnabledToSee(String text) {
        textIsDisplayedAndEnabled(text, logopage.Fast_and_free_delivery);
        textIsDisplayedAndEnabled(text, logopage.Money_back_guarantee);
        textIsDisplayedAndEnabled(text, logopage.customerSupport);
        textIsDisplayedAndEnabled(text, logopage.SecureOnlinePayment);

//        System.out.println(logopage.Fast_and_free_delivery.getText());
//        System.out.println(text);

    }

    @Then("user  enabled to see address on displayed")
    public void user_enabled_to_see_address_on_displayed() {
      //  imageIsDisplayedAndEnabled(logopage.address);
        //waitSomeTime(1000L);
        // logger.info("adress is displayed");
        //}
        String expected = "Address: 1002 Texas Pkwy Suite E Stafford TX 77477";
        waitSomeTime(1000L);
        textIsDisplayedAndEnabled(expected,logopage.address);
    }




}
