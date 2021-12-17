package tests.Login;

import org.testng.annotations.Test;
import tests.BaseTest;


public class RestorePassTest extends BaseTest {
    @Test
    public void successRestore() {
        basePage.open(testData.getAppLoginUrl());
        loginPage.checkUpdate(testData.getUpgradeUrl())
                .forgotPassClick()
                .setRequestedEmail(testData.getEmailDev())
                .clickSubmit(); //next step requires pass from email, but in testing environment we don't receive this mail

    }
}
