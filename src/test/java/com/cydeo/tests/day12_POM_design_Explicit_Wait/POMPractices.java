package com.cydeo.tests.day12_POM_design_Explicit_Wait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POMPractices {

    LibraryLoginPage libraryLoginPage;

    @BeforeMethod
    public void setupMethod(){
        Driver.getDriver().get("https://library1.cydeo.com/login.html");
        libraryLoginPage = new LibraryLoginPage(); // creat your object first
    }

    @Test
    public void Required_Field_Error_Message_Test(){

        //TC #1: Required field error message test
        //1- Open a chrome browser

        //3- Do not enter any information
        //4- Click to “Sign in” button

        libraryLoginPage.signInButton.click();


        //5- Verify expected error is displayed:
        //Expected: This field is required
        Assert.assertTrue(libraryLoginPage.fillRequiredErrorMessage.isDisplayed());

        Driver.closeDriver();

    }
    @Test
    public void Invalid_Email_Format_Error_Message_Test(){

        //TC #2: Invalid email format error message test
        //1- Open a chrome browser


        //3- Enter invalid email format
        libraryLoginPage.inputUserName.sendKeys("email"+ Keys.ENTER);
        // libraryLoginPage.signInButton.click();


        //4- Verify expected error is displayed:
        //Expected: Please enter a valid email address.
        Assert.assertTrue(libraryLoginPage.enterValidEmailErrorMessage.isDisplayed());

        Driver.closeDriver();
    }

    @Test
    public void Librar_Negative_Login_Test(){

        //TC #3: Library negative login
        //1- Open a chrome browser


        //3- Enter incorrect username or incorrect password
        libraryLoginPage.inputUserName.sendKeys("email@gmail.com");
        libraryLoginPage.inputPassword.sendKeys("askjn345");
        libraryLoginPage.signInButton.click();

        //4- Verify title expected error is displayed:
        //Expected: Sorry, Wrong Email or Password
        Assert.assertTrue(libraryLoginPage.wrongEmailOrPasswordErrorMessage.isDisplayed());

        Driver.closeDriver();

    }
}
