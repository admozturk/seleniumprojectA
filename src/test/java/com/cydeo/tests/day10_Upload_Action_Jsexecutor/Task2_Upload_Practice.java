package com.cydeo.tests.day10_Upload_Action_Jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task2_Upload_Practice {
    @Test
    public void uploadTest(){

        //TC #2 Upload Test
        //1. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get("https://practice.cydeo.com/upload");

        //2. Find some small file from your computer, and get the path of it.

        //3. Upload the file.
        WebElement uploadFile = Driver.getDriver().findElement(By.xpath("//input[@id='file-upload']"));
        BrowserUtils.sleep(3);
        uploadFile.sendKeys("C:\\Users\\HUNTER\\Desktop\\HTML class\\FCB.png");

        WebElement uploadButton = Driver.getDriver().findElement(By.xpath("//input[@id='file-submit']"));
        BrowserUtils.sleep(3);
        uploadButton.sendKeys("C:\\Users\\HUNTER\\Desktop\\HTML class\\FCB.png"+ Keys.ENTER);

        //4. Assert: -File uploaded text is displayed on the page
        WebElement verifyUploadedText = Driver.getDriver().findElement(By.xpath("//h3[1]"));
        Assert.assertTrue(verifyUploadedText.isDisplayed());


    }
}
