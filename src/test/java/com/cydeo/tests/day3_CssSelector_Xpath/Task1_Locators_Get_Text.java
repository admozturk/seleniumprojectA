package com.cydeo.tests.day3_CssSelector_Xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task1_Locators_Get_Text {
    public static void main(String[] args) {
        //TC #1: NextBaseCRM, locators and getText() practice
        //1- Open a chrome browser
        //2- Go to: https://login1.nextbasecrm.com/
       // WebDriverManager.chromedriver().setup();
       // WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.navigate().to("https://login1.nextbasecrm.com");

        //3- Enter incorrect username: “incorrect”
        //driver.findElement(By.name("USER_LOGIN")).sendKeys("incorrect"); not recommended like this
        WebElement inputUserName = driver.findElement(By.className("login-inp"));
        inputUserName.sendKeys("Incorrect");


        //4- Enter incorrect password: “incorrect”
        WebElement user_password = driver.findElement(By.name("USER_PASSWORD"));
        user_password.sendKeys("Incorrect123");

        //5- Click to login button.
        WebElement login_Button = driver.findElement(By.className("login-btn"));
        login_Button.click();


        //6- Verify error message text is as expected:  Expected: Incorrect login or password
        WebElement errorMessage = driver.findElement(By.className("errortext"));

        String expectedErrorMessage = "Incorrect login or password";
        String actualerrorMessage = errorMessage.getText();

        if (actualerrorMessage.equals(expectedErrorMessage)){
            System.out.println("Error message verification PASSED!");
        }else{
            System.out.println("Error message verification FAILED!");
        }




        // PS: Inspect and decide which locator you should be using to locate web elements.






    }
}
