package com.stormnet.yandex.actions;

import com.stormnet.yandex.page_wrappers.Files;
import com.stormnet.yandex.waiter.Waiter;
import com.stormnet.yandex.page_wrappers.CreatorMessageForm;
import io.qameta.allure.Step;
import java.io.File;
import java.io.IOException;


public class CreatorMessageFormActions {

    public CreatorMessageFormActions() {
    }

    @Step("Fill required field for new message")
    public static void writeNewLetterAndSend(){
        Waiter.waitUntilFindElementField();
        clickToField();
        Waiter.waitUntilFindElementChooseMailer();
        chooseMailer();
        Waiter.waitUntilFindElementThemeField();
        fillThemeField("theme");
        uploadFile();
        Waiter.waitUntilLoadFile();
        Waiter.waitUntilFindSendButton();
        sendMessage();
        Waiter.waitUntilFindReturnButton();
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

    public static void uploadFile(){
       
        new CreatorMessageForm().findAttachButton().sendKeys("/Users/admin/Documents/3tasks.docx");

    }
    public static void sendMessage() {
        new CreatorMessageForm().getSendButton().click();
    }

    public static void clickReturnButton() {
        new CreatorMessageForm().getReturnButton().click();
    }



}
