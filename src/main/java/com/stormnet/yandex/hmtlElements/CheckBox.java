package com.stormnet.yandex.hmtlElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBox extends HtmlElements{
    public CheckBox(WebDriver driver, By locator) {
        super(driver, locator);
    }
    public void clickCheckBox(){
        getElement().click();
    }
}
