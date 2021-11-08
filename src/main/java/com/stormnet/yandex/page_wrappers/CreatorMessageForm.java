package com.stormnet.yandex.page_wrappers;

import com.stormnet.yandex.hmtlElements.Button;
import com.stormnet.yandex.hmtlElements.HtmlElements;
import com.stormnet.yandex.hmtlElements.InputField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CreatorMessageForm {
    private static final By TO_FIELD_LOCATOR = By.cssSelector(".ComposeRecipients-TopRow .composeYabbles");
    private static final By CHOOSE_MAILER_FIELD_LOCATOR = By.cssSelector(".ContactsSuggestItemDesktop");
    private static final By THEME_FIELD_LOCATOR = By.xpath("//input[@name=\"subject\"]");
    private static final By ATTACH_BUTTON_LOCATOR = By.xpath("//input[@type='file']");
    private static final By SEND_BUTTON_LOCATOR = By.cssSelector(".Button2_view_default");
    private static final By RETURN_TO_ALL_MESSAGE_BUTTON_LOCATOR = By.xpath("//div[@class=\"ComposeDoneScreen-Actions\"]/a");


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

    public HtmlElements findAttachButton() {
        return new HtmlElements(driver, ATTACH_BUTTON_LOCATOR);
    }

    public Button getSendButton() {
        return new Button(driver, SEND_BUTTON_LOCATOR);
    }

    public Button getReturnButton() {
        return new Button(driver, RETURN_TO_ALL_MESSAGE_BUTTON_LOCATOR);
    }





}
