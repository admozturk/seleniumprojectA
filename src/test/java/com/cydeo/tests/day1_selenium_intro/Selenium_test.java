package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_test {
    public static void main(String[] args) {
        //1- Setting up the web driver manager
        WebDriverManager.chromedriver().setup();

        // 2- Create instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        // 3- Test if the driver is working fine

        driver.get("https://www.youtube.com");




    }
}