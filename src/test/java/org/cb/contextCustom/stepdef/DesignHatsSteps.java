package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import org.cb.contextCustom.pages.DesignHats;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DesignHatsSteps extends Base {

    DesignHats designHats = new DesignHats();
    Logger logger = LoggerFactory.getLogger(DesignHatsSteps.class);

    @And("move on to hats button")
    public void moveOnToHatsButton() {
        moveToElement(designHats.hats);
    }

    @And("move on to All hats button and click")
    public void moveOnToAllHatsButtonAndClick() {moveAndClickToElement(designHats.allHats);
    }

    @And("selects the first hat in the page")
    public void selectsTheFirstHatInThePage() {moveAndClickToElement(designHats.firstHat);
    }
}
