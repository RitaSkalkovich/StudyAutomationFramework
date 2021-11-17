package com.stormnet.yandex.page_wrappers;

import com.stormnet.yandex.driver.UiDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class FilesPage {

    private static final By ALL_FILES_LIST_LOCATOR = By.cssSelector(".listing-item__fields");
    private static final By BASKET_BUTTON_LOCATOR = By.xpath("//a[@href=\"/client/trash\"]");
    private static final By FILE_BUTTON_LOCATOR = By.xpath("//a[@href=\"/client/disk\"]");

    @Step("Open file page")
    public static void openFilePage() {
        FilesPage.getFilePage();
    }

    @Step("Shift file to trash")
    public static void shiftFIleToTrash() {
        FilesPage.getLastFile().click();
        FilesPage.dragAndDropTest();
    }

    public static WebElement getLastFile() {
        List<WebElement> myElements = new WebDriverWait(UiDriver.getDriver(), Duration.ofSeconds(4)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ALL_FILES_LIST_LOCATOR));
        WebElement last = myElements.get(2);
        return last;
    }

    public static WebElement getBasket() {
        WebElement elementBasket = UiDriver.getDriver().findElement(BASKET_BUTTON_LOCATOR);
        return elementBasket;

    }
//
//    public static void dragAndDropNew(WebElement elementBasket, WebElement last) {
//        Actions builder = new Actions(UiDriver.getDriver());
//        Action dragAndDrop = builder.clickAndHold(last)
//                .moveToElement(elementBasket)
//                .release(elementBasket)
//                .build();
//        dragAndDrop.perform();
//
//    }

    public static void getFilePage() {
        WebDriverWait wait = new WebDriverWait(UiDriver.getDriver(), Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(FILE_BUTTON_LOCATOR)).click();
    }

    public static void dragAndDropTest() {
        Actions actions = new Actions(UiDriver.getDriver());
        actions.dragAndDrop(getLastFile(), getBasket()).perform();
    }

}

