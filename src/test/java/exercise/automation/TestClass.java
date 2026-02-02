package exercise.automation;

import exercise.automation.common.BaseTest;
import exercise.automation.common.Precondition;
import exercise.automation.page.ContactUsPage;
import exercise.automation.page.HomePage;
import exercise.automation.page.LoginPage;
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


    @Test
    // Test Case 3: Login User with incorrect email and password
    public void logUserWithIncorrEmailAndPass() {
        new Precondition(getDriver()).testAccountAbsent();

        new HomePage(getDriver())
                .clickSignUp()
                .setLogin()
                .setPassword()
                .clickLoginButton();
        Assert.assertTrue(new LoginPage(getDriver()).isLoginErrorMessagePresent());
    }


    @Test
    // Test Case 4: Logout User
    public void logoutUser() {
        new Precondition(getDriver()).testAccountPresent();

        new HomePage(getDriver())
                .clickSignUp()
                .setLogin()
                .setPassword()
                .clickLoginButton()
                .clickLogout();

        Assert.assertTrue(getDriver().getCurrentUrl()
                .contains("login"));
    }


    @Test
    // Test Case 5: Register User with existing email
    public void regUserWithExistEmail() {
        new Precondition(getDriver()).testAccountPresent();

        new HomePage(getDriver())
                .clickSignUp()
                .setNewUserName()
                .setNewUserEmail()
                .clickSignupButton();

        Assert.assertTrue(new LoginPage(getDriver()).isSignupErrorMessagePresent());
    }


    @Test
    // Test Case 6: Contact Us Form
    public void contactUsForm() {

        new HomePage(getDriver())
                .clickContactUs()
                .setName()
                .setEmail()
                .setSubject()
                .setMessage()
                .uploadFile()
                .clickSubmitButton();

        Assert.assertTrue(getDriver()
                .findElement(By.xpath("//div[@class = 'status alert alert-success']")).getText()
                .contains("Success! Your details have been submitted successfully."));

        new ContactUsPage(getDriver()).clickGreenHomeButtonAfterSentMessage();
    }


    @Test
    // Test Case 7: Verify Test Cases Page
    public void verifyTestCasePage() {
        new HomePage(getDriver())
                .clickTestCasesButton();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("test_cases"));
    }
}
