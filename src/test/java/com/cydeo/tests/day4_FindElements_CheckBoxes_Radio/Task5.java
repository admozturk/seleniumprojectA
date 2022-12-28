package com.cydeo.tests.day4_FindElements_CheckBoxes_Radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Task5 {
    public static void main(String[] args) {
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/abtest
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/abtest");

        //3- Locate “CYDEO” link, verify it is displayed.
        WebElement locatelink = driver.findElement(By.xpath("//a[@target='_blank']"));
        System.out.println("locatelink.isDisplayed() = " + locatelink.isDisplayed());

        //4- Refresh the page.
        driver.navigate().refresh();

        // we are refreshing the web element reference by re-assigning (re-locating) the web element
        // every refreshment of the page better to take the process if not it will throw an exception
        locatelink = driver.findElement(By.xpath("//a[@target='_blank']"));


        //5- Verify it is displayed, again.
        System.out.println("locatelink.isDisplayed() = " + locatelink.isDisplayed());


    }
}
