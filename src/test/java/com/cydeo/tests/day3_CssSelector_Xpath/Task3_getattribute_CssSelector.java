package com.cydeo.tests.day3_CssSelector_Xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task3_getattribute_CssSelector {
    public static void main(String[] args) {

       /* TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        1- Open a chrome browser
        2- Go to: https://login1.nextbasecrm.com/*/
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com");

       //  3- Verify “Log in” button text is as expected: Expected: Log In
       // WebElement signInButton = driver.findElement(By.cssSelector("input[type='submit']"));
        WebElement signInButton = driver.findElement(By.cssSelector("input[value='Log In']"));

        String expectedLoginButtonText = "Log In";
        String actualLoginButtonText = signInButton.getAttribute("value");
        System.out.println("actualLoginButtonText = " + actualLoginButtonText);

        if (actualLoginButtonText.equals(expectedLoginButtonText)){
            System.out.println("Verification Log in button is PASSED!");
        }else {
            System.out.println("Verification Log in button is FAILED!");
        }

        // PS: Inspect and decide which locator you should be using to locate web  elements.

       // PS2: Pay attention to where to get the text of this button from





    }
}
