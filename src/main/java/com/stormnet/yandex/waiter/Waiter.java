package com.stormnet.yandex.waiter;

import com.stormnet.yandex.driver.UiDriver;
import com.stormnet.yandex.loginPage.LoginPage;
import com.stormnet.yandex.page_wrappers.CreatorMessageForm;
import com.stormnet.yandex.page_wrappers.DiskPage;
import com.stormnet.yandex.page_wrappers.DownloadPage;
import com.stormnet.yandex.page_wrappers.PersonalMailPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Waiter {
    public static void waitUntilOpenedPasswordFiled() {
        WebDriverWait waits = new WebDriverWait(UiDriver.getDriver(), Duration.ofSeconds(3));
        waits.withMessage("Password form was opened")
                .until(ExpectedConditions.visibilityOfElementLocated(LoginPage.PASSWORD_FIELD_LOCATOR));
    }


    public static void waitUntilOpened() {
        WebDriverWait wait = new WebDriverWait(UiDriver.getDriver(), Duration.ofSeconds(7));
        wait.withMessage("Page was opened")
                .until(ExpectedConditions.visibilityOfElementLocated(PersonalMailPage.WRITE_BUTTON_LOCATOR));

    }

    public static void waitUntilFindElementField() {
        WebDriverWait wait = new WebDriverWait(UiDriver.getDriver(), Duration.ofSeconds(3));
        wait.withMessage("Element was found")
                .until(ExpectedConditions.visibilityOfElementLocated(CreatorMessageForm.TO_FIELD_LOCATOR));

    }

    public static void waitUntilFindElementChooseMailer() {
        WebDriverWait wait = new WebDriverWait(UiDriver.getDriver(), Duration.ofSeconds(3));
        wait.withMessage("Element was found")
                .until(ExpectedConditions.visibilityOfElementLocated(CreatorMessageForm.CHOOSE_MAILER_FIELD_LOCATOR));

    }

    public static void waitUntilFindElementThemeField() {
        WebDriverWait wait = new WebDriverWait(UiDriver.getDriver(), Duration.ofSeconds(3));
        wait.withMessage("Element was found")
                .until(ExpectedConditions.visibilityOfElementLocated(CreatorMessageForm.THEME_FIELD_LOCATOR));

    }

    public static void waitUntilFindSendButton() {
        WebDriverWait wait = new WebDriverWait(UiDriver.getDriver(), Duration.ofSeconds(5));
        wait.withMessage("Send Button was found")
                .until(ExpectedConditions.visibilityOfElementLocated(CreatorMessageForm.SEND_BUTTON_LOCATOR));


    }

    public static void waitUntilFindReturnButton() {
        WebDriverWait wait = new WebDriverWait(UiDriver.getDriver(), Duration.ofSeconds(3));
        wait.withMessage("Send Button was found")
                .until(ExpectedConditions.visibilityOfElementLocated(CreatorMessageForm.RETURN_TO_ALL_MESSAGE_BUTTON_LOCATOR));

    }

    public static void waitUntilLoadFile() {
        WebDriverWait wait = new WebDriverWait(UiDriver.getDriver(), Duration.ofSeconds(4));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.tagName("Загружено 0 из")));
//        UiDriver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(6))


    }

    public static void waitUntilFindFirstMessage() {
        WebDriverWait wait = new WebDriverWait(UiDriver.getDriver(), Duration.ofSeconds(5));
        wait.withMessage("CheckBox was found")
                .until(ExpectedConditions.visibilityOfElementLocated(PersonalMailPage.CHECK_BOX_LOCATOR));
    }

    public static void waitUntilFindMoveToDisk() {
        WebDriverWait wait = new WebDriverWait(UiDriver.getDriver(), Duration.ofSeconds(7));
        wait.withMessage("Send Button was found")
                .until(ExpectedConditions.visibilityOfElementLocated(PersonalMailPage.PANEL_WITH_DISK_BUTTON_LOCATOR));
    }

    public static void waitUntilOpenDisk() {
        WebDriverWait wait = new WebDriverWait(UiDriver.getDriver(), Duration.ofSeconds(7));
        wait.withMessage("Send Button was not found")
                .until(ExpectedConditions.visibilityOfElementLocated(PersonalMailPage.OPEN_TO_DISK_BUTTON_LOCATOR));

    }

    public static void waitUntilOpenDownloadPage() {
        WebDriverWait wait = new WebDriverWait(UiDriver.getDriver(), Duration.ofSeconds(5));
        wait.withMessage("Download page was found")
                .until(ExpectedConditions.visibilityOfElementLocated(DiskPage.DOWNLOAD_BUTTON_LOCATOR));
    }

    public static void waitUntilMoveEntityToFilePage() {
        WebDriverWait wait = new WebDriverWait(UiDriver.getDriver(), Duration.ofSeconds(3));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(DownloadPage.LOADING_ELEMENT_LOCATOR));
    }


}
