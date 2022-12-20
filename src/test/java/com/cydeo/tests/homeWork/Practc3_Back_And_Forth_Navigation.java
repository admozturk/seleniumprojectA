package com.cydeo.tests.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practc3_Back_And_Forth_Navigation {
    public static void main(String[] args) {
       /* TC #3: Back and forth navigation
        1- Open a chrome browser
        2- Go to: https://google.com */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");


        //  3- Click to Gmail from top right.
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/span/div/div/div/div[3]/div[1]/button[2]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).click();


        //  4- Verify title contains:   Expected: Gmail
        String expectedTitle = "Gmail";
        String actualtitle = driver.getTitle();

        if (actualtitle.contains(expectedTitle)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
        driver.navigate().refresh();
        //  5- Go back to Google by using the .back();
        driver.navigate().back();


        //  6- Verify title equals:  Expected: Google
        expectedTitle = "Google";
        actualtitle = driver.getTitle();

        if (actualtitle.equals(expectedTitle)) {
            System.out.println("Verification PASSED!");
        } else {
            System.out.println("Verification FAILED!");
        }


    }
}
