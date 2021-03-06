package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.cb.contextCustom.pages.*;
import org.cb.contextCustom.utils.ConfigurationReader;
import org.cb.contextCustom.utils.MyDriver;


public class ShopDepartmentStepDefinitions extends Base {

    AccessoriesPage accessoriesPage=new AccessoriesPage();
    ShopDepartmentPage landingPage=new ShopDepartmentPage();
    HomeAndLivingPage homeAndLivingPage=new HomeAndLivingPage();
    HatsPage hatsPage=new HatsPage();
    MensClothing mensClothing = new MensClothing();
    KidsAndYouth kidsAndYouth = new KidsAndYouth();
    WomensClothing womensClothing = new WomensClothing();


    @Given("user is on the landing page")
    public void userIsOnTheLandingPage() {
        MyDriver.get().get(ConfigurationReader.getProperty("baseUrl"));
        waitSomeTime(1000L);
    }


    @Then("user clicks Accesories;")
    public void user_clicks_Accesories() {
        moveAndClickToElement(landingPage.Accesories);
        //landingPage.Accesories.click();
        waitSomeTime(1000L);
    }


    @Then("user verifies Accesories options;")
    public void user_verifies_Accesories_options() {
        String expected = "Accessories";
        String actual = accessoriesPage.textOfAccessories.getText();
        verifyTheText(actual, expected);
        waitSomeTime(1000L);
    }


    @Then("user clicks Hats;")
    public void user_clicks_Hats() {
        moveAndClickToElement(landingPage.Hats);
        //landingPage.Hats.click();
        waitSomeTime(1000L);
    }

    @Then("user verifies Hats options;")
    public void user_verifies_Hats_options() {
        String expected = "Hats";
        String actual = hatsPage.textOfHats.getText();
        verifyTheText(actual, expected);
        waitSomeTime(1000L);
    }

    @Then("user clicks Home&Living;")
    public void user_clicks_Home_Living() {

        moveAndClickToElement(landingPage.Home_Living);
        //landingPage.Home_Living.click();
        waitSomeTime(1000l);
    }

    @Then("user verifies Home&Living options;")
    public void user_verifies_Home_Living_options() {
        String expected="Home & Living";
        waitSomeTime(1000L);
        String actual = homeAndLivingPage.textOfHomeAndLiving.getText();
        verifyTheText(actual, expected);
    }

    @Then("user clicks Kids&Youth;")
    public void user_clicks_Kids_Youth() {
        moveAndClickToElement(landingPage.Kids_YouthClothing);
        //landingPage.Kids_YouthClothing.click();
        waitSomeTime(1000L);

    }

    @Then("user verifies Kids&Youth options;")
    public void user_verifies_Kids_Youth_options() {
        String expected = "Kids & Youth Clothing";
        waitSomeTime(1000L);
        textIsDisplayedAndEnabled(expected, kidsAndYouth.KidsYouthClothingText);
    }

    @Then("user clicks Men's Clothing;")
    public void user_clicks_Men_s_Clothing() {
        moveAndClickToElement(landingPage.Men_Clothing);
       // landingPage.Men_Clothing.click();
        waitSomeTime(1000L);
    }

    @Then("user verifies Mens's Clothing options;")
    public void user_verifies_Mens_s_Clothing_options() {
        String expected = "Men's Clothing";
        waitSomeTime(1000L);
        textIsDisplayedAndEnabled(expected, mensClothing.mensClothingText);
    }


    @Then("user clicks Women's Clothing;")
    public void user_clicks_Women_s_Clothing() {
        moveAndClickToElement(landingPage.Women_Clothing);
        //landingPage.Women_Clothing.click();
      //  landingPage.Women_Clothing_2.click();

    }

    @Then("user verifies Women's Clothing  options;")
    public void user_verifies_Women_s_Clothing_options() {
        String expected = "Women's Clothing";
        waitSomeTime(1000L);
        textIsDisplayedAndEnabled(expected, womensClothing.womensClothingText);

    }




}