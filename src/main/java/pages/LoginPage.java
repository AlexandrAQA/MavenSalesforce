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

    public void open() {
        driver.get("https://home34.my.salesforce.com/");
        //wait.until(ExpectedConditions.visibilityOfElementLocated());
    }

    public void fillInUserName(String userName) {
        userNameInput.sendKeys(userName);
    }

    public void fillInPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void submitForm() {
        loginButton.submit();
    }
}




















































































