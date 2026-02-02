package exercise.automation.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

    private final WebDriver driver;
    private static final Duration DEFAULT_TIMEOUT = Duration.ofSeconds(5);

    protected BasePage(WebDriver driver) {
        this.driver = driver;
    }


    protected WebElement waitUntilVisible(By locator, Duration timeout) {
        return new WebDriverWait(driver, timeout)
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }


    protected WebElement waitUntilVisible(By locator) {
        return waitUntilVisible(locator, DEFAULT_TIMEOUT);
    }


    protected WebDriver getDriver() { return driver; }
}
