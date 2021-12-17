package pages.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageElements.LoginPageElements;

import java.time.Duration;

import static constants.Constant.TimeoutVariable.IMPLICIT_WAIT;

public class LoginPage extends LoginPageElements {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage checkUpdate(String url) {
        if (driver.getCurrentUrl().equals(url)) {
            driver.findElement(getUpdButton()).click();
        }
        return this;
    }

    public LoginPage setEmail(String email) {
        driver.findElement(getEmailField()).sendKeys(email);
        return this;
    }

    public LoginPage setPass(String pass) {
        driver.findElement(getPassField()).sendKeys(pass);
        return this;
    }

    public LoginPage clickLogin() {
        driver.findElement(getLoginButton()).click();
        return this;
    }

    public LoginPage checkUrlAfterLogin(String url) {
        new WebDriverWait(driver, Duration.ofSeconds(IMPLICIT_WAIT)).until(ExpectedConditions
                .urlToBe(url));
        return this;
    }

    public LoginPage checkError() {
        new WebDriverWait(driver, Duration.ofSeconds(IMPLICIT_WAIT)).until(ExpectedConditions
                .presenceOfElementLocated(getErrorMessage()));
        return this;
    }

    public LoginPage forgotPassClick() {
        WebElement buttonForgot = driver.findElement(getForgotPass());
        if (buttonForgot.isDisplayed()) { //useless check, just for studying
            buttonForgot.click();
        }
        return this;
    }

    public LoginPage setRequestedEmail(String email) {
        WebElement restoreEmailField = driver.findElement(getEmailForRestorePassField());
        if (restoreEmailField.isDisplayed()) {
            restoreEmailField.sendKeys(email);
        }
        return this;
    }

    public LoginPage clickSubmit() {
        driver.findElement(getSubmitRestore()).click();
        return this;
    }

    public LoginPage successLogin(String email, String pass) {
        setEmail(email);
        setPass(pass);
        clickLogin();
        return this;
    }

}




