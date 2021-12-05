package com.stormnet.yandex.waiter;

import com.stormnet.yandex.driver.UiDriver;
import com.stormnet.yandex.elements.HtmlElements;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waiter {
    public static final int DEFAULT_WAIT_TIME = 5;

    public enum TIMEOUT {
        SEVEN_SEC(7),
        SIX_SEC(6),
        FIVE_SEC(5),
        FOUR_SEC(4),
        THREE_SEC(3);

        int seconds;

        TIMEOUT(int seconds) {
            this.seconds = seconds;
        }

        public int getSeconds() {
            return seconds;
        }
    }

    public static WebDriverWait getWait() {
        return new WebDriverWait(UiDriver.getDriver(), Duration.ofSeconds(DEFAULT_WAIT_TIME));
    }

    public static WebDriverWait getWaits(TIMEOUT timeInSeconds) {
        return new WebDriverWait(UiDriver.getDriver(), Duration.ofSeconds(timeInSeconds.seconds));
    }

    public static void waitUntilVisible(HtmlElements elements, String message, TIMEOUT timeInSeconds) {
        WebDriverWait waits = new WebDriverWait(UiDriver.getDriver(), Duration.ofSeconds(timeInSeconds.seconds));
        waits.withMessage(message)
                .until(ExpectedConditions.visibilityOfElementLocated(elements.getLocator()));
    }

    public static void waitUntilLoadFile() {
        WebDriverWait wait = new WebDriverWait(UiDriver.getDriver(), Duration.ofSeconds(DEFAULT_WAIT_TIME));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.tagName("Загружено 0 из")));
//        UiDriver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(DEFAULT_WAIT_TIME))
    }

    public static void waitUntilInvisibleElement(HtmlElements elements, String message, TIMEOUT timeInSeconds) {
        WebDriverWait waits = new WebDriverWait(UiDriver.getDriver(), Duration.ofSeconds(timeInSeconds.seconds));
        waits.withMessage(message)
                .until(ExpectedConditions.invisibilityOfElementLocated(elements.getLocator()));
    }


}



