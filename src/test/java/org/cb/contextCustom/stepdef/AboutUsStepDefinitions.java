package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.Then;

import org.cb.contextCustom.pages.AboutUsPage;
import org.cb.contextCustom.pages.LogoPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AboutUsStepDefinitions extends Base {
    AboutUsPage aboutUsPage = new AboutUsPage();
    LogoPage logoPage = new LogoPage();
    Logger logger = LoggerFactory.getLogger(AboutUsStepDefinitions.class);

    @Then("user should  About company  enabled under  About us department")
    public void user_should_About_company_enabled_under_About_us_department() {
        aboutUsPage.About_Company.isDisplayed();
        waitSomeTime(1000L);
    }

    @Then("user should  Our team   enabled under About us department")
    public void user_should_Our_team_enabled_under_About_us_department() {

        aboutUsPage.Our_Team.isDisplayed();
        waitSomeTime(1000L);
    }

    @Then("user should Careers enabled under About us department")
    public void user_should_Careers_enabled_under_About_us_department() {
        aboutUsPage.Careers.isDisplayed();
    }

    @Then("user clicks on <social media button>")
    public void user_clicks_on_social_button() {

        aboutUsPage.Follow_Us.isDisplayed();
        waitSomeTime(1000L);

    }


    @Then("user should enable to see {string}")
    public void userShouldEnableToSee(String button) {

        textIsDisplayedAndEnabled(button,aboutUsPage.Twitter);

        textIsDisplayedAndEnabled(button,aboutUsPage.Facebook);

        textIsDisplayedAndEnabled(button,aboutUsPage.Instagram);

        textIsDisplayedAndEnabled(button,aboutUsPage.Youtube);


    }

    @Then("user click on youtube;")
    public void userClickOnYoutube() {
        aboutUsPage.Youtube.click();

    }

    @Then("user should see bottom page")
    public void user_should_see_bottom_page(io.cucumber.datatable.DataTable dataTable) {
    logoPage.Fast_and_free_delivery.isDisplayed();
        waitSomeTime(1000L);
    logoPage.Money_back_guarantee.isDisplayed();
        waitSomeTime(1000L);
   logoPage.customerSupport.isDisplayed();
        waitSomeTime(1000L);
    logoPage.SecureOnlinePayment.isDisplayed();
    }



}

