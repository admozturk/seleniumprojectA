package com.cydeo.tests.day8_Properties_Config_Reader;

import org.testng.annotations.Test;

public class LearningProperties {

    @Test
    public void java_Properties_reading_Test(){
        System.out.println("System.getProperties(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));

    }



}
