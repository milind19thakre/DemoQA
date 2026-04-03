package stepDefinitions;

import base.DriverFactory;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.ElementsPage;
import pages.HomePage;
import utils.ScrollUtility;


import static base.DriverFactory.driver;


public class Elements_sd {

    HomePage hp = new HomePage(DriverFactory.getDriver());
    ScrollUtility sc = new ScrollUtility(DriverFactory.getDriver());;

    ElementsPage elementsPage = new ElementsPage(DriverFactory.getDriver());



    @When("user clicks on {string} on home page")
    public void userClicksOnFromElementsList(String menuOption_1) {
              driver.findElement(By.xpath("//h3[text()='" + menuOption_1 + "']")).click();
    }


    @Then("{string} page should be displayed successfully")
    public void pageShouldBeDisplayedSuccessfully(String menuOption_2) {
        String header = driver.findElement(By.xpath("//h1[@class='text-4xl font-black text-primary font-futura tracking-[0.15em] mb-2']")).getText();
        Assert.assertEquals(header, menuOption_2);
    }
}
