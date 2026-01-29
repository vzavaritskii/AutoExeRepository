package exercise.automation.page;

import exercise.automation.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteAccountPage extends BasePage {

    private static final By CONTINUE_BUTTON =
        By.xpath("//a[@data-qa = 'continue-button']");


    public DeleteAccountPage(WebDriver driver) {
        super(driver);
    }


    public HomePage clickContinueButton() {
        getDriver().findElement(CONTINUE_BUTTON).click();

        return new HomePage(getDriver());
    }
}
