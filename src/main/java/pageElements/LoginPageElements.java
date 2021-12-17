package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class LoginPageElements extends BasePage {

    public LoginPageElements(WebDriver driver) {
        super(driver);
    }

    private final By emailField = By.id("login-field-email"); //не робив їх статік бо не зрозумів як їх можна змінити
    private final By passField = By.id("login-field-password");
    private final By loginButton = By.xpath("//*[contains(text(),'Log In')]");
    private final By updButton = By.xpath("//*[contains(text(),'Upgrade')]");
    private final By errorMessage = By.xpath("//*[contains(@class, 'form-message')] "); // same as //*[contains(text(),'Invalid user id or password')]
    private final By forgotPass = By.linkText("Forgot Password");
    private final By emailForRestorePassField = By.id("request-email-field");
    private final By submitRestore = By.xpath("//*[contains(text(),'Submit')]");


    public By getLoginButton() {
        return loginButton;
    }

    public By getEmailField() {
        return emailField;
    }

    public By getPassField() {
        return passField;
    }

    public By getUpdButton() {
        return updButton;
    }

    public By getErrorMessage() {
        return errorMessage;
    }

    public By getForgotPass() {
        return forgotPass;
    }

    public By getEmailForRestorePassField() {
        return emailForRestorePassField;
    }

    public By getSubmitRestore() {
        return submitRestore;
    }
}
