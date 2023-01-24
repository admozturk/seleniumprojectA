package com.cydeo.tests.day10_Upload_Action_Jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task3_Actions_Hover {
    @Test
    public void hovering_Test(){
        //TC #3: Hover Test
        //1. Go to https://practice.cydeo.com/hovers
        Driver.getDriver().get("https://practice.cydeo.com/hovers");

        //2. Locate all the images under here
        WebElement img1 = Driver.getDriver().findElement(By.xpath("//img[1]"));
        WebElement img2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement img3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));


        //3. Locate all the "User" texts under here:
        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user1']"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user2']"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user3']"));

        Actions actions = new Actions(Driver.getDriver());

        //4. Hover over to first image
        BrowserUtils.sleep(3);
        actions.moveToElement(img1).perform();

        //a. Assert “name: user1” is displayed
        Assert.assertTrue(user1.isDisplayed());


        //5. Hover over to second image
        BrowserUtils.sleep(3);
        actions.moveToElement(img2).perform();

        //a. Assert “name: user2” is displayed
        Assert.assertTrue(user2.isDisplayed());



        //6. Hover over to third image
        BrowserUtils.sleep(3);
        actions.moveToElement(img3).perform();

        //a. Assert “name: user3” is displayed
        Assert.assertTrue(user3.isDisplayed());



    }
}
