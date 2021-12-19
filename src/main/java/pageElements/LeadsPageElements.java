package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class LeadsPageElements extends BasePage {
    public LeadsPageElements(WebDriver driver) {
        super(driver);
    }

    public static final By userName = By.className("nav-username");
    public static final By loadLeads = By.xpath("//*[contains(text(),'Page')]");
    public static final By toolBarButton = By.id("toolbar-menu-button");
    public static final By statusColumnCheckbox = By.xpath("//*[contains(@aria-label, 'Status')]" +
            "//*[contains(@class,'checkbox-icon')]");
    public static final By columnChooser = By.xpath("//*[contains(@class,'toolbar-button-icon') " +
            "and contains(@aria-label,'column-chooser')]");
    public static String[] columns = {"Create Date", "Market", "Status", "Reference ID", "Appointment Date",
            "Appointment Date", "First Name", "Last Name", "Address", "City", "Zip Code", "Cell Phone",
            "Installation Types", "Rooms", "Promotion", "Sales Rep", "Last Note", "Next Action Date" };
    public static final By statusColumn = By.xpath("//*[contains(@aria-label,'Column Status') and @id='dx-col-45']");

    public By getUserName() {
        return userName;
    }

    public By getLoadLeads() {
        return loadLeads;
    }

    public String[] getColumns() {
        return columns;
    }


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

}
