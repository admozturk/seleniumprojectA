package com.cydeo.utilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BrowserUtils {

    /*
     This method will accept int (in seconds) and execute Thread.sleep
     for given duration
      */
    public static void sleep (int seconds){
       seconds*=1000;
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {

        }
    }



    /*
    This method accepts 3 arguments.
    Arg1: webdriver
    Arg2: expectedInUrl : for verify if the url contains given String.
        - If condition matches, will break loop.
    Arg3: expectedInTitle to be compared against actualTitle
     */
    public static void switchWindowAndVerify(WebDriver driver, String expectedUrl, String expectedTitle){
        Set<String> allowAllWindows = driver.getWindowHandles();
        for (String eachWebPages : allowAllWindows) {
            driver.switchTo().window(eachWebPages);

            System.out.println("Current Url: " + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains(expectedUrl)) {
                break;
            }
        }
        // 5. Assert: Title contains “expected title”
        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));


    }



    /*
   This method accepts a String "expectedTitle" and Asserts if it is true
    */
    public static void verifyTitle(WebDriver driver, String expectedTitle){
        Assert.assertEquals(driver.getTitle(),expectedTitle);
    }
    //creating a utility method for explicitWait,so we don't have to repeat lines again
    public static void wairForInvisibilityOf(WebElement webElement){
        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }





}
