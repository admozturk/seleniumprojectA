package com.cydeo.tests.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practc1_Wooden_Spoon {
    public static void main(String[] args) {
        // TC #1: Etsy Title Verification
        // 1. Open Chrome browser
       //  2. Go to https://www.etsy.com
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com");


       // 3. Search for “wooden spoon”

        driver.findElement(By.xpath("//*[@id=\"gdpr-single-choice-overlay\"]/div/div[2]/div[2]/button")).click();
        WebElement searchWoodenSpoon = driver.findElement(By.name("search_query"));
        searchWoodenSpoon.sendKeys("wooden spoon"+Keys.ENTER);


        // 4. Verify title:
        //  Expected: “Wooden spoon | Etsy”
        String expectedTitle = "Wooden spoon - Etsy";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("The Title verification test PASSED!");
        }else{
            System.out.println("The Title verification test FAILED!");
        }







    }
}
