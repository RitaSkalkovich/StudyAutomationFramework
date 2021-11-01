package com.stormnet.yandex.loginPage;

import com.stormnet.yandex.PersonalMailPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {

    private static final By USERNAME_FIELD_LOCATOR = By.id("passp-field-login");
    private static final By SIGN_IN_BUTTON_LOCATOR = By.id("passp:sign-in");
    private static final By PASSWORD_FIELD_LOCATOR = By.xpath("//input[@data-t=\"field:input-passwd\"]");

    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUserNameField() {
        return driver.findElement(USERNAME_FIELD_LOCATOR);
    }

    public WebElement getPasswordsField() {
        return driver.findElement(PASSWORD_FIELD_LOCATOR);
    }

    public WebElement getSignInButton() {
        return driver.findElement(SIGN_IN_BUTTON_LOCATOR);
    }

    public LoginPage fillUserName(String userName) {
        getUserNameField().sendKeys(userName);
        return this;
    }

    public LoginPage fillPassword(String password) {
        getPasswordsField().sendKeys(password);
        return this;
    }

    public PersonalMailPage submitForm() {
        getSignInButton().click();
        return new PersonalMailPage(driver);
    }

}
