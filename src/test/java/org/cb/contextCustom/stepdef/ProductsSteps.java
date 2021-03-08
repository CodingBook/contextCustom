package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.Products;

public class ProductsSteps extends Base {
    Products products = new Products();


    @When("user verifies that images {string} are displayed")
    public void userVerifiesThatImagesAreDisplayed(String value) {

        if (value.equals(products.accessoriesImage.getAttribute("alt"))) {
            imageIsDisplayedAndEnabled(products.accessoriesImage);

        } else if (value.equals(products.hatImage.getAttribute("alt"))) {
            imageIsDisplayedAndEnabled(products.hatImage);

        } else if (value.equals(products.homeLivingImage.getAttribute("alt"))) {
            imageIsDisplayedAndEnabled(products.homeLivingImage);

        } else if (value.equals(products.kidsYouthImage.getAttribute("alt"))) {
            imageIsDisplayedAndEnabled(products.kidsYouthImage);

        } else if (value.equals(products.mensClothingImage.getAttribute("alt"))) {
            imageIsDisplayedAndEnabled(products.mensClothingImage);

        } else if (value.equals(products.womensClothingImage.getAttribute("alt"))) {
            imageIsDisplayedAndEnabled(products.womensClothingImage);

        } else {
            logger.warn("Failed");
        }
    }


    @And("user verifies that headings {string} are displayed")
    public void userVerifiesThatHeadingsAreDisplayed(String value) {
        waitSomeTime(150L);

        if (value.equals(products.accessories.getText())) {
            textIsDisplayedAndEnabled("Accessories", products.accessories);

        } else if (value.equals(products.hats.getText())) {
            textIsDisplayedAndEnabled("Hats", products.hats);

        } else if (value.equals(products.homeLiving.getText())) {
            textIsDisplayedAndEnabled("Home & Living", products.homeLiving);

        } else if (value.equals(products.kidsYouthClothing.getText())) {
            textIsDisplayedAndEnabled("Kids & Youth Clothing", products.kidsYouthClothing);

        } else if (value.equals(products.mensClothing.getText())) {
            textIsDisplayedAndEnabled("Men's Clothing", products.mensClothing);

        } else if (value.equals(products.womensClothing.getText())) {
            textIsDisplayedAndEnabled("Women's Clothing", products.womensClothing);

        } else {
            logger.warn("Failed");
        }
    }

    @And("user verifies that names {string} are present")
    public void userVerifiesThatNamesArePresent(String value) {
        waitSomeTime(250L);

        if (value.equals(products.backpacks.getText())) {
            textIsDisplayedAndEnabled("Backpacks", products.backpacks);

        } else if (value.equals(products.beanies.getText())) {
            textIsDisplayedAndEnabled("Beanies", products.beanies);

        } else if (value.equals(products.blankets.getText())) {
            textIsDisplayedAndEnabled("Blankets", products.blankets);

        } else if (value.equals(products.babybibs.getText())) {
            textIsDisplayedAndEnabled("Baby Bibs", products.babybibs);

        } else if (value.equals(products.bottomsM.getText())) {
            textIsDisplayedAndEnabled("Bottoms", products.bottomsM);

        } else if (value.equals(products.bottomsW.getText())) {
            textIsDisplayedAndEnabled("Bottoms", products.bottomsW);

        } else {
            logger.warn("Failed");
        }
    }

    @Then("user clicks on Bottoms product and verifies")
    public void userClicksOnBottomsProductAndVerifies() {
        waitSomeTime(150L);
        click(products.bottomsW);
        textIsDisplayedAndEnabled("Bottoms", products.verifyBottomsPageW);
    }
}