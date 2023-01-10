package com.cydeo.tests.day5_TestNG_Intro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task6_MultipleSelect_Dropdowns_Task {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        // TC #8: Selecting value from multiple select dropdown
        // 1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        // go to https://practice.cydeo.com/dropdown
        driver.navigate().to("https://practice.cydeo.com/dropdown");


    }

    @Test
    public void multipleSelectDropdown() {

        //3. Select all the options from multiple select dropdown.


        //4. Print out all selected values.


        //5. Deselect all values.


    }


}
