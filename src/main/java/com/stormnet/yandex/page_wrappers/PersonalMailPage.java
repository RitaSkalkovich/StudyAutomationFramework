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

    private static final By CHECK_BOX_LOCATOR = By.cssSelector(".nb-checkbox");
    private static final By PANEL_WITH_DISK_BUTTON_LOCATOR = By.cssSelector(".mail-File_type_doc");
    private static final By MOVE_TO_DISK_BUTTON_LOCATOR = By.cssSelector(".js-show-save-popup");
    private static final By OPEN_TO_DISK_BUTTON_LOCATOR = By.xpath("//a[@href=\"https://disk.yandex.ru\"]");


    public PersonalMailPage(WebDriver driver) {
        this.commonSignPage = new CommonSignPage(driver);
        this.driver = driver;
    }

    public CommonSignPage getCommonSignPage() {
        return commonSignPage;
    }

    public Button clickWriteButton() {
        return new Button(driver, WRITE_BUTTON_LOCATOR);
    }


    public PersonalMailPage writerButton() {
        clickWriteButton().click();
        return new PersonalMailPage(driver);
    }

    public PersonalMailPage waitUntilOpened() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.withMessage("Page was opened")
                .until(ExpectedConditions.visibilityOfElementLocated(WRITE_BUTTON_LOCATOR));
        return this;

    }


}
