package tests.LeadsPage.ToolBar;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.BaseTest;
import static constants.Constant.AuthAdmin.email;
import static constants.Constant.AuthAdmin.pass;
import static constants.Constant.Urls.OASIS_LOGIN;

public class DisplayingColumn extends BaseTest {
    @Test
    public void verifyColumnDisplaying() {
        basePage.open(OASIS_LOGIN);
        loginPage.checkUpdate();
        loginPage.successLogin(email,pass);
        leadsPage.checkLeadsAreLoaded();
        driver.findElement(leadsPage.getToolBarButton()).click();
        driver.findElement(leadsPage.getColumnChooser()).click();
        driver.findElement(leadsPage.getStatusColumnCheckbox()).click();
        driver.findElement(leadsPage.getStatusColumnCheckbox()).click(); //один клік не канає, напевно wait треба добавити
        WebElement statusColumn = driver.findElement(leadsPage.getStatusColumn());

    }

}
