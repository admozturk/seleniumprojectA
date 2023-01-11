package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    // - Create the object of Properties classes
    private static Properties properties = new Properties();

    static {

        try {
            // We need to open the file in java memory using= FileInputStream
            FileInputStream file = new FileInputStream("configuration.properties");

            // Load the properties object using FileInputStream object
            properties.load(file);

            //close file
            file.close();

        } catch (IOException e) {
            System.out.println("File not found in the configurationReader Class");
            e.printStackTrace();
        }

    }


    public static String getProperty(String keyword) {
        return properties.getProperty(keyword);
    }
}
