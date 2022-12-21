package com.cydeo.tests.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prctc_Cydeo {
    public static void main(String[] args) {
        // TC #4: Practice Cydeo – Class locator practice
        // 1- Open a chrome browser
        // 2- Go to: https://practice.cydeo.com/inputs

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/inputs");



        // 3- Click to “Home” link
        WebElement clickhomelink = driver.findElement(By.className("nav-link"));
        clickhomelink.click();



        // 4- Verify title is as expected:
        // Expected: Practice
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("The Title verification test PASSED!");
        }else{
            System.out.println("The Title verification test FAILED!");
        }

        // PS: Locate “Home” link using “className” locator
        WebElement locateLink = driver.findElement(By.className("nav-link"));
        System.out.println(locateLink.getAttribute("href"));



    }
}
