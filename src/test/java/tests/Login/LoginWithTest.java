package tests.Login;

import constants.Constant;
import org.testng.annotations.Test;
import tests.BaseTest;
import static constants.Constant.AuthAdmin.email;
import static constants.Constant.AuthAdmin.pass;
import static constants.Constant.Urls.OASIS_LOGIN;

public class LoginWithTest extends BaseTest {
    @Test
    public void wrongEmail(){
        basePage.open(OASIS_LOGIN);
        loginPage.checkUpdate()
                .setEmail(email + "1") //wrong email
                .setPass(pass)
                .clickLogin();
        loginPage.checkError();

    }
    @Test
    public void wrongPass() {
        basePage.open(OASIS_LOGIN);
        loginPage.checkUpdate()
                .setEmail(email)
                .setPass(pass + "a") //wrong pass
                .clickLogin();
        loginPage.checkError();

    }

}
