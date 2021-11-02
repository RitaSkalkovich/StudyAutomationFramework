package com.stormnet.yandex.actions;

import com.stormnet.yandex.page_wrappers.CreatorMessage;
import org.openqa.selenium.WebDriver;

public class CreatorMessageFormActions {

    WebDriver driver;

    public CreatorMessageFormActions(WebDriver driver) {
        this.driver = driver;
    }

    public CreatorMessageFormActions clickToField() {
        new CreatorMessage(driver).getToField().click();
        return this;
    }

    public CreatorMessageFormActions chooseMailer() {
        new CreatorMessage(driver).getChooseField().click();
        return this;
    }

    public CreatorMessageFormActions fillThemeField(String theme) {
        new CreatorMessage(driver).getThemeField().sendKeys(theme);
        return this;
    }

}
