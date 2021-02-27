package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.BrandLogosNew;

public class BrandLogosNewSteps extends Base {
    BrandLogosNew brandLogosNew = new BrandLogosNew();


    @When("User verifies that Brands is present")
    public void userVerifiesThatBrandsIsPresent() {
        String expected = "Brands";
        String actual = brandLogosNew.brands.getText();
        verifyTheText(expected,actual);

    }

    @And("user verifies that {string} are displayed")
    public void userVerifiesThatAreDisplayed(String value) {
        if (value.equals(brandLogosNew.contexCustomLogo.getAttribute("alt"))) {
            imageIsDisplayedAndEnabled(brandLogosNew.contexCustomLogo);

        } else if (value.equals(brandLogosNew.gildan.getAttribute("alt"))) {
            imageIsDisplayedAndEnabled(brandLogosNew.gildan);

        } else if (value.equals(brandLogosNew.bellaCanvas.getAttribute("alt"))) {
            imageIsDisplayedAndEnabled(brandLogosNew.bellaCanvas);

        } else {
            logger.warn("Failed");

        }
    }
}
