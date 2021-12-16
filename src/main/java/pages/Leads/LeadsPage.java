package pages.Leads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;
import java.time.Duration;
import static constants.Constant.TimeoutVariable.EXPLICIT_WAIT;

public class LeadsPage extends BasePage {
    public LeadsPage(WebDriver driver) {
        super(driver);
    }
    private final By userName = By.className("nav-username");
    private final By loadLeads = By.xpath("//*[contains(text(),'Page')]");
    private final By toolBarButton = By.id("toolbar-menu-button");
    private final By statusColumnCheckbox = By.xpath("//*[contains(@aria-label, 'Status')]" +
            "//*[contains(@class,'checkbox-icon')]");
    private final By columnChooser = By.xpath("//*[contains(@class,'toolbar-button-icon') " +
            "and contains(@aria-label,'column-chooser')]");
    private final String[] columns = { "Create Date", "Market", "Status", "Reference ID", "Appointment Date",
            "Appointment Date","First Name", "Last Name", "Address", "City", "Zip Code", "Cell Phone",
            "Installation Types", "Rooms", "Promotion", "Sales Rep", "Last Note", "Next Action Date"};
    private final By statusColumn = By.xpath("//*[contains(@aria-label,'Column Status') and @id='dx-col-45']");

    public By getStatusColumnCheckbox() {
        return statusColumnCheckbox;
    }
    public By getColumnChooser() {
        return columnChooser;
    }
    public By getToolBarButton() {
        return toolBarButton;
    }

    public By getStatusColumn() {
        return statusColumn;
    }

    public LeadsPage verifyCheckboxes() {
        for (int i = 0; i < columns.length; i++) {
            WebElement columnCheckbox = driver.findElement(By.xpath(("//*[contains(@aria-label, '"+columns[i]+"') " +
                    "and contains(@class,'checkbox') and contains(@aria-selected,'true')]"))); //локатор чекнутого чекбокса
             if(columnCheckbox.isEnabled())
             {
             }
            else {
                System.out.println("bad Job Oleh");
            }
        } return this;
    }
    public LeadsPage checkLeadsAreLoaded(){
        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT)).
                until(ExpectedConditions.presenceOfElementLocated(loadLeads)));
        return this;
    }

    }

