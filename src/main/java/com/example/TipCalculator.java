package com.example;
import java.util.Scanner;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
         public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
         
         double tip = Math.round (cost * ((percent / 100.0)) * 100) / 100.0; 
         double billWithTip = Math.round ((tip + cost) * 100) / 100.0; 
         double perPersonBeforeTip = Math.round ((cost / people) * 100) / 100.0; 
         double tipPerPerson = Math.round ((tip / people) * 100) / 100.0; 
         double totalCostPerPerson = Math.round ((billWithTip / people) * 100)/ 100.0; 

        //DO NOT DELETE ANY OF THE CODE BELOW      

        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + cost + "" + "\n" +
                       "Total percentage: "  + percent + "" + "%\n" +
                       "Total tip: $" + tip + "" + "\n" +
                       "Total Bill with tip: $" + billWithTip + "" + "\n" +
                       "Per person cost before tip: $" + perPersonBeforeTip + "" + "\n" +
                       "Tip per person: $" + tipPerPerson + "" + "\n" +
                       "Total cost per person: $" + totalCostPerPerson + "" + "\n" +
                       "-------------------------------\n";

        return result;
            
         }


        //DO NOT DELETE ANY OF THE CODE BELOW      


    public static String extraCredit(int people, int percent, double cost) {
        String result = "Extra credit not implemented";
        boolean condition = true;
    
        //  COPY AND PASTE YOUR PROGRAM FROM calculateTip() HERE 
        System.out.println  ("Test"); 
        // the while loop condition is checked,
        // and if TRUE, runs the code inside.
        // when the code inside is done running, the condition is rechecked,
        // and the loop repeats as long as the condition remains TRUE.
        // when the condition becomes FALSE, it stops

        while (condition) {
            //enter your code here 
            System.out.println("placeholder");
            condition = false;
    
        }

        return result;
    }
    
    
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people=10; 
        int percent=8;
        double cost=10.5;              
        //System.out.println(calculateTip(people,percent,cost));
        System.out.println(extraCredit(people, percent, cost));
        System.out.println(calculateTip(6, 25, 52.27));
    }
}
        