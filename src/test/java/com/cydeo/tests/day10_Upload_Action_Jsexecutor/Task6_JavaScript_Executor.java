package com.cydeo.tests.day10_Upload_Action_Jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Task6_JavaScript_Executor {
    @Test
    public void javaScript_Executor_Test1(){
        //TC #6: Scroll using JavascriptExecutor
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/infinite_scroll
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");

        //3- Use below JavaScript method and scroll
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


        //JavaScript method to use : window.scrollBy(0,0)
        //a. 750 pixels down 10 times.
        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,750)");
        }
        //b. 750 pixels up 10 times
        for (int i = 0; i <10; i++) {
            BrowserUtils.sleep(2);
            js.executeScript("window.scrollBy(0,-750)");
        }

    }
}
