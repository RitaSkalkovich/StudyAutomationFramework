package com.stormnet.yandex.page_wrappers;

import com.stormnet.yandex.hmtlElements.InputField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreatorMessageForm {
    private static final By TO_FIELD_LOCATOR = By.cssSelector(".ComposeRecipients-TopRow .composeYabbles");
    private static final By CHOOSE_MAILER_FIELD_LOCATOR = By.cssSelector(".ContactsSuggestItemDesktop");
    private static final By THEME_FIELD_LOCATOR = By.xpath("//input[@name=\"subject\"]");
    public final WebDriver driver;

    public CreatorMessageForm(WebDriver driver) {
        this.driver = driver;
    }

    public InputField getToField() {
        return new InputField(driver, TO_FIELD_LOCATOR);
    }

    public InputField getChooseField() {
        return new InputField(driver, CHOOSE_MAILER_FIELD_LOCATOR);
    }

    public InputField getThemeField() {
        return new InputField(driver, THEME_FIELD_LOCATOR);
    }


//.ContactsSuggestItemDesktop себе
//    //input[@name="subject"] тема
//    .WithUpload-FileInput атач
//    .ComposeRecipients-TopRow .composeYabbles
}
