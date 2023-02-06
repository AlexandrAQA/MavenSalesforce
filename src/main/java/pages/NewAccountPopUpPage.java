package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.wrappers.Input;

public class NewAccountPopUpPage extends BasePage {

    @FindBy(xpath = "button[@title='Save']")
    private WebElement saveButton;

    public NewAccountPopUpPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public NewAccountPopUpPage createNewAccount(String accountName) {
        new Input(driver, "Account Name").fillIn(accountName);
        return this;
    }

    public NewAccountPopUpPage saveAccount(){
        saveButton.click();
        return this;
    }
}