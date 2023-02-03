package pages.wrappers;

import org.openqa.selenium.WebDriver;

public class Input {

    WebDriver driver;
    String label; //var for locator's text which will be changed

    public Input(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }
}
