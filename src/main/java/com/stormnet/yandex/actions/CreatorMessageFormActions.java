package com.stormnet.yandex.actions;

import com.stormnet.yandex.waiter.Waiter;
import com.stormnet.yandex.page_wrappers.CreatorMessageForm;
import io.qameta.allure.Step;


public class CreatorMessageFormActions {

    public CreatorMessageFormActions() {
    }

    @Step("Fill required field for new message")
    public static void writeNewLetterAndSend() {
        Waiter.waitUntilVisible(new CreatorMessageForm().getToField(),"Element was found", Waiter.TIMEOUT.THREE_SEC);
        clickToField();
        Waiter.waitUntilVisible(new CreatorMessageForm().getChooseField(), "Element was found", Waiter.TIMEOUT.THREE_SEC);
        chooseMailer();
        Waiter.waitUntilVisible(new CreatorMessageForm().getThemeField(),"Element was found", Waiter.TIMEOUT.THREE_SEC);
        fillThemeField("theme");
        uploadFile();
        Waiter.waitUntilLoadFile();
        Waiter.waitUntilVisible(new CreatorMessageForm().getSendButton(),"Send Button was found", Waiter.TIMEOUT.FIVE_SEC);
        sendMessage();
        Waiter.waitUntilVisible(new CreatorMessageForm().getReturnButton(),"find return button", Waiter.TIMEOUT.THREE_SEC);
        clickReturnButton();

    }


    public static void clickToField() {
        new CreatorMessageForm().getToField().click();
    }

    public static void chooseMailer() {
        new CreatorMessageForm().getChooseField().click();
    }

    public static void fillThemeField(String theme) {
        new CreatorMessageForm().getThemeField().sendKeys(theme);
    }


    public static void uploadFile() {

        new CreatorMessageForm().findAttachButton().sendKeys("/Users/admin/Documents/3tasks.docx");

    }

    public static void sendMessage() {
        new CreatorMessageForm().getSendButton().click();
    }

    public static void clickReturnButton() {
        new CreatorMessageForm().getReturnButton().click();
    }


}
