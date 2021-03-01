package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.NewProducts;

public class NewProductsSteps extends Base {

    NewProducts newProducts = new NewProducts();

    @When("User verifies that product images are displayed")
    public void userVerifiesThatProductImagesAreDisplayed() {

        imageIsDisplayedAndEnabled(newProducts.unisexVNeckTeeImage);

        imageIsDisplayedAndEnabled(newProducts.unisexSpongeFleeceImage);

        imageIsDisplayedAndEnabled(newProducts.babyJerseyImage);

        imageIsDisplayedAndEnabled(newProducts.embroideredApronImage);

    }

    @And("User verifies that product names are present")
    public void userVerifiesThatProductNamesArePresent() {

        String expected = "Unisex V-Neck Tee | Bella + Canvas 3005";
        textIsDisplayedAndEnabled(expected,newProducts.unisexVNeckTeeName);

        expected = "Unisex Sponge Fleece Drop Shoulder Sweatshirt | 3945 Bella Canvas";
        textIsDisplayedAndEnabled(expected, newProducts.unisexSpongeFleeceName);

        expected = "Baby Jersey Short Sleeve One Piece | 100B Bella Canvas";
        textIsDisplayedAndEnabled(expected,newProducts.babyJerseyName);

        expected = "Embroidered Apron";
        textIsDisplayedAndEnabled(expected,newProducts.embroideredApronName);

    }

    @And("User verifies that product prices are present")
    public void userVerifiesThatProductPricesArePresent() {

        String expected = "$4.85";
        textIsDisplayedAndEnabled(expected,newProducts.unisexVNeckTeePrice);

        expected = "$18.73";
        textIsDisplayedAndEnabled(expected,newProducts.unisexSpongeFleecePrice);

        expected = "$9.95";
        textIsDisplayedAndEnabled(expected,newProducts.babyJerseyPrice);

        expected = "$16.50";
        textIsDisplayedAndEnabled(expected,newProducts.embroideredApronPrice);

    }

    @And("User verifies that brand names are present")
    public void userVerifiesThatBrandNamesArePresent() {

        String expected = "Bella canvas";
        textIsDisplayedAndEnabled(expected,newProducts.unisexVNeckTeeBrand);

        expected = "Bella canvas";
        textIsDisplayedAndEnabled(expected,newProducts.unisexSpongeFleeceBrand);

        expected = "Bella canvas";
        textIsDisplayedAndEnabled(expected,newProducts.babyJerseyBrand);

        expected = "Context";
        textIsDisplayedAndEnabled(expected,newProducts.embroideredApronBrand);

    }

    @Then("User verifies that design&buy buttons are present")
    public void userVerifiesThatDesignBuyButtonsArePresent() {

        moveToElement(newProducts.vNeckTee);
        logger.info("Moves to Unisex V-Neck Tee");
        waitSomeTime(3000L);
        imageIsDisplayedAndEnabled(newProducts.unisexVNeckTeeDesignButton);

        moveToElement((newProducts.sweatshirt));
        logger.info("Moves to Unisex Sponge Fleece Drop Shoulder Sweatshirt");
        waitSomeTime(5000L);
        imageIsDisplayedAndEnabled(newProducts.unisexSpongeFleeceDesignButton);

        moveToElement(newProducts.babyJersey);
        logger.info("Moves to Baby Jersey Short Sleeve One Piece");
        waitSomeTime(3000L);
        imageIsDisplayedAndEnabled(newProducts.babyJerseyDesignButton);

        moveToElement(newProducts.apron);
        logger.info("Moves to Embroidered Apron");
        waitSomeTime(5000L);
        imageIsDisplayedAndEnabled(newProducts.embroideredApronDesignButton);

    }

    @Then("User clicks on More Products button and verifies the page")
    public void userClicksOnMoreProductsButtonAndVerifiesThePage() {
        newProducts.moreProductsButton.click();
        logger.info("Clicks on More Products Button");
        newProducts.productCatalog.isDisplayed();
        logger.info("Product Catalog is present");
    }


}
