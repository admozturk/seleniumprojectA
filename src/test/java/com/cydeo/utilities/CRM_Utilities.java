package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {

    // This method will log in with helpdesk1@cybertekschool.com user when it's called.
    public static void CRM_Login(WebDriver driver){
        //3. Enter valid username
        WebElement inputUserName = driver.findElement(By.xpath("//*[@name='USER_LOGIN']"));
        inputUserName.sendKeys("helpdesk1@cybertekschool.com ");

        //helpdesk1@cybertekschool.com  UserUser
        //Helpdesk2@cybertekschool.com  UserUser

        //4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//*[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");


        //5. Click to Log In button
        WebElement loginButton = driver.findElement(By.cssSelector("input[value='Log In']"));
        loginButton.click();


    }




    public static void CRM_Login(WebDriver driver, String userName, String password){
        //3. Enter valid username
        WebElement inputUserName = driver.findElement(By.xpath("//*[@name='USER_LOGIN']"));
        inputUserName.sendKeys(userName);

        //helpdesk1@cybertekschool.com  UserUser
        //Helpdesk2@cybertekschool.com  UserUser

        //4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//*[@name='USER_PASSWORD']"));
        inputPassword.sendKeys(password);


        //5. Click to Log In button
        WebElement loginButton = driver.findElement(By.cssSelector("input[value='Log In']"));
        loginButton.click();


    }
}
