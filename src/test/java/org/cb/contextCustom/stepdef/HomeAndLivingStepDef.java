package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.HomeAndLivingPage;
import org.openqa.selenium.WebElement;

public class HomeAndLivingStepDef extends Base {

    HomeAndLivingPage homeAndLivingPage=new HomeAndLivingPage();

    @When("move on to Categories dropdown menu for Home & Living")
    public void move_on_to_Categories_dropdown_menu_for_Home_Living() {
        moveToElement(homeAndLivingPage.categories);
    }

    @Then("move on to Home & Living and move on to All Home & Living Page and click")
    public void moveOnToHomeLivingAndMoveOnToAllHomeLivingPageAndClick() {
        moveToElement(homeAndLivingPage.homeAndLiving);
        moveAndClickToElement(homeAndLivingPage.allHomeAndLiving);
    }

    @Then("verify Ceramic Mug image brand,text,price,is present")
    public void verifyCeramicMugImageBrandTextPriceIsPresent() {
        homeAndLivingPage.ceramicMugImage.isDisplayed();
        homeAndLivingPage.ceramicMugBrand.isDisplayed();
        String expected="Ceramic Mug | Context";
        String actual=homeAndLivingPage.ceramicMugText.getText();
        verifyTheText(expected,actual);
        homeAndLivingPage.ceramicMugPrice.isDisplayed();

    }

    @Then("verify  Home & Living  text is present")
    public void verify_Home_Living_text_is_present() {
        String expected="Home & Living";
        String actual = homeAndLivingPage.textOfHomeAndLiving.getText();
        verifyTheText(actual, expected);
    }

    @And("print all links from the current page")
    public void printAllLinksFromTheCurrentPage() {
        System.out.println("The number of the links on this page "+homeAndLivingPage.allLinks.size());
        for (WebElement link:homeAndLivingPage.allLinks) {
            String fullLink= link.getAttribute("href");
            String linkText=link.getText();
            if(!linkText.isEmpty()){
                System.out.println(linkText+"          "+fullLink);
            }
        }
    }

    @And("click  Ceramic Mug item picture")
    public void clickCeramicMugItemPicture() {
    }


}
