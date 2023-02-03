package pages;

import org.openqa.selenium.WebDriver;
import pages.wrappers.Input;

public class NewAccountPopUpPage extends BasePage{
    public NewAccountPopUpPage(WebDriver driver) {
        super(driver);
    }

    public NewAccountPopUpPage createNewAccount(String accountName){
        new Input(driver, "Account Name").fillIn(accountName);

        return this;

    }
}