package com.stormnet.yandex.page_wrappers;

import com.stormnet.yandex.elements.Button;
import com.stormnet.yandex.waiter.Waiter;
import com.stormnet.yandex.driver.UiDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class DownloadPage {

    private static final By ALL_FILES_LIST_LOCATOR = By.cssSelector(".listing-item__icon-wrapper");
    private static final By MOVE_BUTTON_LOCATOR = By.xpath("(//span[@class='Menu-Text'])[6]");
    private static final By SUBMIT_BUTTON_LOCATOR = By.xpath("(//button[contains(@class,'confirmation-dialog__button_submit')])[1]");
    private static final By LOADING_ELEMENT_LOCATOR = By.cssSelector(".operations-progress__text");


    @Step("Choose last uploaded file")
    public static void chooseLastUploadedFile() {
        DownloadPage.rightClick(DownloadPage.getLastUploadedFile());
    }

    @Step("Move attachment to file page")
    public static void moveAttachmentToFilePage() {
        DownloadPage.clickMoveButton();
        DownloadPage.sendToFile();
        Waiter.waitUntilInvisibleElement(new DownloadPage().getLoadingButton(), "download page was opened", Waiter.TIMEOUT.THREE_SEC);
    }


    public static WebElement getMoveButtonToFiles() {
        return UiDriver.getDriver().findElement(MOVE_BUTTON_LOCATOR);
    }
    public Button getLoadingButton() {
        return new Button(LOADING_ELEMENT_LOCATOR);
    }

    public static void clickMoveButton() {
        getMoveButtonToFiles().click();
    }

    public static WebElement getLastUploadedFile() {
        List<WebElement> allFiles = new WebDriverWait(UiDriver.getDriver(), Duration.ofSeconds(4)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ALL_FILES_LIST_LOCATOR));
        WebElement lastFile = allFiles.get(0);
        return lastFile;
    }

    public static void rightClick(WebElement element) {
        try {
            Actions action = new Actions(UiDriver.getDriver()).contextClick(element);
            action.build().perform();

            System.out.println("Successfully Right clicked on the element");
        } catch (StaleElementReferenceException e) {
            System.out.println("Element is not attached to the page document "
                    + e.getStackTrace());
        } catch (NoSuchElementException e) {
            System.out.println("Element " + element + " was not found in DOM "
                    + e.getStackTrace());
        } catch (Exception e) {
            System.out.println("Element " + element + " was not clickable "
                    + e.getStackTrace());
        }
    }

    public static void sendToFile() {
        WebDriverWait wait = new WebDriverWait(UiDriver.getDriver(), Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(SUBMIT_BUTTON_LOCATOR)).click();
    }


}
