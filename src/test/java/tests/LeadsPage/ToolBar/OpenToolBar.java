package tests.LeadsPage.ToolBar;

import org.testng.annotations.Test;
import tests.BaseTest;

public class OpenToolBar extends BaseTest {
    @Test
    public void checkboxesByDefault() {
        //WHEN LOGIN
        basePage.open(testData.getAppLoginUrl());
        loginPage.checkUpdate()
                .successLogin(testData.getEmailDev(), testData.getPassDev());
        leadsPage.checkLeadsAreLoaded();
        driver.findElement(leadsPage.getToolBarButton()).click();
        driver.findElement(leadsPage.getColumnChooser()).click();

        leadsPage.verifyCheckboxes();
    }
} /* WebElement checkbox = driver.findElement(leadsPage.getCrDateCheckbox());
        Actions actions = new Actions(driver);     /** інший варіант як можна реалізувати той клік
        actions.moveToElement(checkbox).click().click(checkbox).build().perform();*/
