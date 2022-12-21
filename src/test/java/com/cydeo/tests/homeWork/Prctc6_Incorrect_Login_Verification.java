package com.cydeo.tests.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prctc6_Incorrect_Login_Verification {
    public static void main(String[] args) throws InterruptedException {
        /*TC #2: Facebook incorrect login title verification
            1. Open Chrome browser
            2. Go to https://www.facebook.com*/
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        Thread.sleep(2000);
        // Allow cookies

        driver.findElement(By.xpath("(//button[normalize-space()='Allow essential and optional cookies'])[1]")).click();

       // 3. Enter incorrect username
        WebElement verifyUserName = driver.findElement(By.id("email"));
        verifyUserName.sendKeys("incorrenct@gmail.com");

        //4. Enter incorrect password
        WebElement verifyUserPassword = driver.findElement(By.name("pass"));
        verifyUserPassword.sendKeys("123456789");

        //5. Verify title changed to:
           //Expected: “Log into Facebook”
        String expectedLoginTitle = "Log into Facebook";
        String actualLoginTitle = driver.getTitle();

        if (actualLoginTitle.equals(expectedLoginTitle)) {
            System.out.println("Verification is PASSED!");
        }else{
            System.out.println("Verification is FAILED!!");
        }


        Thread.sleep(2000);

      // press login button
     driver.findElement(By.xpath("(//button[normalize-space()='Log In'])[1]")).click();



    }
}
