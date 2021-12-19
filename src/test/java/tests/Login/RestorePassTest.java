package tests.Login;

import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;


public class RestorePassTest extends BaseTest {
    @Test
    public void successRestore() {
        basePage.open(testData.getAppLoginUrl());
        loginPage.checkUpdate(testData.getUpgradeUrl())
                .forgotPassClick();
        Assert.assertFalse(driver.findElement(loginPageElements.getSubmitRestore()).isEnabled()); //button should be disabled
        loginPage.setRequestedEmail(testData.getEmailDev())
                .clickSubmit()
                .waitLocator(loginPage.getNewPassFormText());
        Assert.assertTrue(driver.findElement(loginPageElements.getTemporaryPassText()).isDisplayed());
        Assert.assertTrue(driver.findElement(loginPageElements.getNewPassText()).isDisplayed());
        Assert.assertTrue(driver.findElement(loginPageElements.getReTypePassText()).isDisplayed());
        Assert.assertFalse(driver.findElement(loginPageElements.getSaveNewPass()).isEnabled()); //button should be disabled
        loginPage.fillInSavePassForm(testData.getNewPass());
        Assert.assertTrue(driver.findElement(loginPageElements.getSaveNewPass()).isEnabled());

    }
}
