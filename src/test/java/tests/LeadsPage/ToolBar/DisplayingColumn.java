package tests.LeadsPage.ToolBar;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.BaseTest;

public class DisplayingColumn extends BaseTest {
    @Test
    public void verifyColumnDisplaying() {
        basePage.open(testData.getAppLoginUrl());
        loginPage.checkUpdate(testData.getUpgradeUrl());
        loginPage.successLogin(testData.getEmailDev(), testData.getPassDev());
        leadsPage.checkLeadsAreLoaded();
        driver.findElement(leadsPage.getToolBarButton()).click();
        driver.findElement(leadsPage.getColumnChooser()).click();
        driver.findElement(leadsPage.getStatusColumnCheckbox()).click();
        driver.findElement(leadsPage.getStatusColumnCheckbox()).click(); //один клік не канає, напевно wait треба добавити
        WebElement statusColumn = driver.findElement(leadsPage.getStatusColumn());

    }

}
