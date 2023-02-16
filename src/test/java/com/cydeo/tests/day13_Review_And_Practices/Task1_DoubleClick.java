package com.cydeo.tests.day13_Review_And_Practices;

import com.cydeo.pages.DoubleClickTestPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1_DoubleClick {

    @Test
    public void t1_Double_Click_Test() {


        //TC #1: Double Click Test
        //1. Go to
        //https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblcli
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

        // click accept cookies button
        DoubleClickTestPage doubleClickTestPage = new DoubleClickTestPage();
        doubleClickTestPage.acceptCookies.click();

        //2. Switch to iframe.
        Driver.getDriver().switchTo().frame("iframeResult");

        //3. Double click on the text “Double-click me to change my text color.”

        Actions actions = new Actions(Driver.getDriver());
        actions.doubleClick(doubleClickTestPage.textToDoubleClick).perform();


        //4. Assert: Text’s “style” attribute value contains “red”.
        System.out.println("doubleClickTestPage.textToDoubleClick.getAttribute(\"style\") = "
                + doubleClickTestPage.textToDoubleClick.getAttribute("style"));

        String actualStyleAttributeValue = doubleClickTestPage.textToDoubleClick.getAttribute("style");
        String expectedColor = "red";

        Assert.assertTrue(actualStyleAttributeValue.contains(expectedColor));


    }
}
