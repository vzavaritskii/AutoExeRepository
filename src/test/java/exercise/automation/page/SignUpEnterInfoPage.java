package exercise.automation.page;

import exercise.automation.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpEnterInfoPage extends BasePage {

    public SignUpEnterInfoPage(WebDriver driver) {
        super(driver);
    }

    public SignUpEnterInfoPage setTitleMr() {
        getDriver().findElement(By.xpath("//input[@id='id_gender1']")).click();

        return new SignUpEnterInfoPage(getDriver());
    }


    public SignUpEnterInfoPage setTitleMrs() {
        getDriver().findElement(By.xpath("//input[@id='id_gender2']")).click();

        return new SignUpEnterInfoPage(getDriver());
    }


    public SignUpEnterInfoPage setName() {
        getDriver().findElement(By.xpath("//input[@data-qa='name']")).sendKeys();
    }
}
