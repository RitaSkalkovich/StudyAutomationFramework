package com.stormnet.tests.yandex_tests;
import com.stormnet.tests.AbstractTest;
import com.stormnet.yandex.actions.CreatorMessageFormActions;
import com.stormnet.yandex.page_wrappers.CommonSignPage;
import com.stormnet.yandex.page_wrappers.PersonalMailPage;
import com.stormnet.yandex.actions.LoginPageActions;
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

        LoginPageActions loginPageActions = new LoginPageActions(driver);
        PersonalMailPage personalMailPage = loginPageActions.fillUserName("skalRitaNew")
                .submitForm();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-t=\"field:input-passwd\"]")));

        loginPageActions.fillPassword("skalRita")
                .submitForm();
        personalMailPage.waitUntilOpened();
        personalMailPage.writerButton();

        CreatorMessageFormActions creatorMessageFormActions = new CreatorMessageFormActions(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ComposeRecipients-TopRow .composeYabbles")));
        creatorMessageFormActions.clickToField();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ContactsSuggestItemDesktop")));
        creatorMessageFormActions.chooseMailer();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"subject\"]")));
        creatorMessageFormActions.fillThemeField("dfdfd");
        creatorMessageFormActions.clickAttachButton();



    }
}
