package com.stormnet.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.testng.AllureTestNg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners({AllureTestNg.class})
public class AbstractTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        this.driver = driver;
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
