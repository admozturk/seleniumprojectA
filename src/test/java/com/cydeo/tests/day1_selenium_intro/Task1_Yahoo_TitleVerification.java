package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_Yahoo_TitleVerification {
    public static void main(String[] args) {

        /* TC #1: Yahoo Title Verification
             1. Open Chrome browser
             2. Go to https://www.yahoo.com
             3. Verify title:
             Expected: Yahoo
        */
        // first do setup
        WebDriverManager.chromedriver().setup();

        // Open your Chrome browser
        WebDriver driver = new ChromeDriver();

        // make your page full screen
        driver.manage().window().maximize();

        // go to target line
        driver.get("https://www.yahoo.com");
        

        // verify expected title
        // my expected title is: Yahoo fait partie de la famille de marques Yahoo.
        String expectedTitle = "Yahoo fait partie de la famille de marques Yahoo.";

        // compare expected title with current title
        String currentTitle = driver.getTitle();
        if (currentTitle.equals(expectedTitle)){
            System.out.println("Title is as expected. Verification done successfully");
        }else{
            System.out.println("Title is NOT as expected. Verification FAILED");
        }














    }
}
