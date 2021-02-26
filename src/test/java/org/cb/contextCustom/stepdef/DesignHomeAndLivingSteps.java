package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import org.cb.contextCustom.pages.DesignHomeAndLiving;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DesignHomeAndLivingSteps extends Base{

    DesignHomeAndLiving designHomeAndLiving = new DesignHomeAndLiving();
    Logger logger = LoggerFactory.getLogger(DesignHomeAndLivingSteps.class);

    @And("move on to Home and Living button")
    public void moveOnToHomeAndLivingButton() {
        moveToElement(designHomeAndLiving.homeAndLiving);
    }

    @And("move on to All Home and Living button and click")
    public void moveOnToAllHomeAndLivingButtonAndClick() {
        moveAndClickToElement(designHomeAndLiving.allHomeAndLiving);
    }

    @And("selects the first Home and Living product in the page")
    public void selectsTheFirstHomeAndLivingProductInThePage() {
        moveAndClickToElement(designHomeAndLiving.firstHomeAndLivingProduct);
    }
}
