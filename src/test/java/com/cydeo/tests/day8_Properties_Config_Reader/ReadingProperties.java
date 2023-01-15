package com.cydeo.tests.day8_Properties_Config_Reader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_From_properties_Test() throws IOException {
        // - Create the object of Properties classes
        Properties properties = new Properties();

        // We need to open the file as a stream in java memory using= FileInputStream
        FileInputStream file = new FileInputStream("configuration.properties");

        // Load the properties object using FileInputStream object
        properties.load(file);

        // use properties objects to read values
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));


    }


}
