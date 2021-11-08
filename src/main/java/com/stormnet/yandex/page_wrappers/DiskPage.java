package com.stormnet.yandex.page_wrappers;

import com.stormnet.yandex.hmtlElements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DiskPage {
    protected DiskPage diskPage;
    private WebDriver driver;
    private static final By DOWNLOAD_BUTTON_LOCATOR = By.cssSelector(".navigation__link_downloads");

    public DiskPage(WebDriver driver) {
        this.driver = driver;
    }

    public Button clickDownloadButton() {
        return new Button(driver, DOWNLOAD_BUTTON_LOCATOR);
    }

    public DiskPage openDownload() {
        clickDownloadButton().click();
        return new DiskPage(driver);
    }

    public DiskPage waitUntilOpenDownloadPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.withMessage("Download page was found")
                .until(ExpectedConditions.visibilityOfElementLocated(DOWNLOAD_BUTTON_LOCATOR));
        return this;
    }

}
