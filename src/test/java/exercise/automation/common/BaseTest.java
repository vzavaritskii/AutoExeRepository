package exercise.automation.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public abstract class BaseTest {

    private WebDriver driver;


    @BeforeMethod
    protected void beforeMethod() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
    }


    @AfterMethod
    protected void afterMethod() {
        if (driver != null) {
            driver.quit();
        }
    }


    protected WebDriver getDriver() {
        return driver;
    }
}
