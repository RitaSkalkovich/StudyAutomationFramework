package com.stormnet.tests;
import com.stormnet.listeners.CustomTestNgListener;
import com.stormnet.yandex.driver.UiDriver;

import io.qameta.allure.Allure;
import io.qameta.allure.testng.AllureTestNg;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.testng.ITestResult;
import org.testng.annotations.*;
import java.io.ByteArrayInputStream;


@Listeners({AllureTestNg.class, CustomTestNgListener.class})
public class AbstractTest {


    @BeforeMethod
    public void setup() {
        UiDriver.getDriver();
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (!result.isSuccess()) {
            Allure.addAttachment("attachment.png", new ByteArrayInputStream(takeScreenshotAs()));
        }
        UiDriver.closeDriver();
    }

    public byte[] takeScreenshotAs() {
        return ((TakesScreenshot) UiDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
