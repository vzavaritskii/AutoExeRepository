package exercise.automation.page;

import exercise.automation.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage (WebDriver driver) { super(driver); }


    public LoginPage clickSignUp() {
        waitUntilVisible(By.xpath("//a[@href='/login']"));
        getDriver().findElement(By.xpath("//a[@href='/login']")).click();

        return new LoginPage(getDriver());
    }


    public DeleteAccountPage clickDeleteAccount() {
        getDriver().findElement(By.xpath("//a[@href = '/delete_account']")).click();

        return new DeleteAccountPage(getDriver());
    }


    public LoginPage clickLogout() {
        getDriver().findElement(By.xpath("//a[@href = '/logout']")).click();

        return new LoginPage(getDriver());
    }


    public ContactUsPage clickContactUs() {
        getDriver().findElement(By.xpath("//a[@href = '/contact_us']")).click();

        return new ContactUsPage(getDriver());
    }


    public TestCasePage clickTestCasesButton() {
        waitUntilVisible(By.xpath("//div[@class = 'item active']//button[contains(text(), 'Test Cases')]")).click();

        return new TestCasePage(getDriver());
    }
}
