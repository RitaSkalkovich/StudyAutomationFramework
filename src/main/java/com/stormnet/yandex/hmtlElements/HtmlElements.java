package com.stormnet.yandex.hmtlElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HtmlElements {
    protected WebElement element;
    protected By locator;
    protected WebDriver driver;

    public HtmlElements(WebDriver driver, By locator) {
        this.locator = locator;
        this.driver = driver;
    }

    protected WebElement getElement() {
        return driver.findElement(locator);
    }
}
