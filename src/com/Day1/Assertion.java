package com.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {

    @Test
    public void myTest(){
        System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://10.147.3.55:3000/login");
        driver.manage().window().maximize();
        WebElement w = driver.findElement(By.name("username"));
        Assert.assertEquals(true, w.isEnabled());
    }
}
