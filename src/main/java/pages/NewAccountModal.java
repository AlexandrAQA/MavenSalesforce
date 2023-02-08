package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.wrappers.Input;

public class NewAccountModal extends BasePage {

    @FindBy(xpath = "//button[@title='Save']")
    private WebElement saveButton;

    public NewAccountModal(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public NewAccountModal createNewAccount(String accountName, String website, String phone) {
        new Input(driver, "Account Name").fillIn(accountName);
        new Input(driver, "Website").fillIn(website);
        new Input(driver, "Phone").fillIn(phone);
        return this;
    }

    public NewAccountModal saveAccount() {
        saveButton.click();
        return this;
    }
}