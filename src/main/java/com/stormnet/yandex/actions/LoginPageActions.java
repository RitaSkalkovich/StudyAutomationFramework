package com.stormnet.yandex.actions;

import com.stormnet.yandex.waiter.Waiter;
import com.stormnet.yandex.loginPage.LoginPage;
import io.qameta.allure.Step;
public class LoginPageActions {


    @Step("Login with creds")
    public static void loginWithCreds(String userName, String password) {
        LoginPageActions.fillUserName(userName);
        LoginPageActions.submitForm();
        Waiter.waitUntilOpenedPasswordFiled();
        LoginPageActions.fillPassword(password);
        LoginPageActions.submitForm();
    }

    public static void fillUserName(String userName) {
        new LoginPage().getUserNameField().sendKeys(userName);
    }

    public static void fillPassword(String password) {
        new LoginPage().getPasswordsField().sendKeys(password);
    }

    public static void submitForm() {
        new LoginPage().getSignInButton().click();
    }

}
