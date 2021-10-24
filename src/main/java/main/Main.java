package main;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;


public class Main {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        WebElement acceptCookie = driver.findElement(By.xpath("//button[@id='L2AGLb']"));
        acceptCookie.click();


        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("Banana");
        searchField.sendKeys(Keys.ENTER);

//        WebElement newE = driver.findElement(By.xpath("//a[@href][3]"));
//        newE.click();
        List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='yuRUbf']/a"));
        WebElement thirdLink = allLinks.get(2);
        thirdLink.click();


        driver.close();

    }
}
