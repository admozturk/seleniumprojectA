package com.cydeo.tests.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prctc5_Facebook {
    public static void main(String[] args) {

        /*TC #1: Facebook title verification
        1. Open Chrome browser
        2. Go to https://www.facebook.com*/
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");


       // 3. Verify title:
       // Expected: “Facebook - Log In or Sign Up”
        String expectedTitle = "Facebook - log in or sign up";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Verification is PASSED!");
        }else{
            System.out.println("Verification is FAILED!!");
        }









    }
}
