package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import static constants.Constant.TimeoutVariable.IMPLICIT_WAIT;
import static constants.Constant.Urls.*;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private final By emailField = By.id("login-field-email");
    private final By passField = By.id("login-field-password");
    private final By loginButton = By.xpath("//*[contains(text(),'Log In')]");
    private final By updButton = By.xpath("//*[contains(text(),'Upgrade')]");
    private final By errorMessage = By.xpath("//*[contains(@class, 'form-message')] "); // same as //*[contains(text(),'Invalid user id or password')]
    private final By forgotPass = By.linkText("Forgot Password");
    private final By emailForRestorePassField = By.id("request-email-field");
    private final By submitRestore = By.xpath("//*[contains(text(),'Submit')]");
    /**
     *можна подобавляти геттери і сеттери і тоді через них ініціалізувати ті локатори в самому тесті
     */
    public By getLoginButton() {
        return loginButton;
    }
    public LoginPage checkUpdate(){
        if (driver.getCurrentUrl().contains(UPGRADE_PAGE)){
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
    public LoginPage clickLogin(){
        driver.findElement(loginButton).click();
        return this;
    }
    public LoginPage checkUrlAfterLogin(){
        new WebDriverWait(driver, Duration.ofSeconds(IMPLICIT_WAIT)).until(ExpectedConditions.urlToBe(DEFAULT_AFTER_LOGIN));
        return this;
    }
    public LoginPage checkError(){
        new WebDriverWait(driver,Duration.ofSeconds(IMPLICIT_WAIT)).until(ExpectedConditions.presenceOfElementLocated(errorMessage));
        return this;
    }
    public LoginPage forgotPassClick(){
        WebElement buttonForgot = driver.findElement(forgotPass);
        if (buttonForgot.isDisplayed()) { //useless check, just for studying
            buttonForgot.click();
        } return this;
    }
    public LoginPage setRequestedEmail(String email){
        WebElement restoreEmailField = driver.findElement(emailForRestorePassField);
        if (restoreEmailField.isDisplayed()){
            restoreEmailField.sendKeys(email);
        } return this;
    }
    public LoginPage clickSubmit(){
        driver.findElement(submitRestore).click();
        return this;
    }
    public LoginPage successLogin(String email, String pass){
        setEmail(email);
        setPass(pass);
        clickLogin();
        checkUrlAfterLogin();
        return this;
    }

    }




