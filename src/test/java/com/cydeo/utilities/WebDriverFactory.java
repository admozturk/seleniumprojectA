package com.cydeo.utilities;
// task: new Method creation
// Method Name getDriver
// Static method
// Accept string args browser type
//   - This args will determine what type of browser is opened
//   - If chrome passed --> it will open chrome browser
//   -  id firefox passed --> it will open firefox driver
// RETURN TYPE "WebDriver"

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    public static WebDriver getDriver(String browserType){
        if (browserType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }else if (browserType.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else{
            System.out.println("Given Browser type does not exist/ is not currently supported");
            System.out.println("Driver null");
            return null;
        }

    }

}
