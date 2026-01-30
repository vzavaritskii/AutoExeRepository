package exercise.automation.common;

import exercise.automation.page.HomePage;
import exercise.automation.page.LoginPage;
import org.openqa.selenium.WebDriver;

public class Precondition {

    private final WebDriver driver;

    public Precondition (WebDriver driver) {
        this.driver = driver;
    }


    public void testAccountAbsent() {
        tryLogin();

        if (!driver.getCurrentUrl().contains("login")) {
            new HomePage(driver).clickDeleteAccount().clickContinueButton();

        }
    }


    public void testAccountPresent() {
        tryLogin();

        if (driver.getCurrentUrl().contains("login")) {
            new LoginPage(driver).clickGoToHomePage();
            registerTestUser();
        }
        new HomePage(driver).clickLogout().clickGoToHomePage();
    }


    private void registerTestUser() {
        driver.get("https://automationexercise.com/");
        new HomePage(driver)
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
                .clickContinueButton();
    }

    private void tryLogin() {
        new HomePage(driver)
                .clickSignUp()
                .setLogin()
                .setPassword()
                .clickLoginButton();
    }
}
