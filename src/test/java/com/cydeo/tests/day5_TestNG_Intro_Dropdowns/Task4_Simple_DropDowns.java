package com.cydeo.tests.day5_TestNG_Intro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task4_Simple_DropDowns {


    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //TC#4: Verifying “Simple dropdown” and “State selection” dropdown default values
        // open browser
        driver = WebDriverFactory.getDriver("chrome");

        // maximize page
        driver.manage().window().maximize();

        // implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/dropdown
        driver.navigate().to("https://practice.cydeo.com/dropdown");
    }

    @AfterMethod
    public void tearDownMethod() {
    }

    @Test
    public void simpleDropDown() {

        //3. Verify “Simple dropdown” default selected value is correct: Expected: “Please select an option”

        Select simpleDropDown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        WebElement currentSelectedOption = simpleDropDown.getFirstSelectedOption();

        String actualSimpleDropdownText = currentSelectedOption.getText();
        String expectedSimpleDropdownText = "Please select an option";

        Assert.assertEquals(actualSimpleDropdownText, expectedSimpleDropdownText);
        Assert.assertTrue(actualSimpleDropdownText.equals(expectedSimpleDropdownText));


        //4. Verify “State selection” default selected value is correct: Expected: “Select a State”
        Select stateDropDown = new Select(driver.findElement(By.xpath("//*[@id=\"state\"]")));
        String actualStateSelectionDropDown = stateDropDown.getFirstSelectedOption().getText();
        String expectedStateSelectionDropDown = "Select a State";

        Assert.assertEquals(actualStateSelectionDropDown,expectedStateSelectionDropDown);

    }


}
