package com.stormnet.yandex.actions;


import com.stormnet.yandex.waiter.Waiter;
import com.stormnet.yandex.page_wrappers.PersonalMailPage;
import io.qameta.allure.Step;


public class PersonalPageActions {

    @Step("Open message creator")
    public static void openMessageForm() {
        Waiter.waitUntilVisible(new PersonalMailPage().getWriteButton(), "Page was opened", Waiter.TIMEOUT.SEVEN_SEC);
        PersonalPageActions.writeMessage();
    }

    @Step("Move file to yandex disk")
    public static void moveFileToYandexDisk() {
        Waiter.waitUntilVisible(new PersonalMailPage().findCheckBox(),"CheckBox was found", Waiter.TIMEOUT.FIVE_SEC);
        PersonalPageActions.chooseFirstMessage();
        Waiter.waitUntilVisible(new PersonalMailPage().getPanelWithDiskButton(),"panel was opened", Waiter.TIMEOUT.SEVEN_SEC);
        PersonalPageActions.openPanelWithDiskButton();
        PersonalPageActions.moveFileToDisk();
        Waiter.waitUntilVisible(new PersonalMailPage().getDiskButton(),"disk was opened", Waiter.TIMEOUT.SEVEN_SEC);
        PersonalPageActions.openDiskPage();
    }


    public static void writeMessage() {
        new PersonalMailPage().clickWriteButton().click();
    }

    public static void chooseFirstMessage() {
        new PersonalMailPage().findCheckBox().clickCheckBox();
    }

    public static void openPanelWithDiskButton() {
        new PersonalMailPage().getPanelWithDiskButton().click();
    }

    public static void openDiskPage() {
        new PersonalMailPage().getDiskButton().click();
    }

    public static void moveFileToDisk() {
        new PersonalMailPage().getDiskButtonToMove().click();
    }

}
