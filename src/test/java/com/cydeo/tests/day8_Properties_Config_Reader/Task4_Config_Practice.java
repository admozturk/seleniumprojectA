package com.cydeo.tests.day8_Properties_Config_Reader;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task4_Config_Practice {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        // TC #4: Google search
        // 1- Open a chrome browser
        // 2- Go to: https://google.com
        String browserType = ConfigurationReader.getProperty("browser");
        driver = WebDriverFactory.getDriver(browserType);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://google.com");

    }
    @Test
    public void google_Search_Test(){

        // Get over if there is pop-ups or some securities message
        driver.findElement(By.xpath("//button[@id='L2AGLb']")).click();


        //3- Write “apple” in search box
        WebElement appleToSerachBox = driver.findElement(By.xpath("//*[@name='q']"));
        appleToSerachBox.sendKeys("apple"+Keys.ENTER);

        //4- Verify title:  Expected: apple - Google Search
       //  BrowserUtils.verifyTitle(driver,"apple - Recherche Google");

        String expectedTitle = "apple - Recherche Google";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
