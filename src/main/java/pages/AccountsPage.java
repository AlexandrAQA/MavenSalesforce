package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountsPage extends BasePage {

    @FindBy(xpath = "//div[@title='New']")
    private WebElement newButton;

    public AccountsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public AccountsPage open() {
        driver.
                get("https://home34.lightning.force.com/lightning/o/Account/list?filterName=Recent");
        final By accountTabLocatorXpath = By.xpath("//span[@class='slds-var-p-right_x-small']");
        wait.until(ExpectedConditions.
                visibilityOfElementLocated(accountTabLocatorXpath));
        return this;
    }

    public AccountsPage clickNewButtonAccPage() {
        newButton.click();
        return this;
    }
}
