package com.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://10.147.3.55:3000/login");

        driver.manage().window().maximize();

        WebElement serachField = driver.findElement(By.name("username"));
        serachField.sendKeys("k@gmail.com");
        System.out.println(serachField.getSize());


        WebElement serachFie = driver.findElement(By.id("password"));
        serachFie.sendKeys("kshitiz");

        WebElement serachfi = driver.
                findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div/div/form/button"));
        serachfi.click();
        driver.quit();
    }

}
