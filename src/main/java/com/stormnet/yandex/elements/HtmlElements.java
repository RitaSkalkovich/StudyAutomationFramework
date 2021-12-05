package com.stormnet.yandex.elements;

import com.stormnet.yandex.driver.UiDriver;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class HtmlElements {
    protected By locator;

    public HtmlElements(By locator) {
        this.locator = locator;

    }

    public WebElement getElement() {
        return UiDriver.getDriver().findElement(locator);
    }

    public void sendKeys(CharSequence... keysToSend) {
        getElement().sendKeys(keysToSend);
    }

    public By getLocator() {
        return locator;
    }


}
