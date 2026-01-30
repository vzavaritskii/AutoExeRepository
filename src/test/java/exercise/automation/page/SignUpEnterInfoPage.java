package exercise.automation.page;

import exercise.automation.common.BasePage;
import exercise.automation.common.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpEnterInfoPage extends BasePage {

    public SignUpEnterInfoPage(WebDriver driver) {
        super(driver);
    }

    public SignUpEnterInfoPage setPassword() {
        waitUntilVisible(By.xpath("//input[@data-qa='password']"));
        getDriver().findElement(By.xpath("//input[@data-qa='password']"))
                .sendKeys(TestData.PASSWORD);

        return this;
    }


    public SignUpEnterInfoPage setDayOfBirth() {
        new Select(getDriver().findElement(By.xpath("//select[@data-qa='days']"))).selectByVisibleText("12");

        return this;
    }


    public SignUpEnterInfoPage setMonthOfBirth() {
        new Select(getDriver().findElement(By.xpath("//select[@data-qa='months']")))
                .selectByVisibleText("April");

        return this;
    }


    public SignUpEnterInfoPage setYearOfBirth() {
        new Select(getDriver().findElement(By.xpath("//select[@data-qa='years']")))
                .selectByVisibleText("2001");

        return this;
    }


    public SignUpEnterInfoPage toggleNewsletterCheckbox() {
        getDriver().findElement(By.xpath("//input[@id = 'newsletter']")).click();

        return this;
    }


    public SignUpEnterInfoPage toggleSpecialOffersCheckbox() {
        getDriver().findElement(By.xpath("//input[@id = 'optin']")).click();

        return this;
    }


    public SignUpEnterInfoPage setFirstName() {
        getDriver().findElement(By.xpath("//input[@id = 'first_name']")).sendKeys("TestFirstName");

        return this;
    }


    public SignUpEnterInfoPage setLastName() {
        getDriver().findElement(By.xpath("//input[@id = 'last_name']")).sendKeys("TestLastName");

        return this;
    }


    public SignUpEnterInfoPage setAddress1() {
        getDriver().findElement(By.xpath("//input[@id = 'address1']")).sendKeys("Main street 90-210");

        return this;
    }


    public SignUpEnterInfoPage setCountry() {
        new Select(getDriver().findElement(By.xpath("//select[@id = 'country']"))).selectByVisibleText("Australia");

        return this;
    }


    public SignUpEnterInfoPage setState() {
        getDriver().findElement(By.xpath("//input[@id = 'state']")).sendKeys("Victoria");

        return this;
    }


    public SignUpEnterInfoPage setCity() {
        getDriver().findElement(By.xpath("//input[@id = 'city']")).sendKeys("Alberton");

        return this;
    }


    public SignUpEnterInfoPage setZipCode() {
        getDriver().findElement(By.xpath("//input[@id = 'zipcode']")).sendKeys("3971");

        return this;
    }


    public SignUpEnterInfoPage setMobileNumber() {
        getDriver().findElement(By.xpath("//input[@id = 'mobile_number']")).sendKeys("+61 4 1234 5678");

        return this;
    }


    public AccountCreatedPage clickCreateAccount() {
        getDriver().findElement(By.xpath("//button[@data-qa = 'create-account']")).click();

        return new AccountCreatedPage(getDriver());
    }
}
