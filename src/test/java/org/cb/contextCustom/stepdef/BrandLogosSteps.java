package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.BrandLogos;

public class BrandLogosSteps extends Base {
    BrandLogos brandLogos = new BrandLogos();


    @When("User verifies that Brands is present")
    public void userVerifiesThatBrandsIsPresent() {
        String expected = "Brands";
        String actual = brandLogos.brands.getText();
        verifyTheText(expected,actual);

    }

    @And("user verifies that {string} are displayed")
    public void userVerifiesThatAreDisplayed(String value) {
        if (value.equals(brandLogos.contexCustomLogo.getAttribute("alt"))) {
            imageIsDisplayedAndEnabled(brandLogos.contexCustomLogo);

        } else if (value.equals(brandLogos.gildan.getAttribute("alt"))) {
            imageIsDisplayedAndEnabled(brandLogos.gildan);

        } else if (value.equals(brandLogos.bellaCanvas.getAttribute("alt"))) {
            imageIsDisplayedAndEnabled(brandLogos.bellaCanvas);

        } else {
            logger.warn("Failed");

        }
    }
}
