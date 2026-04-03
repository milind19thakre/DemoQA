package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollUtility {

    private WebDriver driver;

    public ScrollUtility(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Scrolls the page until the given element is visible in the viewport.
     *
     * @param element - WebElement to scroll into view
     */
    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", element);
    }

    /**
     * Scrolls by a specific number of pixels vertically.
     *
     * @param pixels - number of pixels to scroll
     */
    public void scrollByPixels(int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + pixels + ");");
    }

    /**
     * Scrolls to the bottom of the page.
     */
    public void scrollToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

}
