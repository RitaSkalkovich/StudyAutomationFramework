package com.stormnet.yandex.loginPage;
import com.stormnet.yandex.hmtlElements.Button;
import com.stormnet.yandex.hmtlElements.InputField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {

    private static final By USERNAME_FIELD_LOCATOR = By.id("passp-field-login");
    private static final By SIGN_IN_BUTTON_LOCATOR = By.id("passp:sign-in");
    private static final By PASSWORD_FIELD_LOCATOR = By.xpath("//input[@data-t=\"field:input-passwd\"]");

    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public InputField getUserNameField() {
        return new InputField(driver, USERNAME_FIELD_LOCATOR);
    }

    public InputField getPasswordsField() {
       return new InputField(driver, PASSWORD_FIELD_LOCATOR);
    }

    public Button getSignInButton() {
        return new Button(driver, SIGN_IN_BUTTON_LOCATOR);
    }

}
