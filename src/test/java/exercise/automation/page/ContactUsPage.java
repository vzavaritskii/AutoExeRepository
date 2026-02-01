package exercise.automation.page;

import exercise.automation.common.BasePage;
import exercise.automation.common.TestData;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class ContactUsPage extends BasePage {

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }


    public ContactUsPage setName() {
        getDriver().findElement(By.xpath("//input[@data-qa = 'name']")).sendKeys(TestData.NEW_USER_NAME);

        return this;
    }


    public ContactUsPage setEmail() {
        getDriver().findElement(By.xpath("//input[@data-qa = 'email']")).sendKeys(TestData.USER_EMAIL);

        return this;
    }


    public ContactUsPage setSubject() {
        getDriver().findElement(By.xpath("//input[@data-qa = 'subject']")).sendKeys(TestData.SUBJECT);

        return this;
    }


    public ContactUsPage setMessage() {
        getDriver().findElement(By.xpath("//textarea[@data-qa = 'message']")).sendKeys(TestData.MESSAGE);

        return this;
    }


    public ContactUsPage uploadFile() {
        File file = new File(TestData.UPLOAD_FILE_PATH);
        getDriver().findElement(By.xpath("//input[@name = 'upload_file']")).sendKeys(file.getAbsolutePath());

        return this;
    }


    public ContactUsPage clickSubmitButton() {
        getDriver().findElement(By.xpath("//input[@data-qa= 'submit-button']")).click();
        getDriver().switchTo().alert().accept();

        return this;
    }


    public HomePage clickGreenHomeButtonAfterSentMessage() {
        getDriver().findElement(By.xpath("//a[@class = 'btn btn-success']")).click();

        return new HomePage(getDriver());
    }
}
