package com.stormnet.yandex.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputField extends HtmlElements {


    public InputField(By locator) {
        super(locator);
    }


    public void sendKeys(String text) {
        getElement().sendKeys(text);
    }

    public void click() {
        getElement().click();
    }


}
