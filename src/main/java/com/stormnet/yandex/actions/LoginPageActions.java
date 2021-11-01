package com.stormnet.yandex.actions;

import com.stormnet.yandex.page_wrappers.PersonalMailPage;
import com.stormnet.yandex.loginPage.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginPageActions {
    WebDriver driver;

    public LoginPageActions(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPageActions fillUserName(String userName) {
        new LoginPage(driver).getUserNameField().sendKeys(userName);
        return this;
    }

    public LoginPageActions fillPassword(String password) {
        new LoginPage(driver).getPasswordsField().sendKeys(password);
        return this;
    }

    public PersonalMailPage submitForm() {
        new LoginPage(driver).getSignInButton().click();
        return new PersonalMailPage(driver);
    }
}
