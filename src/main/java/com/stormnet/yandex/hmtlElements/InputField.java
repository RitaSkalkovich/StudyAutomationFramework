package com.stormnet.yandex.hmtlElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputField extends HtmlElements {


    public InputField(WebDriver driver, By locator) {
        super(driver, locator);
    }


    public void sendKeys(String text) {
        getElement().sendKeys(text);
    }

    public void click() {
        getElement().click();
    }


}
