package com.cydeo.tests.day7_WebTables_Utilities_JavaFaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task3_CRM_LOGIN {
    public WebDriver driver;

    @BeforeMethod
    public void Setupmethod() {

        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Test
    public void crm_Login_Test2() {
        //2. Go to : https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        CRM_Utilities.CRM_Login(driver);

        //6. Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyTitle(driver, "My tasks");


    }

    @Test
    public void crm_Login_Test() {
        //2. Go to : https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3. Enter valid usernamE
        WebElement inputUserName = driver.findElement(By.xpath("//*[@name='USER_LOGIN']"));
        inputUserName.sendKeys("helpdesk1@cybertekschool.com ");

        //helpdesk1@cybertekschool.com  UserUser
        //Helpdesk2@cybertekschool.com  UserUser

        //4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//*[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");


        //5. Click to Log In button
        WebElement loginButton = driver.findElement(By.cssSelector("input[value='Log In']"));
        loginButton.click();

        //6. Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyTitle(driver, "My tasks");

    }

    @Test
    public void crm_Login_Test3() {
        //2. Go to : https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        CRM_Utilities.CRM_Login(driver, "Helpdesk2@cybertekschool.com", "UserUser");

        //6. Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyTitle(driver,"(1) Portal");


    }
}