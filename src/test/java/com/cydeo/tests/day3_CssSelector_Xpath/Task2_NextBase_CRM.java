package com.cydeo.tests.day3_CssSelector_Xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task2_NextBase_CRM {
    public static void main(String[] args) {
        /*TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        1- Open a chrome browser
        2- Go to: https://login1.nextbasecrm.com/*/

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.navigate().to("https://login1.nextbasecrm.com/");


       // 3- Verify “remember me” label text is as expected:
       // Expected: Remember me on this computer
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));

        String expectedRememberMeLabel = "Remember me on this computer";
        String actualRememberMeLabel= rememberMeLabel.getText();
        if (actualRememberMeLabel.equals(expectedRememberMeLabel)){
            System.out.println("PASSED!");
        }else{
            System.out.println("FAILED");
        }

       // 4- Verify “forgot password” link text is as expected:
      //  Expected: Forgot your password?
       WebElement forgetPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));

        String expectedForgetPasswordLinkText = "FORGOT YOUR PASSWORD?";
        String actualForgetPasswordLinkText = forgetPasswordLink.getText();

        if (actualForgetPasswordLinkText.equals(expectedForgetPasswordLinkText)){
            System.out.println("Forgot your password verification PASSED!");
        }else{
            System.out.println("Forgot your password verification FAILED!");
        }

        // 5- Verify “forgot password” href attribute’s value contains expected:
       //   Expected: forgot_password=yes
        String expectedInHref = "forgot_password=yes";
        String actualInHref = forgetPasswordLink.getAttribute("href");
        System.out.println("actualInHref = " + actualInHref);
        
        if (actualInHref.contains(expectedInHref)){
            System.out.println("HREF attribute value verification PASSED!");
        }else{
            System.out.println("HREF attribute value verification FAILED!!!");
        }





      //  PS: Inspect and decide which locator you should be using to locate web elements.






    }
}
