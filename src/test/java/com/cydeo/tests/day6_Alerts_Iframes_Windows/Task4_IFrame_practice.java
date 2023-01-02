package com.cydeo.tests.day6_Alerts_Iframes_Windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task4_IFrame_practice {
    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/iframe");
    }

    // @Ignore // This annotation will ignore all the contents of this @Test until you remove it
    @Test
    public void iframe_Test() {

        // we need to switch driver's focus to iframe
        // option #1= Switch to iframe using id attribute value
        // driver.switchTo().frame("mce_0_ifr");  // String by Id value

        // option #2= Switch to iframe using id attribute value
        // driver.switchTo().frame(0);

        // option #3= locate as web element and pass in frame() method
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));


        // 4. Assert: “Your content goes here.” Text is displayed.
        WebElement yourContentIsHereGoesText = driver.findElement(By.xpath("//p"));

        Assert.assertTrue(yourContentIsHereGoesText.isDisplayed());

        // 5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
        // to be able to verify the header, we must switch back to main html page
        driver.switchTo().parentFrame();

        WebElement verifyTheHeaderText = driver.findElement(By.xpath("//h3"));

        // assertion of header is text is displayed or not
        Assert.assertTrue(verifyTheHeaderText.isDisplayed());
    }

    @AfterMethod
    public void teardownMethod (){
        driver.close();
    }


}
