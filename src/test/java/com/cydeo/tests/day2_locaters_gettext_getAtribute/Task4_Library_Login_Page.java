package com.cydeo.tests.day2_locaters_gettext_getAtribute;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task4_Library_Login_Page {
    public static void main(String[] args) {
      // TC #4: Library verifications
      // 1. Open Chrome browser
      // 2. Go to http://library2.cybertekschool.com/login.html
       // WebDriverManager.chromedriver().setup();
       // WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("firefox");
        driver.navigate().to("https://library2.cybertekschool.com/login.html");


       // 3. Enter username: “incorrect@email.com”
        WebElement userNameInput = driver.findElement(By.className("form-control"));
        userNameInput.sendKeys("incorrect@email.com");


       // 4. Enter password: “incorrect password”
        WebElement passwordInput = driver.findElement(By.id("inputPassword"));
        passwordInput.sendKeys("incorrect Password");
      // 5. Verify: visually “Sorry, Wrong Email or Password” displayed

        // Click to sign in button
        WebElement signInButton = driver.findElement(By.tagName("button"));
        signInButton.click();

     /* PS: Locate username input box using “className” locator
        Locate password input box using “id” locator
        Locate Sign in button using “tagName” locator
             */









    }

}
