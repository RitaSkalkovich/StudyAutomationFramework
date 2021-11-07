package com.stormnet.yandex.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalPageActions {
    WebDriver driver;
    private static final By WRITE_BUTTON_LOCATOR = By.xpath("//a[@href=\"#compose\"]");
    private static final By MOVE_TO_DISK_BUTTON_LOCATOR = By.cssSelector(".mail-File_icon");
    private static final By DISK_BUTTON_LOCATOR = By.xpath("//a[@role=\"button\"]");

    public PersonalPageActions(WebDriver driver) {
        this.driver = driver;
    }



}
