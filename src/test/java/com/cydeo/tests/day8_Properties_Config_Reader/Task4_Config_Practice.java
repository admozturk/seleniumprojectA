package com.cydeo.tests.day8_Properties_Config_Reader;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task4_Config_Practice {

    /*public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        // TC #4: Google search
        // 1- Open a chrome browser
        // 2- Go to: https://google.com
        String browserType = ConfigurationReader.getProperty("browser");
        driver = WebDriverFactory.getDriver(browserType);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }*/
    @Test
    public void google_Search_Test(){

        Driver.getDriver().get("https://google.com");

        // Get over if there is pop-ups or some securities message
        Driver.getDriver().findElement(By.xpath("//button[@id='L2AGLb']")).click();


        //3- Write “apple” in search box by using
        WebElement appleToSerachBox = Driver.getDriver().findElement(By.xpath("//*[@name='q']"));
        appleToSerachBox.sendKeys(ConfigurationReader.getProperty("searchValue")+Keys.ENTER);

        //4- Verify title:  Expected: apple - Google Search
       //  BrowserUtils.verifyTitle(driver,"apple - Recherche Google");

        // checking my title dynamically by using code
        String expectedTitle = ConfigurationReader.getProperty("searchValue")+" - Recherche Google";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
