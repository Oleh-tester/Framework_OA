package tests.Login;

import constants.Constant;
import org.testng.annotations.Test;
import tests.BaseTest;
public class LoginWithTest extends BaseTest {
    @Test
    public void wrongEmail() {
        basePage.open(testData.getAppLoginUrl());
        loginPage.checkUpdate(testData.getUpgradeUrl())
                .setEmail(testData.getEmailDev() + "1") //wrong email
                .setPass(testData.getPassDev())
                .clickLogin();
        loginPage.checkError();

    }

    @Test
    public void wrongPass() {
        basePage.open(testData.getAppLoginUrl());
        loginPage.checkUpdate(testData.getUpgradeUrl())
                .setEmail(testData.getEmailDev())
                .setPass(testData.getPassDev() + "a") //wrong pass
                .clickLogin();
        loginPage.checkError();

    }

}
