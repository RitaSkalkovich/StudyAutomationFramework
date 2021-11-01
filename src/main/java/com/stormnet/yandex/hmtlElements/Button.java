package com.stormnet.yandex.hmtlElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Button extends HtmlElements{
    public Button(WebDriver driver, By locator) {
        super(driver, locator);
    }

    public void click(){
        getElement().click();
    }
}
