package tests.LeadsPage.ToolBar;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class OpenToolBar extends BaseTest {
    @Test
    public void checkboxesByDefault() throws InterruptedException {
        //WHEN LOGIN
        basePage.open(testData.getAppLoginUrl());
        loginPage.checkUpdate(testData.getUpgradeUrl())
                .successLogin(testData.getEmailDev(), testData.getPassDev());
        leadsPage.checkLeadsAreLoaded();
        driver.findElement(leadsPage.getToolBarButton()).click();
        driver.findElement(leadsPage.getColumnChooser()).click();
        leadsPage.verifyCheckboxes();
    }
}
