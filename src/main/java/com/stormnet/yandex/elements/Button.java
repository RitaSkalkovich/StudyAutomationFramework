package com.stormnet.yandex.elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Button extends HtmlElements{
    public Button(By locator) {
        super(locator);
    }

    public void click(){
        getElement().click();
    }

}
