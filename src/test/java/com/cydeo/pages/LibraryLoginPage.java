package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    // initialize the driver instance and object of the class

    public LibraryLoginPage(){ // default constructor
        // initElements method will create connection in between the current driver session(instance)
        // and the object of the current class
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // use @FindBy annotation to locate WebElements

    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement inputUserName;


    @FindBy(id = "inputPassword")
    public WebElement inputPassword;


    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;


    @FindBy(xpath = "//div[.='This field is required.']/div")
    public WebElement fillRequiredErrorMessage;


    @FindBy(xpath = "//div[.='Please enter a valid email address.']/div")
    public WebElement enterValidEmailErrorMessage;


    @FindBy(xpath = "//div[.='Sorry, Wrong Email or Password']")
    public WebElement wrongEmailOrPasswordErrorMessage;










}
