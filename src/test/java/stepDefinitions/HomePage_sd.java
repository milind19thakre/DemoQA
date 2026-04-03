package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import base.DriverFactory;
import pages.HomePage;
import org.junit.Assert;
import utils.Constants;

public class HomePage_sd {

    HomePage homePage = new HomePage(DriverFactory.getDriver());


    @Then("page title should be correct")
    public void verify_page_title() {

        String actualTitle = homePage.getPageTitle();
        System.out.println("Page Title: " + actualTitle);

        Assert.assertTrue(actualTitle.contains(Constants.HOME_PAGE_TITLE));
    }
}