package com.stormnet.tests.yandex_tests;

import com.stormnet.tests.AbstractTest;
import com.stormnet.yandex.actions.CreatorMessageFormActions;
import com.stormnet.yandex.page_wrappers.CommonSignPage;
import com.stormnet.yandex.page_wrappers.DiskPage;
import com.stormnet.yandex.page_wrappers.PersonalMailPage;
import com.stormnet.yandex.actions.LoginPageActions;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class LoginTest extends AbstractTest {
    @Test(testName = "Login with right credentials")
    @Story("JIRA-1")
    public void loginTestRightCredentials() {

        driver.get("https://mail.yandex.ru/");

        CommonSignPage commonSignPage = new CommonSignPage(driver);
        commonSignPage.getSignInButtonOpenForm().click();


        LoginPageActions loginPageActions = new LoginPageActions(driver);
        loginPageActions.fillUserName("skalRita14")
                .submitForm()
                .waitUntilOpenedPasswordFiled()
                .fillPassword("skalrita")
                .submitForm();

        PersonalMailPage personalMailPage = new PersonalMailPage(driver);
        personalMailPage.waitUntilOpened()
                .writerButton();

        CreatorMessageFormActions creatorMessageFormActions = new CreatorMessageFormActions(driver);
        creatorMessageFormActions.waitUntilFindElementField()
                .clickToField()
                .waitUntilFindElementChooseMailer()
                .chooseMailer()
                .waitUntilFindElementThemeField()
                .fillThemeField("dfdfd")
                .uploadFile()
                .waitUntilFindSendButton()
                .sendMessage()
                .waitUntilFindReturnButton()
                .clickReturnButton();
        driver.navigate().refresh();

        creatorMessageFormActions.waitUntilFindFirstMessage()
                .chooseFirstMessage()
                .waitUntilFindMoveToDisk()
                .openPanelWithDiskButton()
                .moveFileToDisk()
                .waitUntilOpenDisk()
                .openDiskPage();

        DiskPage diskPage = new DiskPage(driver);
        diskPage.waitUntilOpenDownloadPage()
                .openDownload();

    }
}
