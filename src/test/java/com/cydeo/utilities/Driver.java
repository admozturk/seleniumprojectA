package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    // Creating private constructor, so we are closing access to the object of this class from outside the class
    private Driver(){}

    // We make Webdriver private because we want to close access from outside the class
    // we make it static because we will use it in a static method
    private static WebDriver driver;

    // create a re-usable utility method which will return same driver instance when we call it
    public static WebDriver getDriver(){
     if (driver == null){
         // We read our browser type from configuration.properties.
         // This way we can control which browser is opened from outside our code,from configuration.properties
       String browserType = ConfigurationReader.getProperty("browser");

       switch (browserType){
           case "chrome":
               WebDriverManager.chromedriver().setup();
               driver = new ChromeDriver();
               driver.manage().window().maximize();
               driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
               break;

           case "firefox":
               WebDriverManager.firefoxdriver().setup();
               driver = new FirefoxDriver();
               driver.manage().window().maximize();
               driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
               break;

           case "edge":
               WebDriverManager.edgedriver().setup();
               driver = new EdgeDriver();
               driver.manage().window().maximize();
               driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
               break;

           case "safari":
               WebDriverManager.safaridriver().setup();
               driver = new SafariDriver();
               driver.manage().window().maximize();
               driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
               break;
       }
     }
     return driver;
    }
    // try to create a method named close driver
    // driver.quit()--> Suchsession
    public static void closeDriver(){
        if (driver != null){
            driver.quit();// this line will terminate the existing session. value will not even be null;
            driver = null;
        }
    }

    // driver.close()--> Suchsession


}
