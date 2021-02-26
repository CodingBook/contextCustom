package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import org.cb.contextCustom.pages.DesignWomensClothing;

public class DesignWomensClothingSteps extends Base{

    DesignWomensClothing designWomensClothing = new DesignWomensClothing();

    @And("move on to Women's Clothing button")
    public void moveOnToWomenSClothingButton() {
        moveToElement(designWomensClothing.womensClothing);
    }

    @And("move on to All Women's Clothing button and click")
    public void moveOnToAllWomenSClothingButtonAndClick() {
        moveAndClickToElement(designWomensClothing.allWomensClothing);
    }

    @And("selects the first Women's Clothing product in the page")
    public void selectsTheFirstWomenSClothingProductInThePage() {
        moveAndClickToElement(designWomensClothing.firstWomensClothingProduct);
    }
}
