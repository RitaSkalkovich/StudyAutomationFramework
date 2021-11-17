package com.stormnet.yandex.page_wrappers;

import com.stormnet.yandex.driver.UiDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CommonSignPage {
    private static final By SIGN_IN_BUTTON_OPEN_FORM = By.xpath("//div[@class=\"HeadBanner-ButtonsWrapper\"]/a[2]");



    public static WebElement getSignInButtonOpenForm() {
        return UiDriver.getDriver().findElement(SIGN_IN_BUTTON_OPEN_FORM);
    }
    public static void openLoginForm(){
        getSignInButtonOpenForm().click();
    }
}
