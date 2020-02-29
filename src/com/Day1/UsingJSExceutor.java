package com.Day1;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class UsingJSExceutor {

    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://10.147.3.55:3000/login");
        driver.manage().window().maximize();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //explicit wait
        new WebDriverWait(driver,10 )
                .until(ExpectedConditions.visibilityOfElementLocated(By.name("username")))
                .sendKeys("k@gmail.com");

        //Fluent
    //    Wait<WebDriver> wait = new FluentWait<driver>()

        WebElement field = driver.findElement(By.name("username"));
        field.sendKeys("k@gmail.com");
        ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style','background:red');",field);
       // ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.height)");
      //  File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        //FileUtils.copyFile(ss,new File("/Users/apple/Desktop/ss.png"));
    }
}