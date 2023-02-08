package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BasePage {

    @FindBy(id = "username")
    private WebElement userNameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "Login")
    private WebElement loginButton;


    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public LoginPage open() {
        driver.get("https://home34.my.salesforce.com/");
        return this;
    }

    public LoginPage fillInUserName(String userName) {
        userNameInput.sendKeys(userName);
        return this;
    }

    public LoginPage fillInPassword(String password) {
        passwordInput.sendKeys(password);
        return this;
    }

    public void submitForm() {
        loginButton.submit();
    }
}




















































































