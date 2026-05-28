package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class MyFirstTestCase {
    @Test
    public void dummyTest() throws Exception{

        ChromeOptions options = new ChromeOptions();
       // jj options.addArguments("--incognito");
        //options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(1000);
        WebElement searchButton = driver.findElement(By.cssSelector("div[class*='FPdoLc'] input[class='gNO89b']"));

        Assert.assertTrue(searchButton.isDisplayed());

        driver.quit();
    }
}
