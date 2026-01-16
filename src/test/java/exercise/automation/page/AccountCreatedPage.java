package exercise.automation.page;

import exercise.automation.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountCreatedPage extends BasePage {

    public AccountCreatedPage(WebDriver driver) {
        super(driver);
    }

    public HomePage clickContinueButton() {
        getDriver().findElement(By.xpath("//a[@data-qa = 'continue-button']")).click();

        return new HomePage(getDriver());
    }
}
