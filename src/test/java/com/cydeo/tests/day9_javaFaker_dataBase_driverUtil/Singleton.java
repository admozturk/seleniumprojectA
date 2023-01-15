package com.cydeo.tests.day9_javaFaker_dataBase_driverUtil;

public class Singleton {

    //#1 create private constructor
   private Singleton(){}

    //# Create private static string
    // prevent access and provide a getter method
    private static String word;

   // This utility method will return the "word" in the way we want to return
   public static String getWord(){
       if (word==null){
           System.out.println("First time call. word object is null."+ "Assigning value to it now!");
           word= "something";
       }else{
           System.out.println("word already has value.");
       }
       return word;
   }
}
