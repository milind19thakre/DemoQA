package hooks;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import config.ConfigReader;
import base.DriverFactory;
import org.openqa.selenium.WebDriver;

public class Hooks {

    WebDriver driver;

    @Before
    public void setup() {

        // Load config
        ConfigReader.init_prop();

        // Initialize driver
        driver = DriverFactory.initDriver();

        // Launch URL
        driver.get(ConfigReader.get("url"));
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}