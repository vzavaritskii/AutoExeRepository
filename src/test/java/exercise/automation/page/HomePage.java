package exercise.automation.page;

import exercise.automation.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage (WebDriver driver) { super(driver); }


    public LoginPage clickSignUp() {
        getDriver().findElement(By.xpath("//a[@href='/login']")).click();

        return new LoginPage(getDriver());
    }


    public HomePage clickDeleteAccount() {
        getDriver().findElement(By.xpath("//a[@href = '/delete_account']")).click();

        return this;
    }
}
