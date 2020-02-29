package com.Day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class TestNGAnnotations {

    WebDriver driver;

        @Test(priority = 1, enabled = true)
        public void test(){
            System.out.println("this is test 1");
        }

        @Test(priority = 0)
        public void test2(){
            System.out.println("this is test 2");
        }

        @BeforeTest
        public void beforetest(){
            System.out.println("this is before test");
        }

        @AfterTest
        public void aftertest(){
            System.out.println("this is after test");
        }

        @BeforeClass
        public void beforeclass(){
            System.out.println("this is before class");
        }

        @AfterClass
        public void afterClass(){
            System.out.println("this is after class");
        }

        @BeforeSuite
        public void login(){
            System.out.println("this is before suite");

            System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/chromedriver");

            driver = new ChromeDriver();
            driver.get("http://10.147.3.55:3000/login");
            driver.manage().window().maximize();

            new WebDriverWait(driver,10 )
                    .until(ExpectedConditions.visibilityOfElementLocated(By.name("username")))
                    .sendKeys("k@gmail.com");

            new WebDriverWait(driver,10 )
                    .until(ExpectedConditions.visibilityOfElementLocated(By.id("password")))
                    .sendKeys("kshitiz");

            WebElement login = driver.
                    findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div/div/form/button"));
            login.click();


        }

        @AfterSuite
        public void afterSuite(){
            System.out.println("this is after suite");
        }

        @BeforeMethod
        public void beforemethod(){
            System.out.println("this is before method");
        }

        @AfterMethod
        public void aftermethod(){
            System.out.println("this is after method");
        }

        @BeforeGroups
        public void beforegrp(){
            System.out.println("this is before group");
        }

        @AfterGroups
        public void aftergrp(){
            System.out.println("this is after group");
        }


    }
