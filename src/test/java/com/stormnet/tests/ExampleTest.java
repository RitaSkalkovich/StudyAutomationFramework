package com.stormnet.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ExampleTest extends AbstractTest {
    @Test(testName = "First test")
    public void testSum() {

        driver.get("https://www.google.com/");
        WebElement acceptCookie = driver.findElement(By.xpath("//button[@id='L2AGLb']"));
        acceptCookie.click();


        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("Banana");
        searchField.sendKeys(Keys.ENTER);


        List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='yuRUbf']/a"));
        WebElement thirdLink = allLinks.get(2);
        thirdLink.click();

//        driver.get("https://google.by");
//
//        String windowTitle = driver.getTitle();
//        Assert.assertEquals(windowTitle, "Google", "Unexpected window title");
    }
}
