package com.stormnet.yandex.page_wrappers;

import com.stormnet.yandex.waiter.Waiter;
import com.stormnet.yandex.elements.Button;
import io.qameta.allure.Step;
import org.openqa.selenium.*;

public class DiskPage {


    private static final By DOWNLOAD_BUTTON_LOCATOR = By.cssSelector(".navigation__link_downloads");


    @Step("Open download page")
    public static void openDownloadPage() {
        Waiter.waitUntilVisible(new DiskPage().downloadButton(),"Download page was found", Waiter.TIMEOUT.FIVE_SEC);
        DiskPage.openDownload();
    }


    public Button downloadButton() {
        return new Button(DOWNLOAD_BUTTON_LOCATOR);
    }

    public static void openDownload() {
        new DiskPage().downloadButton().click();
    }

}




