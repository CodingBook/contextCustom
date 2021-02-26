package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import org.cb.contextCustom.pages.DesignKidsAndYouthClothing;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DesignKidsAndYouthClothingSteps extends Base{

    DesignKidsAndYouthClothing designKidsAndYouthClothing = new DesignKidsAndYouthClothing();
    Logger logger = LoggerFactory.getLogger(DesignKidsAndYouthClothingSteps.class);

    @And("move on to Kids and Youth Clothing button")
    public void moveOnToKidsAndYouthClothingButton() {
        moveToElement(designKidsAndYouthClothing.kidsAndYouthClothing);
    }

    @And("move on to All Kids and Youth Clothing button and click")
    public void moveOnToAllKidsAndYouthClothingButtonAndClick() {
        moveAndClickToElement(designKidsAndYouthClothing.allKindAndYouthClothing);
    }

    @And("selects the first Kids and Youth Clothing product in the page")
    public void selectsTheFirstKidsAndYouthClothingProductInThePage() {
        moveAndClickToElement(designKidsAndYouthClothing.firstKindAndYouthClothingProduct);
    }
}
