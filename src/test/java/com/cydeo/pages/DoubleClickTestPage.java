package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoubleClickTestPage {

    public DoubleClickTestPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "accept-choices")
    public WebElement acceptCookies;


    @FindBy(id = "demo")
    public WebElement textToDoubleClick;


}
