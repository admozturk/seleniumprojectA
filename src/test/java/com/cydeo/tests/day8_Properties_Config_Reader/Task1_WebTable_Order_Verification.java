package com.cydeo.tests.day8_Properties_Config_Reader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task1_WebTable_Order_Verification {

    public WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
      driver= WebDriverFactory.getDriver("chrome");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //TC #1: Web table practice
        //1. Go to: https://practice.cydeo.com/web-tables
        driver.get("https://practice.cydeo.com/web-tables");
    }



    @Test
    public void order_Name_Verify_Test(){


        // Locate first the cell that bob martin exists
        WebElement bobMartinCell =
         driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody//td[.='Bob Martin']"));

        System.out.println(bobMartinCell.getText());

        //2. Verify Bob’s name is listed as expected.  Expected: “Bob Martin”
        String expectedBobName = "Bob Martin";
        String actualBobName = bobMartinCell.getText();

        Assert.assertEquals(actualBobName,expectedBobName);



        //3. Verify Bob Martin’s order date is as expected.  Expected: 12/31/2021
        WebElement bobMartinDateCell =
            driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody//td[.='Bob Martin']/following-sibling::td[3]"));

        String expectedBobMartinDate = "12/31/2021";
        String actualBobMartinDate = bobMartinDateCell.getText();

        Assert.assertEquals(actualBobMartinDate,expectedBobMartinDate);

    }


    @Test
    public void test2(){

        String costumerOrderDate1 = WebTableUtils.returnOrderDate(driver, "Alexandra Gray");
        System.out.println("costumerOrderDate1 = " + costumerOrderDate1);


        String costumerOrderDate2 = WebTableUtils.returnOrderDate(driver, "John Doe");
        System.out.println("costumerOrderDate2 = " + costumerOrderDate2);

    }

    @Test
    public void test3(){
         WebTableUtils.orderVerify(driver,"Bart Fisher","01/16/2021");
    }

}

