package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.HomeAndLivingPage;
import org.openqa.selenium.WebElement;

public class HomeAndLivingStepDef extends Base {

    HomeAndLivingPage homeAndLivingPage=new HomeAndLivingPage();


    @When("user lands on All Home & Living Page and verifies")
    public void userLandsOnAllHomeLivingPageAndVerifies() {
        moveToElement(homeAndLivingPage.categories);
        moveToElement(homeAndLivingPage.homeAndLiving);
        moveAndClickToElement(homeAndLivingPage.allHomeAndLiving);

        String expected = "Home&Living";
        String actual = homeAndLivingPage.textOfHomeAndLiving.getText();
        verifyTheText(actual, expected);

    }


    @And("user verifies that first Home & Living product features are present")
    public void userVerifiesThatFirstHomeLivingProductFeaturesArePresent() {
        homeAndLivingPage.ceramicMugImage.isDisplayed();
        homeAndLivingPage.ceramicMugBrand.isDisplayed();
        String expected="Ceramic Mug | Context";
        String actual=homeAndLivingPage.ceramicMugText.getText();
        verifyTheText(expected,actual);
        homeAndLivingPage.ceramicMugPrice.isDisplayed();

    }

    @Then("user clicks on first Home & Living product and verifies")
    public void userClicksOnFirstHomeLivingProductAndVerifies() {
        click(homeAndLivingPage.ceramicMugImage);
        homeAndLivingPage.mugTextOnDesignPage.isDisplayed();
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



}
