package com.stormnet.yandex.actions;


import com.stormnet.yandex.page_wrappers.PersonalMailPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PersonalPageActions {
    WebDriver driver;
    private static final By WRITE_BUTTON_LOCATOR = By.xpath("//a[@href=\"#compose\"]");
    private static final By CHECK_BOX_LOCATOR = By.cssSelector(".nb-checkbox");
    private static final By PANEL_WITH_DISK_BUTTON_LOCATOR = By.cssSelector(".mail-File_type_doc");
    private static final By OPEN_TO_DISK_BUTTON_LOCATOR = By.xpath("//a[@href=\"https://disk.yandex.ru\"]");

    public PersonalPageActions(WebDriver driver) {
        this.driver = driver;
    }

    public PersonalPageActions writeMessage() {
        new PersonalMailPage(driver).clickWriteButton().click();
        return this;
    }

    public PersonalPageActions chooseFirstMessage() {
        new PersonalMailPage(driver).findCheckBox().clickCheckBox();
        return this;
    }

    public PersonalPageActions openPanelWithDiskButton() {
        new PersonalMailPage(driver).getPanelWithDiskButton().click();
        return this;
    }

    public PersonalPageActions openDiskPage() {
        new PersonalMailPage(driver).getDiskButton().click();
        return this;
    }

    public PersonalPageActions moveFileToDisk() {
        new PersonalMailPage(driver).getDiskButtonToMove().click();
        return this;
    }

    public PersonalPageActions waitUntilFindFirstMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.withMessage("CheckBox was found")
                .until(ExpectedConditions.visibilityOfElementLocated(CHECK_BOX_LOCATOR));
        return this;
    }

    public PersonalPageActions waitUntilFindMoveToDisk() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        wait.withMessage("Send Button was found")
                .until(ExpectedConditions.visibilityOfElementLocated(PANEL_WITH_DISK_BUTTON_LOCATOR));
        return this;
    }


    public PersonalPageActions waitUntilOpenDisk() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        wait.withMessage("Send Button was not found")
                .until(ExpectedConditions.visibilityOfElementLocated(OPEN_TO_DISK_BUTTON_LOCATOR));
        return this;
    }

    public PersonalPageActions waitUntilOpened() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.withMessage("Page was opened")
                .until(ExpectedConditions.visibilityOfElementLocated(WRITE_BUTTON_LOCATOR));
        return this;

    }


}
