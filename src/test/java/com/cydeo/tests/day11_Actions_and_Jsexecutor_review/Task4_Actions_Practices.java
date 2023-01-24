package com.cydeo.tests.day11_Actions_and_Jsexecutor_review;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Task4_Actions_Practices {
    @Test
    public void task4_and_Task5_Actions(){

        // TC #4: Scroll practice
        // 1- Open a chrome browser
        // 2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");

        // 3- Scroll down to “Powered by CYDEO”
        // Create object of actions and pass our "driver" instance
        Actions actions = new Actions(Driver.getDriver());

        // Locating cydeo link to be able to pass in the actions method
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

        // 4- Scroll using Actions class “moveTo(element)” method
        actions.moveToElement(cydeoLink).perform();

        //2- Scroll back up to “Home” link using PageUP button
        // It will not take the page to completely up it will just take a liitle up
        // if you want to take page completely up use PAGE_UP 2 times.
        actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP).perform();

        Driver.closeDriver();




    }
    @Test
    public void quitMethodTrial(){
        Driver.getDriver().get("https://practice.cydeo.com/");

        // close the driver
        Driver.closeDriver();

    }

}
