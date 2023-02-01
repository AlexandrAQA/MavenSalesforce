package aqa;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest{

    @Test
    public void createAccountTest(){
        new LoginPage(driver).open()
                            .fillInUserName("surnamealeks-rwdg@force.com")
                            .fillInPassword("Zx!cvbnm23+")
                            .submitForm();
        //   //span[@class='slds-var-p-right_x-small']
        driver.get("https://home34.lightning.force.com/lightning/o/Account/list?filterName=Recent");
        final By accountTabLocatorXpath = By.xpath("//span[@class='slds-var-p-right_x-small']");
        wait.until(ExpectedConditions.
                visibilityOfElementLocated(accountTabLocatorXpath));
    }
}







































