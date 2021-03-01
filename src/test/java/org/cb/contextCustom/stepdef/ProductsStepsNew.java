package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.ProductsNew;

public class ProductsStepsNew extends Base {
    ProductsNew productsNew = new ProductsNew();


    @When("user verifies that images {string} are displayed")
    public void userVerifiesThatImagesAreDisplayed(String value) {
        waitSomeTime(150L);
       // scrollDown(productsNew.womensClothingImage);

        if (value.equals(productsNew.accessoriesImage.getAttribute("alt"))) {
            imageIsDisplayedAndEnabled(productsNew.accessoriesImage);

        } else if (value.equals(productsNew.hatImage.getAttribute("alt"))) {
            imageIsDisplayedAndEnabled(productsNew.hatImage);

        } else if (value.equals(productsNew.homeLivingImage.getAttribute("alt"))) {
            imageIsDisplayedAndEnabled(productsNew.homeLivingImage);

        } else if (value.equals(productsNew.kidsYouthImage.getAttribute("alt"))) {
            imageIsDisplayedAndEnabled(productsNew.kidsYouthImage);

        } else if (value.equals(productsNew.mensClothingImage.getAttribute("alt"))) {
            imageIsDisplayedAndEnabled(productsNew.mensClothingImage);

        } else if (value.equals(productsNew.womensClothingImage.getAttribute("alt"))) {
            imageIsDisplayedAndEnabled(productsNew.womensClothingImage);

        } else {
            logger.warn("Failed");
        }
    }


    @And("user verifies that headings {string} are displayed")
    public void userVerifiesThatHeadingsAreDisplayed(String value) {
        waitSomeTime(150L);

        if (value.equals(productsNew.accessories.getText())) {
            textIsDisplayedAndEnabled("Accessories", productsNew.accessories);

        } else if (value.equals(productsNew.hats.getText())) {
            textIsDisplayedAndEnabled("Hats", productsNew.hats);

        } else if (value.equals(productsNew.homeLiving.getText())) {
            textIsDisplayedAndEnabled("Home & Living", productsNew.homeLiving);

        } else if (value.equals(productsNew.kidsYouthClothing.getText())) {
            textIsDisplayedAndEnabled("Kids & Youth Clothing", productsNew.kidsYouthClothing);

        } else if (value.equals(productsNew.mensClothing.getText())) {
            textIsDisplayedAndEnabled("Men's Clothing", productsNew.mensClothing);

        } else if (value.equals(productsNew.womensClothing.getText())) {
            textIsDisplayedAndEnabled("Women's Clothing", productsNew.womensClothing);
//            click(productsNew.womensClothing);
//            textIsDisplayedAndEnabled("Women's Clothing", productsNew.verifyWomensClothingText);
        } else {
            logger.warn("Failed");
        }
    }

    @And("user verifies that names {string} are present")
    public void userVerifiesThatNamesArePresent(String value) {
        waitSomeTime(250L);

        if (value.equals(productsNew.backpacks.getText())) {
            textIsDisplayedAndEnabled("Backpacks", productsNew.backpacks);

        } else if (value.equals(productsNew.beanies.getText())) {
            textIsDisplayedAndEnabled("Beanies", productsNew.beanies);

        } else if (value.equals(productsNew.blankets.getText())) {
            textIsDisplayedAndEnabled("Blankets", productsNew.blankets);

        } else if (value.equals(productsNew.babybibs.getText())) {
            textIsDisplayedAndEnabled("Baby Bibs", productsNew.babybibs);

        } else if (value.equals(productsNew.bottomsM.getText())) {
            textIsDisplayedAndEnabled("Bottoms", productsNew.bottomsM);

        } else if (value.equals(productsNew.bottomsW.getText())) {
            textIsDisplayedAndEnabled("Bottoms", productsNew.bottomsW);

        } else {
            logger.warn("Failed");
        }
    }

    @Then("user clicks on Bottoms product and verifies")
    public void userClicksOnBottomsProductAndVerifies() {
        waitSomeTime(150L);
        click(productsNew.bottomsW);
        textIsDisplayedAndEnabled("Bottoms", productsNew.verifyBottomsPageW);
    }
}