package tests.LeadsPage.ToolBar;

import org.testng.annotations.Test;
import tests.BaseTest;

import static constants.Constant.AuthAdmin.email;
import static constants.Constant.AuthAdmin.pass;
import static constants.Constant.Urls.OASIS_LOGIN;

public class OpenToolBar extends BaseTest {
    /**
     * логін юзера треба винести в окремий метод для логін пейджі, щоб кожен раз не вставляти купу тих рядків
     */
    @Test
    public void checkboxesByDefault() {
        //WHEN LOGIN
        basePage.open(OASIS_LOGIN);
        loginPage.checkUpdate()
                .setEmail(email)
                .setPass(pass)
                .clickLogin();
        leadsPage.checkLeadsAreLoaded();
        driver.findElement(leadsPage.getToolBarButton()).click();
        driver.findElement(leadsPage.getColumnChooser()).click();

        leadsPage.verifyCheckboxes();
    }
    } /* WebElement checkbox = driver.findElement(leadsPage.getCrDateCheckbox());
        Actions actions = new Actions(driver);     /** інший варіант як можна реалізувати той клік
        actions.moveToElement(checkbox).click().click(checkbox).build().perform();*/
