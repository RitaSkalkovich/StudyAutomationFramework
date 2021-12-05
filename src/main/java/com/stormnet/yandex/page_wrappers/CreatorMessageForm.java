package com.stormnet.yandex.page_wrappers;

import com.stormnet.yandex.elements.Button;
import com.stormnet.yandex.elements.HtmlElements;
import com.stormnet.yandex.elements.InputField;
import org.openqa.selenium.By;


public class CreatorMessageForm {
    private static final By ATTACH_BUTTON_LOCATOR = By.xpath("//input[@type='file']");
    private static final By TO_FIELD_LOCATOR = By.cssSelector(".ComposeRecipients-TopRow .composeYabbles");
    private static final By CHOOSE_MAILER_FIELD_LOCATOR = By.cssSelector(".ContactsSuggestItemDesktop");
    private static final By THEME_FIELD_LOCATOR = By.xpath("//input[@name=\"subject\"]");
    private static final By SEND_BUTTON_LOCATOR = By.cssSelector(".Button2_view_default");
    private static final By RETURN_TO_ALL_MESSAGE_BUTTON_LOCATOR = By.xpath("//div[@class=\"ComposeDoneScreen-Actions\"]/a");


    public InputField getToField() {
        return new InputField(TO_FIELD_LOCATOR);
    }

    public InputField getChooseField() {
        return new InputField(CHOOSE_MAILER_FIELD_LOCATOR);
    }

    public InputField getThemeField() {
        return new InputField(THEME_FIELD_LOCATOR);
    }

    public HtmlElements findAttachButton() {
        return new HtmlElements(ATTACH_BUTTON_LOCATOR);
    }

    public Button getSendButton() {
        return new Button(SEND_BUTTON_LOCATOR);
    }

    public Button getReturnButton() {
        return new Button(RETURN_TO_ALL_MESSAGE_BUTTON_LOCATOR);
    }





}
