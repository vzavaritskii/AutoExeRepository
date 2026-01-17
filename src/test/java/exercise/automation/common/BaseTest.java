package exercise.automation.common;

import exercise.automation.page.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public abstract class BaseTest {

    private WebDriver driver;

    private WebDriverWait wait2;
    private WebDriverWait wait5;
    private WebDriverWait wait10;

    @BeforeMethod
    protected void beforeMethod() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");

        /*
        new HomePage(driver)
                .clickSignUp()
                .setLogin()
                .setPassword()
                .clickLoginButton();

        if (driver.getCurrentUrl().equals("https://automationexercise.com/")) {
            driver.findElement(By.xpath("//a[@href = '/delete_account']")).click();
        }

         */
    }

    @AfterMethod
    protected void afterMethod() {
        if (driver != null) {
            driver.quit();
            wait2 = null;
            wait5 = null;
            wait10 = null;
        }
    }

    protected WebDriver getDriver() {
        return driver;
    }
}
