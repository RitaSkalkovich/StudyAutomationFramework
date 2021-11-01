package com.stormnet.yandex.page_wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonSignPage {
    private static final By SIGN_IN_BUTTON_OPEN_FORM = By.xpath("//div[@class=\"HeadBanner-ButtonsWrapper\"]/a[2]");
    public final WebDriver driver;

    public CommonSignPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSignInButtonOpenForm() {
        return driver.findElement(SIGN_IN_BUTTON_OPEN_FORM);
    }
}
