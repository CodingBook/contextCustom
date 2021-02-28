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

    @And("User enters correct email {string} in the signin section")
    public void userEntersCorrectEmailInTheSigninSection(String arg0) {
        logIn.eMail.sendKeys(arg0);
        waitSomeTime(1000L);
    }

    @And("User enters correct password {string} in the signin section")
    public void userEntersCorrectPasswordInTheSigninSection(String arg0) {
        logIn.password.sendKeys(arg0);
        waitSomeTime(1000L);
    }

    @And("User enters incorrect email {string} in the signin section")
    public void userEntersIncorrectEmailInTheSigninSection(String arg0) {
        logIn.eMail.sendKeys(arg0);
        waitSomeTime(1000L);
    }

    @And("User enters incorrect password {string} in the signin section")
    public void userEntersIncorrectPasswordInTheSigninSection(String arg0) {
        logIn.password.sendKeys(arg0);
        waitSomeTime(1000L);
    }

    @Then("User clicks Sign In button in the signin section")
    public void userClicksSignInButtonInTheSigninSection() {
        logIn.signInButton.click();
        waitSomeTime(5000L);
    }
}
