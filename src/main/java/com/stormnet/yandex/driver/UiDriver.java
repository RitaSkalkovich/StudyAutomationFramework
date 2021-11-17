package com.stormnet.yandex.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UiDriver {

    private final WebDriver driver;
    private static final ThreadLocal<UiDriver> instance = new ThreadLocal<>();


    private UiDriver() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
    }

    public static WebDriver getDriver() {
        if (instance.get() == null) {
            instance.set(new UiDriver());
        }
        return instance.get().driver;
    }

    public static void closeDriver() {
        getDriver().quit();
        instance.set(null);
    }
}
