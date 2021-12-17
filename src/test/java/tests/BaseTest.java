package tests;

import common.CommonActions;
import common.ConfigFileReader;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import pages.BasePage;
import pages.Leads.LeadsPage;
import pages.LoginPage.LoginPage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static common.Config.CLEAR_COOKS_AND_STORAGE;
import static common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected LoginPage loginPage = new LoginPage(driver);
    protected LeadsPage leadsPage = new LeadsPage(driver);
    protected ConfigFileReader testData = new ConfigFileReader();
    public void clearCookiesAndLocalStorage() {
        if (CLEAR_COOKS_AND_STORAGE) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterClass
    public void close() {
        if (HOLD_BROWSER_OPEN) {
            driver.quit();
        }
    }


}
