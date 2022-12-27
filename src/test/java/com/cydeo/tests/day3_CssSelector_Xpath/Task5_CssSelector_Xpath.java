package com.cydeo.tests.day3_CssSelector_Xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task5_CssSelector_Xpath {
    public static void main(String[] args) {
        /*TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
        1- Open a chrome browser
        2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes*/
        WebDriver driver = WebDriverFactory.getDriver("firefox");
        driver.manage().window().maximize();
        driver.navigate().to("https://login1.nextbasecrm.com/?forgot_password=yes");


        // 3- Enter incorrect username into login box:
        WebElement usernameVerification = driver.findElement(By.cssSelector("input[class='login-inp']"));
        usernameVerification.sendKeys("admoztrk");
        // 4- Click to `Reset password` button
        // 5- Verify “error” label is as expected. Expected: Login or E-mail not found
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.getMessage();
        }
        driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[4]/button")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.getMessage();
        }
        System.out.println("usernameVerification = " + usernameVerification);

        WebElement verifyErrorLabel = driver.findElement(By.cssSelector("div[class='errortext']"));
        System.out.println("verifyErrorLabel = " + verifyErrorLabel);

        String expectedErrorMessage = "Login or E-mail not found";
        String actualtedErrorMessage = verifyErrorLabel.getText();
        if (actualtedErrorMessage.equals(expectedErrorMessage)) {
            System.out.println("PASSED!");
        } else {
            System.out.println("FAILED!!!");
        }

        /*PS: Inspect and decide which locator you should be using to locate web elements.
          PS2: Pay attention to where to get the text of this button from*/


    }
}
