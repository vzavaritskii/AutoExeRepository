package exercise.automation.page;

import exercise.automation.common.BasePage;
import exercise.automation.common.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public LoginPage setNewUserEmail() {
        getDriver().findElement(By.xpath("//input[@data-qa='signup-email']"))
                .sendKeys(TestData.USER_EMAIL);

        return new LoginPage(getDriver());
    }


    public LoginPage setNewUserName() {
        final String NEW_USER_NAME = "newTestUserName";
        getDriver().findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys(NEW_USER_NAME);

        return new LoginPage(getDriver());
    }


    public SignUpEnterInfoPage clickSignupButton() {
        getDriver().findElement(By.xpath("//button[@data-qa='signup-button']")).click();

        return new SignUpEnterInfoPage(getDriver());
    }


    public LoginPage setLogin() {
        getDriver().findElement(By.xpath("//input[@data-qa = 'login-email']"))
                .sendKeys(TestData.USER_EMAIL);

        return this;
    }


    public LoginPage setPassword() {
        getDriver().findElement(By.xpath("//input[@type = 'password']"))
                .sendKeys(TestData.PASSWORD);

        return this;
    }


    public HomePage clickLoginButton() {
        getDriver().findElement(By.xpath("//button[@data-qa = 'login-button']")).click();

        return new HomePage(getDriver());
    }


    public HomePage clickGoToHomePage() {
        getDriver().findElement(By.xpath("//img[@src = '/static/images/home/logo.png']")).click();

        return new HomePage(getDriver());
    }


    public boolean isErrorMessagePresent() {
        try {
            waitUntilVisible(By.xpath("//p[contains(text(), 'Your email or password is incorrect!')]"));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }
}
