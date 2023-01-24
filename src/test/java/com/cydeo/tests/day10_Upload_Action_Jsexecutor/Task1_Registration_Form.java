package com.cydeo.tests.day10_Upload_Action_Jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Task1_Registration_Form {
    @Test
    public void registration_Form_Test(){
        //1. Open browser
        //2. Go to website: https://practice.cydeo.com/registration_form
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        //3. Enter first name
        WebElement inputFirstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));

        // create JavaFaker object (optional)
        Faker faker = new Faker();
        inputFirstName.sendKeys(faker.name().firstName());


        //4. Enter last name
        WebElement inputLastname = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        inputLastname.sendKeys(faker.name().lastName());

        //5. Enter username
        WebElement inputUserName = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        //inputUserName.sendKeys(faker.name().username().replaceAll(".",""));
        // inputUserName.sendKeys(faker.bothify("helpdesk###"));
        String user = faker.bothify("helpdesk###");
        inputUserName.sendKeys(user);


        //6. Enter email address
        WebElement inputEmailAddress = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        inputEmailAddress.sendKeys(user+"@gmail.com");

        //7. Enter password
        WebElement inputPassword = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        inputPassword.sendKeys(faker.bothify("#?###?##"));

        //8. Enter phone number
        WebElement inputPhone= Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        inputPhone.sendKeys(faker.numerify("###-###-####"));

        //9. Select a gender from radio buttons
        WebElement inputGender= Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        inputGender.click();

        //10. Enter date of birth
        WebElement inputBirthDay= Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        //inputBirthDay.sendKeys(faker.number().numberBetween());
        inputBirthDay.sendKeys("03/08/2023");


        //11. Select Department/Office
        Select departmentDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        //departmentDropdown.selectByIndex(faker.number().numberBetween(1,9));// this is just a way to use it
        departmentDropdown.selectByIndex(1);


        //12. Select Job Title
        Select jobTitle = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        jobTitle.selectByVisibleText("Developer");

        //13. Select programming language from checkboxes
        WebElement inputJobSelection= Driver.getDriver().findElement(By.xpath("//input[@id='inlineCheckbox2']"));
        inputJobSelection.click();

        //14. Click to sign up button
        WebElement clickButton = Driver.getDriver().findElement(By.xpath("//button[@id='wooden_spoon']"));
        clickButton.click();

        //15. Verify success message “You’ve successfully completed registration.” is displayed.
        WebElement verifySuccessMessage = Driver.getDriver().findElement(By.xpath("//p[1]"));
        System.out.println("verify Success Message= " + verifySuccessMessage.getText());


    }
}
