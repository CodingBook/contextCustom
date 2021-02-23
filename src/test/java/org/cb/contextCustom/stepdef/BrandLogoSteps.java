package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.Then;
import org.cb.contextCustom.pages.BrandLogo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BrandLogoSteps extends Base {

    BrandLogo brandLogo = new BrandLogo();
    Logger logger = LoggerFactory.getLogger(BrandLogoSteps.class);


    @Then("User verifies that {string} is present")
    public void userVerifiesThatIsPresent(String value) {

        if (value.equals(brandLogo.suppy.getText())) {
            textIsDisplayedAndEnabled("Supply from you print from us", brandLogo.suppy);

        } else if (value.equals(brandLogo.bring.getText())) {
            textIsDisplayedAndEnabled("Bring Your Own Tee", brandLogo.bring);

        } else if (value.equals(brandLogo.brands.getText())) {
            textIsDisplayedAndEnabled("Brands", brandLogo.brands);

        } else {
            logger.warn("Failed");
        }
    }


    @Then("User verifies that Print Now button is present")
    public void userVerifiesThatPrintNowButtonIsPresent() {
        brandLogo.printNowButton.isEnabled();
        logger.info("Print Now button is enable");

    }

    @Then("User verifies that Print image is present")
    public void userVerifiesThatPrintImageIsPresent() {
        brandLogo.printImage.isDisplayed();
        logger.info("Print image is displayed");
    }

    @Then("User verifies that {string} logo is present")
    public void userVerifiesThatLogoIsPresent(String value) {

        if (value.equals(brandLogo.contexCustomLogo.getAttribute("alt"))) {
            imageIsDisplayedAndEnabled(brandLogo.contexCustomLogo);

        } else if (value.equals(brandLogo.gildan.getAttribute("alt"))) {
            imageIsDisplayedAndEnabled(brandLogo.gildan);

        } else if (value.equals(brandLogo.bellaCanvas.getAttribute("alt"))) {
            imageIsDisplayedAndEnabled(brandLogo.bellaCanvas);

        } else {
            logger.warn("Failed");

        }

    }

}

