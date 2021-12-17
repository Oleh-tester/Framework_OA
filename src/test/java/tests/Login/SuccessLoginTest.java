package tests.Login;

import org.testng.annotations.Test;
import tests.BaseTest;

public class SuccessLoginTest extends BaseTest {

    @Test
    public void checkLogin() {
        basePage.open(testData.getAppLoginUrl());
        loginPage.checkUpdate()
                .setEmail(testData.getEmailDev())
                .setPass(testData.getPassDev())
                .clickLogin()
                .checkUrlAfterLogin();
        driver.quit();
    }


}
