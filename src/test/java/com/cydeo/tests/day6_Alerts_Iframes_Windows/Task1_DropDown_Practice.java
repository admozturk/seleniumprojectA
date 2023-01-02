package com.cydeo.tests.day6_Alerts_Iframes_Windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task1_DropDown_Practice {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        // 1. Open Chrome browser
       // 2. Go to http://practice.cybertekschool.com/dropdown*/

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cybertekschool.com/dropdown");

        // handle the security problems
        driver.findElement(By.xpath("//button[@id='details-button']")).click();
        driver.findElement(By.xpath("//a[@id='proceed-link']")).click();

    }

    @Test
    public void dropdown_Task5() throws InterruptedException {
        //TC #5: Selecting state from State dropdown and verifying result
        //Use all Select options. (visible text, value, index)
        // Locate first the dropdown and make it ready to use
        Thread.sleep(2000);
        Select selectDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //3. Select Illinois
        Thread.sleep(2000);
        selectDropdown.selectByVisibleText("Illinois");

        //4. Select Virginia
        Thread.sleep(2000);
        selectDropdown.selectByValue("VA");

        //5. Select California
        selectDropdown.selectByIndex(5);

        //6. Verify final selected option is California.
        String expectedOptionText = "California";
        String actualOptionText = selectDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionText,expectedOptionText);

    }

    @Test
    public void dropdown_Task6(){
        // TC #6: Selecting date on dropdown and verifying
        //Select “December 1st, 1923” and verify it is selected.
        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        //Select year using : visible text
        yearDropdown.selectByVisibleText("1924");

        //Select month using : value attribute
        monthDropdown.selectByValue("11");

        //Select day using : index number
        dayDropdown.selectByIndex(0);

        String expectedYear = "1924";
        String expectedMonth = "December";
        String expectedDay = "1";

        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        String actualMonth = monthDropdown.getFirstSelectedOption().getText();
        String actualday = dayDropdown.getFirstSelectedOption().getText();

        Assert.assertTrue(actualYear.equals(expectedYear));
        Assert.assertTrue(actualMonth.equals(expectedMonth));
        Assert.assertTrue(actualday.equals(expectedDay));

    }

    @AfterMethod
    public void teardownMethod(){
        driver.close();
    }


}
