package com.Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAndCloseBrowser {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","/Users/apple/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com");

    System.out.println(driver.getTitle());
    System.out.println(driver.getCurrentUrl());
    System.out.println(driver.getPageSource().length());
    driver.quit();
    }

}
