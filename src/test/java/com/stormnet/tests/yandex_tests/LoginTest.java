package com.stormnet.tests.yandex_tests;
import com.stormnet.tests.AbstractTest;
import com.stormnet.yandex.CommonSignPage;
import com.stormnet.yandex.PersonalMailPage;
import com.stormnet.yandex.loginPage.LoginPage;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

public class LoginTest extends AbstractTest {
    @Test(testName = "Login with right credentials")
    @Story("JIRA-1")
    public void loginTestRightCredentials() {
        driver.get("https://mail.yandex.ru/");

        CommonSignPage commonSignPage = new CommonSignPage(driver);
        commonSignPage.getSignInButtonOpenForm().click();

        LoginPage loginPage = new LoginPage(driver);
        PersonalMailPage personalMailPage = loginPage.fillUserName("RitaSkal")
                .submitForm();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-t=\"field:input-passwd\"]")));

        loginPage.fillPassword("ritaskal14")
                .submitForm();
        personalMailPage.waitUntilOpened();
        personalMailPage.writerButton();

    }
}
