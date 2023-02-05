package aqa;

import org.testng.annotations.Test;
import pages.AccountsPage;
import pages.LoginPage;
import pages.NewAccountPopUpPage;

public class LoginTest extends BaseTest {

    @Test
    public void createAccountTest() {
        new LoginPage(driver).open()
                .fillInUserName("surnamealeks-rwdg@force.com")
                .fillInPassword("Zx!cvbnm23+")
                .submitForm();

        new AccountsPage(driver).open()
                .clickNewButtonAccPage();
        new NewAccountPopUpPage(driver).createNewAccount("Account2");

    }
}







































