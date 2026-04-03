package pages;

import base.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

     WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//div[@class='card-body']/h5[text()='Elements']")
    private WebElement Elements_xpath ;

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void click_Elements(){
        Elements_xpath.click();
    }
}