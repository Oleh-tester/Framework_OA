package pages.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageElements.LoginPageElements;

public class LoginPage extends LoginPageElements {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage checkUpdate(String updateUrl) {
        if (driver.getCurrentUrl().equals(updateUrl)) {
            driver.findElement(updButton).click();
        }
        return this;
    }

    public LoginPage setEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public LoginPage setPass(String pass) {
        driver.findElement(passField).sendKeys(pass);
        return this;
    }

    public LoginPage clickLogin() {
        driver.findElement(loginButton).click();
        return this;
    }

    public LoginPage forgotPassClick() {
        WebElement buttonForgot = driver.findElement(forgotPass);
        if (buttonForgot.isDisplayed()) {
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
        driver.findElement(submitRestore).click();
        return this;
    }

    public LoginPage successLogin(String email, String pass) {
        setEmail(email);
        setPass(pass);
        clickLogin();
        return this;
    }
    public LoginPage fillInSavePassForm(String newPass) {
        driver.findElement(temporaryPassField).sendKeys("tempPass21");
        driver.findElement(newPassField).sendKeys(newPass);
        driver.findElement(reTypePassField).sendKeys(newPass);
        return this;
    }

}




