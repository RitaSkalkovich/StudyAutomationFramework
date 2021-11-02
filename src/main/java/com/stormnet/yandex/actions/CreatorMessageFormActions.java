package com.stormnet.yandex.actions;

import com.stormnet.yandex.page_wrappers.CreatorMessageForm;
import org.openqa.selenium.WebDriver;

public class CreatorMessageFormActions {

    WebDriver driver;

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

    public CreatorMessageFormActions clickAttachButton() {
        new CreatorMessageForm(driver).getAttachButton().click();
        return this;
    }

}
