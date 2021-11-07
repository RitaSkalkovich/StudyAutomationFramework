package com.stormnet.yandex.actions;

import com.stormnet.yandex.loginPage.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPageActions {
    WebDriver driver;
    private static final By PASSWORD_FIELD_LOCATOR = By.xpath("//input[@data-t=\"field:input-passwd\"]");

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

    public LoginPageActions submitForm() {
        new LoginPage(driver).getSignInButton().click();
        return this;
    }
    public LoginPageActions waitUntilOpenedPasswordFiled() {
        WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(3));
        waits.withMessage("Password form was opened")
                .until(ExpectedConditions.visibilityOfElementLocated(PASSWORD_FIELD_LOCATOR));
        return this;

    }




}
