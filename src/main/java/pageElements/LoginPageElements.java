package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class LoginPageElements extends BasePage {

    public LoginPageElements(WebDriver driver) {
        super(driver);
    }

    public static final By emailField = By.id("login-field-email");
    public static final By passField = By.id("login-field-password");
    public static final By loginButton = By.id("login-log-in-button");
    public static final By updButton = By.xpath("//*[contains(text(),'Upgrade')]");
    public static final By errorMessage = By.xpath("//*[contains(@class, 'form-message')] "); // same as //*[contains(text(),'Invalid user id or password')]
    public static final By forgotPass = By.linkText("Forgot Password");
    public static final By emailForRestorePassField = By.id("request-email-field");
    public static final By submitRestore = By.xpath("//*[contains(@class,'request-button ')][2]");
    public static final By temporaryPassText = By.xpath("//*[contains(text(),'Temporary Password')]");
    public static final By temporaryPassField = By.xpath("//*[contains(@aria-label,'Temporary Password')]");
    public static final By newPassText = By.xpath("//*[contains(text(),'New Password')]");
    public static final By newPassField = By.xpath("//*[contains(@aria-label,'New Password')]");
    public static final By reTypePassField = By.xpath("//*[contains(@aria-label,'Re-type Password')]");
    public static final By reTypePassText = By.xpath("//*[contains(text(),'Re-type Password')]");
    public static final By saveNewPass = By.xpath("//*[contains(@data-id,'submit-change-password-button')]");
    public static final By newPassFormText = By.xpath("//*[contains(@class,'flex form-message data-id')]");

    /**
     * Геттери залишив, щоб була можливість використовувати локатори в самих тестах
     */
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

    public By getTemporaryPassText() {
        return temporaryPassText;
    }

    public By getTemporaryPassField() {
        return temporaryPassField;
    }

    public By getNewPassText() {
        return newPassText;
    }

    public By getNewPassField() {
        return newPassField;
    }

    public By getSaveNewPass() {
        return saveNewPass;
    }

    public By getReTypePassField() {
        return reTypePassField;
    }

    public By getReTypePassText() {
        return reTypePassText;
    }
    public By getNewPassFormText(){
        return newPassFormText;
    }
}
