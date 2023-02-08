package pages.wrappers;

import org.openqa.selenium.WebDriver;

public class DropDown {

    WebDriver driver;
    String label;

    public DropDown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }
}
