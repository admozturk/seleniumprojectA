package com.cydeo.tests.locaters_gettext_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_Cydeo_Verifications {
    public static void main(String[] args) {
        /*TC #1: Cydeo practice tool verifications
           1. Open Chrome browser
           2. Go to https://practice.cydeo.com
           3. Verify URL contains
           Expected: cydeo
           4. Verify title:
           Expected: Practice
         */
        // Always start with setup
        WebDriverManager.chromedriver().setup();

        // open web browser
        WebDriver driver = new ChromeDriver();

        //maximaze the page
        driver.manage().window().maximize();

        // go to the website
        driver.navigate().to("https://practice.cydeo.com");

        // verify your URL contains
        // Expected: expectedURL = "Cydeo"
        String expectedURL = "cydeo";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains(expectedURL)){
            System.out.println("URL verification PASSED!");
        }else{
            System.out.println("URL verification FAILED!");
        }

        //  4. Verify title:
        // Expected: Practice

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!");
        }






    }
}
