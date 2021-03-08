package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.DesignKidsAndYouthClothingNew;

public class DesignKidsAndYouthClothingStepsNew extends Base{

    DesignKidsAndYouthClothingNew designKidsAndYouthClothingNew = new DesignKidsAndYouthClothingNew();

    @When("user lands on all Kids and Youth Clothing and verifies")
    public void userLandsOnAllKidsAndYouthClothingAndVerifies() {

        moveToElement(designKidsAndYouthClothingNew.allProducs);
        moveToElement(designKidsAndYouthClothingNew.kidsAndYouthClothing);
        moveAndClickToElement(designKidsAndYouthClothingNew.allKindAndYouthClothing);

    }
}
