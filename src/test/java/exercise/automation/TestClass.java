package exercise.automation;

import exercise.automation.common.BaseTest;
import exercise.automation.page.HomePage;
import org.testng.annotations.Test;

public class TestClass extends BaseTest {

    @Test
    public void test() {
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
                .setMobileNumber();
    }
}
