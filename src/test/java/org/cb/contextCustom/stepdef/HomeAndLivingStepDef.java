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

    @When("move on to Home & Living")
    public void move_on_to_Home_Living() {
       moveToElement(homeAndLivingPage.homeAndLiving);
    }

    @Then("move on to All Home & Living Page and click")
    public void move_on_to_All_Home_Living_Page_and_click() {
       moveAndClickToElement(homeAndLivingPage.allHomeAndLiving);
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
    @Then("verify Ceramic Mug image is present")
    public void verifyCeramicMugImageIsPresent() {
        homeAndLivingPage.ceramicMugImage.isDisplayed();
    }

    @And("verify  Ceramic Mug item brand name is present")
    public void verifyCeramicMugItemBrandNameIsPresent() {
        homeAndLivingPage.ceramicMugBrand.isDisplayed();
    }

    @Then("verify Ceramic Mug item text is present")
    public void verifyCeramicMugItemTextIsPresent() {
        String expected="Ceramic Mug | Context";
        String actual=homeAndLivingPage.ceramicMugText.getText();
        verifyTheText(expected,actual);
    }

    @And("verify Ceramic Mug item price is present")
    public void verifyCeramicMugItemPriceIsPresent() {
        homeAndLivingPage.ceramicMugPrice.isDisplayed();
    }

    @And("click  Ceramic Mug item picture")
    public void clickCeramicMugItemPicture() {
    }

}
