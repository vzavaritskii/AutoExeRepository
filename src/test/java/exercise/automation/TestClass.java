package exercise.automation;

import exercise.automation.common.BaseTest;
import exercise.automation.common.Precondition;
import exercise.automation.page.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends BaseTest {

    @Test
    // Test Case 1: Register User
    public void registerUser() {
        new Precondition(getDriver()).testAccountAbsent();

        new HomePage(getDriver())
                .clickSignUp()
                .setNewUserName()
                .setNewUserEmail()
                .clickSignupButton()
                .setPassword()
                .setDayOfBirth()
                .setMonthOfBirth()
                .setYearOfBirth()
                .toggleNewsletterCheckbox()
                .toggleSpecialOffersCheckbox()
                .setFirstName()
                .setLastName()
                .setAddress1()
                .setCountry()
                .setState()
                .setCity()
                .setZipCode()
                .setMobileNumber()
                .clickCreateAccount()
                .clickContinueButton()
                .clickDeleteAccount();

        Assert.assertEquals(getDriver().findElement(By.xpath("//h2[@data-qa = 'account-deleted']")).getText(),
                "ACCOUNT DELETED!");
    }


    @Test
    // Test Case 2: Login User with correct email and password
    public void logUserWithCorrEmailAndPass() {
        new Precondition(getDriver()).testAccountPresent();

        new HomePage(getDriver())
                .clickSignUp()
                .setLogin()
                .setPassword()
                .clickLoginButton()
                .clickDeleteAccount();
        Assert.assertEquals(getDriver().findElement(By.xpath("//h2[@data-qa = 'account-deleted']")).getText(),
                "ACCOUNT DELETED!");
    }
}
