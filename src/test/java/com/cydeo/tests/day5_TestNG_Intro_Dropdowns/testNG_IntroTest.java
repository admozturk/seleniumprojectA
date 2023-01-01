package com.cydeo.tests.day5_TestNG_Intro_Dropdowns;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// Each run button is responsible for running its own method
public class testNG_IntroTest {

    @BeforeClass
    public void setUpMethod(){
        System.out.println("---> Before class is running");
    }

    @BeforeMethod
    public void setUpmethod(){
        System.out.println("---> Before Method is running");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("---> after Method is running ");
    }

    @Test(priority = 1) // we can prioritys our tests by (priority =)
    public void testTestOne() {
        System.out.println("test one is running");

        //ASSERT EQUALS: compare 2 of the same things
        String actual = "apple";
        String expected = "apple";

        Assert.assertEquals(actual,expected);
    }

    @Test(priority = 2)
    public void test2() {
        System.out.println("test 2 is running");

        String actual = "apple";
        String expected = "apple";

        Assert.assertTrue(actual.equals(expected));
    }
}