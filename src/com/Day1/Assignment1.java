package com.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment1 {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://10.147.3.55:3000/login");
        driver.manage().window().maximize();

        //a[@id="LoginLink"]

        new WebDriverWait(driver,10 )
                .until(ExpectedConditions.visibilityOfElementLocated(By.name("username")))
                .sendKeys("k@gmail.com");

        new WebDriverWait(driver,10 )
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("password")))
                .sendKeys("kshitiz");

        WebElement login = driver.
                findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div/div/form/button"));
        login.click();

        new WebDriverWait(driver,10 )
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/createIncident']"))).click();



      //  WebElement createInc = driver.
        //        findElement(By.xpath("//a[@href='/createIncident']"));
       // createInc.click();

    }
}
