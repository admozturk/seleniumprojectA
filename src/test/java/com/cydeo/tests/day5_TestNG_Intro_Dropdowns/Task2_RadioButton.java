package com.cydeo.tests.day5_TestNG_Intro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Task2_RadioButton {
    public static void main(String[] args) throws InterruptedException {
        //TC #2: Radiobutton handling
        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
        //1. Open Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");


        //3. Click to “Hockey” radio button
        WebElement hockeyRadioBtn = driver.findElement(By.xpath("//input[@id='hockey']"));

        Thread.sleep(2000);
        hockeyRadioBtn.click();

        //4. Verify “Hockey” radio button is selected after clicking.
        System.out.println("hockeyRadioBtn.isSelected() = " + hockeyRadioBtn.isSelected());

        if (hockeyRadioBtn.isSelected()){
            System.out.println("button is selected. verification is PASSED!");
        }else{
            System.out.println("button is not selected. verification is FAILED!");
        }


    }
}
