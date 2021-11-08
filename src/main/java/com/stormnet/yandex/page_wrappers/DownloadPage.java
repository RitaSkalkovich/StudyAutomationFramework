package com.stormnet.yandex.page_wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DownloadPage {
    private WebDriver driver;
    private static final By MOVE_BUTTON_LOCATOR = By.xpath("//div[@data-key=\"item-5\"]");
    private static final By ALL_FILES_LIST_LOCATOR = By.cssSelector(".listing-item__icon_type_preview");


    public DownloadPage(WebDriver driver) {
        this.driver = driver;
    }
    List<WebElement> allFiles = driver.findElements(By.cssSelector(".listing-item__icon_type_preview"));
    WebElement lastFile = allFiles.get(0);


}
