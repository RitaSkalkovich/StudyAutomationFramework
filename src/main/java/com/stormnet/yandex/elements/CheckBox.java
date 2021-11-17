package com.stormnet.yandex.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBox extends HtmlElements{
    public CheckBox(By locator) {
        super(locator);
    }
    public void clickCheckBox(){
        getElement().click();
    }
}
