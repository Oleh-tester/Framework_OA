package tests.Login;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import java.time.Duration;

public class SuccessLoginTest extends BaseTest {

    @Test  //
    public void checkLogin() {
        basePage.open(testData.getAppLoginUrl());
        loginPage.checkUpdate(testData.getUpgradeUrl());
        Assert.assertFalse(driver.findElement(loginPageElements.getLoginButton()).isEnabled());//button should be disabled
        loginPage.setEmail(testData.getEmailDev())
                .setPass(testData.getPassDev())
                .clickLogin();
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions
                .presenceOfElementLocated(leadsPage.getUserName()));
        Assert.assertTrue(driver.getCurrentUrl().equals(testData.getDefaultAfterLogin()));
        driver.quit();
    }


}
