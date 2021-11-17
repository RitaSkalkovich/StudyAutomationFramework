package com.stormnet.tests.yandex_tests;

import com.stormnet.tests.AbstractTest;
import com.stormnet.yandex.actions.CreatorMessageFormActions;
import com.stormnet.yandex.actions.PersonalPageActions;
import com.stormnet.yandex.driver.UiDriver;
import com.stormnet.yandex.page_wrappers.*;
import com.stormnet.yandex.actions.LoginPageActions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;


public class LoginTest extends AbstractTest {
    @BeforeMethod
    public void openPage() {
        UiDriver.getDriver().get("https://mail.yandex.ru/");
    }

    @Test(testName = "Login with right credentials")
    public void loginTestRightCredentials(){

        CommonSignPage.openLoginForm();

        LoginPageActions.loginWithCreds("skalRita14", "skalrita");

        PersonalPageActions.openMessageForm();

        CreatorMessageFormActions.writeNewLetterAndSend();

        UiDriver.getDriver().navigate().refresh();

        PersonalPageActions.moveFileToYandexDisk();

        DiskPage.openDownloadPage();

        DownloadPage.chooseLastUploadedFile();

        DownloadPage.moveAttachmentToFilePage();

        FilesPage.openFilePage();

        FilesPage.shiftFIleToTrash();



    }
}


