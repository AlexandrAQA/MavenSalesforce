package pages.wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDown {

    WebDriver driver;
    String label;

    public DropDown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }
    //span[text()='%s']//ancestor::div[contains(@class,'uiInput')]//input
    public DropDown select(String option){
        By fullLocator = By.xpath(String.format
                                       ("//span[text()='%s']//ancestor::div[contains(@class,'uiInput')]//a", label));
        driver.findElement(fullLocator).click();
        driver.findElement(By.xpath("//a[@title='Competitor']"));
        return this;
    }
}
