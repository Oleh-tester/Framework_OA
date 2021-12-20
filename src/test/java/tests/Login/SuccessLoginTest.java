package tests.Login;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;


public class SuccessLoginTest extends BaseTest {

    @Test  //
    public void checkLogin() {
        basePage.open(testData.getAppLoginUrl());
        loginPage.checkUpdate(testData.getUpgradeUrl());
        Assert.assertFalse(driver.findElement(loginPageElements.getLoginButton()).isEnabled());//button should be disabled
        loginPage.setEmail(testData.getEmailDev())
                .setPass(testData.getPassDev())
                .clickLogin()
                .waitLocator(leadsPage.getUserName());
        Assert.assertTrue(driver.getCurrentUrl().equals(testData.getDefaultAfterLogin()));
        driver.quit();
    }


}
