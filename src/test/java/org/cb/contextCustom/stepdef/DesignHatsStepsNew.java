package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.DesignHatsNew;

public class DesignHatsStepsNew extends Base{

    DesignHatsNew designHatsNew = new DesignHatsNew();

    @When("user lands on all hats and verifies")
    public void userLandsOnAllHatsAndVerifies() {
//        waitSomeTime(1000L);
        moveToElement(designHatsNew.allProducs);
        moveToElement(designHatsNew.hats);
        moveAndClickToElement(designHatsNew.allHats);
    }

    @And("user clicks the first hat in the page")
    public void userClicksTheFirstHatInThePage() {
        moveAndClickToElement(designHatsNew.firstHat);
    }
}
