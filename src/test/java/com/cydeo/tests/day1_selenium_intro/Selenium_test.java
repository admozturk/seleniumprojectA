package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_test {
    public static void main(String[] args) {
        //1- Setting up the web driver manager
        // We create our " browser driver"
        WebDriverManager.chromedriver().setup();

        // 2- Create instance of the chrome driver
        // This command will open our "browser"
        WebDriver driver = new ChromeDriver();

        // 3- Test if the driver is working fine
        // This is our selenium method allowing us to get the target
        driver.get("https://www.youtube.com");




    }
}
