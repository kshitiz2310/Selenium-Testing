package com.Day1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class JavascriptAndAngulerWaits {

    @Test
    public  void test(){
        System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://10.147.3.55:3000/login");
        driver.manage().window().maximize();
        new WebDriverWait(driver, 5).until(webDriver -> ((JavascriptExecutor)webDriver))
                .executeScript("return document.readyState").equals("complete");


    }
    public void waitForAngularToLoad(){
        String angularScript =  "var injector = window.angular.element('body').injector();" +
                "var $http = injector.get('$http');" +
                "return ($http.pendingRequests.length === 0)";

        ExpectedCondition<Boolean> angularLoading = new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver webDriver) {
                return ((JavascriptExecutor)webDriver).executeScript(angularScript).equals(true);
            }
        };}

}
