package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.DesignWomensClothingNew;

public class DesignWomensClothingStepsNew extends Base{

    DesignWomensClothingNew designWomensClothingNew = new DesignWomensClothingNew();

    @When("user lands on all Women's Clothing and verifies")
    public void userLandsOnAllWomenSClothingAndVerifies() {
        moveToElement(designWomensClothingNew.allProducs);
        moveToElement(designWomensClothingNew.womensClothing);
        moveAndClickToElement(designWomensClothingNew.allWomensClothing);
    }
}
