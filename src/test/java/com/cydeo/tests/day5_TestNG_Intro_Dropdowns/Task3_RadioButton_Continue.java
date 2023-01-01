package com.cydeo.tests.day5_TestNG_Intro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task3_RadioButton_Continue {
    public static void main(String[] args) throws InterruptedException {

        //TC #2: Radiobutton handling
        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
        //1. Open Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");


        clickAndVerifyRadioButton(driver, "color", "black");

        Thread.sleep(3000);

        clickAndVerifyRadioButton(driver, "sport", "basketball");


        // //Locate name='sports' radio buttons and store them in a List of Web Element
      /*  List<WebElement> supportRadioButton = driver.findElements(By.name("sport"));

        //Loop through the List of WebElement and select matching result "hockey"

        for (WebElement each : supportRadioButton) {
           String eachId = each.getAttribute("id");
            System.out.println("eachId = " + eachId);

            if (eachId.equals("hockey")){
                each.click();
                System.out.println("hockey is selected: "+each.isSelected());
                break;
            }
        }
*/

    }

    // Method for all ratio button tests
    private static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue) {
        List<WebElement> radioButton = driver.findElements(By.name(nameAttribute));

        for (WebElement each : radioButton) {
            System.out.println(each);
            String eachId = each.getAttribute("id");
            if (eachId.equals(idValue)) {
                System.out.println(eachId);
                each.click();
                System.out.println(eachId + " is selected: " + each.isSelected());
                break;
            }
        }


    }
}
