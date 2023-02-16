package com.cydeo.tests.day13_Review_And_Practices;

import com.cydeo.pages.DynamicControlsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWaitPractices {

    DynamicControlsPage dynamicControlsPage;

    @BeforeMethod
    public void setupMethod(){
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
        dynamicControlsPage = new DynamicControlsPage();
    }

    @Test
    public void remove_Button_Test(){

        //3- Click to “Remove” button
        dynamicControlsPage.removeButton.click();

        //4- Wait until “loading bar disappears”
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.invisibilityOf(dynamicControlsPage.loadingBar));
        //5- Verify:
        //a. Checkbox is not displayed
        try {
            Assert.assertTrue(!dynamicControlsPage.checkBox.isDisplayed());
            // AssertFalse method will pass the test if the boolean value returned is= false
            Assert.assertFalse(dynamicControlsPage.checkBox.isDisplayed());
        } catch (NoSuchElementException e) {
            Assert.assertTrue(true);
        }

        //b. “It’s gone!” message is displayed.

        Assert.assertTrue(dynamicControlsPage.message.isDisplayed());
        Assert.assertTrue(dynamicControlsPage.message.getText().equals("It's gone!"));

    }

    @Test
    public void Enable_Button_Test(){

        //3- Click to “Enable” button
        dynamicControlsPage.enableButton.click();

        //4- Wait until “loading bar disappears”
        // calling our explicitWait utility method to wait loading bar to disappear
        BrowserUtils.wairForInvisibilityOf(dynamicControlsPage.loadingBar);

        //5- Verify:
        //a. Input box is enabled.
        Assert.assertTrue(dynamicControlsPage.inputBox.isEnabled());

        //b. “It’s enabled!” message is displayed.
        Assert.assertTrue(dynamicControlsPage.enabledMessage.isDisplayed());
        // use one of these the one that is above or the one which is below
        Assert.assertTrue(dynamicControlsPage.enabledMessage.getText().equals("It's enabled!"));
    }

}
