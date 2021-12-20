package pages.Leads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageElements.LeadsPageElements;

import java.time.Duration;

import static common.ConfigVariables.TimeoutVariable.tenSec;

public class LeadsPage extends LeadsPageElements {
    public LeadsPage(WebDriver driver) {
        super(driver);
    }

    public LeadsPage verifyCheckedCheckboxes() throws InterruptedException {
        for (int i = 0; i < columns.length; i++) {
            WebElement columnCheckbox = driver.findElement(By.xpath(("//*[contains(@aria-label, '"
                    + columns[i] + "') " + "and contains(@class,'checkbox') " +
                    "and contains(@aria-selected,'true')]")));
            //локатор чекнутого чекбокса
            if (columnCheckbox.isDisplayed()) {
                System.out.println(columns[i]);
            } else if (columnCheckbox.isDisplayed() == false) {
                scrollTill(columnCheckbox);
            } else
                throw new RuntimeException("Column " + columns[i] + " isn't displayed");
        }
        return this;
    }

    public LeadsPage checkLeadsAreLoaded() {
        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(tenSec)).
                until(ExpectedConditions.presenceOfElementLocated(loadLeads)));
        return this;
    }

}

