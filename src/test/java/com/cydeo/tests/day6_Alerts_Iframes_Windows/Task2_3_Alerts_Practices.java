package com.cydeo.tests.day6_Alerts_Iframes_Windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task2_3_Alerts_Practices {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //TC #1: Information alert practice
        // 1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("https://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void alert_Test1() {
        // 3. Click to “Click for JS Alert” button
        WebElement informationAlertButton = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        informationAlertButton.click();

        // 4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

        // 5. Verify “You successfully clicked an alert” text is displayed.
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(resultText.isDisplayed(), "result text is not displayed ");

        // verify the text as is expected
        String expectedTextAlert = "You successfully clicked an alert";
        String actualTextAlert = resultText.getText();
        System.out.println(actualTextAlert);

        Assert.assertEquals(expectedTextAlert, actualTextAlert);
    }

    @AfterMethod
    public void teardownMethod() {
        driver.close();
    }


}
