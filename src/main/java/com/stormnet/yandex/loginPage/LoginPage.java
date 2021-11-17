package com.stormnet.yandex.loginPage;
import com.stormnet.yandex.elements.Button;
import com.stormnet.yandex.elements.InputField;
import org.openqa.selenium.By;



public class LoginPage {

    private static final By USERNAME_FIELD_LOCATOR = By.id("passp-field-login");
    private static final By SIGN_IN_BUTTON_LOCATOR = By.id("passp:sign-in");
    public static final By PASSWORD_FIELD_LOCATOR = By.xpath("//input[@data-t=\"field:input-passwd\"]");

    public InputField getUserNameField() {
        return new InputField(USERNAME_FIELD_LOCATOR);
    }

    public InputField getPasswordsField() {
       return new InputField(PASSWORD_FIELD_LOCATOR);
    }

    public Button getSignInButton() {
        return new Button(SIGN_IN_BUTTON_LOCATOR);
    }

}
