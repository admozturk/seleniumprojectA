package com.cydeo.tests.day3_CssSelector_Xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task4_CssSelector_GetText {
    public static void main(String[] args) {
        /*TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
        1- Open a chrome browser
        2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes*/
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        // 3- Verify “Reset password” button text is as expected:   Expected: Reset password
       // WebElement resetButtonVerification = driver.findElement(By.cssSelector("button[class='login-btn']"));


        WebElement resetButtonVerification = driver.findElement(By.cssSelector("button[value='Reset password']"));
        String expectedResetPasswordButton= "Reset password";
        String actualResetPasswordButton= resetButtonVerification.getText();
        System.out.println("actualResetPasswordButton = " + actualResetPasswordButton);

        if (actualResetPasswordButton.equals(expectedResetPasswordButton)){
            System.out.println("Verification Log in button is PASSED!");
        }else {
            System.out.println("Verification Log in button is FAILED!");
        }


        // PS: Inspect and decide which locator you should be using to locate web  elements.
        // PS2: Pay attention to where to get the text of this button from




    }

}
