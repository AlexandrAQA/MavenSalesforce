package aqa;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pages.page.AccountsPage;
import pages.page.LoginPage;
import pages.page.NewAccountModal;
import pages.wrappers.DropDown;

public class LoginTest extends BaseTest {

    @Test
    public void createAccountTest() {
        new LoginPage(driver).open()
                             .fillInUserName("surnamealeks-rwdg@force.com")
                             .fillInPassword("Zx!cvbnm23+")
                             .submitForm();
        new AccountsPage(driver).open()
                                .clickNewButton();
        Faker faker = new Faker();

        new NewAccountModal(driver).
                createNewAccount(faker.company().name(),
                        faker.internet().url(),
                        faker.phoneNumber().phoneNumber());
        new DropDown(driver, "Type").select("Competitor");
               // .saveAccount();


    }
}







































