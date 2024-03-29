package com.cydeo.tests.day6_Alerts_Iframes_Windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Task5_Windows_Handle_Practice {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //TC #5: Window Handle practice
        // 2. Create new test and make set ups
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 3. Go to : https://practice.cydeo.com/windows
        driver.get(" https://practice.cydeo.com/windows");
    }

    @Test
    public void multiple_windows_Test() {
        //Storing the main page's window handle as string is
        // good practice for future re-usable purposes
        String mainHandle = driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);


        // 4. Assert: Title is “Windows”
        String expectedTitle = "Windows";
        String actualTitle = driver.getTitle();

        // compare them if it is as expected
        Assert.assertEquals(actualTitle, expectedTitle);


        // 5. Click to: “Click Here” link
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();


        // 6. Switch to new Window. we will use for each loop for the coming new windows
        // First way
        /*for (String each : driver.getWindowHandles()) {
                 driver.switchTo().window(each);*/
        // Second Way recommended
        Set<String> allWindowHandles = driver.getWindowHandles();
        // window handle 1 - main window
        // window handle 2 - 2nd window
        for(String each: allWindowHandles){
            driver.switchTo().window(each);
            System.out.println("Current title while switching windows: " + driver.getTitle());
        }

        // 7. Assert: Title is “New Window”
        String expectedTitleAfterClick = "New Window";
        actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitleAfterClick);

        System.out.println("Title after click = " + actualTitle);
    }

    @AfterMethod
    public void teardownMethod() {
        driver.quit();
    }


}
