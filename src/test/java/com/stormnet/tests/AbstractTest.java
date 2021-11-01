package com.stormnet.tests;

import com.stormnet.listeners.CustomTestNgListener;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import io.qameta.allure.testng.AllureTestNg;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import java.io.ByteArrayInputStream;


@Listeners({AllureTestNg.class, CustomTestNgListener.class})
public class AbstractTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        this.driver = driver;
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (!result.isSuccess()) {
            Allure.addAttachment("attachment.png", new ByteArrayInputStream(takeScreenshotAs()));
        }
        driver.close();
    }

    public byte[] takeScreenshotAs() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
