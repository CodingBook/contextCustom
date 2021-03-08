package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.DesignHomeAndLivingNew;

public class DesignHomeAndLivingStepsNew extends Base{

    DesignHomeAndLivingNew designHomeAndLivingNew = new DesignHomeAndLivingNew();

    @When("user lands on all Home and Living and verifies")
    public void userLandsOnAllHomeAndLivingAndVerifies() {
        moveToElement(designHomeAndLivingNew.allProduct);
        moveToElement(designHomeAndLivingNew.homeAndLiving);
        moveAndClickToElement(designHomeAndLivingNew.allHomeAndLiving);
    }
}
