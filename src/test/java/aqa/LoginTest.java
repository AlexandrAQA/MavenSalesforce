package aqa;

import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest{

    @Test
    public void createAccountTest(){
        new LoginPage(driver).open()
                .fillInUserName("surnamealeks-rwdg@force.com")
                .fillInPassword("Zx!cvbnm23+")
                .submitForm();
    }
}
