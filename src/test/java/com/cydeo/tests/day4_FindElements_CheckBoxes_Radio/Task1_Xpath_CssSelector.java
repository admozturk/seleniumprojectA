package com.cydeo.tests.day4_FindElements_CheckBoxes_Radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task1_Xpath_CssSelector {
    public static void main(String[] args) {
        /*1. Open Chrome browser
        2. Go to https://practice.cydeo.com/forgot_password*/
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/forgot_password");

       // 3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
       // a. “Home” link Locate homeLink using cssSelector
        WebElement homeLink_Exam1 = driver.findElement(By.cssSelector("a[class='nav-link']"));
        System.out.println("homeLink_Exam1.isDisplayed() = " + homeLink_Exam1.isDisplayed());

        //Locate home with 2nd syntax of cssSelector
        WebElement homeLink_Exam2 = driver.findElement(By.cssSelector("a.nav-link"));
        System.out.println("homeLink_Exam2.isDisplayed() = " + homeLink_Exam2.isDisplayed());

        //Locate home with 3rd syntax of cssSelector
        WebElement homeLink_Exam3 = driver.findElement(By.cssSelector("a[href='/']"));
        System.out.println("homeLink_Exam3.isDisplayed() = " + homeLink_Exam3.isDisplayed());

        // b. “Forgot password” header
        //Locate Header by using css selectors: locate parent element and move down to h2
        WebElement forgetPasswordheader_exam1 = driver.findElement(By.cssSelector("div.example>h2"));
        System.out.println("forgetPasswordheader_exam1.isDisplayed() = " + forgetPasswordheader_exam1.isDisplayed());

        //Locate Header by using xpath: using web element text for "Forgot Password"
        // WebElement forgetPasswordheader_exam2 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        WebElement forgetPasswordheader_exam2 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

        // c. “E-mail” text
        WebElement emailLabel_Exam1 = driver.findElement(By.xpath("//label[@for='email']"));
        System.out.println("emailLabel_Exam1.isDisplayed() = " + emailLabel_Exam1.isDisplayed());
        // d. E-mail input box
        WebElement inputBox_Exam1 = driver.findElement(By.xpath("//input[@name='email']"));
        System.out.println("inputBox_Exam1.isDisplayed() = " + inputBox_Exam1.isDisplayed());
        // Locate input using xpath contains method
        // tagname[contains(@attribute,'value')]
        WebElement inputBox_Exam2 = driver.findElement(By.xpath("//input[contains(@pattern,'[a-z0-9._%+-]')]"));

        // e. “Retrieve password” button
        // button [@class='radius']
        // button [@type='submit']
        WebElement retrevePasswordBtn = driver.findElement(By.xpath("//button[@id='form_submit']"));
        System.out.println("retrevePasswordBtn.isDisplayed() = " + retrevePasswordBtn.isDisplayed());

        // f. “Powered by Cydeo text
        WebElement poweredByCydeotText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));
        System.out.println("poweredByCydeotText.isDisplayed() = " + poweredByCydeotText.isDisplayed());


        // 4. Verify all web elements are displayed.
      // First solve the task with using cssSelector only. Try to create 2 different cssSelector if possible
      // Then solve the task using XPATH only. Try to create 2 different  XPATH locator if possible


    }
}
