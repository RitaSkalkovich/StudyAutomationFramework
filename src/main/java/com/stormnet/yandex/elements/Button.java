package com.stormnet.yandex.elements;
import org.openqa.selenium.By;

public class Button extends HtmlElements{
    public Button(By locator) {
        super(locator);
    }

    public void click(){
        getElement().click();
    }

}
