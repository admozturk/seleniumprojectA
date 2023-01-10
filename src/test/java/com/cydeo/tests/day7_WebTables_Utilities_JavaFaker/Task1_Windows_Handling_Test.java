package com.cydeo.tests.day7_WebTables_Utilities_JavaFaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task1_Windows_Handling_Test {

    public WebDriver driver;

    @BeforeMethod
    public void Setupmethod() {
        // TC #1: Window Handle practice
        // 1. Create new test and make set ups
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Test
    public void windows_Handling_Task() {

        // 2. Go to : https://www.amazon.com
        driver.get("https://www.amazon.com");

        // 3. Copy paste the lines from below into your class

        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");


        // 4. Create a logic to switch to the tab where Etsy.com is open
        BrowserUtils.switchWindowAndVerify(driver,"etsy","Etsy");





    }
}
