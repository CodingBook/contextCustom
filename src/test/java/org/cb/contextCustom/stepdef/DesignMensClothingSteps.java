package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import org.cb.contextCustom.pages.DesignMensClothing;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DesignMensClothingSteps extends Base{

    DesignMensClothing designMensClothing = new DesignMensClothing();
    Logger logger = LoggerFactory.getLogger(DesignMensClothingSteps.class);

    @And("move on to Mens Clothing button")
    public void moveOnToMensClothingButton() {
        moveToElement(designMensClothing.mensClothing);
    }

    @And("move on to All Mens Clothing button and click")
    public void moveOnToAllMensClothingButtonAndClick() {
        moveAndClickToElement(designMensClothing.allMensClothing);
    }

    @And("selects the first Mens Clothing product in the page")
    public void selectsTheFirstMensClothingProductInThePage() {
        moveAndClickToElement(designMensClothing.firstMensClothingProduct);
    }
}
