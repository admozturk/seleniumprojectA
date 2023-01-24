package com.cydeo.tests.day11_Actions_and_Jsexecutor_review;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task9_Drug_and_Drop {
    @Test
    public void drug_and_Drop() {

        //TC #: Drag and drop
        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        // Locate Accept cookies button
        WebElement acceptCookies = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));

        acceptCookies.click();

        // Locate the two element small and big ones to be able to drag them
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));

        //2. Drag and drop the small circle to bigger circle.
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(smallCircle, bigCircle).perform();

        // 2nd way of achieving the same mission a little long way
       // actions.clickAndHold(smallCircle).moveToElement(bigCircle).release().perform();

        //3. Assert:
        String actualBigCircleText = bigCircle.getText();
        String expectedBigCircleText = "You did great!";

        Assert.assertEquals(actualBigCircleText, expectedBigCircleText);
        //-Text in big circle changed to: “You did great!”
    }
}
