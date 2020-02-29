package com.Day2;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GenerateVideoRecording {

    @Test
    public void test() throws ATUTestRecorderException {
        System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/chromedriver");
        ATUTestRecorder rec = new ATUTestRecorder("/Users/apple/Desktop/Kshitiz Testing","TestRec",false);
        rec.start();
        WebDriver driver = new ChromeDriver();
        driver.get("http://10.147.3.55:3000/login");
        driver.manage().window().maximize();
        driver.quit();
        rec.stop();

    }
}
