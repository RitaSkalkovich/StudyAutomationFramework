package com.stormnet.yandex.page_wrappers;

import com.stormnet.yandex.elements.Button;
import com.stormnet.yandex.elements.CheckBox;
import org.openqa.selenium.By;



public class PersonalMailPage {

    public static final By WRITE_BUTTON_LOCATOR = By.xpath("//a[@href=\"#compose\"]");
    public static final By CHECK_BOX_LOCATOR = By.cssSelector(".nb-checkbox");
    public static final By PANEL_WITH_DISK_BUTTON_LOCATOR = By.cssSelector(".mail-File_type_doc");
    private static final By MOVE_TO_DISK_BUTTON_LOCATOR = By.cssSelector(".js-show-save-popup");
    public static final By OPEN_TO_DISK_BUTTON_LOCATOR = By.xpath("//a[@href=\"https://disk.yandex.ru\"]");


    public Button clickWriteButton() {
        return new Button(WRITE_BUTTON_LOCATOR);
    }
    public CheckBox findCheckBox() {
        return new CheckBox(CHECK_BOX_LOCATOR);
    }
    public Button getPanelWithDiskButton() {
        return new Button(PANEL_WITH_DISK_BUTTON_LOCATOR);
    }
    public Button getDiskButtonToMove() {
        return new Button(MOVE_TO_DISK_BUTTON_LOCATOR);
    }
    public Button getDiskButton() {
        return new Button(OPEN_TO_DISK_BUTTON_LOCATOR);
    }


}
