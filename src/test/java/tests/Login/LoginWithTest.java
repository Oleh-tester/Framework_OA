package tests.Login;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class LoginWithTest extends BaseTest {
    @Test
    public void wrongEmail() {
        basePage.open(testData.getAppLoginUrl());
        loginPage.checkUpdate(testData.getUpgradeUrl())
                .setEmail( "d" + testData.getEmailDev()) //wrong email
                .setPass(testData.getPassDev())
                .clickLogin()
                .waitLocator(loginPage.getErrorMessage());
        Assert.assertTrue(driver.findElement(loginPage.getErrorMessage()).isDisplayed());
    }

    @Test
    public void wrongPass() {
        basePage.open(testData.getAppLoginUrl());
        loginPage.checkUpdate(testData.getUpgradeUrl())
                .setEmail(testData.getEmailDev())
                .setPass(testData.getPassDev() + "a") //wrong pass
                .clickLogin()
                .waitLocator(loginPage.getErrorMessage());
        Assert.assertTrue(driver.findElement(loginPage.getErrorMessage()).isDisplayed());

    }

}
