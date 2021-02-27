package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.LogIn;
import org.cb.contextCustom.utils.ConfigurationReader;
import org.cb.contextCustom.utils.MyDriver;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogInStepdefs extends Base {
    LogIn logIn = new LogIn();
    Logger logger = LoggerFactory.getLogger(LogInStepdefs.class);
    @Given("User is in the contextcustom.com homepage")
    public void userIsInTheContextcustomComHomepage() {
        MyDriver.get().get(ConfigurationReader.getProperty("baseUrl"));
        String expected = "Context Custom";
        String actual = MyDriver.get().getTitle();
        Assert.assertEquals(expected, actual);
        logger.info("contextcustom.com website title is {}", actual);
        waitSomeTime(1000L);
    }
    @When("User clicks to signin")
    public void userClicksToSignin() {
        moveAndClickToElement(logIn.signIn);
        waitSomeTime(1000L);
    }

    @And("User enters correct {string} in the signin section")
    public void userEntersCorrectInTheSigninSection(String arg0) {
        sendKeysValue("kutluhang@yahoo.com", logIn.eMail);
        sendKeysValue("123456", logIn.password);
        waitSomeTime(1000L);

    }

    @Then("User clicks Sign In button in the signin section")
    public void userClicksSignInButtonInTheSigninSection() {
        moveAndClickToElement(logIn.signInButton);
        waitSomeTime(10000L);
    }

    @And("User enters incorrect {string} in the signin section")
    public void userEntersIncorrectInTheSigninSection(String arg0) {
        sendKeysValue("utluhang@yahoo.com", logIn.eMail);
        sendKeysValue("12345", logIn.password);
        waitSomeTime(1000L);
    }
}
