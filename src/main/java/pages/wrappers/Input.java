package pages.wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input {

    WebDriver driver;
    String label; //var for locator's text which will be changed

    public Input(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public Input fillIn(String text){
        By fullLocator =
                By.xpath(String.format
                        ("//span[text()='%s']//ancestor::div[contains(@class,'uiInput')]//input", label));
        driver.findElement(fullLocator).sendKeys();
        return this;
    }
}
