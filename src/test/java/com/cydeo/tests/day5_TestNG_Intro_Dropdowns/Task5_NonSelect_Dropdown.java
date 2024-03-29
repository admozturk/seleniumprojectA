package com.cydeo.tests.day5_TestNG_Intro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task5_NonSelect_Dropdown {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        // TC #7: Selecting value from non-select dropdown
        // 1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // go to the site:https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

    }

    @Test
    public void NonSelectDropdown_Task() {

        // 3. Click to non-select dropdown
        WebElement clickSelectWebsiteButton = driver.findElement(By.xpath("//a[@role='button']"));
        clickSelectWebsiteButton.click();

        // 4. Select Facebook from dropdown
        // first way By xpath
        // WebElement selectfacebook = driver.findElement(By.xpath("//a[@class='dropdown-item'][4]"));
        // selectfacebook.click();

        // Second way By linkText
        WebElement selectfacebook = driver.findElement(By.linkText("Facebook"));
        selectfacebook.click();


        // 5. Verify title is “Facebook - Log In or Sign Up”
        String expectedTitle = "Facebook - log in or sign up";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.println("Actual title = " + actualTitle);
        System.out.println("Expected Title = " + expectedTitle);

    }

    @AfterMethod
    public void teardownMethod() {
        driver.close();
    }
}
