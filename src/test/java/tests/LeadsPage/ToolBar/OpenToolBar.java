package tests.LeadsPage.ToolBar;

import org.testng.annotations.Test;
import tests.BaseTest;

public class OpenToolBar extends BaseTest {
    @Test
    public void checkboxesByDefault() throws InterruptedException {
        basePage.open(testData.getAppLoginUrl());
        loginPage.checkUpdate(testData.getUpgradeUrl())
                .successLogin(testData.getEmailDev(), testData.getPassDev());
        leadsPage.checkLeadsAreLoaded();
        driver.findElement(leadsPage.getToolBarButton()).click();
        driver.findElement(leadsPage.getColumnChooser()).click();
      /*  driver.findElement(leadsPageElements.getStatusColumnCheckbox()).click();
        driver.findElement(leadsPageElements.getStatusColumnCheckbox()).click();*/
        leadsPage.verifyCheckboxes();
    }
}
