package pages.Leads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageElements.LeadsPageElements;

import java.time.Duration;

import static common.ConfigVariables.TimeoutVariable.sevenSec;

public class LeadsPage extends LeadsPageElements {
    public LeadsPage(WebDriver driver) {
        super(driver);
    }

    public LeadsPage verifyCheckboxes() {
        for (int i = 0; i < columns.length; i++) {
            WebElement columnCheckbox = driver.findElement(By.xpath(("//*[contains(@aria-label, '"
                    + getColumns()[i] + "') " + "and contains(@class,'checkbox') " +
                    "and contains(@aria-selected,'true')]"))); //локатор чекнутого чекбокса
            if (columnCheckbox.isEnabled(
            )) {
            } else {
                System.out.println("bad Job Oleh");
            }
        }
        return this;
    }

    public LeadsPage checkLeadsAreLoaded() {
        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(sevenSec)).
                until(ExpectedConditions.presenceOfElementLocated(loadLeads)));
        return this;
    }

}

