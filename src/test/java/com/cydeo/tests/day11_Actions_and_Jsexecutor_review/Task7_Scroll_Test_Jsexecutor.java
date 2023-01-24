package com.cydeo.tests.day11_Actions_and_Jsexecutor_review;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Task7_Scroll_Test_Jsexecutor {
    @Test
    public void task7_ScroolTest(){
        //TC #7: Scroll using JavascriptExecutor
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/large
        Driver.getDriver().get(" https://practice.cydeo.com/large");

        //3- Scroll down to “Cydeo” link
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));

        // create first java script executor by downcasting our driver
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


        //4- Scroll up to “Home” link
        js.executeScript("arguments[0].scrollIntoView(true)",cydeoLink);

        //4- Scroll up to “Home” link
        //js.executeScript("arguments[1].scrollIntoView(true)",cydeoLink, homeLink);
        js.executeScript("arguments[0].scrollIntoView(true)",homeLink);
        //5- Use below provided JS method only
    }
}
