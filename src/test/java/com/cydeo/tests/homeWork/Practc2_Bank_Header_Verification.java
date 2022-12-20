package com.cydeo.tests.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practc2_Bank_Header_Verification {
    public static void main(String[] args) {
       /* TC #2: Zero Bank header verification

        1. Open Chrome browser
        2. Go to http://zero.webappsecurity.com/login.html */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://zero.webappsecurity.com/login.html");


        //3. Verify header text
           /* Expected: “
            Log in to ZeroBank” */
        String expectedTitle = "zero.webappsecurity.com";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Verification PASSED!");
        }else{
            System.out.println("Verification FAILED!");
        }


    }
}
