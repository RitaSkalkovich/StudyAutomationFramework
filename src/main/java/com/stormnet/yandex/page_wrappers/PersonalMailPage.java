package com.stormnet.yandex.page_wrappers;
import com.stormnet.yandex.hmtlElements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class PersonalMailPage {
    protected CommonSignPage commonSignPage;
    private WebDriver driver;
    private static final By WRITE_BUTTON_LOCATOR = By.xpath("//a[@href=\"#compose\"]");

    public PersonalMailPage(WebDriver driver) {
        this.commonSignPage = new CommonSignPage(driver);
        this.driver = driver;
    }

    public Button clickWriteButton() {
        return new Button(driver, WRITE_BUTTON_LOCATOR);
    }

    public PersonalMailPage writerButton() {
        clickWriteButton().click();
        return new PersonalMailPage(driver);
    }

    public void waitUntilOpened() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.withMessage("Page was not opened")
                .until(ExpectedConditions.visibilityOfElementLocated(WRITE_BUTTON_LOCATOR));

    }

}
