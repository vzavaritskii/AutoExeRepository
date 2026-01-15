package exercise.automation.page;

import exercise.automation.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public LoginPage setNewUserEmail() {
        final String NEW_USER_EMAIL = "newtestuser@gmail.com";
        getDriver().findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys(NEW_USER_EMAIL);

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
}
