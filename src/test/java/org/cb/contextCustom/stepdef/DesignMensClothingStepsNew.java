package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.DesignMensClothingNew;

public class DesignMensClothingStepsNew extends Base{

    DesignMensClothingNew designMensClothingNew = new DesignMensClothingNew();

    @When("user lands on all Mens Clothing and verifies")
    public void userLandsOnAllMensClothingAndVerifies() {

        moveToElement(designMensClothingNew.allProducs);
        moveToElement(designMensClothingNew.mensClothing);
        moveAndClickToElement(designMensClothingNew.allMensClothing);

    }
}
