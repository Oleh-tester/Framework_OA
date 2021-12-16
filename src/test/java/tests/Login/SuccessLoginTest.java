package tests.Login;

import constants.Constant;
import org.testng.annotations.Test;
import tests.BaseTest;
import static constants.Constant.AuthAdmin.email;
import static constants.Constant.AuthAdmin.pass;
import static constants.Constant.Urls.OASIS_LOGIN;

public class SuccessLoginTest extends BaseTest {
    @Test
    public void checkLogin() {
        basePage.open(OASIS_LOGIN); //
     loginPage.checkUpdate()
             .setEmail(email)
             .setPass(pass)
             .clickLogin()
             .checkUrlAfterLogin();
     driver.quit();
    }


}
