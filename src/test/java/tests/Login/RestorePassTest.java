package tests.Login;

import constants.Constant;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tests.BaseTest;

import static constants.Constant.AuthAdmin.email;
import static constants.Constant.Urls.OASIS_LOGIN;

public class RestorePassTest extends BaseTest {
    @Test
    public void successRestore(){
        basePage.open(OASIS_LOGIN);
        loginPage.checkUpdate()
                 .forgotPassClick()
                .setRequestedEmail(email)
                .clickSubmit(); //next step requires pass from email, but in testing environment we don't receive this mail

    }
}
