package com.cydeo.tests.day12_POM_design_Explicit_Wait;

import com.cydeo.pages.DynamicLoad1Page;
import com.cydeo.pages.DynamicLoad7Pages;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriverWaitPractices {
    @Test
    public void dynamic_Load_7_Test(){
        //TC#4 : Dynamically Loaded Page Elements 7
        //1. Go to https://practice.cydeo.com/dynamic_loading/7
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");

        //2. Wait until title is “Dynamic title”
        //Creating the wait object to be able to create certain condition to wait
        WebDriverWait wait =new WebDriverWait(Driver.getDriver(),10);

        //use the wait object to create our expected condition
        wait.until(ExpectedConditions.titleIs("Dynamic title"));

       // Create object of DynamicLOadPage to reach and assert web elements
        DynamicLoad7Pages dynamicLoad7Pages = new DynamicLoad7Pages();

        //3. Assert: Message “Done” is displayed.
        Assert.assertTrue(dynamicLoad7Pages.doneMessage.isDisplayed());

        //4. Assert: Image is displayed.
        Assert.assertTrue(dynamicLoad7Pages.spongeBonImage.isDisplayed());
    }

    @Test
    public void dynamically_Loaded_Page_Elements_1(){
        //1. Go to https://practice.cydeo.com/dynamic_loading/1
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");

        DynamicLoad1Page dynamicLoad1Page = new DynamicLoad1Page();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);

        //2. Click to start
        dynamicLoad1Page.startButton.click();

        //3. Wait until loading bar disappears

        wait.until(ExpectedConditions.invisibilityOf(dynamicLoad1Page.loadingBar));

        //4. Assert username inputbox is displayed
        Assert.assertTrue(dynamicLoad1Page.inputUserName.isDisplayed());

        //5. Enter username: tomsmith
        dynamicLoad1Page.inputUserName.sendKeys("tomsmith");

        //6. Enter password: incorrectpassword
        dynamicLoad1Page.inputPassword.sendKeys("incorrectpassword");

        //7. Click to Submit button
        dynamicLoad1Page.submitButton.click();

        //8. Assert “Your password is invalid!” text is displayed.
        Assert.assertTrue(dynamicLoad1Page.errorMessage.isDisplayed());

    }
}
