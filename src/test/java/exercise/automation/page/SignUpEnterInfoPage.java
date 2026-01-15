package exercise.automation.page;

import exercise.automation.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpEnterInfoPage extends BasePage {

    public SignUpEnterInfoPage(WebDriver driver) {
        super(driver);
    }

    public SignUpEnterInfoPage setTitleMr() {
        getDriver().findElement(By.xpath("//input[@id='id_gender1']")).click();

        return this;
    }


    public SignUpEnterInfoPage setTitleMrs() {
        getDriver().findElement(By.xpath("//input[@id='id_gender2']")).click();

        return this;
    }


    public SignUpEnterInfoPage setPassword() {
        getDriver().findElement(By.xpath("//input[@data-qa='password']"))
                .sendKeys("testPassword");

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
}
