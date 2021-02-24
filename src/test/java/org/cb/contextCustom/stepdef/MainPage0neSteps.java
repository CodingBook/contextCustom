package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.MainPageOne;
import org.cb.contextCustom.utils.ConfigurationReader;
import org.cb.contextCustom.utils.MyDriver;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainPage0neSteps extends Base {

    MainPageOne mainPageOne = new MainPageOne();
    Logger logger = LoggerFactory.getLogger(MainPage0neSteps.class);

    @Given("User is in landing page")
    public void userIsInLandingPage() {
        MyDriver.get().get(ConfigurationReader.getProperty("baseUrl"));
        String expected = "Context Custom";
        String actual = MyDriver.get().getTitle();
        Assert.assertEquals(expected, actual);
        logger.info("contextcustom.com website title is {}", actual);
    }

    @When("Verify that Context Custom logo is present")
    public void verifyThatContextCustomLogoIsPresent() {
        imageIsDisplayedAndEnabled(mainPageOne.logo);
    }

    @And("Verify that {string} is present")
    public void verifyThatIsPresent(String value) {
        if(value.equalsIgnoreCase(mainPageOne.howItWorks.getText())){
            textIsDisplayedAndEnabled(value,mainPageOne.howItWorks);
        }
        else if(value.equalsIgnoreCase(mainPageOne.freeMockups.getText())){
            textIsDisplayedAndEnabled(value, mainPageOne.freeMockups);
        }
        else if(value.equalsIgnoreCase(mainPageOne.buyDesigns.getText())){
            textIsDisplayedAndEnabled(value,mainPageOne.buyDesigns);
        }

        else logger.warn("Error");

    }
}
