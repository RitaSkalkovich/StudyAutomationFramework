package com.stormnet.yandex.actions;

import com.stormnet.yandex.page_wrappers.CreatorMessageForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class CreatorMessageFormActions {

    WebDriver driver;
    private static final By TO_FIELD_LOCATOR = By.cssSelector(".ComposeRecipients-TopRow .composeYabbles");
    private static final By CHOOSE_MAILER_FIELD_LOCATOR = By.cssSelector(".ContactsSuggestItemDesktop");
    private static final By THEME_FIELD_LOCATOR = By.xpath("//input[@name=\"subject\"]");
    private static final By SEND_BUTTON_LOCATOR = By.cssSelector(".Button2_view_default");
    private static final By RETURN_TO_ALL_MESSAGE_BUTTON_LOCATOR = By.xpath("//div[@class=\"ComposeDoneScreen-Actions\"]/a");
    private static final By CHECK_BOX_LOCATOR = By.cssSelector(".nb-checkbox");
    private static final By PANEL_WITH_DISK_BUTTON_LOCATOR = By.cssSelector(".mail-File_type_doc");
    private static final By OPEN_TO_DISK_BUTTON_LOCATOR = By.xpath("//a[@href=\"https://disk.yandex.ru\"]");

    public CreatorMessageFormActions(WebDriver driver) {
        this.driver = driver;
    }

    public CreatorMessageFormActions clickToField() {
        new CreatorMessageForm(driver).getToField().click();
        return this;
    }

    public CreatorMessageFormActions chooseMailer() {
        new CreatorMessageForm(driver).getChooseField().click();
        return this;
    }

    public CreatorMessageFormActions fillThemeField(String theme) {
        new CreatorMessageForm(driver).getThemeField().sendKeys(theme);
        return this;
    }

    public CreatorMessageFormActions uploadFile(){
        new CreatorMessageForm(driver).findAttachButton().sendKeys("/Users/admin/Documents/3tasks.docx");
        return this;
    }
    public CreatorMessageFormActions sendMessage() {
        new CreatorMessageForm(driver).getSendButton().click();
        return this;
    }
    public CreatorMessageFormActions clickReturnButton() {
        new CreatorMessageForm(driver).getReturnButton().click();
        return this;
    }
    public CreatorMessageFormActions chooseFirstMessage() {
        new CreatorMessageForm(driver).findCheckBox().clickCheckBox();
        return this;
    }
    public CreatorMessageFormActions openPanelWithDiskButton() {
        new CreatorMessageForm(driver).getPanelWithDiskButton().click();
        return this;
    }
    public CreatorMessageFormActions moveFileToDisk() {
        new CreatorMessageForm(driver).getDiskButtonToMove().click();
        return this;
    }
    public CreatorMessageFormActions openDiskPage() {
        new CreatorMessageForm(driver).getDiskButton().click();
        return this;
    }
    public CreatorMessageFormActions waitUntilFindElementField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.withMessage("Element was found")
                .until(ExpectedConditions.visibilityOfElementLocated(TO_FIELD_LOCATOR));
        return this;

    }
    public CreatorMessageFormActions waitUntilFindElementChooseMailer() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.withMessage("Element was found")
                .until(ExpectedConditions.visibilityOfElementLocated(CHOOSE_MAILER_FIELD_LOCATOR));
        return this;

    }
    public CreatorMessageFormActions waitUntilFindElementThemeField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.withMessage("Element was found")
                .until(ExpectedConditions.visibilityOfElementLocated(THEME_FIELD_LOCATOR));
        return this;
    }
    public CreatorMessageFormActions waitUntilFindSendButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.withMessage("Send Button was found")
                .until(ExpectedConditions.visibilityOfElementLocated(SEND_BUTTON_LOCATOR));
        return this;
    }
    public CreatorMessageFormActions waitUntilFindReturnButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.withMessage("Send Button was found")
                .until(ExpectedConditions.visibilityOfElementLocated(RETURN_TO_ALL_MESSAGE_BUTTON_LOCATOR));
        return this;
    }

    public CreatorMessageFormActions waitUntilFindFirstMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.withMessage("CheckBox was found")
                .until(ExpectedConditions.visibilityOfElementLocated(CHECK_BOX_LOCATOR));
        return this;
    }
    public CreatorMessageFormActions waitUntilFindMoveToDisk() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        wait.withMessage("Send Button was found")
                .until(ExpectedConditions.visibilityOfElementLocated(PANEL_WITH_DISK_BUTTON_LOCATOR));
        return this;
    }

    public CreatorMessageFormActions waitUntilOpenDisk() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        wait.withMessage("Send Button was not found")
                .until(ExpectedConditions.visibilityOfElementLocated(OPEN_TO_DISK_BUTTON_LOCATOR));
        return this;
    }

}
