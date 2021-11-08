package com.stormnet.yandex.actions;

import com.stormnet.yandex.page_wrappers.CreatorMessageForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class CreatorMessageFormActions {

    WebDriver driver;
    private static final By TO_FIELD_LOCATOR = By.cssSelector(".ComposeRecipients-TopRow .composeYabbles");
    private static final By CHOOSE_MAILER_FIELD_LOCATOR = By.cssSelector(".ContactsSuggestItemDesktop");
    private static final By THEME_FIELD_LOCATOR = By.xpath("//input[@name=\"subject\"]");
    private static final By SEND_BUTTON_LOCATOR = By.cssSelector(".Button2_view_default");
    private static final By RETURN_TO_ALL_MESSAGE_BUTTON_LOCATOR = By.xpath("//div[@class=\"ComposeDoneScreen-Actions\"]/a");

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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.withMessage("Send Button was found")
                .until(ExpectedConditions.visibilityOfElementLocated(SEND_BUTTON_LOCATOR));
        driver.manage().timeouts().implicitlyWait(5000,
                TimeUnit.MILLISECONDS);
        return this;
    }
    public CreatorMessageFormActions waitUntilFindReturnButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.withMessage("Send Button was found")
                .until(ExpectedConditions.visibilityOfElementLocated(RETURN_TO_ALL_MESSAGE_BUTTON_LOCATOR));
        return this;
    }
    public CreatorMessageFormActions waitUntilLoadFile(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.withMessage("File was uploaded")
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".Attachments__body--UhETx")));
        return this;
    }


}
