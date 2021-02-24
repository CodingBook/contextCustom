package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.Products;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductsSteps extends Base {
    Products products = new Products();
    Logger logger = LoggerFactory.getLogger(ProductsSteps.class);

    @When("User navigate and verifies that More products button is present")
    public void userNavigateAndVerifiesThatMoreProductsButtonIsPresent() {
        products.moreProductsButton.isDisplayed();
        logger.info("More products button is displayed");
    }

    @Then("User verifies that {string} is displayed")
    public void userVerifiesThatIsDisplayed(String value) {  // image

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

    @Then("User verifies that {string} heading is present")
    public void userVerifiesThatHeadingIsPresent(String value) {

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
            click(products.womensClothing);
            textIsDisplayedAndEnabled("Women's Clothing", products.verifyWomensClothingText);
        } else {
            logger.warn("Failed");
        }
    }


    @Then("User verifies that {string} menu is present")
    public void userVerifiesThatMenuIsPresent(String value) {

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
//            click(productsPage.bottomsW);
          //  textIsDisplayedAndEnabled("Bottoms", productsPage.bottomsW);

        } else {
            logger.warn("Failed");
        }
    }

}