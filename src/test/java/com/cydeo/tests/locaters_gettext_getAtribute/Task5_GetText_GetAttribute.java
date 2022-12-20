package com.cydeo.tests.locaters_gettext_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5_GetText_GetAttribute {

    public static void main(String[] args) {

        /*TC #5: getText() and getAttribute() method practice
        1- Open a chrome browser
        2- Go to: https://practice.cydeo.com/registration_form*/

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://practice.cydeo.com/registration_form");


       /* 3- Verify header text is as expected: Expected: Registration form */
        WebElement headerText = driver.findElement(By.tagName("h2"));
        // Expected= Registration Form
        String ExpectedHeaderText = "Registration Form";
        String actualHeaderText = headerText.getText(); // Will return "Registration Form' as string

        if (actualHeaderText.equals(actualHeaderText)){
            System.out.println("Header text verification PASSED!");
        }else{
            System.out.println("Header text verification FAILED!");
        }


       // 4- Locate “First name” input box
       // We are going to locate the web element using "Name" Locator
       // Name Attribute has "firstname" value

        WebElement firstNameInput =  driver.findElement(By.name("firstname"));

        String expectedPlaceHolder = "first name";
        String actualPlaceHolder = firstNameInput.getAttribute("placeholder");

        if (actualPlaceHolder.equals(expectedPlaceHolder)){
            System.out.println("Place holder text verification PASSED!");
        }else{
            System.out.println("Place holder text verification FAILED!");
        }


        // Verify the last name as expected.

        WebElement lastNameInput = driver.findElement(By.name("lastname"));

        String expectedPlaceHolderLastName = "lastname";
        String actualPlaceHolderLastName = lastNameInput.getAttribute("data-bv-field");

        if (actualPlaceHolderLastName.equals(expectedPlaceHolderLastName)){
            System.out.println("Place holder last name text verification Passed!");
        }else{
            System.out.println("Place holder last name text verification FAILED!");
        }









    }
}
