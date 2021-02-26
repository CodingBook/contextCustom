package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.MainPageCustomPrint;

public class MainPageCustomPrintSteps extends Base {
    MainPageCustomPrint mainPageCustomPrint = new MainPageCustomPrint();

    @Given("User verifies that heading and subheading are present")
    public void userVerifiesThatHeadingAndSubheadingArePresent() {
        String expected = "Custom printed & embroidered products";
        String actual = mainPageCustomPrint.customPrintHeading.getText();
        verifyTheText(actual,expected);

        expected = "Order custom design products for yourself or sell them online under your own brand";
        actual = mainPageCustomPrint.customPrintSubheading.getText();
        verifyTheText(actual,expected);


    }

    @When("Verifies that Make an Order is present")
    public void verifiesThatMakeAnOrderIsPresent() {
        String expected = "We'll print & ship it for you!";
        String actual = mainPageCustomPrint.printAndShip.getText();
        verifyTheText(actual,expected);

        expected = "Customize for yourself or for your customers";
        actual = mainPageCustomPrint.customizeYourselfText.getText();
        verifyTheText(actual,expected);

        mainPageCustomPrint.makeAnOrderButton.isEnabled();

        imageIsDisplayedAndEnabled(mainPageCustomPrint.makeAnOrderImage);

    }

    @And("Verifies that Print Now is present")
    public void verifiesThatPrintNowIsPresent() {
        String expected = "Bring Your Own Tee";
        String actual = mainPageCustomPrint.bringYourTee.getText();
        verifyTheText(actual,expected);

        expected = "Supply from you print from us";
        actual = mainPageCustomPrint.supplyFromYouText.getText();
        verifyTheText(actual,expected);

        mainPageCustomPrint.printNowButton.isEnabled();

        imageIsDisplayedAndEnabled(mainPageCustomPrint.printNowImage);

    }


}

