package com.cydeo.tests.day5_TestNG_Intro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {


    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        // Do browser driver setup
        // open browser
        driver = WebDriverFactory.getDriver("chrome");

        // maximize page
        driver.manage().window().maximize();

        // implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }

    @Test
    public void selenium_Test(){

        // get"https://google.com
        driver.get("https://google.com");

        driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]")).click();


        // Assert: title is Google
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";

        Assert.assertTrue(actualTitle.equals(expectedTitle));

       // Assert.assertEquals(driver.getTitle(),"Google");



    }
}

