package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Navigations {
    public static void main(String[] args) throws InterruptedException {
        // setup browser driver
        WebDriverManager.chromedriver().setup();


        // Create instance of the selenium driver
        // This line is automatically opens an empty browser
        WebDriver driver = new ChromeDriver();


        // This line will maximize the browser size
        driver.manage().window().maximize();
        // driver.manage().window().fullscreen(); this does the same mission as maximize but
        // sometimes doesn't work in windows OP


        // Go to tesla.com
        driver.get("https://www.tesla.com");


        // gets the title method gets the title of the page and "returns as a String"
        String currentTitle= driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);


        // get current URL using selenium
        String currentURl = driver.getCurrentUrl();
        System.out.println("currentURl = " + currentURl);


        // stop code execution for 3 seconds
        Thread.sleep(3000);


        // use selenium to navigate back
        driver.navigate().back();


        // stop code execution for 3 seconds
        Thread.sleep(3000);


        // use selenium to navigate forward
        driver.navigate().forward();


        // stop code execution for 3 seconds
        Thread.sleep(3000);


        // Use selenium to navigate page refresh
        driver.navigate().refresh();


        // stop code execution for 3 seconds
        Thread.sleep(3000);


        // use navigate(). to ():
        driver.navigate().to("https://www.google.com");


        // get the current title after getting the Google page
        currentTitle= driver.getTitle();


        // gets the title method gets the title of the page and "returns as a String"
        System.out.println("currentTitle= "+currentTitle);


        // get current URL using selenium
        currentURl = driver.getCurrentUrl();
        System.out.println("currentURl = " + currentURl);






    }
}
