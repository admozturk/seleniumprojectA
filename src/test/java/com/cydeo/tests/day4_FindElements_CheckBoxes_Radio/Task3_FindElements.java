package com.cydeo.tests.day4_FindElements_CheckBoxes_Radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task3_FindElements {
    public static void main(String[] args) {

        //1- Open a chrome browser

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //Providing extra wait time for our driver before it throws NoSuchElementExceptions
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");


        //3- Locate all the links in the page.
        // Windows alt+enter: Introduce local variable
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        //4- Print out the number of the links on the page.
        System.out.println("allLinks.size() = " + allLinks.size());


        //5- Print out the texts of the links.
        // 6- Print out the HREF attribute values of the links
        for (WebElement each : allLinks) {
            System.out.println("Test of links: "+each.getText());
            System.out.println("Href Values: "+each.getAttribute("href"));

        }









    }
}
