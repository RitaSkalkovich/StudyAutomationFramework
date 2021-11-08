package com.stormnet.yandex.page_wrappers;

import com.stormnet.yandex.hmtlElements.Button;
import com.stormnet.yandex.hmtlElements.CheckBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PersonalMailPage {
    protected CommonSignPage commonSignPage;
    private WebDriver driver;
    private static final By WRITE_BUTTON_LOCATOR = By.xpath("//a[@href=\"#compose\"]");
    private static final By CHECK_BOX_LOCATOR = By.cssSelector(".nb-checkbox");
    private static final By PANEL_WITH_DISK_BUTTON_LOCATOR = By.cssSelector(".mail-File_type_doc");
    private static final By MOVE_TO_DISK_BUTTON_LOCATOR = By.cssSelector(".js-show-save-popup");
    private static final By OPEN_TO_DISK_BUTTON_LOCATOR = By.xpath("//a[@href=\"https://disk.yandex.ru\"]");


    public PersonalMailPage(WebDriver driver) {
        this.driver = driver;
    }


    public Button clickWriteButton() {
        return new Button(driver, WRITE_BUTTON_LOCATOR);
    }
    public CheckBox findCheckBox() {
        return new CheckBox(driver, CHECK_BOX_LOCATOR);
    }
    public Button getPanelWithDiskButton() {
        return new Button(driver, PANEL_WITH_DISK_BUTTON_LOCATOR);
    }
    public Button getDiskButtonToMove() {
        return new Button(driver, MOVE_TO_DISK_BUTTON_LOCATOR);
    }
    public Button getDiskButton() {
        return new Button(driver, OPEN_TO_DISK_BUTTON_LOCATOR);
    }


}
